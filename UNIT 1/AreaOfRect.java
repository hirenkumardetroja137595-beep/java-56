import java.util.Scanner;

class AreaOfRect {
	public static void main(String[] args) 
	{
        		int h;
        		int w;
    		int b;
    		int aor;

        		System.out.print("Enter the Length: ");
    		Scanner sc = new Scanner(System.in);
        		h = sc.nextInt();

        		System.out.print("Enter the width: ");
    		Scanner sc1 = new Scanner(System.in);
       		 w = sc1.nextInt();

        		System.out.print("Enter the b: ");
    		Scanner sc2 = new Scanner(System.in);
        		b = sc2.nextInt();

    		aor = h * w *b;
        
        		System.out.println("Area of Rectengel is: " + aor);

        sc.close();
    }
}