package semestr1.practise09.Task2WorkstationConfigurator;

import java.util.Arrays;

public class NvmeSsdDrive extends AbstractHardwareComponent {
    private final int capacityGb;
    private final int readSpeedMbSec;
    private final int[] speedSamples;

    public NvmeSsdDrive(String modelName, double priceUah, int capacityGb,
                        int readSpeedMbSec, int[] speedSamples) {
        super(modelName, priceUah);
        if (capacityGb <= 0 || readSpeedMbSec <= 0) {
            throw new IllegalArgumentException("Ємність і швидкість мають бути додатними");
        }
        if (speedSamples == null) {
            throw new IllegalArgumentException("Масив замірів не може бути null");
        }
        this.capacityGb = capacityGb;
        this.readSpeedMbSec = readSpeedMbSec;
        this.speedSamples = Arrays.copyOf(speedSamples, speedSamples.length);
    }

    public int getCapacityGb() {
        return capacityGb;
    }

    public int getReadSpeedMbSec() {
        return readSpeedMbSec;
    }

    public int[] getSpeedSamples() {
        return Arrays.copyOf(speedSamples, speedSamples.length);
    }

    @Override
    public int getPowerWatts() {
        return 12;
    }

    @Override
    public double getBenchmarkScore() {
        return readSpeedMbSec * 0.25;
    }

    @Override
    public String getCategory() {
        return "NVMe SSD";
    }
}