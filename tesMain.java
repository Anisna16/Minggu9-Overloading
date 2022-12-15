/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas2;

/**
 *
 * @author Lenovo
 */
public class tesMain {
    public static void main (String [] args){
        System.out.println("---------------------------");
        Manusia man = new Manusia();
        man.bernafas();
        man.makan();
        System.out.println("---------------------------");
        Dosen dos = new Dosen();
        dos.tampilManusia();
        dos.makan();
        dos.lembur();
        System.out.println("---------------------------");
        Mahasiswa mhs = new Mahasiswa();
        mhs.tampilManusia();
        mhs.makan();
        mhs.tidur();
        
    }
    
}
