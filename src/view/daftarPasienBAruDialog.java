/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author jarkom
 */
public class daftarPasienBAruDialog extends JDialog{

    private JLabel judulLabel;
    private JLabel namaLabel;
    private JLabel alamatLabel;
    private JTextField alamatText;
    private JTextField namaText;
    private JTextField noRMText;
    private JButton saveButton;
    
    public daftarPasienBAruDialog(){
        init();
    }

    public daftarPasienBAruDialog(String tittle){
        this.setTitle(tittle);
        init();
    }
    
    private void init() {
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
