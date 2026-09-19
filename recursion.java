import java.util.Scanner;

class recursion
{
    static int factorial(int n)
    {
        if (n == 0)
        {
            return 1;
        }
        else
        {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n;

        System.out.print("Enter a number: ");
        n = sc.nextInt();

        System.out.println("Factorial = " + factorial(n));
        sc.close();
    }
}