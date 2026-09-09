import java.util.Scanner;

class positivenegative
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n;

        System.out.print("Enter a number: ");
        n = sc.nextInt();

        if (n > 0)
        {
            System.out.println("Positive number");
        }
        else if (n < 0)
        {
            System.out.println("Negative number");
        }
        else
        {
            System.out.println("Zero");
        }
        sc.close();
    }
}