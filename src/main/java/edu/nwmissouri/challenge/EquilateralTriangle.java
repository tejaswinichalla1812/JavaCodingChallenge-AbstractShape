/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package edu.nwmissouri.challenge;

/**
 *
 * @author S545710
 */
public class EquilateralTriangle extends AbstractShape{

    /**
     * @param args the command line arguments
     */
    // private attribute
    double e_length;

    // constructor
    public EquilateralTriangle(double e_length) {
        super("EquilateralTriangle");
        this.e_length = e_length;
    }
    @Override
    public double getArea() {
       return (Math.sqrt(3)/4)*(e_length*e_length);
    }
    
        

    @Override
    public double getPerimeter() {
        return 3 * e_length;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        double e_length = 6;
        
        EquilateralTriangle equi = new EquilateralTriangle(e_length);
        String equi_type = equi.getShapeType();
        double equi_area = equi.getArea();
        double equi_perimeter = equi.getPerimeter();

        System.out.println("===========================================");
        System.out.println("EquilateralTriangle");
        System.out.println("===========================================");
        System.out.println("Given length: " + e_length);
        System.out.println("Type is: "+equi_type);

        System.out.println("A EquilateralTriangle's area will be " + equi_area);
        System.out.println("A EquilateralTriangle's perimeter will be " + equi_perimeter);
        System.out.println("==========================================="); 
    }

    
    
}
