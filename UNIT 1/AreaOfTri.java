import java.util.Scanner;
class AreaOfTri {
    public static void main(String[] args) {
        int l, b;
        double tri;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Length: ");
        l = sc.nextInt();

        System.out.print("Enter the Width: ");
        b = sc.nextInt();

        tri = 0.5 * l * b;

        System.out.println("Area of Triangle is: " + tri);

        sc.close();
    }
}