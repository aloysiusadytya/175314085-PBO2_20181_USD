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
public class AntrianPasien {
//    private int tanggalAntrian;
//    private int bulanAntrian;
//    private int tahunAntrian;
//    private Klinik klinik;
//    private Pasien daftarPasien;
    
    private int nomorAntrian=0;
    private final int JUMLAH_MAKSIMAL_PASIEN = 50;
    private Pasien[] daftarPasien = new Pasien[JUMLAH_MAKSIMAL_PASIEN];
    
    public void mendaftar(Pasien pasien)throws Exception{
        if(nomorAntrian<JUMLAH_MAKSIMAL_PASIEN){
            daftarPasien[nomorAntrian]=pasien;
            nomorAntrian++;
        }
        else{
            throw new Exception("nomor antrian penuh");
        }
    }
    
    public Pasien panggilPasien(int nomorPasien){
        if(this.nomorAntrian<JUMLAH_MAKSIMAL_PASIEN){
            
        }
return null;            
    }

}
