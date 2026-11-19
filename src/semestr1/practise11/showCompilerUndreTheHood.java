package semestr1.practise11;

import java.util.ArrayList;

public class showCompilerUndreTheHood {
    public static void showCompilerUnderTheHood(){
        ArrayList<Integer> list = new ArrayList<>();
        int a = 42;
        Integer boxed = a;
    list.add(100);
    int unboxed = list.get(0);
    Integer.valueOf(a);
    list.add(Integer.valueOf(100));
    list.get(0).intValue();
    ArrayList<Double> list1 = new ArrayList<>();
    Double.valueOf(3.14);
    list1.add(Double.valueOf(3.14));
    list1.add(10.0);
    list1.add(3.14);
    list1.add(213.5);
        System.out.println(list);
        System.out.println(list1);
    }
}
