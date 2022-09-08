/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Raparthur
 */
public class Pizza {

    private int id;
    private double dimensao;
    private Forma forma;
    private Sabor sabor1;
    private Sabor sabor2;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getDimensao() {
        return dimensao;
    }

    public void setDimensao(double dimensao) {
        this.dimensao = dimensao;
    }

    public Forma getForma() {
        return forma;
    }

    public void setForma(Forma forma) {
        this.forma = forma;
    }

    public Sabor getSabor1() {
        return sabor1;
    }

    public void setSabor1(Sabor sabor1) {
        this.sabor1 = sabor1;
    }

    public Sabor getSabor2() {
        return sabor2;
    }

    public void setSabor2(Sabor sabor2) {
        this.sabor2 = sabor2;
    }
    
    public void setArea(double area){
        if(forma instanceof Quadrado){
           this.dimensao = Math.sqrt(area);
        }
        if(forma instanceof Triangular){
           this.dimensao = 2*Math.sqrt(area/Math.sqrt(3));
        }
        if(forma instanceof Circular){
            this.dimensao = Math.sqrt(area/Math.PI);
        }
    }

    public double getArea() {
        double area = 0.0;
        if(this.forma != null){
            area = round(this.forma.calcArea(this.dimensao), 1);
        }
        return area;
    }

    public double getValor() {
        double valor = 0.0;
        if (sabor1 != null && forma != null) {
            double area = this.forma.calcArea(this.dimensao);
            double precoPorAreaSabor = sabor1.getTipo().getPrecoUnidArea();
            valor = area * precoPorAreaSabor;
            if (sabor2 != null) { //vai fazer media aritmetica do valor
                precoPorAreaSabor = sabor2.getTipo().getPrecoUnidArea();
                valor = (valor + area * precoPorAreaSabor) / 2;
            }
        }

        return round(valor, 2);

    }

    public static double round(double value, int places) {
        if (places < 0) {
            throw new IllegalArgumentException();
        }

        long factor = (long) Math.pow(10, places);
        value = value * factor;
        long tmp = Math.round(value);
        return (double) tmp / factor;
    }

}
