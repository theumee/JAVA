
import java.util.Scanner;

public class calc {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number:");
        double num1 = sc.nextDouble();
        System.out.println("Enter operation (eg. +, -, * & /):");
        sc.nextLine();
        String op = sc.nextLine();
        System.out.println("Enter Second Number:");
        double num2 = sc.nextDouble();
        double output = 0;
        switch (op) {
            case "+" -> output = num1 + num2;
            case "-" -> output = num1 - num2;
            case "*" -> output = num1 * num2;
            case "/" -> output = num1 / num2;
            default -> System.out.println("Invalid Operation!");
        }
        System.out.println(num1 + " " + op + " " + num2 + " = " + output);

    }
}


