class Triangle
{
    int side1 = 3;
    int side2 = 4;
    int side3 = 5;

    Triangle()
    {
        // No parameter constructor
    }

    void calculate()
    {
        int perimeter;
        double area;

        perimeter = side1 + side2 + side3;

        area = (side1 * side2) / 2.0;

        System.out.println("Area = " + area);
        System.out.println("Perimeter = " + perimeter);
    }

    public static void main(String[] args)
    {
        Triangle t = new Triangle();

        t.calculate();
    }
}