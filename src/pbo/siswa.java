/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo;

/**
 *
 * @author feb
 */
public class siswa {
    
    int jumlahSiswa=0 ;
    String jenisKelamin="" ;
    
    public siswa (String kelamin, int siswa){
        
        this.jenisKelamin = kelamin ;
        this.jumlahSiswa = siswa ;
    }
    
    public void info(){
        
        System.out.println("Kelas XII-RPL mempunyai "+this.jumlahSiswa+" murid berjenis kelamin "+this.jenisKelamin);
        
    }
}
