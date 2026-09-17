import java.util.Scanner;

class Factors
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n, i;

        System.out.print("Enter a number: ");
        n = sc.nextInt();

        System.out.println("Factors are:");

        for (i = 1; i <= n; i++)
        {
            if (n % i == 0)
            {
                System.out.println(i);
            }
        }
        sc.close();
    }
}