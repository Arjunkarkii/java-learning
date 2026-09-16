import java.util.Scanner;

class Armstrong
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n, temp, digit, arm = 0;

        System.out.print("Enter a number: ");
        n = sc.nextInt();

        temp = n;

        while (n > 0)
        {
            digit = n % 10;
            arm = arm + digit * digit * digit;
            n = n / 10;
        }

        if (arm == temp)
        {
            System.out.println("Armstrong number");
        }
        else
        {
            System.out.println("Not an Armstrong number");
        }
        sc.close();
    }
}