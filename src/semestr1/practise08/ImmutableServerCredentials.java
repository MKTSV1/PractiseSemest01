package semestr1.practise08;

public final class ImmutableServerCredentials {
    private final String host;
    private final int port;
    private final String apiKey;
    public  ImmutableServerCredentials(String host,int port, String apiKey){
        this.host=host;
        this.port=port;
        this.apiKey=apiKey;
    }
    public String secretApiKey(){
        return "***SECRET***";
    }
    @Override
    public String toString() {
        return "Хост = " + host + " Порт = " + port + " Апікей = " + secretApiKey();
    }
}
