package semestr1.practise09.Task2WorkstationConfigurator;

public class Motherboard {
    private final String model;
    private final String socketType;
    private final int maxExpansionSlots;

    public Motherboard(String model, String socketType, int maxExpansionSlots) {
        if (model == null || model.isBlank()) {
            throw new IllegalArgumentException("Модель плати не може бути порожньою");
        }
        if (socketType == null || socketType.isBlank()) {
            throw new IllegalArgumentException("Тип сокета не може бути порожнім");
        }
        if (maxExpansionSlots < 1 || maxExpansionSlots > 8) {
            throw new IllegalArgumentException("Кількість слотів розширення має бути в межах 1..8");
        }
        this.model = model;
        this.socketType = socketType;
        this.maxExpansionSlots = maxExpansionSlots;
    }

    public String getModel() {
        return model;
    }

    public String getSocketType() {
        return socketType;
    }

    public int getMaxExpansionSlots() {
        return maxExpansionSlots;
    }

    public boolean isSocketCompatible(String cpuSocket) {
        return socketType.equalsIgnoreCase(cpuSocket);
    }
}
