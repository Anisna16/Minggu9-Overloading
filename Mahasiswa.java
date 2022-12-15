/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas2;

/**
 *
 * @author Lenovo
 */
public class Mahasiswa extends Manusia{
     public void makan(){
        System.out.println("Mahasiswa harus makan");
    }
    public void tidur(){
        System.out.println("Mahasiswa harus tidur");
    }
    
    public void tampilManusia(){
        super.bernafas();
        super.makan();
    }
    
}
