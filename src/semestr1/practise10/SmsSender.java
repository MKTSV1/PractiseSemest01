package semestr1.practise10;

public class SmsSender extends NotificationSender{
    public SmsSender(String recipient) {
        super(recipient);
    }
        @Override
        public String send(String message) {
            String processedMessage = message;
            if (message.length() > 70) {
                processedMessage = message.substring(0, 70) + "...";
            }
            return super.send(processedMessage);
        }
    }


