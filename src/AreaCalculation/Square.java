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
public class Square {
   
    private double s;
    private double luas;


    public double getS() {
        return s;
    }

    public void setS(double s) {
        this.s = s;
    }

    public double getLuas() {
        return luas;
    }

    public void setLuas(double luas) {
        this.luas = luas;
    }
    
    public Square(){
        Scanner a = new Scanner(System.in); 
        System.out.println("");
        System.out.println("---Persegi---");
        System.out.print("Masukkan Panjang sisi : ");
        s = a.nextDouble();
        luas = s*s;
        System.out.println("Luas = " + s + " * " + s + " = " + luas);
        
    } 
}
