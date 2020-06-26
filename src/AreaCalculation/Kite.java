/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AreaCalculation;

import java.util.Scanner;
/**
 *
 * @author yosef
 */
public class Kite {
    private double d1;
    private double d2;
    protected double luas;

    public double getD1() {
        return d1;
    }

    public void setD1(double d1) {
        this.d1 = d1;
    }

    public double getD2() {
        return d2;
    }

    public void setD2(double d2) {
        this.d2 = d2;
    }
   
    protected double getLuas() {
        return luas;
    }
    
    protected void setLuas() {
        this.luas = luas;
    }
    
    public Kite(){
        Scanner ab = new Scanner(System.in);
        System.out.println("");
        System.out.println("---Layang-Layang---");
        System.out.print("Masukkan Diagonal 1 : ");
        d1 = ab.nextDouble();
        System.out.print("Masukkan Diagonal 2 : ");
        d2 = ab.nextDouble();
        luas = 0.5 * d1 * d2;
        System.out.println("Luas = " + d1 + " * " + d2 + " / 0.5 " + " = " + luas);
    }
    
}
