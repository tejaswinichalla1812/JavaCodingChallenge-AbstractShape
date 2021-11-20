/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package edu.nwmissouri.challenge;

/**
 *
 * @author Tejaswini Challa
 */
public class Rectangle extends AbstractShape {

    /**
     * @param args the command line arguments
     */
    private double width;
    private double height;

    public Rectangle(double width, double height) {

        super("Rectangle");
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2.0 * (width + height);
    }
    // add an executable main() method to test it

    public static void main(String[] args) {
        // TODO code application logic here
        double width = 10;
        double height = 20;
        Rectangle rect = new Rectangle(width, height);
        String rect_type = rect.getShapeType();
        double rect_area = rect.getArea();
        double rect_perimeter = rect.getPerimeter();

        System.out.println("===========================================");
        System.out.println("Rectangle");
        System.out.println("===========================================");
        System.out.println("Given width: " + width);
        System.out.println("Given height: " + height);
        System.out.println("Type is: " + rect_type);
        System.out.println("A Rectangle's area will be " + rect_area);
        System.out.println("A Rectangle's perimeter will be " + rect_perimeter);
        System.out.println("===========================================");

    }

}
