/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.HeadlessException;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;


/**
 * membuat method kelas MainFrame dengan dengan turunan dari JFrame
 *
 * @author Hewlett-Packard
 */
public class MainFrame extends JFrame {

    // mendeklarasikan variabel menuBar bertipe data JMenuBar dan bersifat private
    private JMenuBar menuBar;
    // private mendeklarasikan variabel fileMenu bertipe data JMenu dan bersifat private
    private JMenu fileMenu;
    // private mendeklarasikan variabel exitMenuItem bertipe data JMenuItem dan bersifat private
    private JMenuItem exitMenuItem;

    /**
     * membuat constructor MainFrame dengan handleException
     *
     * @throws HeadlessException
     */
    public MainFrame() throws HeadlessException {
        // memanggil method init
        init();
    }

    /**
     * membuat method init bertipe data void
     */
    private void init() {
        //membuat menu bar
        menuBar = new JMenuBar();
        //set tittle
        this.setTitle("Main Frame");
        //membuat menu File
        fileMenu = new JMenu("File");
        //membuat menu file exit
        exitMenuItem = new JMenuItem("exit");
        // menambahkan menu item exit
        fileMenu.add(exitMenuItem);
        // menambahkan menu bar fileMenu
        menuBar.add(fileMenu);
        // set MenuBar
        this.setJMenuBar(menuBar);
    }
}
