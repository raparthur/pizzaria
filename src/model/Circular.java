/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;


/**
 *
 * @author Raparthur
 */
public class Circular extends Forma{

    public static final double MIN_RAIO =  7;
    public static final double MAX_RAIO = 23;

    public Circular(int id) {
        super(id);
    }
 
    @Override
    public double calcArea(double raio) {
       return raio*raio*Math.PI;
    }
    
    @Override
    public double calcDim(double area){
        return Math.sqrt(area/Math.PI);
    };
    
    @Override
    public String toString() {
        return "Circular";
    }
    
}
