import java.util.Scanner;

class AreaOfCircle {
	public static void main(String[] args) 
	{
        		int r;
        		float pi = 3.14f;
        		float aoc;

       		 Scanner sc = new Scanner(System.in);

        		System.out.print("Enter the radius: ");
       		 r = sc.nextInt();

       		 aoc = pi * r * r;

        		System.out.println("Area of circle is: " + aoc);

        		sc.close();
    	}
}