import java.util.Scanner;

class DivisibleBy5
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n;

        System.out.print("Enter a number: ");
        n = sc.nextInt();

        if (n % 5 == 0)
        {
            System.out.println("The number is divisible by 5");
        }
        else
        {
            System.out.println("The number is not divisible by 5");
        }
        sc.close();
    }
}