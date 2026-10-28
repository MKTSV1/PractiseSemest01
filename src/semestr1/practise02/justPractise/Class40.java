package semestr1.practise02.justPractise;

public class Class40 {
    public static void main(String[] args) {
        System.out.println("""
                +---------------------------------------+
                |             IT-STORE ЧЕК              |
                +---------------------------------------+
                | Товар		       К-сть	   Ціна     |
                | Флешка 128GB	     2	       750 грн  |
                | Килимок для миші	 1	       600 грн  |
                +---------------------------------------+
                | Разом до сплати (грн):                |""");
        System.out.print("| ");
        System.out.print(750*2+600*1);
        System.out.println("                                  |");
        System.out.println("""
                +---------------------------------------+
                |      Дякуємо за покупку!              |
                +---------------------------------------+
                """);
    }
}
