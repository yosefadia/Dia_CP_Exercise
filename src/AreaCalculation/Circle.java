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
public class Circle {
    private double r;
    private double luas;
    double phi = 3.14;

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getLuas() {
        return luas;
    }

    public void setLuas(double luas) {
        this.luas = luas;
    }
   
    public Circle(){
        Scanner a = new Scanner(System.in); 
        System.out.println("");
        System.out.println("---Lingkaran---");
        System.out.print("---Masukkan jari-jari : ");
        r = a.nextDouble();
        luas = phi * r * r;
        System.out.println("Luas = " + r + " * " + r + " = " + luas);
    }
    
}
