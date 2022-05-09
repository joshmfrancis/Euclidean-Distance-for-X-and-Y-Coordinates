// Name: Joshua Francis
// Course: CSC 135
// Project: Problem_3_2
// File Name: EuclideanDistance.java

// Program that asks for the user to input 2 (x,y) values 
// (formatted as 'x1 y1 x2 y2') and outputs the distance between them.

// Imports that I used
import java.util.Scanner;

public class EuclideanDistance {
    
    public static void main(String[] args) {
        
        // Makes a new scanner to scan the input from the user
        Scanner scan = new Scanner(System.in);
        
        // Variables that I used: (I declare more below) (It saves space)
        String input;
        double dist; 
        
        // Asks the user for the coordinates formatted as 'x1 y1 x2 y2'
        System.out.print("Enter the coordinates of two points "
        + "(Make sure they are fromatted as 'x1 y1 x2 y2'): ");
        input = scan.nextLine();
        
        // Splits the input from directly above into four seperate strings
        String x1 = input.split(" ")[0];
        String y1 = input.split(" ")[1];
        String x2 = input.split(" ")[2];
        String y2 = input.split(" ")[3];
        
        // Takes the 4 string variables that I made directly 
        // above and converts them to 4 double variable
        double x1Final = Integer.parseInt(x1);
        double y1Final = Integer.parseInt(y1);
        double x2Final = Integer.parseInt(x2);
        double y2Final = Integer.parseInt(y2);

        // Euclidean Distance Formula that takes in the 4 double variables
        // that I made directly above and assigns it to the variable 'dist'
        dist = Math.sqrt(Math.pow((x2Final - x1Final), 2)
        + Math.pow((y2Final - y1Final), 2));
        
        // Outputs the distance between the 2 points
        System.out.println("The Distance "
        + "Between the two points is " + dist + ".");
    }
}
