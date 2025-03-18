import java.util.Scanner;

class Area {
    private double length;
    private double breadth;

    // Method to set dimensions
    public void setDim(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Method to calculate and return area
    public double getArea() {
        return length * breadth;
    }
}

public class AreaTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for rectangle dimensions
        System.out.print("Enter length of the rectangle: ");
        double length = scanner.nextDouble();
        System.out.print("Enter breadth of the rectangle: ");
        double breadth = scanner.nextDouble();

        // Creating Area object
        Area rectangle = new Area();
        rectangle.setDim(length, breadth);

        // Displaying the area of the rectangle
        System.out.println("The area of the rectangle is: " + rectangle.getArea());

        scanner.close();
    }
}
