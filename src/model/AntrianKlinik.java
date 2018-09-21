/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.ArrayList;
import javax.swing.UIManager;
import view.DaftarAntrianDialog;

/**
 *
 * @author Hewlett-Packard
 */
public class AntrianKlinik {

    /**
     * mendeklarasikan variabel klinik yang bertipe Klinik membuat objek
     * urutanPasien dengan ArrayList
     */
    public static ArrayList<AntrianKlinik> daftarAntrian = new ArrayList<AntrianKlinik>();

    private Klinik klinik;
    private int tanggalAntrian;
    private int bulanAntrian;
    private int tahunAntrian;
    private int nomorAntrian;

    public int getNomorAntrian() {
        return nomorAntrian;
    }

    public void setNomorAntrian(int nomorAntrian) {
        this.nomorAntrian = nomorAntrian;
    }

    public int getTanggalAntrian() {
        return tanggalAntrian;
    }

    public void setTanggalAntrian(int tanggalAntrian) {
        this.tanggalAntrian = tanggalAntrian;
    }

    public int getBulanAntrian() {
        return bulanAntrian;
    }

    public void setBulanAntrian(int bulanAntrian) {
        this.bulanAntrian = bulanAntrian;
    }

    public int getTahunAntrian() {
        return tahunAntrian;
    }

    public void setTahunAntrian(int tahunAntrian) {
        this.tahunAntrian = tahunAntrian;
    }
    private Pasien daftarPasienAntri[];
//    public AntrianKlinik daftarAntrian[];

    /**
     *
     */
    public AntrianKlinik() {

    }

    public AntrianKlinik(int tanggalAntrian, int bulanAntrian, int tahunAntrian, Klinik klinik) {
        this.tanggalAntrian = tanggalAntrian;
        this.bulanAntrian = bulanAntrian;
        this.tahunAntrian = tahunAntrian;
        this.klinik = klinik;
        
    }
    
    public ArrayList<AntrianKlinik> getDaftarPasien() {
        //pengambalian nilai dari variabel urutanPasien
        return daftarAntrian;
    }

    public void setDaftarPasien(ArrayList<Pasien> urutanPasien) {
        // pernyataan bahwa nilai dari variabel daftarPasien sama dengan nilai dari variabel lokal daftarPasien
        this.daftarAntrian = daftarAntrian;
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

    public void Mendaftar(Pasien pasien) {
        // mengisi data pada variabel daftarPasien dengan variabel lokal daftarPasien 
        pasien.getDaftarPasienKlinik().add(pasien);
    }

    public static void daftarPasien(Pasien pasien, int tanggal, int bulan, int tahun, Klinik klinik) {
        // cari antrian klinik,jika ada fungsi mendaftar dari objek antrian
        // jika tidak ada buat antrian baru 

    }

    public static Pasien cariPasien(String noRM) {
       
        return null;
        
        
    }

    public static void buatAntrian(int tanggal, int bulan, int tahun, Klinik klinik) {
        AntrianKlinik antrian = new AntrianKlinik();
        antrian.setTanggalAntrian(tanggal);
        antrian.setBulanAntrian(bulan);
        antrian.setTahunAntrian(tahun);
        antrian.setKlinik(klinik);
        // tambah dalam list antrian
        if (cariAntrian(tanggal, bulan, tahun, klinik) <0) {
            // tambah dalam list antrian
            daftarAntrian.add(antrian);
        } else {
            System.out.println("Antrian Sudah Ada");
        }
    }

    public static int cariAntrian(int tanggalAntrian, int bulanAntrian, int tahunAntrian, Klinik klinik) {
        for (int i = 0; i < daftarAntrian.size(); i++) {
            if (daftarAntrian.get(i).getTanggalAntrian() == tanggalAntrian
                    && daftarAntrian.get(i).getBulanAntrian() == bulanAntrian
                    && daftarAntrian.get(i).getTahunAntrian() == tahunAntrian
                    && daftarAntrian.get(i).getKlinik().getIdKlinik().equalsIgnoreCase(klinik.getIdKlinik())
                    && daftarAntrian.get(i).getKlinik().getNamaKlinik().equalsIgnoreCase(klinik.getNamaKlinik())) {
                return 1;
            }
        }
        return -1;
    }

    public String toString() {

        return String.valueOf(tahunAntrian)
                + String.valueOf(bulanAntrian)
                + String.valueOf(tanggalAntrian)
                + klinik.getIdKlinik()
                + klinik.getNamaKlinik();
    }

}
