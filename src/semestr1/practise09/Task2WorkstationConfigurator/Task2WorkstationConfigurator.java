package semestr1.practise09.Task2WorkstationConfigurator;

import java.util.Arrays;

public class Task2WorkstationConfigurator {
    private static void tryInstall(WorkstationPC pc, AbstractHardwareComponent comp) {
        if (pc.installComponent(comp)) {
            System.out.println("Встановлено: " + comp);
        }
    }
    public static void main(String[] args) {


        System.out.println("================ КОНФІГУРАТОР РОБОЧОЇ СТАНЦІЇ (КОМПОЗИЦІЯ) ================");

        Motherboard board = new Motherboard("ASUS ROG B650", "AM5", 4);
        PowerSupplyUnit psu = new PowerSupplyUnit("Seasonics 750W Gold", 750, 0.90);
        WorkstationPC pc = new WorkstationPC("DeepLearning-Rig", board, psu);

        ProcessorUnit intelCpu = new ProcessorUnit("Intel Core i9", 21000.0, "LGA1700", 24, 5.8, 253);
        ProcessorUnit amdCpu = new ProcessorUnit("AMD Ryzen 9 7950X", 19900.0, "AM5", 16, 5.7, 170);
        GraphicsAccelerator rtx4080 = new GraphicsAccelerator("NVIDIA RTX 4080 Super", 48000.0, 16, 552, 320);
        GraphicsAccelerator rtx4090 = new GraphicsAccelerator("NVIDIA RTX 4090", 90000.0, 24, 512, 450);

        int[] originalSamples = {7400, 7450, 7430, 7460};
        NvmeSsdDrive ssd = new NvmeSsdDrive("Samsung 990 Pro 2TB", 11000.0, 2000, 7450, originalSamples);

        System.out.println("[ПЕРЕВІРКА СУМІСНОСТІ]:");
        tryInstall(pc, intelCpu);
        tryInstall(pc, amdCpu);
        tryInstall(pc, rtx4080);
        tryInstall(pc, ssd);

        System.out.println();
        System.out.println(pc);
        System.out.println("=======================================================================");
    }
}