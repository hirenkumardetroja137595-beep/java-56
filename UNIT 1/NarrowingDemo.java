public class NarrowingDemo 
{
	public static void main(String[] args) 
	{
		double currentPrice = 9.78;
		int roundedPrice = (int) currentPrice;
		System.out.println("Original Double: " + currentPrice);
		System.out.println("Narrowed Integer: " + roundedPrice);
	}
}