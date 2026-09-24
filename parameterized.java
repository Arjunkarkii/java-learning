import java.util.Scanner;

class Area
{
    int length;
    int breadth;

    Area(int length, int breadth)
    {
        this.length = length;
        this.breadth = breadth;
    }

    int returnArea()
    {
        return length * breadth;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int length, breadth, area;

        System.out.print("Enter length: ");
        length = sc.nextInt();

        System.out.print("Enter breadth: ");
        breadth = sc.nextInt();

        Area obj = new Area(length, breadth);

        area = obj.returnArea();

        System.out.println("Area of rectangle = " + area);

        sc.close();
    }
}