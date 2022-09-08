/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package model;

/**
 *
 * @author Raparthur
 */
public abstract class Forma {
    protected int id;
    
    public Forma(int id){
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public double calcArea(double dim){
        return 0.0;
    };
    
    public double calcDim(double dim){
        return 0.0;
    };
    
}
