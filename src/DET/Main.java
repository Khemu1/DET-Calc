package DET;

public class Main {
    public static void main(String[] args) {
        ICalculator1 calculator = new ICalculator1();
        calculator.add(5);
        calculator.sub(3);
        calculator.mul(2);
        System.out.println("Current Value: " + calculator.getCurrentValue());

        int sign = calculator.sign();
        System.out.println("Sign: " + sign);
    }
}
