class Student
{
    String name;
    int roll_no;

    public static void main(String[] args)
    {
        Student student1 = new Student();

        student1.name = "John";
        student1.roll_no = 2;

        System.out.println("Name = " + student1.name);
        System.out.println("Roll No = " + student1.roll_no);
    }
}