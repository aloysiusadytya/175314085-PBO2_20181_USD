/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import com.sun.istack.internal.logging.Logger;

/**
 *
 * @author Hewlett-Packard
 */
public class test1 {

    public static void main(String[] args) throws Exception {
        Pasien psn = new Pasien();

        System.out.print("Nama Pasien       : ");
        psn.setNama("aloysius adytya endryana putra");
        System.out.println(psn.getNama());

        System.out.print("Tempat Lahir      : ");
        psn.setTempatLahir("Yogyakarta");
        System.out.println(psn.getTempatLahir());

        System.out.print("Alamat            : ");
        psn.setAlamat("jogja");
        System.out.println(psn.getAlamat());

        System.out.print("Tanggal Lahir     : ");
        try {
            psn.setTanggalLahir(19);
            System.out.println(psn.getTanggalLahir());
        } catch (Exception ex) {
            System.out.println(ex);
        }

        System.out.print("Bulan Lahir       : ");
        try {
            psn.setBulanLahir(06);
            System.out.println(psn.getBulanLahir());
        } catch (Exception ex) {
            System.out.println(ex);
        }

        System.out.print("Tahun Lahir       : ");
        try {
            psn.setTahunLahir(1998);
            System.out.println(psn.getTahunLahir());
        } catch (Exception ex) {
            System.out.println(ex);

        }
        System.out.print("No rekam Medis    : ");
        try {
            psn.setNoRekamMedis("alo");
            System.out.println(psn.getTanggalLahir()+""+psn.getBulanLahir()+""+psn.getTahunLahir()+""+psn.getNoRekamMedis());
        } catch (Exception ex) {
            System.out.println(ex);
        }
        
    }

}
