
import java.util.Scanner;

public class TestRectangle {
    // Get positive input from user
    public static double checkPositiveInput(Scanner input, String strMsg) {
        double value;
        while (true) {
            System.out.print(strMsg);
            if (input.hasNextDouble()) {
                value = input.nextDouble();
                if (value > 0){ 
                  break;
                } else { 
                  System.out.println("Invalid input, ONLY +ve numbers are allowed. Try again.");
                }
            } else {
                System.out.println("Invalid input. Please enter a number.");
                input.next();
            }
        }
        return value;
    }

    // View rectangle details
    public static void viewRectInfo(Rectangle rect, String name) {
        System.out.printf("------------------\nWidth: \t\t%.2f\nHeight: \t\t%.2f\nArea: \t\t%.2f\nPerimeter: \t%.2f\n", rect.getWidth(), rect.getHeight(), rect.getArea(), rect.getPerimeter());
        System.out.println(rect.toString(name));
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentVal = "y";

        while (sentVal.equalsIgnoreCase("y") || sentVal.equalsIgnoreCase("yes")) {
            System.out.println("\nRECTANGLE OBJECTS:");

            // myRectangle (default values)
            Rectangle myRectangle = new Rectangle();

            // hisRectangle 
            System.out.println("\nEnter dimensions for hisRectangle:");
            double hisWidth = checkPositiveInput(input, "Width: ");
            double hisHeight = checkPositiveInput(input, "Height: ");
            Rectangle hisRectangle = new Rectangle(hisWidth, hisHeight);

            // herRectangle
            System.out.println("\nEnter dimensions for herRectangle:");
            double herWidth = checkPositiveInput(input, "Width: ");
            double herHeight = checkPositiveInput(input, "Height: ");
            Rectangle herRectangle = new Rectangle(herWidth, herHeight);

            // Display all 
            System.out.println("\nmyRectangle:");
            viewRectInfo(myRectangle, "myRectangle");

            System.out.println("\nhisRectangle:");
            viewRectInfo(hisRectangle, "hisRectangle");

            System.out.println("\nherRectangle:");
            viewRectInfo(herRectangle, "herRectangle");

            // Sentinel check
            System.out.print("\nWould you like to re-run? (y/n): ");
            input.nextLine(); 
            sentVal = input.nextLine();
        }

        input.close();
    }
}

