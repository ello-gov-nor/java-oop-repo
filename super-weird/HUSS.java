import java.util.Scanner;

public class HUSS {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double num1, num2, result;
        char operator;

        System.out.println("Simple Calculator");
        System.out.print("Enter first number: ");
        num1 = input.nextDouble();

        System.out.print("Enter operator (+, -, *, /): ");
        operator = input.next().charAt(0);

        System.out.print("Enter second number: ");
        num2 = input.nextDouble();

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("Cannot divide by zero.");
                    input.close();
                    return;
                }
                result = num1 / num2;
                break;
            default:
                System.out.println("Invalid operator.");
                input.close();
                return;
        }

        System.out.println("Result: " + result);
        input.close();
    }
}
