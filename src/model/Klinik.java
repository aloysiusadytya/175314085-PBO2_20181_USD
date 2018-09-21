/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author jarkom
 */
public class Klinik {

    public static ArrayList<Klinik> daftarKlinik = new ArrayList<Klinik>();

    public static void tambahKlinik(Klinik klinik) {
        daftarKlinik.add(klinik);
    }

    public static Klinik cariKlinik(String namaKlinik) {
        for (int i = 0; i < daftarKlinik.size(); i++) {
            if (daftarKlinik.get(i).getNamaKlinik().equalsIgnoreCase(namaKlinik)) {
                return daftarKlinik.get(i);
            }
        }
        return null;
    }

    private String idKlinik;
    private String namaKlinik;

    /**
     * object Klinik dideklarasikan lewat konstruktor
     */
    public Klinik() {

    }
    
    public Klinik(String idKlinik, String namaKlinik) {
        this.idKlinik = idKlinik;
        this.namaKlinik = namaKlinik;
    }

    /**
     * method ini digunakan untuk mengambil nilai idKlinik
     *
     * @return
     */
    public String getIdKlinik() {
        return idKlinik;
    }

    /**
     * method ini digunakan untuk memasukkan nilai dari variabel idKlinik dengan
     * parameter lokal dengan tipe String
     *
     * @param idKlinik
     */
    public void setIdKlinik(String idKlinik) {
        this.idKlinik = idKlinik;
    }

    /**
     * method ini digunakan untuk mengambil nilai nama
     *
     * @return
     */
    public String getNamaKlinik() {
        return namaKlinik;
    }

    /**
     * method ini digunakan untuk memasukkan nilai dari variabel nama dengan
     * parameter lokal dengan tipe String
     *
     * @param nama
     */
    public void setNama(String nama) {
        this.namaKlinik = nama;
    }

}
