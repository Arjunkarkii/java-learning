import java.util.Scanner;

class average
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double a, b, c, average;
        System.out.print("Enter first number: ");
        a = sc.nextDouble();
        System.out.print("Enter second number: ");
        b = sc.nextDouble();
        System.out.print("Enter third number: ");
        c = sc.nextDouble();

        average = (a + b + c) / 3;

        System.out.println("Average = " + average);
    }
}