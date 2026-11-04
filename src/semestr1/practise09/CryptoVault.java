package semestr1.practise09;

public class CryptoVault {
    private final String walletAddress;
    private String secretRecoveryPhrase;
    private double btcBalance;
    private boolean locked;
    public CryptoVault(String walletAddress, String secretRecoveryPhrase, double btcBalance, boolean locked){
        this.walletAddress = walletAddress;
        this.secretRecoveryPhrase = secretRecoveryPhrase;
        this.btcBalance = btcBalance;
        this.locked = locked;
    }

    public String getSecretRecoveryPhrase(){
        return "Отказано";
    }
    public void setbtcBalance(double amount){
        this.btcBalance = this.btcBalance;
    }
    public boolean unlock(String phrase){
        if (secretRecoveryPhrase.equalsIgnoreCase(phrase)){
            return locked = false;
        }
        return locked = true;
    }
    public void lock(){
    locked = true;
    }
    public boolean sendBtc(double amount,String destination){
        if (!locked && amount >0 && btcBalance >= amount){
            this.btcBalance -= amount;
            return true;
        }
        return  false;
    }
    @Override public String toString(){
        return  String.format("Адреса гаманця = %s | Статус гаманця %b |" +
                " Баланс гаманця = %.2f",walletAddress,locked,btcBalance);
    }
}
