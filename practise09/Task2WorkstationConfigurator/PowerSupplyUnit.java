package semestr1.practise09.Task2WorkstationConfigurator;

public class PowerSupplyUnit {
    private final String model;
    private final int maxOutputWatts;
    private final double efficiencyCoefficient;

    public PowerSupplyUnit(String model, int maxOutputWatts, double efficiencyCoefficient) {
        if (model == null || model.isBlank()) {
            throw new IllegalArgumentException("Модель БЖ не може бути порожньою");
        }
        if (maxOutputWatts <= 0) {
            throw new IllegalArgumentException("Потужність БЖ має бути додатною");
        }
        if (efficiencyCoefficient < 0.80 || efficiencyCoefficient > 0.96) {
            throw new IllegalArgumentException("ККД має бути в межах [0.80; 0.96]");
        }
        this.model = model;
        this.maxOutputWatts = maxOutputWatts;
        this.efficiencyCoefficient = efficiencyCoefficient;
    }

    public String getModel() {
        return model;
    }

    public int getMaxOutputWatts() {
        return maxOutputWatts;
    }

    public double getEfficiencyCoefficient() {
        return efficiencyCoefficient;
    }

    public int getSafeContinuousWatts() {
        return (int) (maxOutputWatts * 0.85);
    }

    public double calculateWallPowerDraw(int internalLoadWatts) {
        return internalLoadWatts / efficiencyCoefficient;
    }
}