/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package edu.nwmissouri.challenge;

/**
 *
 * @author Tejaswini Challa
 */
public class Square extends AbstractShape {

    /**
     * @param args the command line arguments
     * @return
     */
    // private attribute
    double s_length;

    // constructor
    public Square(double s_length) {
        super("Square");
        this.s_length = s_length;
    }

    @Override
    public double getArea() {
        return s_length * s_length;
    }

    @Override
    public double getPerimeter() {
        return 4 * s_length;
    }

    // add an executable main() method to test it
    public static void main(String[] args) {
        // TODO code application logic here
        double s_length = 5;

        Square square = new Square(s_length);
        String square_type = square.getShapeType();
        double s_area = square.getArea();
        double s_perimeter = square.getPerimeter();

        System.out.println("===========================================");
        System.out.println("Square");
        System.out.println("===========================================");
        System.out.println("Given length: " + s_length);
        System.out.println("Type is: " + square_type);
        System.out.println("A Sqaure's area will be " + s_area);
        System.out.println("A Square's perimeter will be " + s_perimeter);
        System.out.println("===========================================");
    }

}
