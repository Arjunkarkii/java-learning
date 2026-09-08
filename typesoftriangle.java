import java.util.Scanner;

class typesoftriangle
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int a, b, c;

        System.out.print("Enter first side: ");
        a = sc.nextInt();

        System.out.print("Enter second side: ");
        b = sc.nextInt();

        System.out.print("Enter third side: ");
        c = sc.nextInt();

        if (a == b && b == c)
        {
            System.out.println("Equilateral Triangle");
        }
        else if (a == b || b == c || a == c)
        {
            System.out.println("Isosceles Triangle");
        }
        else
        {
            System.out.println("Scalene Triangle");
        }
        sc.close();
    }
}