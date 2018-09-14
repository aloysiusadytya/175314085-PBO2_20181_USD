/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;
import model.Pasien;

/**
 * membuat method kelas DaftarPasienBaru dengan dengan turunan dari JDialog
 * @author jarkom
 */
public class DaftarPasienBaruDialog extends JDialog {

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
    // mendeklarasikan variabel saveButton bertipe data JButton dan bersifat private
    private JButton saveButton;
    
    /**
     * membuat constructor DaftarPasienBaruDialog
     */
    public DaftarPasienBaruDialog(){
        // memanggil method init
        init();
    }

    /**
     * membuat constructor DaftarPasienBaruDialog dan memiliki parameter title bertipe data String
     * @param title 
     */
    public DaftarPasienBaruDialog(String title){
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
        
        // mengisi objek saveButton dengan Simpan
        saveButton=new JButton("Simpan");
        // mengeset ukuran tombol yang ingin digunakan
        saveButton.setBounds(150, 160, 90, 20);
        // meanambahkan saveButton
        this.add(saveButton);
    }
    public void actionPerformed(ActionEvent e){
        Object tambahButton = null;
        if(e.getSource()==tambahButton){
            Pasien baru = new Pasien();
            baru.setNama(namaText.getText());

        }
    }
}
