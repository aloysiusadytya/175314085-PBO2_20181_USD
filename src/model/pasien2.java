/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Hewlett-Packard
 */
public class pasien2 {

    /**
     * mendeklarasikan variabel yang diperlukan untuk mengisi data dari pasien
     */
    private String nama;
    private String alamat;
    private String tempatLahir;
    private int tanggalLahir;
    private int bulanLahir;
    private int tahunLahir;
    private String noRekamMedis;

    /**
     * object pasien2 dideklarasikan lewat konstruktor
     */
    public pasien2() {

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

    /**
     * method ini digunakan untuk mengambil nilai alamat
     *
     * @return
     */
    public String getAlamat() {
        return alamat;
    }

    /**
     * method ini digunakan untuk memasukkan nilai dari variabel alamat dengan
     * parameter lokal dengan tipe String
     *
     * @param alamat
     */
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    /**
     * method ini digunakan untuk mengambil nilai tempat lahir
     *
     * @return
     */
    public String getTempatLahir() {
        return tempatLahir;
    }

    /**
     * method ini digunakan untuk memasukkan nilai dari variabel tempatLahir
     * dengan parameter lokal dengan tipe String
     *
     * @param tempatLahir
     */
    public void setTempatLahir(String tempatLahir) {

        this.tempatLahir = tempatLahir;
    }

    /**
     * method ini digunakan untuk mengambil nilai tanggal lahir
     *
     * @return
     */
    public int getTanggalLahir() {
        return tanggalLahir;
    }

    /**
     * method untuk menghitung tanggal lahir pasien yang diberi jangkauan antara
     * 0-31
     *
     * @param tanggalLahir
     * @throws Exception
     */
    public void setTanggalLahir(int tanggalLahir) throws Exception {
        if (tanggalLahir > 0 && tanggalLahir < 32) {
            this.tanggalLahir = tanggalLahir;
        } else {
            throw new Exception("salah tanggal/bulan/tahun");
        }
    }

    /**
     * method ini digunakan untuk mengambil nilai bulan lahir
     *
     * @return
     */
    public int getBulanLahir() {
        return bulanLahir;
    }

    /**
     * method untuk menghitung bulan lahir pasien yang diberi jangkauan antara
     * 0-12
     *
     * @param bulanLahir
     * @throws Exception
     */
    public void setBulanLahir(int bulanLahir) throws Exception {
        if (bulanLahir > 0 && bulanLahir < 13) {
            this.bulanLahir = bulanLahir;
        } else {
            throw new Exception("salah tanggal/bulan/tahun");
        }

    }

    /**
     * method ini digunakan untuk mengambil nilai tahun lahir
     *
     * @return
     */
    public int getTahunLahir() {
        return tahunLahir;
    }

    /**
     * method untuk menghitung tahun lahir pasien lebih dari 0
     *
     * @param tahunLahir
     * @throws Exception
     */
    public void setTahunLahir(int tahunLahir) throws Exception {
        if (tahunLahir > 0) {
            this.tahunLahir = tahunLahir;
        } else {
            throw new Exception("salah tanggal/bulan/tahun");
        }

    }

    /**
     * method ini untuk memanggil no rekam medis yang diambil dari tanggal masuk
     * pasien dan 3 digit nama depan pasien
     *
     * @return
     */
    public String getNoRekamMedis() {
        String noRekamMedis;
        Date date = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("yyyMMdd");
        noRekamMedis = ft.format(date) + nama.substring(0, 3);

        return noRekamMedis;
    }

    /**
     * method ini digunakan untuk memasukkan nilai dari variabel noRekamMedis dengan
     * parameter lokal dengan tipe String
     */
    public void setNoRekamMedis(String noRekamMedis) {
        this.noRekamMedis = noRekamMedis;
    }

    /**
     * method ini digunakan untuk memanggil tanggal, bulan, dan tahun kelahiran
     * pasien
     */
    public void getKelahiran() {
        Date date = new Date(getTahunLahir() - 1900, getBulanLahir() - 1, getTanggalLahir());
        SimpleDateFormat ft = new SimpleDateFormat("dd-MM-yyyy");
        System.out.print(ft.format(date));
    }

}
