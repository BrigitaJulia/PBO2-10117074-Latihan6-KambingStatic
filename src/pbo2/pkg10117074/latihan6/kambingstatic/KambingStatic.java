/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117074.latihan6.kambingstatic;

/**
 *
 * @author Rizki Adam Kurniawan
 */
public class KambingStatic {
    //Nama_Kambing sebagai konstanta
    public static final String Nama_Kambing = "Shaun the Sheep";
    
    public static void main(String[] args) {
        Mamalia.jumlahKambing = 485000;
        System.out.println("Nama_Kambing " + " memiliki kambing sebanyak " +
                Mamalia.jumlahKambing);
    }
 
}
