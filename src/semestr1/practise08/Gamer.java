package semestr1.practise08;

public class Gamer {
    private String nickname;
    private int hoursPlayed;
    public Gamer(String nickname, int hoursPlayed){
        this.nickname = nickname;
        this.hoursPlayed = hoursPlayed;
    }
    @Override public String toString(){
        return String.format("Чел під ніком %s, награв %d годин", nickname,hoursPlayed);
    }
}
