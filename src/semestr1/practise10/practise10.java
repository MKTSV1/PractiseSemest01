package semestr1.practise10;

import static semestr1.practise10.Task2.findMaxAreaShape;

public class practise10 {
    public static void main(String[] args) {
        //Завдання 1
        double totalCostForAll =0;
        double totalFee = 0;
        PaymentInstrument[] card = {
        new BankCardInstrument("Валєра"),
        new IbanDirectInstument("Жора"),
        new CryptoTokenInstrument("Хохлік",12)
};
for (PaymentInstrument c : card){
    double costForInstrument = c.processPayment(10000);
    double totalFeeInstument = c.calculateFee(10000);
    totalFee += totalFeeInstument;
    totalCostForAll += costForInstrument;
    System.out.println("Комісія = " +c.calculateFee(10000));
}
        System.out.println("Всього заплатили = " + totalCostForAll);
        System.out.println("Всього комісія = " + totalFee);
        //Завдання 2
        Shape2D[] myShapes = new Shape2D[]{
                new CircleShape(5.0),
                new RectangleShape(20, 6),
                new EquilateralTriangleShape(8)
        };
        Shape2D largestShape = findMaxAreaShape(myShapes);
        if (largestShape != null) {
            System.out.println("Фігура з найбільшою площею: " + largestShape.getClass().getSimpleName());
            System.out.printf("Її площа: %.2f%n", largestShape.getArea());
        }
        //Завдання 3


        //Завдання 4
        NotificationSender[] senders = {
       new NotificationSender("Васьок Пупок"),
       new EmailSender("Роутеру"),
       new SmsSender("Собаці"),
       new TelegramBotSender("Жеке")
        };
        String alertMsg = "ВУЛИЧНІ БОЇ ФЕМБОЇВ НА КОНТРАКТОВІЙ! НЕГАЙНО НА ВУЛИЦЮ ВСІ! ЦЕ ПОВІДОМЛЕННЯ ШТУЧНО ПОДОВЖЕНО ДЛЯ ПЕРЕВІРКИ СМС.";
        NotificationSender.broadcastAlert(senders, alertMsg);
        //Завдання 5
        ShippingTariff[] tariffs = {
                new RoadTruckTariff(250,600),
                new AirCargoTariff(250,600),
                new RailFreightTariff(250,600)
        };
        double minimalCost = tariffs[0].calculateCost();
        String nameOfMinimalCostTarrif = tariffs[0].getName();
        for (int i = 0; i < tariffs.length; i++) {
            if (minimalCost > tariffs[i].calculateCost()) {
                minimalCost = tariffs[i].calculateCost();
                nameOfMinimalCostTarrif = tariffs[i].getName();
            }
        }
        System.out.println(minimalCost);
        System.out.println(nameOfMinimalCostTarrif);

        //Завдання 6


        //Завдання 7


        //Завдання 8


        //Завдання 9
        Measurable[] items ={
                new BankVault(100),
                new HighwayRoute(1000),
                new CpuCore(3),
                new HighwayRoute(100)
        };
        System.out.println(Measurable.computeAverage(items));
        //Завдання 10
        EnergyConvertible body = new KineticBody(10,10);
        System.out.println(body.getEnergyJoules());
        EnergyConvertible body2 = new BatteryCell(12,200);
        System.out.println(body2.getEnergyJoules());
        //Завдання 11


        //Завдання 12


        //Завдання 13


        //Завдання 14


        //Завдання 15


        //Завдання 16
DataExportable[] records = {
        new StudentGradeRecord("Нікіта",12,10),
        new WeatherObservation("Київ",22.6,12)
};
        System.out.println(records[0].toJson() + " " + records[1].toJson());
        System.out.println();
        System.out.println(records[0].toCsvRow() + " " +records[1].toCsvRow());
        //Завдання 17
        AbstractBird[] birds = {
                new Falcon("кривий",12),
                new EmperorPenguin("красивий",20)
        };
        FlyableUnit[] flyableUnits = {
                new CargoPlane()
        };
        System.out.println(birds[0].species + birds[0].weightKg +
                " " + birds[1].species + birds[1].weightKg);
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
