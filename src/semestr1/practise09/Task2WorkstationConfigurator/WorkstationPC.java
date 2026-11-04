package semestr1.practise09.Task2WorkstationConfigurator;

public class WorkstationPC {
    private final String buildName;
    private final Motherboard motherboard;
    private final PowerSupplyUnit psu;
    private final AbstractHardwareComponent[] components;
    private int componentCount;

    public WorkstationPC(String buildName, Motherboard motherboard, PowerSupplyUnit psu) {
        if (buildName == null || buildName.isBlank()) {
            throw new IllegalArgumentException("Назва збірки не може бути порожньою");
        }
        if (motherboard == null || psu == null) {
            throw new IllegalArgumentException("Плата та БЖ є обов'язковими частинами станції");
        }
        this.buildName = buildName;
        this.motherboard = motherboard;
        this.psu = psu;
        this.components = new AbstractHardwareComponent[motherboard.getMaxExpansionSlots()];
        this.componentCount = 0;
    }

    public String getBuildName() {
        return buildName;
    }

    public int getComponentCount() {
        return componentCount;
    }
    private boolean installCpu(ProcessorUnit cpu) {
        if (!motherboard.isSocketCompatible(cpu.getSocket())) {
            System.out.println("Відмова: Процесор " + cpu.getModelName() + " (" + cpu.getSocket()
                    + ") несумісний із платою " + motherboard.getModel()
                    + " (Сокет " + motherboard.getSocketType() + ")");
            return false;
        }
        return true;
    }
    public boolean installComponent(AbstractHardwareComponent comp) {
        if (comp == null) {
            System.out.println("Відмова: не вказано комплектуючу для встановлення");
            return false;
        }
        if (componentCount >= motherboard.getMaxExpansionSlots()) {
            System.out.println("Відмова: немає вільних слотів розширення на платі "
                    + motherboard.getModel());
            return false;
        }
        if (comp.getCategory().equals("CPU") && comp instanceof ProcessorUnit) {
            if (!installCpu((ProcessorUnit) comp)) {
                return false;
            }
        }
        int projectedPower = getTotalPowerWatts() + comp.getPowerWatts();
        if (projectedPower > psu.getSafeContinuousWatts()) {
            System.out.println("Відмова: " + comp.getModelName() + " збільшить споживання до "
                    + projectedPower + " Вт при безпечному ліміті БЖ "
                    + psu.getSafeContinuousWatts() + " Вт — ризик перевантаження БЖ!");
            return false;
        }
        components[componentCount++] = comp;
        return true;
    }

    public int getTotalPowerWatts() {
        int total = 0;
        for (int i = 0; i < componentCount; i++) {
            total += components[i].getPowerWatts();
        }
        return total;
    }

    public double getTotalSystemScore() {
        double total = 0;
        for (int i = 0; i < componentCount; i++) {
            total += components[i].getBenchmarkScore();
        }
        return total;
    }

    public double getTotalBuildPrice() {
        double total = 0;
        for (int i = 0; i < componentCount; i++) {
            total += components[i].getPriceUah();
        }
        return total;
    }

    @Override
    public String toString() {
        int internal = getTotalPowerWatts();
        int safeLimit = psu.getSafeContinuousWatts();
        String status = internal <= safeLimit ? "СТАБІЛЬНО!" : "ПЕРЕВАНТАЖЕННЯ!";
        long efficiencyPercent = Math.round(psu.getEfficiencyCoefficient() * 100);
        String wallPower = String.format("%.2f", psu.calculateWallPowerDraw(internal));
        String totalScore = String.format("%.2f", getTotalSystemScore());
        String totalPrice = String.format("%.2f", getTotalBuildPrice());

        return "[ПАСПОРТ ЗБІРКИ '" + buildName + "']:\n"
                + "  Материнська плата: " + motherboard.getModel()
                + " (Socket: " + motherboard.getSocketType()
                + ", Слотів: " + componentCount + "/" + motherboard.getMaxExpansionSlots() + ")\n"
                + "  Блок живлення:     " + psu.getModel()
                + " (Безпечний ліміт 85%: " + safeLimit + " Вт, ККД: " + efficiencyPercent + "%)\n"
                + "  Внутрішнє споживання: " + internal + " Вт (З розетки з урахуванням ККД: "
                + wallPower + " Вт) → " + status + "\n"
                + "  Сумарний індекс продуктивності: " + totalScore + " балів\n"
                + "  Загальна вартість конфігурації: " + totalPrice + " грн";
    }
}