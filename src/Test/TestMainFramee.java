/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import view.MainFrame;
import javax.swing.JFrame;

/**
 *
 * @author Hewlett-Packard
 */
public class TestMainFramee {
        public static void main(String[] args) {
        MainFrame test = new MainFrame();
        test.setSize(600, 400);
        test.setVisible(true);
        test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
