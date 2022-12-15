/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas2;

/**
 *
 * @author Lenovo
 */
public class Dosen extends Manusia{
    public void makan(){
        System.out.println("Dosen harus makan");
    }
    public void lembur(){
        System.out.println("Dosen harus lembur");
    }
    
    public void tampilManusia(){
        super.bernafas();
        super.makan();
    }
}
