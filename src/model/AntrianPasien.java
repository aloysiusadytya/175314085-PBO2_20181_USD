/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.ArrayList;

/**
 *
 * @author Hewlett-Packard
 */
public class AntrianPasien {

    /**
     * mendeklarasikan variabel klinik yang bertipe Klinik
     * membuat objek urutanPasien dengan ArrayList 
     */
    private Klinik klinik;
    private ArrayList<Pasien> urutanPasien = new ArrayList<Pasien>();

    /**
     * 
     */
    public AntrianPasien() {

    }

    public ArrayList<Pasien> getUrutanPasien() {
        //pengambalian nilai dari variabel urutanPasien
        return urutanPasien;
    }

    public void setDaftarPasien(ArrayList<Pasien> urutanPasien) {
        // pernyataan bahwa nilai dari variabel daftarPasien sama dengan nilai dari variabel lokal daftarPasien
        this.urutanPasien = urutanPasien;
    }

    public void setKlinik(Klinik klinik) {
        this.klinik = klinik;
    }

    /**
     * method ini digunakan untuk mengambil nilai Klinik dari kelas Klinik
     *
     * @return
     */
    public Klinik getKlinik() {
        return klinik;
    }

    public void Pendaftar(Pasien pasien) {
        // mengisi data pada variabel daftarPasien dengan variabel lokal daftarPasien 
        urutanPasien.add(pasien);
    }

}
