package semestr1.practise09;

import java.util.Arrays;

public class practise09 {
    public static void main(String[] args) {
        //Завдання 1
        ImmutableGeoPoint im1 = new ImmutableGeoPoint(67.4,57.94);
        System.out.println(im1);
        ImmutableGeoPoint im1shifted = im1.shift(100, 100);
        System.out.println(im1shifted);
        //Завдання 2
        double[] externalSamples = {125,43.4,17.4,19.5};
        LabMeasurement lab1 = new LabMeasurement("Біолабораторія", externalSamples);
        System.out.println(Arrays.toString(externalSamples));
        System.out.println(Arrays.toString(lab1.getSamples()));
        System.out.println();
        externalSamples[0] = 99;
        System.out.println(Arrays.toString(externalSamples));
        System.out.println(Arrays.toString(lab1.getSamples()));
        System.out.println();
        double[] retrievedSamples = lab1.getSamples();
        retrievedSamples[2] = -50;
        System.out.println(Arrays.toString(retrievedSamples));
        System.out.println(Arrays.toString(lab1.getSamples()));
        System.out.println();
        LabMeasurement nulllab = new LabMeasurement("Null", null);
        System.out.println(Arrays.toString(nulllab.getSamples()));
        //Завдання 3
        CryptoVault wallet = new CryptoVault("LRQ2159125LASDGwe", "zopa osla", 2, true);
        System.out.println(wallet);
        wallet.unlock("zopa osla");
        System.out.println(wallet);
        System.out.println(wallet.getSecretRecoveryPhrase());
        wallet.setbtcBalance(998);
        System.out.println(wallet);
        //Завдання 4
        ClosedInterval interval = new ClosedInterval(67,56);
        System.out.println(interval);
        interval.resize(2,8);
        System.out.println(interval);
        //Завдання 5
        RgbColor color = new RgbColor(250,100,200);
        System.out.println(color);
        RgbColor inverted = color.invert();
        System.out.println(inverted);
        RgbColor color2 = new RgbColor(100,433,9);
        RgbColor mixed = color.mixWith(color2);
        System.out.println(mixed);
        //Завдання 6


        //Завдання 7


        //Завдання 8


        //Завдання 9
        CompositeCircle circle = new CompositeCircle(0.0, 0.0, 5.0);
        System.out.println(circle);
        Point2D pointInside = new Point2D(3.0, 4.0);
        Point2D pointOutside = new Point2D(6.0, 0.0);
        Point2D pointCenter = new Point2D(1.0, 1.0);
        System.out.println("Точка " + pointInside + " належить колу? " + circle.containsPoint(pointInside));
        System.out.println("Точка " + pointOutside + " належить колу? " + circle.containsPoint(pointOutside));
        System.out.println("Точка " + pointCenter + " належить колу? " + circle.containsPoint(pointCenter));
        //Завдання 10
        Engine engine = new Engine("Газ",120,600,true);
        System.out.println(engine);
        Automobile automobile = new Automobile("Гнілуха", 50,engine);
        System.out.println(automobile);
        automobile.accelerate(100);
        System.out.println(automobile);
        engine.stop();
        System.out.println(automobile);
        automobile.accelerate(10);
        System.out.println(automobile);
        //Завдання 11
        Battery battery = new Battery(4000,60);
        Display display = new Display(17.5,89);
        SmartDevice device = new SmartDevice(battery,display);
        System.out.println(battery);
        System.out.println(display);
        device.watchVideo(120);
        System.out.println();
        System.out.println(battery);
        System.out.println(display);
        display.setBrightnessPercent(60);
        device.watchVideo(120);
        System.out.println();
        System.out.println(battery);
        System.out.println(display);
        //Завдання 12


        //Завдання 13


        //Завдання 14
        WeaponItem weaponItem = new WeaponItem("Крісталіс", 24,12);
        HeroCharacter heroCharacter = new HeroCharacter("Wraith King",67,weaponItem);
        System.out.println(weaponItem);
        System.out.println(heroCharacter);
        System.out.println("Шкоди нанесено " + heroCharacter.attack());
        System.out.println("--------------------------------");
        System.out.println(weaponItem);
        System.out.println(heroCharacter);
        System.out.println("Шкоди нанесено " + heroCharacter.attack());
        System.out.println("-----------------------------------");
        System.out.println(weaponItem);
        System.out.println(heroCharacter);
        System.out.println("Шкоди нанесено " + heroCharacter.attack());
        //Завдання 15


        //Завдання 16


        //Завдання 17


        //Завдання 18


        //Завдання 19


        //Завдання 20


        //Завдання 21


        //Завдання 22


        //Завдання 23


        //Завдання 24


        //Завдання 25


        //Завдання 26


        //Завдання 27


        //Завдання 28


        //Завдання 29


        //Завдання 30


        //Завдання 31


        //Завдання 32


        //Завдання 33


        //Завдання 34


        //Завдання 35


        //Завдання 36


        //Завдання 37


        //Завдання 38


        //Завдання 39


        //Завдання 40


    }
}
