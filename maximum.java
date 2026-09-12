import java.util.Scanner;

class maximum
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int a, b, c, max;

        System.out.print("Enter first number: ");
        a = sc.nextInt();

        System.out.print("Enter second number: ");
        b = sc.nextInt();

        System.out.print("Enter third number: ");
        c = sc.nextInt();

        max = a;

        if (b > max)
        {
            max = b;
        }

        if (c > max)
        {
            max = c;
        }

        System.out.println("Maximum number = " + max);
        sc.close();
    }
}