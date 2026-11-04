package semestr1.practise10;

public class NotificationSender {
    private final String recipient;
    public NotificationSender(String recipient){
        this.recipient =recipient;
    }
    public String send(String message){
        return "Одержувач "+ recipient + "|Текст:" + message;
    }
    public static void broadcastAlert(NotificationSender[] senders,String alertText){
        for (NotificationSender s : senders){
            System.out.println(s.send(alertText));
        }
    }
}
