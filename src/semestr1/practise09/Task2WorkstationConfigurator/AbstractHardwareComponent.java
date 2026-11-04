package semestr1.practise09.Task2WorkstationConfigurator;

public abstract class AbstractHardwareComponent {
    private final String modelName;
    private final double priceUah;

    public AbstractHardwareComponent(String modelName, double priceUah) {
        if (modelName == null || modelName.isBlank()) {
            throw new IllegalArgumentException("Назва моделі не може бути порожньою");
        }
        if (priceUah < 0) {
            throw new IllegalArgumentException("Ціна не може бути від'ємною");
        }
        this.modelName = modelName;
        this.priceUah = priceUah;
    }

    public String getModelName() {
        return modelName;
    }

    public double getPriceUah() {
        return priceUah;
    }

    public abstract int getPowerWatts();

    public abstract double getBenchmarkScore();

    public abstract String getCategory();

    @Override
    public String toString() {
        return String.format("[%s] %s (%d Вт | Score: %.1f)",
                getCategory(), modelName, getPowerWatts(), getBenchmarkScore());
    }
}