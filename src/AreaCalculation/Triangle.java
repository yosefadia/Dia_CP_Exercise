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
public class Triangle {
    private double a;
    private double t;
    private double luas;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getT() {
        return t;
    }

    public void setT(double t) {
        this.t = t;
    }

    public double getLuas() {
        return luas;
    }

    public void setLuas(double luas) {
        this.luas = luas;
    }

    public Triangle(){
        Scanner ab = new Scanner(System.in);
        System.out.println("");
        System.out.println("---Segitiga---");
        System.out.print("Masukkan Alas : ");
        a = ab.nextDouble();
        System.out.print("Masukkan Tinggi : ");
        t = ab.nextDouble();
        luas = 0.5 * a * t;
        System.out.println("Luas = " + a + " * " + t + " / 0.5" + " = " + luas);
    }
    
    
}
