/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author jarkom
 */
public class Klinik {

    private String idKlinik;
    private String nama;

    /**
     * object Klinik dideklarasikan lewat konstruktor
     */
    public Klinik() {

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
    public String getNama() {
        return nama;
    }

    /**
     * method ini digunakan untuk memasukkan nilai dari variabel nama dengan
     * parameter lokal dengan tipe String
     *
     * @param nama
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

}
