import java.util.Scanner;

class HarmonicSeries
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n, i;
        double sum = 0;

        System.out.print("Enter n: ");
        n = sc.nextInt();

        for (i = 1; i <= n; i++)
        {
            System.out.print("1/" + i);

            if (i < n)
            {
                System.out.print(" + ");
            }

            sum = sum + (1.0 / i);
        }

        System.out.println();
        System.out.println("Sum = " + sum);
        sc.close();
    }
}