package semestr1.practise08;

public class practise08 {
    public static void main(String[] args) {
        //Завдання 1
        Student s1 = new Student("Sanya", 214, 10);
        System.out.println(s1);
        //
        //Завдання 2
        Product p1 = new Product("A-101", "Монітор", 6499.500, -1);
        System.out.println(p1);
        p1.setPrice(12000);
        System.out.println(p1);
        p1.setStock(2);
        System.out.println(p1);
        //
        //Завдання 3
        Circle c1 = new Circle(12);
        System.out.println(c1);
        c1.setRadius(10);
        System.out.println(c1);
        c1.setRadius(-12);
        System.out.println(c1);
        //
        //Завдання 4
        CardWallet w1 = new CardWallet("1204 2144 2142 2141", "1488", 12422);
        System.out.println(w1);
        w1.changePin("1488", "6767");
        System.out.println(w1);
        //
        /*Завдання 5

        */
        /*Завдання 6

        */
        /*Завдання 7

        */
        /*Завдання 8

        */
        //Завдання 9
        Employee e1 = new Employee("Тарас", 14000);
        System.out.println(e1);
        Developer d1 = new Developer("Ваньок", 20000, "C++");
        System.out.println(d1);
        //
        //Завдання 10
        Dog dog1 = new Dog("Шарік",6,43.2);
        System.out.println(dog1);
        Cat cat1 = new Cat("Барсік",13,24.7);
        System.out.println(cat1);
        //
        //Завдання 11
        CargoTruck car1 = new CargoTruck("Хавал", 140,22.2, 30);
        System.out.println(car1);
        System.out.println("Витрата при повному завантаженні: " + car1.calculateFuelConsumption() + " л/100 км");
        PassengerCar pCar1 = new PassengerCar("BMW",210,12,3);
        System.out.println(pCar1);
        //
        /*Завдання 12

        */
        /*Завдання 13

        */
        /*Завдання 14

        */
        /*Завдання 15

        */
        //Завдання 16
        Gamer g1 = new Gamer("Вітьок",500);
        System.out.println(g1);
        ProEsportsPlayer pro1 = new ProEsportsPlayer("Саня Сімпл", 5488,"Наві",235326.34,677);
        System.out.println(pro1);
        //
        //Завдання 17
        StaffMember m1  = new StaffMember("Антоша", 14000);
        System.out.println(m1);
        Manager m2 = new Manager("Кіріл", 24000, 5000);
        System.out.println(m2);
        SalesPerson m3 = new SalesPerson("Владімір", 48000, 790,21);
        System.out.println(m3);
        //
        /*Завдання 18

        */
        /*Завдання 19

        */
        //Завдання 20
        Weapon wep1 = new Weapon("Діамантовий меч", 7);
        EnchantedSword wep2 = new EnchantedSword("Незерітовий меч", 7,"Гострота", 5,8);
        System.out.println(wep1);
        System.out.println(wep2);
        //
        /*Завдання 21

        */
        /*Завдання 22

        */
        /*Завдання 23

        */
        /*Завдання 24

        */
        //Завдання 25

        //Завдання 26

        //
        /*Завдання 27

        */
        /*Завдання 28

        */
        //Завдання 29
        ImmutableServerCredentials i1 = new ImmutableServerCredentials("Васяніч", 2474743,"21452WWW2");
        System.out.println(i1);
        //
        /*Завдання 30

        */
        /*Завдання 31

        */
        //Завдання 32
        Medicine med1 = new Medicine("Аспірін", 200,true);
        System.out.println(med1);
        PrescriptionMedicine med2 = new PrescriptionMedicine("Героїн", 4000, false,"НЕМАЄ");
        System.out.println(med2);
        ControlledSubstance med3 = new ControlledSubstance("Фіорда", 500,true,"бла бла бла", 18);
        System.out.println(med3);
        //
        /*Завдання 33

        */
        /*Завдання 34

        */
        /*Завдання 35

        */
        /*Завдання 36

        */
        /*Завдання 37

        */
        /*Завдання 38

        */
        /*Завдання 39

        */
        /*Завдання 40

        */
    }
}
