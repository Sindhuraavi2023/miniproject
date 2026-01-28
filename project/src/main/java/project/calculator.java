package project;
import java.util.Scanner;
public class calculator {
	public static void main(String[] args) {
        
        double num1, num2, num3, result = 0;
        char operator;
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Enter three numbers:");
        num1 = scanner.nextDouble();
        num2 = scanner.nextDouble();
        num3 = scanner.nextDouble();

        
        System.out.println("Choose an operator: +, -, *, or /");
        operator = scanner.next().charAt(0);

        
        switch (operator) {
            case '+':
                result = num1 + num2 + num3;
                break;
            case '-':
                result = num1 - num2 - num3;
                break;
            case '*':
                result = num1 * num2 * num3;
                break;
            case '/':
                if (num2 == 0 || num3 == 0) {
                    System.out.println("Error: Division by zero is not allowed.");
                    scanner.close();
                    return; 
                }
                result = num1 / num2 / num3;
                break;
            default:
                System.out.println("Error: Invalid operator entered.");
                scanner.close();
                return; 
        }

        
        System.out.println("\nThe result is: " + result);
        scanner.close();
    }
}
        