package semestr1.practise10;

public class EmailSender extends NotificationSender{

    public EmailSender(String recipient) {
        super(recipient);
    }
    @Override
    public String send(String message){
        String emailFormat = "[Тема: ТЕРМІНОВА ТРИВОГА] " + message;
        return super.send(emailFormat);
    }
}
