package Lab1;
import java.util.Scanner;

public class ByteToDouble {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Number: ");
            byte b = scanner.nextByte();
            double d = b;
            double result = d * 2.5;
            int finalResult = (int) result;
            System.out.println("Result: " + finalResult);
        }
    }

