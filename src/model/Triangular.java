/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;


/**
 *
 * @author Raparthur
 */
public class Triangular extends Forma{
    
    public static final double MIN_LADO =  20;
    public static final double MAX_LADO = 60;

    public Triangular(int id) {
        super(id);
    }

    @Override
    public double calcArea(double lado) {
       return lado*lado*Math.sqrt(3)/4;
    }
    
    @Override
    public double calcDim(double area){
        return 2*Math.sqrt(area/Math.sqrt(3));
    };
    
    @Override
    public String toString() {
        return "Triângulo";
    }
    
}
