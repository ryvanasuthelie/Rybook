/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

/**
 *
 * @author USER
 */
public class inputPeminjamanCtrl {
    private String nama;
    private String alamat;
    private int noHp;
    
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public int getNoHp() {
        return noHp;
    }

    public void setNoHp(int noHp) {
        this.noHp = noHp;
    }
    
    public void print() {
        System.out.println("Nama : "+this.getNama());
        System.out.println("No HP : "+this.getNoHp());
        System.out.println("Alamat : "+this.getAlamat());
    }
}
