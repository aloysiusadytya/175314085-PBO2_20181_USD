/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import model.Pasien;

/**
 * membuat method kelas DaftarPasienBaru dengan dengan turunan dari JDialog
 *
 * @author jarkom
 */
public class DaftarPasienBaruDialog extends JDialog implements ActionListener {

    // mendeklarasikan variabel judulLabel bertipe data JLabel dan bersifat private
    private JLabel judulLabel;
    // mendeklarasikan variabel namaLabel bertipe data JLabel dan bersifat private
    private JLabel namaLabel;
    // mendeklarasikan variabel alamatLabel bertipe data JLabel dan bersifat private
    private JLabel alamatLabel;
    // mendeklarasikan variabel namaText bertipe data JTextField dan bersifat private
    private JTextField namaText;
    // mendeklarasikan variabel alamatText bertipe data JTextField dan bersifat private
    private JTextField alamatText;
    private JLabel nikLabel;
    private JTextField nikText;
    private JRadioButton laki;
    private JRadioButton perempuan;
    // mendeklarasikan variabel saveButton bertipe data JButton dan bersifat private
    private JButton saveButton;

    /**
     * membuat constructor DaftarPasienBaruDialog
     */
    public DaftarPasienBaruDialog() {
        // memanggil method init
        init();
    }

    /**
     * membuat constructor DaftarPasienBaruDialog dan memiliki parameter title
     * bertipe data String
     *
     * @param title
     */
    public DaftarPasienBaruDialog(String title) {
        // mengeset setTitle yang berisi parameter title
        this.setTitle(title);
        // memanggil method init
        init();
    }

    /**
     * membuat method init bertipe data void
     */
    private void init() {
        // mengeset setLayout dengan null
        this.setLayout(null);

        //mengisi objek judulLabel dengan Form Daftar Antrian
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
        
        JLabel JenisKelamin = new JLabel("Jenis Kelamin");
        JenisKelamin.setBounds(20, 110, 100, 20);
        this.add(JenisKelamin);
        
        laki = new JRadioButton("Laki-laki");
        laki.setBounds(120, 110, 100, 20);
        this.add(laki);
        
        perempuan = new JRadioButton("perempuan");
        perempuan.setBounds(220, 110, 150, 20);
        this.add(perempuan);
        
        ButtonGroup kelamin = new ButtonGroup();
        kelamin.add(laki);
        kelamin.add(perempuan);
        
        JLabel tanggaLahirLabel = new JLabel("Tanggal Lahir");
        tanggaLahirLabel.setBounds(20, 150, 100, 20);
        this.add(tanggaLahirLabel);

        JComboBox tanggalCombo = new JComboBox();
        tanggalCombo.setBounds(150, 150, 80, 20);
        this.add(tanggalCombo);

        JComboBox bulanCombo = new JComboBox();
        bulanCombo.setBounds(250, 150, 80, 20);
 
        this.add(bulanCombo);

        JComboBox tahunCombo = new JComboBox();
        tahunCombo.setBounds(350, 150, 80, 20);
        this.add(tahunCombo);

        // mengisi objek alamatLabel dengan alamat
        alamatLabel = new JLabel("alamat");
        // mengeset ukuran label yang ingin digunakan
        alamatLabel.setBounds(20, 190, 100, 20);
        // menambahkan alamatLabel
        this.add(alamatLabel);

        // membuat objek alamatText
        alamatText = new JTextField();
        // mengeset ukuran space text yang ingin digunakan
        alamatText.setBounds(100, 190, 100, 20);
        // meanmbahkan alamatText
        this.add(alamatText);

       nikLabel=new JLabel("NIK");
       nikLabel.setBounds(20,230,100,20);
       this.add(nikLabel);
       
        nikText = new JTextField();
        nikText.setBounds(100, 230, 100, 20);
        this.add(nikText);

        // mengisi objek saveButton dengan Simpan
        saveButton = new JButton("Simpan");
        // mengeset ukuran tombol yang ingin digunakan
        saveButton.setBounds(150, 270, 90, 20);
        // meanambahkan saveButton
        this.add(saveButton);
        
        saveButton.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == saveButton) {
            Pasien baru = new Pasien();
            baru.setNama(namaText.getText());
            baru.setAlamat(alamatText.getText());
            baru.setNik(nikText.getText());
            
            Pasien.tambahPasienBaru(baru);
            
            JOptionPane.showMessageDialog(null, "Data Disimpan");
            
            this.dispose();
        }
        
    }
}
