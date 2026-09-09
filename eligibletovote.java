import java.util.Scanner;

class eligibletovote
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int age;

        System.out.print("Enter your age: ");
        age = sc.nextInt();

        if (age >= 18)
        {
            System.out.println("Eligible to vote");
        }
        else
        {
            System.out.println("Not eligible to vote");
        }
        sc.close();
    }
}