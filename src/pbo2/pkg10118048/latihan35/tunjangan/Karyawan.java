/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pbo2.pkg10118048.latihan35.tunjangan;

/**
 *
 * @author NIX
 * NAMA : Niko Yama
 * KELAS : PBO2
 * NIM : 10118048
 * Deskripsi program :
 */
public class Karyawan {
    
    private double gajiPokok;
    private String status;

    public double getGajiPokok() {
        return gajiPokok;
    }

    public void setGajiPokok(double gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double hitungTunjangan(double gajiPokok,String status) {
        return (status.equals("Menikah"))?0.35 * gajiPokok:0;
    }
    
    public double hitungGajiTotal() {
        return gajiPokok + hitungTunjangan(gajiPokok,status); 
    }
}
