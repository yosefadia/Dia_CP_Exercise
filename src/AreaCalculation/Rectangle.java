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
public class Rectangle {
    private double p;
    private double l;
    private double luas;

    public double getP() {
        return p;
    }

    public void setP(double p) {
        this.p = p;
    }

    public double getL() {
        return l;
    }

    public void setL(double l) {
        this.l = l;
    }

    public double getLuas() {
        return luas;
    }

    public void setLuas(double luas) {
        this.luas = luas;
    }
    
    public Rectangle(){
        Scanner a = new Scanner(System.in);
        System.out.println("");
        System.out.println("---Persegi Panjang---");
        System.out.print("Masukkan Panjang : ");
        p = a.nextDouble();
        System.out.print("Masukkan Lebar : ");
        l = a.nextDouble();
        luas = p * l;
        System.out.println("Luas = " + p + " * " + l + " = " + luas);
    }
    
    
}
