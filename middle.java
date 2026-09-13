import java.util.Scanner;

class Middle
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int a, b, c, middle;

        System.out.print("Enter first number: ");
        a = sc.nextInt();

        System.out.print("Enter second number: ");
        b = sc.nextInt();

        System.out.print("Enter third number: ");
        c = sc.nextInt();

        if ((a > b && a < c) || (a < b && a > c))
        {
            middle = a;
        }
        else if ((b > a && b < c) || (b < a && b > c))
        {
            middle = b;
        }
        else
        {
            middle = c;
        }

        System.out.println("Middle number = " + middle);
        sc.close();
    }
}