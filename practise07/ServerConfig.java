package semestr1.practise07;

public class ServerConfig {
    public static final String SERVER_NAME = "AlphaEnterprise";
    public static final int MAX_CONNECTIONS = 5;
    private static int activeConnections = 0;
    public static boolean connect(){
        if (activeConnections < MAX_CONNECTIONS){
            activeConnections++;
            return true;
        }
        return false;

    }
    public static void disconnect(){
        if (activeConnections > 0) {
            activeConnections--;
        }
    }
    public static void printServerStatus(){
            System.out.println(SERVER_NAME + " " + MAX_CONNECTIONS + " " + activeConnections);
            if (activeConnections == 5){
                System.out.println("МАКСИМАЛЬНА КІЛЬКІСТЬ КОРИСТУВАЧІВ");
        }
    }

}
