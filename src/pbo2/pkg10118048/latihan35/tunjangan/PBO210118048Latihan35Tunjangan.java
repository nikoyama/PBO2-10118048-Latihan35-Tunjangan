/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pbo2.pkg10118048.latihan35.tunjangan;

import java.util.Scanner;

/**
 *
 * @author NIX
 * NAMA : Niko Yama
 * KELAS : PBO2
 * NIM : 10118048
 * Deskripsi program : menghitung tunjangan dan total gaji
 */
public class PBO210118048Latihan35Tunjangan {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Karyawan karyawan = new Karyawan();
        
        System.out.println("========Program Tunjangan========");
        System.out.print("Berapa gaji pokok anda perbulan?: Rp. ");
        karyawan.setGajiPokok(scanner.nextDouble());
        System.out.print("Status Anda? (Menikah/Belum)\t: ");
        karyawan.setStatus(scanner.next());
        System.out.println("\n=====Hasil Perhitungan Gaji Anda=====");
        System.out.println("Gaji Pokok\t: Rp. " +karyawan.getGajiPokok());
        System.out.println("Tunjangan\t: Rp. " +karyawan.hitungTunjangan
                (karyawan.getGajiPokok(),karyawan.getStatus()));
        System.out.println("Total Gaji\t: Rp. " +karyawan.hitungGajiTotal());
        System.out.println("(Developed by : Niko Yama)");
    }

}
