import java.util.Scanner;

class SumNatural
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n, i, sum = 0;

        System.out.print("Enter n: ");
        n = sc.nextInt();

        for (i = 1; i <= n; i++)
        {
            sum = sum + i;
        }

        System.out.println("Sum = " + sum);
        sc.close();
    }
}