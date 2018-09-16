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
    private JDialog tanggalLahirLabel;
    private JDialog bulanLahirLabel;
    private JDialog tahunLahirLabel;
    private JLabel nikLabel;
    private JTextField nikText;
    private JRadioButton laki;
    private JRadioButton perempuan;
    // mendeklarasikan variabel saveButton bertipe data JButton dan bersifat private
    private JButton saveButton;
    private String ArrayTanggal[] = {"Tanggal","1", "2", "3", "4", "5", "6", "7", "8", "9",
        "10", "11", "12", "13", "14", "15", "16", "17", "18",
        "19", "20", "21", "22", "23", "24", "25", "26", "27",
        "28", "29", "30", "31"};
    private String ArrayBulan[] = {"Bulan","1", "2", "3", "4", "5", "6", "7", "8", "9", "10",
        "11", "12"};
    private String ArrayTahun[] = {"Tahun","1900", "1901", "1902", "1903", "1904", "1905", "1906", "1907", "1908", "1909", "1910", "1911",
        "1912", "1913", "1914", "1915", "1916", "1917", "1918", "1918", "1919", "1920", "1921", "1922", "1923", "1924", 
        "1925", "1926", "1927", "1928", "1929", "1930", "1931", "1932", "1933", "1934", "1935", "1936", "1937", "1938", 
        "1939", "1940", "1941", "1942", "1943", "1944", "1945", "1946", "1947", "1948", "1949", "1950", "1951", "1952", 
        "1953", "1954", "1955", "1956", "1957", "1958", "1959", "1960", "1961", "1962", "1963", "1964", "1965", "1966", 
        "1967", "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980",
        "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994",
        "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003",	"2004",	"2005",	"2006",	"2007",	"2008",
        "2009",	"2010",	"2011",	"2012",	"2013",	"2014",	"2015",	"2016", "2017", "2018"};

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

        JComboBox tanggalCombo = new JComboBox(ArrayTanggal);
        tanggalCombo.setBounds(150, 150, 80, 20);
        this.add(tanggalCombo);

        JComboBox bulanCombo = new JComboBox(ArrayBulan);
        bulanCombo.setBounds(250, 150, 80, 20);
        this.add(bulanCombo);

        JComboBox tahunCombo = new JComboBox(ArrayTahun);
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

        nikLabel = new JLabel("NIK");
        nikLabel.setBounds(20, 230, 100, 20);
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
