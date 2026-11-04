package semestr1.practise10;

public interface Measurable {
    double getMeasure();
    public static double computeAverage(Measurable[] items){
        double countOfItems = 0;
        double allCost = 0;
        for (int i = 0; i < items.length; i++) {
            countOfItems++;
            allCost +=items[i].getMeasure();
        }
        return allCost / countOfItems;
    }
}
