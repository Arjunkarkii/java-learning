import java.util.Scanner;

class minimum
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int a, b, c, min;

        System.out.print("Enter first number: ");
        a = sc.nextInt();

        System.out.print("Enter second number: ");
        b = sc.nextInt();

        System.out.print("Enter third number: ");
        c = sc.nextInt();

        min = a;

        if (b < min)
        {
            min = b;
        }

        if (c < min)
        {
            min = c;
        }

        System.out.println("Minimum number = " + min);
        sc.close();
    }
    
}