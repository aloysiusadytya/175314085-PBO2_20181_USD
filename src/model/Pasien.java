/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Hewlett-Packard
 */
public class Pasien implements Serializable{

    /**
     * mendeklarasikan variabel yang diperlukan untuk mengisi data dari pasien
     */
    private String nama;
    private String alamat;
    private String tempatLahir;
    private int tanggalLahir;
    private int bulanLahir;
    private int tahunLahir;
    private String noRM;
    String nik;

    public static ArrayList<Pasien> daftarPasien
            = new ArrayList<Pasien>();

    public static ArrayList<Pasien> getDaftarPasien() {
        return daftarPasien;
    }

    public static void setDaftarPasien(ArrayList<Pasien> daftarPasienKlinik) {
        Pasien.daftarPasien = daftarPasienKlinik;
    }

    /**
     * object pasien2 dideklarasikan lewat konstruktor
     */
    public Pasien() {

    }

    public Pasien(String nama, String alamat, String tempatLahir, int tanggalLahir, int bulanLahir, int tahunLahir, String nik) {
        this.nama = nama;
        this.alamat = alamat;
        this.tempatLahir = tempatLahir;
        this.tanggalLahir = tanggalLahir;
        this.bulanLahir = bulanLahir;
        this.tahunLahir = tahunLahir;
        this.nik = nik;
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
    public String NoRM() {
        String noRekamMedis;
        Date date = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("yyyyMMdd");
        noRekamMedis = ft.format(date) + nama.substring(0, 3);
        return noRekamMedis;
    }

    /**
     * method ini digunakan untuk memasukkan nilai dari variabel noRekamMedis
     * dengan parameter lokal dengan tipe String
     *
     * @param noRekamMedis
     */
    public void setNoRM(String noRM) {
        this.noRM = noRM;
    }

    public String getNoRM() {
        return noRM;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public String getNik() {
        return nik;
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

    // Membuat method tambahPasienBaru bertipe data void dengan parameter test bertipe Pasien
    public static void tambahPasienBaru(Pasien test) {
        daftarPasien.add(test);
    }

    // membuat method cariPasien bertipe data Pasien dengan parameter noRekamMedis bertipe String
    public static Pasien cariPasien(String noRekamMedis) {
        // mendeklarasikan result berisi null bertipe Pasien
        Pasien result = null;
        // membuat boolean cek sama dengan false
        boolean cek = false;
        //membuat perulangan
        for (int i = 0; i < daftarPasien.size() && cek == false; i++) {
            // menggunakan fungsi if
            if (daftarPasien.get(i).nik.equals(noRekamMedis)) {
                cek = true;
                result = daftarPasien.get(i);
            }
        }
        return result;
    }

    public static void simpanDaftarPasien(File file) {
        try {
            FileOutputStream fos = new FileOutputStream(file);
            for (int i = 0; i < daftarPasien.size(); i++) {
                String data = daftarPasien.get(i).toString();
                fos.write(data.getBytes());
            }
            fos.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Pasien.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Pasien.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public String toString() {
        return noRM + "\t" + nama + "\t" + alamat + "\n";
    }

    public static void bacaDaftarPasien(File file) {
        FileInputStream fis = null;
        String hasil = "";
        int dataInt;
        boolean noRM = false;
        boolean nama = false;
        boolean alamat = false;
        Pasien temp = new Pasien();
        try {
            fis = new FileInputStream(file);
            while ((dataInt = fis.read()) != -1) {
                if ((char) dataInt != '\n') {
                    if ((char) dataInt != '\t') {
                        hasil = hasil + (char) dataInt;
                    } else {
                        if (noRM == false) {
                            temp.setNoRM(hasil);
                            noRM = true;
                            hasil = "";
                        } else if (nama == false) {
                            temp.setNama(hasil);
                            nama = true;
                            hasil = "";
                        }
                    }
                } else {
                    temp.setAlamat(hasil);
                    alamat = true;
                    hasil = "";
                    Pasien.tambahPasienBaru(temp);
                    noRM = false;
                    nama = false;
                    alamat = false;
                    temp=new Pasien();
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Pasien.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Pasien.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
