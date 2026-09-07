import java.util.Scanner;

pclass cubevolume {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double side, volume;

        System.out.print("Enter side of cube: ");
        side = sc.nextDouble();

        volume = side * side * side;

        System.out.println("Volume of cube = " + volume);

        sc.close();
    }
}