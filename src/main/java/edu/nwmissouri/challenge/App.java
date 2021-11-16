package edu.nwmissouri.challenge;

/**
 * Starting point for our app.
 */
public class App {

    public static void main(String[] args) {

        // test Circle class
        double r = 1.0;
        Circle c = new Circle(r);

        String type = c.getShapeType();
        double area = c.getArea();
        double perimeter = c.getPerimeter();

        System.out.println("===========================================");
        System.out.println("Circle");
        System.out.println("===========================================");
        System.out.println("Given radius: " + r);
        System.out.println("A circle's area will be " + area);
        System.out.println("A circle's perimeter will be " + perimeter);
        System.out.println("===========================================");

        // test more classes below

    }

}