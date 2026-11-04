package semestr1.practise09.Task2WorkstationConfigurator;

public class GraphicsAccelerator extends AbstractHardwareComponent {
    private final int vramGb;
    private final int tensorCores;
    private final int boardPowerWatts;

    public GraphicsAccelerator(String modelName, double priceUah,
                               int vramGb, int tensorCores, int boardPowerWatts) {
        super(modelName, priceUah);
        if (vramGb <= 0 || tensorCores < 0 || boardPowerWatts <= 0) {
            throw new IllegalArgumentException("Некоректні параметри відеоприскорювача");
        }
        this.vramGb = vramGb;
        this.tensorCores = tensorCores;
        this.boardPowerWatts = boardPowerWatts;
    }

    public int getVramGb() {
        return vramGb;
    }

    public int getTensorCores() {
        return tensorCores;
    }

    public int getBoardPowerWatts() {
        return boardPowerWatts;
    }

    @Override
    public int getPowerWatts() {
        return boardPowerWatts;
    }

    @Override
    public double getBenchmarkScore() {
        return vramGb * 250.0 + tensorCores * 1.5;
    }

    @Override
    public String getCategory() {
        return "GPU";
    }
}