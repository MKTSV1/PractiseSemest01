package semestr1.practise11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task1WrapperAndAutoboxingMemory {
    public static void inspectIntegerCache(int[] testValue){
        System.out.println("=================== ДОСЛІДЖЕННЯ WRAPPER CLASSES ТА INTEGER CACHE ====================");
        System.out.println("[1. ЕКСПЕРИМЕНТ: INTEGER CACHE [-128..127] (== проти .equals())]:");
        for (int i = 0; i < testValue.length; i++) {
            Integer first = Integer.valueOf(testValue[i]);
            Integer second = Integer.valueOf(testValue[i]);
            String source = " ";
            if (first  == second){
                source = "IntegerCache";
            }else{
                source = "Новий об'єкт у Heap!";
            }
            System.out.println("Значення:     " + testValue[i] + " | (a == b): " +
                    (first == second) + " | a.equals(b): " + first.equals(second) +
                    " | Джерело: " + source);
        }
    }
    public static void demonstrateAutoboxingUnderTheHood(){
        List<Integer> sensors = Arrays.asList(45, null, -12, 88, null, 102);
        System.out.println("\n[2. AUTOBOXING / UNBOXING ПІД КАПОТОМ ТА ЗАХИСТ ВІД NULL]:");
        System.out.println("Явне пакування: Integer.valueOf(42) -> " +Integer.valueOf(42) + " | Розпакування .intValue() -> " + Integer.valueOf(42).intValue());
        System.out.println("Явне пакування: Double.valueOf(42.67) -> " +Double.valueOf(42.67) + " | Розпакування  .doubleValue() -> " + Double.valueOf(42.67).doubleValue());
        System.out.println("Явне пакування: Boolean.valueOf(false) -> " +Boolean.valueOf(false) + " | Розпакування .booleanValue() -> " + Boolean.valueOf(false).booleanValue());
        System.out.println("Вхідний список із датчиків (з null): " + sensors);
        int sum = 0;
        int index = 0;
        ArrayList<Integer> nullIndex = new ArrayList<>();
        for (int i = 0; i < sensors.size(); i++) {
        if (sensors.get(i) == null){
            nullIndex.add(i);
        }else{
            sum +=sensors.get(i);
        }
        }
        if (nullIndex.size() > 0){
            System.out.println("Пропущенно null-елемент, ось їх індекси " +nullIndex + "(Запобігання NullPointerException при intValue()!)");
        }
        System.out.println("Сумма валідних розпакованих елементів: " + sum);
    }
    public static List<Integer> parseTelemetryStream(String[] rawPackets) {
        List<Integer> result = new ArrayList<>();
        System.out.println("\n[3.ПАРСИНГ РЯДКІВ (Integer.parseInt)  ТА ЕКСТРЕМУМИ (MAX_VALUE /MIN_VALUE)]:");
        System.out.println("Початкові межі пошуку: min = " + Integer.MAX_VALUE + "(MAX_VALUE), max = " + Integer.MIN_VALUE + "(MIN_VALUE)");
        for (int i = 0; i < rawPackets.length; i++) {
            if (rawPackets[i] == null || rawPackets[i].trim().isEmpty()) {
                System.out.println("Пакет " + rawPackets[i] + " порожній або null-пакет відхилено");
                continue;
            }
            try {
                result.add(Integer.parseInt(rawPackets[i].trim()));
            } catch (NumberFormatException e) {
                System.out.println("Пакет " + rawPackets[i] + " відхилено (NumberFormatException)");
            }
        }
        return result;
    }
public static void printExtremesAndStats(List<Integer> validData){
    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;
        for (int i = 0; i < validData.size(); i++) {
            if (max < validData.get(i)){
                max = validData.get(i);
            }
            if (min > validData.get(i)){
                min = validData.get(i);
            }
        }
        System.out.println("Успішно розпізнаний список Integer: " +validData);
        System.out.println("Знайдений мінімум: " + min + " | Знайдений максимум: " + max);
        validData.remove(Integer.valueOf(-30));
        System.out.println("Після remove(Integer.valueOf(-30) (за значенням): " + validData);
    }


    public static void main(String[] args) {
    int[] testValue = {-128,-50,0,127,128,500,2026};
    inspectIntegerCache(testValue);
    demonstrateAutoboxingUnderTheHood();
    String[] rawPackets= {" 145 ","-30","ERR_404","980","",null,"2147483647","-85"};
    printExtremesAndStats(parseTelemetryStream(rawPackets));
    }
}
