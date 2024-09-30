package bsp4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RationalCalculator rationalCalculator = new RationalCalculator();
        VectorCalculator vectorCalculator = new VectorCalculator();
        ComplexCalculator complexCalculator = new ComplexCalculator();

        while (true) {
            System.out.println("Choose calculator:");
            System.out.println("1 = Rational Calculator");
            System.out.println("2 = Vector Calculator");
            System.out.println("3 = Complex Calculator");
            System.out.println("4 = Exit program");
            int choice = scanner.nextInt();

            if (choice == 4) {
                break;
            }

            System.out.print("Enter number x a> ");
            double xA = scanner.nextDouble();
            System.out.print("Enter number x b> ");
            double xB = scanner.nextDouble();
            System.out.print("Enter number y a> ");
            double yA = scanner.nextDouble();
            System.out.print("Enter number y b> ");
            double yB = scanner.nextDouble();

            Number x = new Number(xA, xB);
            Number y = new Number(yA, yB);

            while (true) {
                System.out.println("Choose operation:");
                System.out.println("1 - Add");
                System.out.println("2 - Subtract");
                System.out.println("3 - Multiply");
                System.out.println("4 - Divide");
                System.out.println("5 - Enter numbers again");
                int operation = scanner.nextInt();

                if (operation == 5) {
                    break;
                }
                Number result = null;
                switch (choice) {
                    case 1:
                        result = selection(rationalCalculator, operation, x, y);
                        break;
                    case 2:
                        result = selection(vectorCalculator, operation, x, y);
                        break;
                    case 3:
                        result = selection(complexCalculator, operation, x, y);
                        break;
                }
                if (result != null) {
                    System.out.println("=========================");
                    System.out.println("Solution:");
                    System.out.println("a = " + result.getA());
                    System.out.println("b = " + result.getB());
                    System.out.println("=========================");
                }
            }
        }
        scanner.close();
    }

    private static Number selection(AbstractCalculator calculator, int operation, Number x, Number y) {
        switch (operation) {
            case 1:
                return calculator.add(x, y);
            case 2:
                return calculator.subtract(x, y);
            case 3:
                return calculator.multiply(x, y);
            case 4:
                return calculator.divide(x, y);
            default:
                return null;
        }
    }
}
