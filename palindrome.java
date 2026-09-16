import java.util.Scanner;

class Palindrome
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n, temp, digit, rev = 0;

        System.out.print("Enter a number: ");
        n = sc.nextInt();

        temp = n;

        while (n > 0)
        {
            digit = n % 10;
            rev = rev * 10 + digit;
            n = n / 10;
        }

        if (rev == temp)
        {
            System.out.println("Palindrome number");
        }
        else
        {
            System.out.println("Not a Palindrome number");
        }
        sc.close();
    }
    
}