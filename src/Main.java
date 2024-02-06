import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double num1;
        double num2;
        double result;

        Scanner myNum = new Scanner(System.in);

        System.out.print("Enter First Number: ");
        num1 = myNum.nextDouble();

        System.out.print("Enter Second Number: ");
        num2 = myNum.nextDouble();

       // (1: Add, 2: Subtract, 3: Multiply, 4: Divide):
        System.out.println("Pick an operation");
        System.out.println("1: Add:      ");
        System.out.println("2: Minus:    ");
        System.out.println("3: Multiply: ");
        System.out.println("4: Divide:   ");

        int choice = myNum.nextInt();

        switch(choice) {
            case 1:
                result = num1 + num2;
                System.out.println("Result: " + result);
                break;
            case 2:
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;
            case 3:
                result = num1 * num2;
                System.out.println("Result: " + result);
                break;
            case 4:
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error: Cannot divide by zero");
                }
            default:
                System.out.println("Invalid number");
        }
    }
}