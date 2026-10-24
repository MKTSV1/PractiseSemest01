package semestr1.practise07;

public class DocumentPrinter {
    public void print(String message){
        System.out.println("message");
    }
    public void print(int number){
        System.out.println("[INT]: " + number);
    }
    public void print(double number, int decimals){
        String format = "%." + decimals + "f";
        System.out.println(String.format(format,number));
    }
    public void print(String[] lines){
        for (int i = 0; i < lines.length; i++) {
            System.out.println(i + 1 + ". " + lines[i]);
        }
    }
    public void print(String message, boolean uppercase){
        if (uppercase){
            System.out.println(message.toUpperCase());
        }else{
            System.out.println(message);
        }
    }
}
