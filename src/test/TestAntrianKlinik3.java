/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import model.AntrianKlinik;
import model.Klinik;
import model.Pasien;

/**
 *
 * @author user only
 */
public class TestAntrianKlinik3 {

    public static void main(String[] args) {
        AntrianKlinik.buatAntrian(
                21,
                9,
                2018,
                new Klinik("001", "anak"));

        AntrianKlinik.buatAntrian(
                21,
                9,
                2018,
                new Klinik("002", "saraf"));

        AntrianKlinik.buatAntrian(
                21,
                9,
                2018,
                new Klinik("001", "anak"));
        for (int i = 0; i < AntrianKlinik.daftarAntrian.size(); i++) {
            System.out.println(AntrianKlinik.daftarAntrian.get(i));
        }

        Pasien pasien1 = new Pasien();
        pasien1.setNama("puspa");
        pasien1.setAlamat("klaten");

        Pasien pasien2 = new Pasien();
        pasien2.setNama("adi");
        pasien2.setAlamat("klaten");

        int indeksAntrian = AntrianKlinik.cariAntrian(21, 9, 2018, new Klinik("001", "anak"));
        if (indeksAntrian > 0) {
            AntrianKlinik.daftarAntrian.get(indeksAntrian).Mendaftar(pasien1);
            AntrianKlinik.daftarAntrian.get(indeksAntrian).Mendaftar(pasien2);
        }
        for (int i = 0; i < AntrianKlinik.daftarAntrian.get(indeksAntrian).getPasienAntri().size(); i++) {
            System.out.println(AntrianKlinik.daftarAntrian.get(indeksAntrian).getPasienAntri().get(i));
        }
    }

}
