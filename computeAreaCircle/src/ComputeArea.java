import java.util.*;
public class ComputeArea {
    public static void main(String[] args) {
        //Create a Scanner object 
        Scanner input = new Scanner(System.in);
        // Prompet the user to enter a radius 
        System.out.print("Enter a number for radius: ");
        double radius = input.nextDouble();
        // Compute area
        double area = radius * radius * 3.14159;
        //Display results 
        System.out.println("The Area for the circle of radius " + radius + " is " + area);
    }
}
