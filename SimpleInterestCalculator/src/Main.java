import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a principal : ");
        double principal = sc.nextDouble();
        System.out.print("Please enter a rate : ");
        double rate = sc.nextDouble();
        System.out.print("Please enter a time : ");
        double time = sc.nextDouble();
        double simple_interest = (principal*rate*time)/100;
        System.out.println("Simple interest is :" + simple_interest);
    }
}
