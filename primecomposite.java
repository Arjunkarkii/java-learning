import java.util.Scanner;

class primeomposite
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n, i, count = 0;

        System.out.print("Enter a number: ");
        n = sc.nextInt();

        for (i = 1; i <= n; i++)
        {
            if (n % i == 0)
            {
                count++;
            }
        }

        if (count == 2)
        {
            System.out.println("Prime number");
        }
        else
        {
            System.out.println("Composite number");
        }
        sc.close();
    }
}