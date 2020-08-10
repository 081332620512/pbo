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
public class kelas {

    /**
     * @param args the command line arguments
     */
    public kelas(){
        
        siswa laki = new siswa("laki-laki",20);
        siswa perempuan = new siswa("Perempuan",16);
        
        laki.info();
        perempuan.info();
        
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        new kelas();
    }
    
}
