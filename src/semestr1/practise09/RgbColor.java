package semestr1.practise09;

public class RgbColor {
    private final int red;
    private final int green;
    private final int blue;
    public RgbColor(int red, int green, int blue){
        this.red = clamp(red);
        this.green = clamp(green);
        this.blue = clamp(blue);
    }
    private static int clamp(int val){
        return Math.max(0, Math.min(255, val));
    }
    public String toHex(){
        return String.format("#%02X%02X%02X", red, green, blue);
    }
    public RgbColor invert() {
        return new RgbColor(255 - this.red, 255 - this.green, 255 - this.blue);
    }
    public RgbColor mixWith(RgbColor other) {
        return new RgbColor(
                (this.red + other.red) / 2,
                (this.green + other.green) / 2,
                (this.blue + other.blue) / 2
        );
    }
    @Override
    public String toString() {
        return String.format("%d - r | %d - g | %d - b | -> %s",red,green,blue, toHex());
    }
}
