/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Hewlett-Packard
 */
public class TestFinal {

    public static void main(String[] args) {

        pasien2 psn1 = new pasien2();
        pasien2 psn2 = new pasien2();
        dokter dok = new dokter();
        AntrianPasien2 urutan = new AntrianPasien2();
        Klinik klinik = new Klinik();

        try {

            dok.setNama("Tarno");
            dok.setNoPegawai("1234567899");
            dok.setTanggalLahir(11);
            dok.setBulanLahir(1);
            dok.setTahunLahir(1960);
            dok.setTempatLahir("Manado");
            dok.setAlamat("JL. Merapi no.32");

            psn1.setNama("Kiwiliam");
            psn1.setTanggalLahir(12);
            psn1.setBulanLahir(2);
            psn1.setTahunLahir(1998);
            psn1.setTempatLahir("Sleman");
            psn1.setAlamat("JL. Merdeka");

            psn2.setNama("Damai");
            psn2.setTanggalLahir(17);
            psn2.setBulanLahir(9);
            psn2.setTahunLahir(2000);
            psn2.setTempatLahir("Yogyakarta");
            psn2.setAlamat("JL. Payung");

            klinik.setIdKlinik("237462864283");
            klinik.setNama("Klinik Kesehatan");

            urutan.setKlinik(klinik);
            urutan.Pendaftar(psn1);
            urutan.Pendaftar(psn2);

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        System.out.println(urutan.getKlinik().getNama());
        System.out.println("Id Klinik : " + urutan.getKlinik().getIdKlinik());
        System.out.println("");

        for (int i = 0; i < urutan.getUrutanPasien().size(); i++) {
            System.out.println("");

            System.out.println("Pasien");
            System.out.println("===================================");
            System.out.println("Nama Pasien     : " + urutan.getUrutanPasien().get(i).getNama());
            System.out.println("Alamat          : " + urutan.getUrutanPasien().get(i).getAlamat());
            System.out.print("Tempat Tanggal Lahir : " + urutan.getUrutanPasien().get(i).getTempatLahir());
            System.out.print(" , ");
            urutan.getUrutanPasien().get(i).getKelahiran();
            System.out.println("");

            System.out.print("No Rekam Medis  : " + urutan.getUrutanPasien().get(i).getNoRekamMedis());
            System.out.println("");
            System.out.println("");

            System.out.println("dokter");
            System.out.println("===================================");
            System.out.println("Nama            : " + dok.getNama());
            System.out.println("No Pegawai      : " + dok.getNoPegawai());
            System.out.println("Alamat          : " + dok.getAlamat());
            System.out.print("Tempat Tanggal Lahir : " + dok.getTempatLahir());
            System.out.print(" , ");
            dok.getKelahiranDokter();

            System.out.println("");
            System.out.println("");
        }

    }
}
