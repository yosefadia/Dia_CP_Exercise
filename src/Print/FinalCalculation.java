/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Print;

import AreaCalculation.Circle;
import AreaCalculation.Kite;
import AreaCalculation.Rectangle;
import AreaCalculation.Square;
import AreaCalculation.Triangle;
import java.util.Scanner;

public class FinalCalculation {
    
    public static void main(String[] args) {        
        try {
            Scanner input = new Scanner(System.in);
            int choose;
            
            System.out.println("=====Menghitung Luas Bangun Datar=====");
            System.out.println("1. Persegi");
            System.out.println("2. Persegi Panjang");
            System.out.println("3. Segitiga");
            System.out.println("4. Lingkaran");
            System.out.println("5. Layang-Layang");
            System.out.print("Masukkan Pilihan : ");
            choose = input.nextInt();
            if (choose == 1) {
                Square sq = new Square();
            }
            else if(choose == 2) {
                Rectangle rc = new Rectangle();
            }
            else if (choose == 3) {
                Triangle tr = new Triangle();
            }
            else if (choose == 4) {
                Circle cr = new Circle();
            }
            else if(choose == 5) {
                Kite kt = new Kite();
            }

        } catch (Exception e) {
            System.out.print("pilihan tidak ada");
        }
        finally{
            System.out.println("Program selesai");
    }
       
            
     
        
    }
    
}
