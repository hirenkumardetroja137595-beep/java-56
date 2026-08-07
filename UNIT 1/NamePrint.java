import java.util.Scanner;

class NamePrint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        
        System.out.println("Your name is: " + name);
        
        scanner.close();
    }
}