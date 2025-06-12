package Lab5;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double firstNumber;
        double secondNumber;
        String operachin;
        double result = 0;

        System.out.print("1st num: ");
        firstNumber = scanner.nextDouble();
        System.out.print("Op (+ - * / ^): ");
        operachin = scanner.next();
        System.out.print("2nd num: ");
        secondNumber = scanner.nextDouble();

        switch (operachin) {
            case "+":
                result = firstNumber + secondNumber;
                break;
            case "-":
                result = firstNumber - secondNumber;
                break;
            case "*":
                result = firstNumber * secondNumber;
                break;
            case "/":
                if (secondNumber == 0) {
                    System.out.println("Can't divide by 0!");
                    scanner.close();
                    return;
                } else {
                    result = firstNumber / secondNumber;
                }
                break;
            case "^":
                result = Math.pow(firstNumber, secondNumber);
                break;
            default:
                System.out.println("Invalid op!");
                scanner.close();
                return;
        }

        System.out.println("= " + result);
        scanner.close();
    }
}
