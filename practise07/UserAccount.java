package semestr1.practise07;

public class UserAccount {
    private int id;
    private String username;
    private String email;
    private static int nextId = 1001;
    UserAccount(String username, String email){
        this.username = username;
        this.email = email;
        this.id = nextId++;
        System.out.println(username + email + id);
    }
    public static int getNextAvailableId(){
        return nextId;
    }
    public static void resetIdSequence(int startId){
        nextId = startId;
    }
}
