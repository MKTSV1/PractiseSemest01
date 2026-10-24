package semestr1.practise07;

import static semestr1.practise07.MathUtils.*;

public class practise07 {
    public static void main(String[] args) {
        //Завдання 1
ABook01 book1 = new ABook01("Баба чай","Мелстрой", 2026,1488);
book1.printInfo();
ABook01 book2 = new ABook01();
book2.printInfo();
ABook01 book3 = new ABook01("dhsdg","reherh",-12, 215);
book3.printInfo();
        //Завдання 2
BStudent02 student1 = new BStudent02("Віталій", 18, 5);
student1.printStudent();
BStudent02 student2 = new BStudent02("Макс", 7, 0);
student2.printStudent();
        //Завдання 3
CBankAccount03 account1 = new CBankAccount03("125215", "Сергій",1488);
account1.printAccount();
account1.deposit(67);
account1.printAccount();
account1.withdraw(1500);
account1.printAccount();
        //Завдання 4
DPoint2D04 point1 = new DPoint2D04(5,4);
point1.distanceToOrigin();
point1.distanceTo(6,3);
point1.printPoint();
        //Завдання 5
EProduct05 product1 = new EProduct05("Ділдакі",67,42,"секс іграшкі");
product1.applyDiscount(20);
product1.printProduct();
        //Завдання 6

        //Завдання 7
FRectangle07 rectangle1 = new FRectangle07(5,7);
rectangle1.printRectangle();
        //Завдання 8

        //Завдання 9
JUser09 user1 = new JUser09();
user1.printUser();
        //Завдання 10
KFraction10 frac1 = new KFraction10(6,5);
frac1.print();
        System.out.println();
        KFraction10 frac2 = new KFraction10(-5,25);
        frac2.print();
        System.out.println();
        KFraction10 frac3 = new KFraction10(4,-16);
        frac3.print();
        System.out.println();
        //Завдання 11
LCar11 car1 = new LCar11("Toyota","Pisun",1488,67);
        car1.startEngine();
car1.drive(100);
        //Завдання 12

        //Завдання 13
        String sql = new MQueryBuilder("users").select("id, name, email").where("age >= 18").build();

        //Завдання 14


        //Завдання 15


        /*Завдання 16

        */
        //Завдання 17
MathOperations m1 = new MathOperations();
m1.add(2,6);
m1.add(2,5,6);
m1.multiply("hi",4);
        //Завдання 18
        DocumentPrinter d1 = new DocumentPrinter();
        d1.print(64);
        d1.print("hi");
        d1.print("hi",true);
        d1.print(6.148890,2);
        d1.print(new String[]{"asg", "dsg", "asgreyh", "sdfhdfhertjh"});
        //Завдання 19


        //Завдання 20
Logger l1 = new Logger();
l1.log("hi");
l1.log("5","hi");
l1.log("4",404,"bye");
l1.log("hi","bye",true);
        //Завдання 21

        //Завдання 22


        //Завдання 23


        //Завдання 24


        //Завдання 25
UserAccount u1 = new UserAccount("ivan","durak@gmail.com");
UserAccount u2 = new UserAccount("vanya","durak123@gmail.com");
UserAccount u3 = new UserAccount("vanyusha","durak321@gmail.com");
        //Завдання 26
ServerConfig users1 = new ServerConfig();
                ServerConfig.connect();
        ServerConfig.printServerStatus();
ServerConfig users2 = new ServerConfig();
            ServerConfig.connect();
        ServerConfig.printServerStatus();
ServerConfig users3 = new ServerConfig();
            ServerConfig.connect();
        ServerConfig.printServerStatus();
ServerConfig users4 = new ServerConfig();
            ServerConfig.connect();
        ServerConfig.printServerStatus();
ServerConfig users5 = new ServerConfig();
            ServerConfig.connect();
        ServerConfig.printServerStatus();
ServerConfig users6 = new ServerConfig();
            ServerConfig.connect();
        ServerConfig.printServerStatus();
        //Завдання 27
            System.out.println(factorial(6));
            System.out.println(factorial(12));
            System.out.println(power(5,-1));
            System.out.println(gcd(9,27));
        //Завдання 28
        System.out.println(CurrencyExchange.eurToUah(6));
        System.out.println(CurrencyExchange.uahToUsd(1000));
        System.out.println(CurrencyExchange.usdToUah(6));
        CurrencyExchange.updateRates(45.5,50.1);
        System.out.println(CurrencyExchange.eurToUah(6));
        System.out.println(CurrencyExchange.uahToUsd(1000));
        System.out.println(CurrencyExchange.usdToUah(6));
        //Завдання 29
        System.out.println();
        FleetCar cars1 = new FleetCar("что писать тут",33.34);
        FleetCar cars2 = new FleetCar("avrora",57.43);
        FleetCar cars3 = new FleetCar("bmw",67.33);
        FleetCar.printFleetSummary();
        //Завдання 30


        //Завдання 31

        //Завдання 32


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
