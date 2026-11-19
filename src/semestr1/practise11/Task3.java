package semestr1.practise11;

import java.util.ArrayList;
import java.util.List;
public class Task3 {
public static List<Integer> parseNumbersFromStrings(String[] inputs){
  ArrayList<Integer> integers = new ArrayList<>();
  int sum = 0;
    for (int i = 0; i < inputs.length; i++) {
        try {
            integers.add(Integer.valueOf(inputs[i]));
            sum += Integer.parseInt(inputs[i]);
        } catch (NumberFormatException e) {
            System.out.println("Помилка, число " + (i + 1) + " не ціле");
        }
    }
    System.out.println(integers);
    System.out.println(sum);
    return integers;
    }
}
