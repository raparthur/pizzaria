/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;


/**
 *
 * @author Raparthur
 */
public class Quadrado extends Forma{

    public static final double MIN_LADO =  10;
    public static final double MAX_LADO = 40;

    public Quadrado(int id) {
        super(id);
    }
    
    @Override
    public double calcArea(double lado) {
       return lado*lado;
    }
    
    @Override
    public double calcDim(double area){
        return Math.sqrt(area);
    };

    @Override
    public String toString() {
        return "Quadrado";
    }

    
    
}
