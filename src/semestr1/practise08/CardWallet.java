package semestr1.practise08;

public class CardWallet {
    private String cardNumber;
    private String pinCode;
    private double balance;
    public CardWallet(String cardNumber,String pinCode, double balance){
        this.cardNumber = cardNumber;
        this.pinCode = pinCode;
        this.balance = balance;

    }
    public boolean changePin(String oldPin, String newPin){
        if (pinCode.equalsIgnoreCase(oldPin)){
            pinCode = newPin;
            return true;
        }
        return false;
    }
    @Override public String toString() {
        String last4 = cardNumber.substring(cardNumber.length() - 4);
        String maskedCard = "**** **** **** " + last4;
        return String.format("CardWallet{card='%s', balance=%.2f UAH}", maskedCard, balance);
    }
}
