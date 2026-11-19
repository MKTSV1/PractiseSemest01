package semestr1.practise11;

import java.util.ArrayList;
import java.util.List;

public class practise11 {
    public static void main(String[] args) {
        //Завдання 1
        WrapperClasses.demonstrateWrapperTwins();
        //Завдання 2
       showCompilerUndreTheHood.showCompilerUnderTheHood();
        //Завдання 3
        String[] inputs = {"123","xyz","21","kawai","100"};
Task3.parseNumbersFromStrings(inputs);
        //Завдання 4
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println();
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);
        System.out.println();
        System.out.println(Short.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);
Task5.testIntegerPool();


        //Завдання 5


        //Завдання 6


        //Завдання 7


        //Завдання 8


        //Завдання 9
String[] fixedArray = new String[3];
//fixedArray[3] = "незя так";
ArrayList<String> dynamicList = new ArrayList<>();
dynamicList.add(fixedArray[0] + fixedArray[1] + fixedArray[2]);
        System.out.println();
        dynamicList.add(1, "другий елемент");
        dynamicList.remove(0);
        System.out.println(dynamicList);
        //Завдання 10


        //Завдання 11
        Object[] oldData = new Object[10];
        for (int i = 0; i < oldData.length; i++) {
            oldData[i] = i + 1;
        }
        Object[] newData = new Object[15];
        System.arraycopy(oldData, 0,newData,0, oldData.length);
newData[10] = 11;
        System.out.println(oldData);
        System.out.println();
        for (int i = 0; i < oldData.length; i++) {
            System.out.print(oldData[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < newData.length; i++) {
            System.out.print(newData[i] + " ");
        }
        //Завдання 12


        //Завдання 13


        //Завдання 14

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
