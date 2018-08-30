/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pasien;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Hewlett-Packard
 */
public class test2 {

    public static void main(String[] args) {
        pasien2 psn = new pasien2();
        dokter dctr = new dokter();

        dctr.setNama("dokter boyke");
        dctr.setNoPegawai("1122334455");
        dctr.setAlamat("sleman");
        dctr.setTempatLahir("kulon progo");

        System.out.println("Nama Dokter       : " + dctr.getNama());
        System.out.println("No Pegawai        : " + dctr.getNoPegawai());
        System.out.println("Alamat            : " + dctr.getAlamat());
        System.out.println("Tempat lahir      : " + dctr.getTempatLahir());
        try {
            dctr.setTanggalLahir(12);
            dctr.setBulanLahir(7);
            dctr.setTahunLahir(1990);
            System.out.print("Tanggal Kelahiran : ");
            dctr.getKelahiran();
        } catch (Exception ex) {
            System.out.println(ex);
        }
        
        System.out.println("");
        System.out.println("");
        psn.setNama("aloysius adytya endryana putra");
        psn.setTempatLahir("Yogyakarta");
        psn.setAlamat("Sleman");
        
        System.out.print("Nama Pasien       : ");
        System.out.println(psn.getNama());
        System.out.print("Tempat Lahir      : ");
        System.out.println(psn.getTempatLahir());
        System.out.print("Alamat            : ");
        System.out.println(psn.getAlamat());
        System.out.print("No Rekam Medis    : ");
        try {
            psn.setTahunLahir(1998);
            psn.setBulanLahir(6);
            psn.setTanggalLahir(19);
            psn.setNoRekamMedis("Alo");
            psn.getKodePasien();
            System.out.print(psn.getNoRekamMedis());
            System.out.println("");
            System.out.print("Tanggal Kelahiran : ");
            psn.getKelahiran();
        } catch (Exception ex) {
            System.out.println(ex);
        }

    }
}
