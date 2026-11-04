package semestr1.practise09.Task2WorkstationConfigurator;

public class ProcessorUnit extends AbstractHardwareComponent {
    private final String socket;
    private final int cores;
    private final double boostClockGhz;
    private final int tdpWatts;

    public ProcessorUnit(String modelName, double priceUah, String socket,
                         int cores, double boostClockGhz, int tdpWatts) {
        super(modelName, priceUah);
        if (socket == null || socket.isBlank()) {
            throw new IllegalArgumentException("Сокет процесора не може бути порожнім");
        }
        if (cores <= 0 || boostClockGhz <= 0 || tdpWatts <= 0) {
            throw new IllegalArgumentException("Ядра, частота та TDP мають бути додатними");
        }
        this.socket = socket;
        this.cores = cores;
        this.boostClockGhz = boostClockGhz;
        this.tdpWatts = tdpWatts;
    }

    public String getSocket() {
        return socket;
    }

    public int getCores() {
        return cores;
    }

    public double getBoostClockGhz() {
        return boostClockGhz;
    }

    public int getTdpWatts() {
        return tdpWatts;
    }

    @Override
    public int getPowerWatts() {
        return tdpWatts;
    }

    @Override
    public double getBenchmarkScore() {
        return cores * boostClockGhz * 120.0;
    }

    @Override
    public String getCategory() {
        return "CPU";
    }
}