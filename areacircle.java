import java.util.Scanner;

class areacircle
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        double radius, area;

        System.out.print("Enter radius: ");
        radius = sc.nextDouble();

        area = Math.PI * radius * radius;

        System.out.println("Area of circle = " + area);
    }
}