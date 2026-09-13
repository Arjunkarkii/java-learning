import java.util.Scanner;

class productodd
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n, digit, product = 1;

        System.out.print("Enter a number: ");
        n = sc.nextInt();

        while (n > 0)
        {
            digit = n % 10;

            if (digit % 2 != 0)
            {
                product = product * digit;
            }

            n = n / 10;
        }

        System.out.println("Product of odd digits = " + product);
        sc.close();
    }
}