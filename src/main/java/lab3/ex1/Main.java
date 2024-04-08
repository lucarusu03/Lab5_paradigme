package lab3.ex1;

public class Main {
    public static void main(String[] args) {
        IntCalculator calculator = new IntCalculator(10);
        int result = calculator.add(5).subtract(3).multiply(2).result();
        System.out.println("a) " + result);

        AdvancedCalculator calculator1 = new AdvancedCalculator(10);
        int result2 = calculator1.power(2).impart(4).radical(2).result();
        //int result2 = calculator1.power(2).result();
        System.out.println("b) " + result2);
    }
}
