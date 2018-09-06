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
public class AntrianPasien2 {
    
    private Klinik klinik;
    private ArrayList<pasien2> urutanPasien = new ArrayList<pasien2>();
    
    public AntrianPasien2(){
        
    }
    
    public ArrayList<pasien2> getUrutanPasien() {
        //pengambalian nilai dari variabel urutanPasien
        return urutanPasien;
    }
    public void setDaftarPasien(ArrayList<pasien2> urutanPasien) {
        // pernyataan bahwa nilai dari variabel daftarPasien sama dengan nilai dari variabel lokal daftarPasien
        this.urutanPasien = urutanPasien;
    }
    
     public void setKlinik(Klinik klinik){
         this.klinik=klinik;
     }
     public Klinik getKlinik(){
         return klinik;
     }
     
     public void Pendaftar(pasien2 pasien) {
        // mengisi data pada variabel daftarPasien dengan variabel lokal daftarPasien 
        urutanPasien.add(pasien);
    }
     
}
