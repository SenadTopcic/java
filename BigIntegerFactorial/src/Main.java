import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the number ");
        int num = sc.nextInt();

        BigInteger result = BigInteger.ONE;

        for (int i = 1; i <= num; i++) {
            BigInteger tempInt = BigInteger.valueOf(i);
            result = result.multiply(tempInt);
        }
        System.out.println("Factorial of number " + num + " is " + result);
    }
}