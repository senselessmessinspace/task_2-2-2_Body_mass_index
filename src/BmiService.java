package src;

public class BmiService {
    public double calculate(double weight, double height) {
        double index = weight/(height*height);
        return ((double) Math.round(index*10))/10;
    }
}