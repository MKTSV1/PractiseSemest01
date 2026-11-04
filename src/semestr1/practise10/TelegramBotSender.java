package semestr1.practise10;

public class TelegramBotSender extends NotificationSender{
    public TelegramBotSender(String recipient) {
        super(recipient);
    }
    @Override
    public String send(String message) {
        // Додає Markdown-теги та емодзі[cite: 1]
        String tgFormat = "🚨 **" + message + "** 🚨";
        return super.send(tgFormat);
    }
}
