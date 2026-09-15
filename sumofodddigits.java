import java.util.Scanner;

class SumDigits
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n, digit, sum = 0;

        System.out.print("Enter a number: ");
        n = sc.nextInt();

        while (n > 0)
        {
            digit = n % 10;
            sum = sum + digit;
            n = n / 10;
        }

        System.out.println("Sum of digits = " + sum);
        sc.close();
    }
}