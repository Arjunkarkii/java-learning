import java.util.Scanner;

class simpleinterest
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        double principal, rate, time, interest;

        System.out.print("Enter principal amount: ");
        principal = sc.nextDouble();

        System.out.print("Enter rate: ");
        rate = sc.nextDouble();

        System.out.print("Enter time: ");
        time = sc.nextDouble();

        interest = (principal * rate * time) / 100;

        System.out.println("Simple Interest = " + interest);
    }
}