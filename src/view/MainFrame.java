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
 *
 * @author jarkom
 */
public class MainFrame extends JFrame {
    private JMenuBar menuBar;
    private JMenu fileMenu;
    private JMenuItem exitMenuItem;
    
    public MainFrame()throws HeadlessException{
        init();
    }

    private void init() {
        //membuat menu bar
        menuBar=new JMenuBar();
        //setset tittle
        this.setTitle("Main Frame");
        //membuat menu File
        fileMenu=new JMenu("File");
        //membuat menu file exit
        exitMenuItem=new JMenuItem("exit");
        fileMenu.add(exitMenuItem);
        menuBar.add(fileMenu);
        this.setJMenuBar(menuBar);
    }
}
