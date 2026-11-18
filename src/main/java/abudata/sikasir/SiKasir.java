/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package abudata.sikasir;

/**
 *
 * @author nunu
 */
import javax.swing.JFrame;

public class SiKasir extends JFrame {
    public SiKasir() {
        setTitle("Aplikasi Kasir Toko - SiKasir");
        setSize(420, 320);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
    
    public static void main(String[] args) {
        new SiKasir().setVisible(true);
    }
}
