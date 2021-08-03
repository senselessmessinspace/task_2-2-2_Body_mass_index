package src;

public class Main {
    public static void main(String[] args) {
        BmiService bmi = new BmiService();
        double weight = 55;
        double height = 1.8;
        System.out.println(bmi.calculate(weight, height));
    }
    
}
