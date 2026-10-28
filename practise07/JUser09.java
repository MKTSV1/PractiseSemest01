package semestr1.practise07;

public class JUser09 {
    private String login;
    private String email;
    private String role;
    private boolean isActive;
public JUser09(String login, String email, String role, boolean isActive){
this.login = login;
this.email = email;
this.role = role;
this.isActive = isActive;
}
    public JUser09(String login, String email){
        this(login, email, "USER", true);
    }
public JUser09(String login) {
    this(login, login + "@domain.com");
}
public JUser09(){
    this("guest");
}
public void printUser(){
        System.out.println("Логін " + login);
        System.out.println("Емаіл " + email);
        System.out.println("Роль " + role);
        System.out.println("Аккаунт активний? " + isActive);
    }
}
