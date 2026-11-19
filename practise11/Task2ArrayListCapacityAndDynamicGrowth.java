package semestr1.practise11;

import java.util.ArrayList;

public class Task2ArrayListCapacityAndDynamicGrowth {
    public static void main(String[] args) {
        System.out.println("================ ЕМУЛЯТОР ВНУТРІШНЬОЇ БУДОВИ ARRAYLIST (ПІД КАПОТОМ) ================");
        var emulator = new CustomArrayCapacityEmulator<String>();
        var raw = new ArrayList<>();
        raw.add("Текст");
        raw.add(123);
        System.out.println("[ІНІЦІАЛІЗАЦІЯ]: Створено CustomArrayCapacityEmulator<String> | size = "
                + emulator.size() + " | capacity = " + emulator.getCapacity());
        System.out.println("\n--- Додавання 35 елементів у список ---");
        for (int i = 1; i <= 35; i++) {
            int prevCapacity = emulator.getCapacity();
            emulator.add("Block-" + i);
            int currentCapacity = emulator.getCapacity();
            if (currentCapacity > prevCapacity) {
                System.out.println("⚡ [GROW #" + emulator.getResizeCount() + "] Переповнення при додаванні "
                        + i + "-го елемента! Ємність: " + prevCapacity + " → " + currentCapacity
                        + " (System.arraycopy скопіював " + prevCapacity + " елементів)");
            }
        }
        System.out.println("Стан після додавання 35 елементів: size = " + emulator.size()
                + " | capacity = " + emulator.getCapacity()
                + " (Вільний резерв: " + (emulator.getCapacity() - emulator.size()) + " комірок null)");
        System.out.println("\n--- Тестування вставки add(0, 'HEADER') та видалення remove(5) ---");
        int shiftedRight = emulator.size();
        emulator.add(0, "HEADER");
        System.out.println("→ Вставлено 'HEADER' на індекс 0 (зсунуто праворуч " + shiftedRight + " елементів через System.arraycopy)");
        int shiftedLeft = emulator.size() - 5 - 1;
        String removed = emulator.remove(5);
        System.out.println("→ Видалено елемент '" + removed + "' з індексу 5 (зсунуто ліворуч "
                + shiftedLeft + " елементів, хвіст занулено для GC)");
        System.out.println("Поточний стан: size = " + emulator.size()
                + " | capacity = " + emulator.getCapacity()
                + " | Перший: '" + emulator.get(0) + "'"
                + " | Останній: '" + emulator.get(emulator.size() - 1) + "'");
        System.out.println("\n--- Оптимізація пам'яті trimToSize() ---");
        int capacityBeforeTrim = emulator.getCapacity();
        emulator.trimToSize();
        System.out.println("→ Викликано trimToSize(): буфер Object[" + capacityBeforeTrim
                + "] стиснуто рівно до Object[" + emulator.getCapacity() + "]!");
        System.out.println("Фінальна телеметрія: size = " + emulator.size()
                + " | capacity = " + emulator.getCapacity()
                + " (capacity == size: " + (emulator.getCapacity() == emulator.size()) + ")"
                + " | Кількість розширень: " + emulator.getResizeCount());
        System.out.println("====================================================================================");
    }
}