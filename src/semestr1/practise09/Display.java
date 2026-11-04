package semestr1.practise09;

public class Display {
    private double diagonalInches;
    private int brightnessPercent;
    public Display(double diagonalInches, int brightnessPerceny){
        this.diagonalInches = diagonalInches;
        this.brightnessPercent = Math.max(10,Math.min(100,brightnessPerceny));
    }

    public int getBrightnessPercent() {
        return brightnessPercent;
    }
    public void setBrightnessPercent(int percent){
        this.brightnessPercent = percent;
    }

    @Override
    public String toString() {
        return String.format("Діагональ екрану = %.1f | Яркість екрану = %d",diagonalInches,brightnessPercent);
    }
}
