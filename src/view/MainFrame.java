/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MainFrame extends JFrame implements ActionListener {

    private JMenuBar menuBar;
    private JMenu fileMenu;
    private JMenuItem exitMenuItem;
    private JMenuItem DaftarPasienBaruMenuItem;
    private JMenuItem DaftarAntrianPasienMenuItem;

    public MainFrame() {
        init();
    }

    public void init() {
        // buat menu bar
        menuBar = new JMenuBar();
        // set Titile
        this.setTitle("Main Frame");
        // buat menu
        fileMenu = new JMenu("File");
        exitMenuItem = new JMenuItem("exit");
        DaftarPasienBaruMenuItem = new JMenuItem("TambahPasien");
        fileMenu.add(DaftarPasienBaruMenuItem);
        DaftarAntrianPasienMenuItem = new JMenuItem("TambahAntrian");
        fileMenu.add(DaftarAntrianPasienMenuItem);
        fileMenu.add(exitMenuItem);
        menuBar.add(fileMenu);

        exitMenuItem.addActionListener(this);
        DaftarPasienBaruMenuItem.addActionListener(this);
        DaftarAntrianPasienMenuItem.addActionListener(this);

        this.setJMenuBar(menuBar);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == exitMenuItem) {
            System.exit(0);
        }
        if (e.getSource() == DaftarPasienBaruMenuItem) {
            DaftarPasienBaruDialog test = new DaftarPasienBaruDialog();
            test.setSize(600, 400);
            test.setVisible(true);
        }
        if (e.getSource() == DaftarAntrianPasienMenuItem) {
            DaftarAntrianDialog test = new DaftarAntrianDialog();
            test.setSize(600, 400);
            test.setVisible(true);

        }
       
    }
}
