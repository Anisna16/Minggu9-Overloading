/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas1;

/**
 *
 * @author User
 */
public class TesSegitiga {
    public static void main (String args []){
        
        Segitiga sg = new Segitiga();
        System.out.println("\t Rumus Segitiga");
        System.out.println();
        System.out.println("1. Menghitung 1 Sudut Segitiga  : " + sg.totalSudut(90));
        System.out.println("2. Menghitung 2 Sudut Segitiga  : " + sg.totalSudut(60, 80));
        System.out.println("3. Menghitung Keliling Segitiga : " + sg.keliling(90, 90, 180));
        System.out.println("4. Menghitung Keliling Segitiga : " + sg.keliling(25, 36));
    }
}
