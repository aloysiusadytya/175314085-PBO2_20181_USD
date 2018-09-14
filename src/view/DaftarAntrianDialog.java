/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JDialog;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import model.Pasien;

/**
 * membuat method kelas daftarAntrianDialog dengan dengan turunan dari JDialog
 * @author jarkom
 */
public class DaftarAntrianDialog extends JDialog implements ActionListener{

    // mendeklarasikan variabel judulLabel bertipe data JLabel dan bersifat private
    private JLabel judulLabel;
    // mendeklarasikan variabel namaLabel bertipe data JLabel dan bersifat private
    private JLabel namaLabel;
    // mendeklarasikan variabel noRMLabel bertipe data JLabel dan bersifat private
    private JLabel noRMLabel;
    // mendeklarasikan variabel alamatLabel bertipe data JLabel dan bersifat private
    private JLabel alamatLabel;
    // mendeklarasikan variabel namaText bertipe data JTextField dan bersifat private
    private JTextField namaText;
    // mendeklarasikan variabel noRMText bertipe data JTextField dan bersifat private
    private JTextField noRMText;
    // mendeklarasikan variabel alamatText bertipe data JTextField dan bersifat private
    private JTextField alamatText;
    // mendeklarasikan variabel saveButton bertipe data JButton dan bersifat private
    private JButton saveButton;

    /**
     * membuat constructor daftarAntrianDialog
     */
    public DaftarAntrianDialog() {
        // memanggil method init
        init();
    }

    /**
     * membuat constructor dafatrAntrianDialog dan memiliki parameter title bertipe data String
     * @param title 
     */
    public DaftarAntrianDialog(String title) {
        // mengeset setTitle yang berisi parameter title
        this.setTitle(title);
        // memanggil method init
        init();
    }

    /**
     * membuat method init bertipe data void
     */
    public void init() {
        // mengeset setLayout dengan null
        this.setLayout(null);
        
        // mengisi objek judulLabel dengan Form Daftar Antrian
        judulLabel = new JLabel("Form Daftar Antrian");
        // mengeset ukuran label yang ingin digunakan
        judulLabel.setBounds(150, 20, 200, 50);
        // menambahkan judulLabel
        this.add(judulLabel);

        // mengisi objek namaLabel dengan Nama
        namaLabel = new JLabel("Nama");
        // mengeset ukuran label yang ingin digunakan
        namaLabel.setBounds(20, 70, 100, 20);
        // menambahkan namaLabel
        this.add(namaLabel);

        // membuat objek namaText
        namaText = new JTextField();
        // mengeset ukuran space text yang ingin digunakan
        namaText.setBounds(100, 70, 100, 20);
        // menambahkan namaText
        this.add(namaText);
        
        namaText.addActionListener(this);
        
        // mengisi objek noRMLabel dengan NO RM
        noRMLabel=new JLabel("No RM");
        // mengeset ukuran label yang ingin digunakan
        noRMLabel.setBounds(20, 100, 100, 20);
        // mena,bahkan noRMLabel
        this.add(noRMLabel);
        
        // membuat objek noRMText
        noRMText=new JTextField();
        // mengeset ukuran space text yang ingin digunakan
        noRMText.setBounds(100, 100, 100, 20);
        // menambahkan noRMText
        this.add(noRMText);
        
        noRMText.addActionListener(this);
        
        JLabel tanggaLahirLabel = new JLabel("Tanggal Lahir");
        tanggaLahirLabel.setBounds(20, 160, 100, 20);
        this.add(tanggaLahirLabel);

        JComboBox tanggalCombo = new JComboBox();
        tanggalCombo.setBounds(150, 160, 100, 20);
        this.add(tanggalCombo);

        JComboBox bulanCombo = new JComboBox();
        bulanCombo.setBounds(250, 160, 80, 20);
 
        this.add(bulanCombo);

        JComboBox tahunCombo = new JComboBox();
        tahunCombo.setBounds(350, 160, 80, 20);
        this.add(tahunCombo);
        
        // mengisi objek alamatLabel dengan alamat
        alamatLabel=new JLabel("alamat");
        // mengeset ukuran label yang ingin digunakan
        alamatLabel.setBounds(20, 130, 100, 20);
        // menambahkan alamatLabel
        this.add(alamatLabel);
        
        // membuat objek alamatText
        alamatText=new JTextField();
        // mengeset ukuran space text yang ingin digunakan
        alamatText.setBounds(100, 130, 100, 20);
        // meanmbahkan alamatText
        this.add(alamatText);
        
        alamatText.addActionListener(this);
        
        
        // mengisi objek saveButton dengan Simpan
        saveButton=new JButton("Simpan");
        // mengeset ukuran tombol yang ingin digunakan
        saveButton.setBounds(150, 200, 90, 20);
        // meanambahkan saveButton
        this.add(saveButton);
        saveButton.addActionListener(this);
        
    }
   
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == noRMText) {
            Pasien cari = Pasien.cariPasien(noRMText.getText());
            if (cari == null){
                JOptionPane.showConfirmDialog(null, "Orang Tidak Ada");
            }else{
                namaText.setText(cari.getNama());
            }
        }
        if (e.getSource() == namaText) {
            JOptionPane.showMessageDialog(null, namaText.getText());
        }
        if (e.getSource() == alamatText) {
            JOptionPane.showMessageDialog(null, alamatText.getText());
        }if (e.getSource() == saveButton) {
            Pasien baru = new Pasien();
            baru.setNama(namaText.getText());
            baru.setAlamat(alamatText.getText());
            
            Pasien.tambahPasienBaru(baru);
            
            JOptionPane.showMessageDialog(null, "Data Disimpan");
        }
    }
}
