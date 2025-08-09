package TANDEMLOOP;

//import java.util.Scanner;
//
//public class Problem1 {
//
//	public static void main(String[] args) {
//		
//		Scanner scan = new Scanner(System.in); 
//		double a=scan.nextDouble();
//		double b=scan.nextDouble();
//		String s=scan.nextLine();
//		
//		double res=(double)(a)+s+(b);
//		
//	}
//
//}
import java.util.Scanner;

class Calculator {
    // Method for Addition
    public double add(double a, double b) {
        return a + b;
    }

    // Method for Subtraction
    public double subtract(double a, double b) {
        return a - b;
    }

    // Method for Multiplication
    public double multiply(double a, double b) {
        return a * b;
    }

    // Method for Division (with zero check)
    public double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return 0;
        }
        return a / b;
    }
}

public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();

        // Taking input from user
        System.out.print("Enter first number (a): ");
        double a = sc.nextDouble();

        System.out.print("Enter second number (b): ");
        double b = sc.nextDouble();

        System.out.print("Enter operation (add, subtract, multiply, divide): ");
        String operation = sc.next().toLowerCase();

        double result = 0;
        boolean validOperation = true;

        // Performing the selected operation
        switch (operation) {
            case "add":
                result = calc.add(a, b);
                break;
            case "subtract":
                result = calc.subtract(a, b);
                break;
            case "multiply":
                result = calc.multiply(a, b);
                break;
            case "divide":
                result = calc.divide(a, b);
                break;
            default:
                System.out.println("Invalid operation!");
                validOperation = false;
        }

        // Displaying the result
        if (validOperation) {
            System.out.println("Result: " + result);
        }

        sc.close();
    }
}