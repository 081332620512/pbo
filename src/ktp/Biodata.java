/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ktp;

/**
 *
 * @author feb
 */
public class Biodata {
    private String nama;
    private Integer usia;
    private String alamat;
    private boolean wni;
    
    public void nama(String nama){
        this.nama = nama;
    }
    public void usia(Integer usia){
        this.usia = usia;
    }
    public void alamat(String alamat){
        this.alamat = alamat;
    }
    public void wni(boolean wni){
        this.wni = wni;
    }
    
    public String nama(){
        return nama;
    }
    public Integer usia(){
        return usia;
    }
    public String alamat(){
        return alamat;
    }
    public boolean wni(){
        return wni;
    }
}
