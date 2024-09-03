/*Write a program to print the area of a rectangle by creating a class named
 'Area' taking the values of its length and breadth as parameters of its
 constructor and having a method named 'returnArea' which returns the area of
 the rectangle.Length and breadth of rectangle are entered through keyboard. */

import java.util.Scanner;

public class Area_of_rectangle {
    private double len;
    private double br;

    public Area_of_rectangle(double len, double br) {
        this.len = len;
        this.br = br;
    }

    public double returnArea() {
        return len * br;
    }

    @SuppressWarnings("resource")
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the rectangle: ");
        double len = scanner.nextDouble();

        System.out.print("Enter the breadth of the rectangle: ");
        double br = scanner.nextDouble();

        Area_of_rectangle r1 = new Area_of_rectangle(len, br);
        System.out.println(r1.returnArea());
    }
}
// dark matter