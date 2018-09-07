/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JDialog;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author jarkom
 */
public class daftarAntrianDialog extends JDialog {

    private JLabel judulLabel;
    private JLabel namaLabel;
    private JLabel noRMLabel;
    private JLabel alamatLabel;
    private JTextField namaText;
    private JTextField noRMText;
    private JTextField alamatText;
    private JButton saveButton;

    public daftarAntrianDialog() {
        init();
    }

    public daftarAntrianDialog(String title) {
        this.setTitle(title);
        init();
    }

    public void init() {
        this.setLayout(null);

        judulLabel = new JLabel("Form Daftar Antrian");
        judulLabel.setBounds(150, 20, 200, 50);
        this.add(judulLabel);

        namaLabel = new JLabel("Nama");
        namaLabel.setBounds(20, 70, 100, 20);
        this.add(namaLabel);

        namaText = new JTextField();
        namaText.setBounds(100, 70, 100, 20);
        this.add(namaText);
        
        noRMLabel=new JLabel("No RM");
        noRMLabel.setBounds(20, 100, 100, 20);
        this.add(noRMLabel);
        
        noRMText=new JTextField();
        noRMText.setBounds(100, 100, 100, 20);
        this.add(noRMText);
        
        alamatLabel=new JLabel("alamat");
        alamatLabel.setBounds(20, 130, 100, 20);
        this.add(alamatLabel);
        
        alamatText=new JTextField();
        alamatText.setBounds(100, 130, 100, 20);
        this.add(alamatText);
        
        saveButton=new JButton("Simpan");
        saveButton.setBounds(150, 160, 90, 20);
        this.add(saveButton);
        
    }
}
