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

    public String getTempatLahir() {
        return tempatLahir;
    }

    public void setTempatLahir(String tempatLahir) {
        
        this.tempatLahir = tempatLahir;
    }

    public int getTanggalLahir() {
        return tanggalLahir;
    }

    /**
     * method untuk menghitung tanggal lahir pasien yang diberi jangkauan
     * antara 0-32
     * @param tanggalLahir
     * @throws Exception 
     */
    public void setTanggalLahir(int tanggalLahir) throws Exception {
        if(tanggalLahir>0&&tanggalLahir<32){
            this.tanggalLahir=tanggalLahir;
        }else{
            throw new Exception("salah tanggal/bulan/tahun");
        }
        
    }

    public int getBulanLahir() {
        return bulanLahir;
    }
    /**
     * method untuk menghitung bulan lahir pasien yang diberi jangkauan
     * antara 0-13
     * @param bulanLahir
     * @throws Exception 
     */
    public void setBulanLahir(int bulanLahir) throws Exception{
        if(bulanLahir>0&&bulanLahir<13){
            this.bulanLahir = bulanLahir;
        }else{
            throw new Exception("salah tanggal/bulan/tahun");
        }
        
    }

    public int getTahunLahir() {
        return tahunLahir;
    }
    
    /**
     * method untuk menghitung tahun lahir pasien lebih dari 0
     * @param tahunLahir
     * @throws Exception 
     */
    public void setTahunLahir(int tahunLahir) throws Exception {
        if(tahunLahir>0){
            this.tahunLahir = tahunLahir;
        }else{
            throw new Exception("salah tanggal/bulan/tahun");
        }
        
    }
    
    /**
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

    public void setNoRekamMedis(String noRekamMedis) {
        this.noRekamMedis = noRekamMedis;
    }
    /**
     * 
     */
    public void getKodePasien() {
        Date date = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("ddMMyyyy");
        System.out.print(ft.format(date));
    }
    public void getKelahiran() {
        Date date = new Date(getTahunLahir() - 1900, getBulanLahir() - 1, getTanggalLahir());
        SimpleDateFormat ft = new SimpleDateFormat("dd-MM-yyyy");
        System.out.print(ft.format(date));
    }
    
}
