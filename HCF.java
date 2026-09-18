import java.util.Scanner;

class HCF
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int a, b, i, hcf = 1;

        System.out.print("Enter first number: ");
        a = sc.nextInt();

        System.out.print("Enter second number: ");
        b = sc.nextInt();

        for (i = 1; i <= a && i <= b; i++)
        {
            if (a % i == 0 && b % i == 0)
            {
                hcf = i;
            }
        }

        System.out.println("HCF = " + hcf);
        sc.close();
    }
}