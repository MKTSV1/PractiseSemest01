package semestr1.practise06;

public class ArrayStats {
    private int[] numbers;
    public void setNumbers(int[] nums){
        this.numbers = nums;
    }
    public int countEvens(){
        int evens = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0){
                evens++;
            }
        }
        return evens;
    }
    public int countOdds(){
        int odds = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0 ){
                odds ++;
            }
        }
        return  odds;
    }
    public int calculateSum(){
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum +=numbers[i];
        }
        return  sum;
    }
}
