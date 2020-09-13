/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ktp;

import ktp.Biodata;

/**
 *
 * @author feb
 */
public class ktp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Biodata data = new Biodata();
        
        data.nama("Febri Brilian Barkah");
        data.usia(17);
        data.alamat("Jl.Dusun Sentong no.52 RW.02 RT.03");
        data.wni(true);
        
        System.out.println("-----Biodata Untuk Pembuatan KTP anda-----");
        System.out.println("Nama :"+data.nama());
        System.out.println("Usia :"+data.usia());
        System.out.println("Alamat :"+data.alamat());
        System.out.println("Warga Negara Indonesia :"+data.wni());
    }
    
}
