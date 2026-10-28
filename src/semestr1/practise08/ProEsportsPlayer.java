package semestr1.practise08;

public class ProEsportsPlayer extends Gamer{
    private String teamName;
    private double prizeMoneyUSD;
    private int tournamentsWon;
    public ProEsportsPlayer(String nickname, int hoursPlayed,String teamName,double prizeMoneyUSD,int tournamentsWon){
        super(nickname,hoursPlayed);
        this.teamName = teamName;
        this.prizeMoneyUSD =prizeMoneyUSD;
        this.tournamentsWon = tournamentsWon;
    }
    public double getAveragePrizePerWin() {
        if (tournamentsWon == 0){
            tournamentsWon = 1;
        }
    return prizeMoneyUSD / tournamentsWon;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" | Грав у команді %s, всього виграв %.2f " +
                "долларів та взяв перемогу у %d турнірах. Середня виручка за виграш %.2f",
                teamName,prizeMoneyUSD,tournamentsWon,getAveragePrizePerWin());
    }
}
