/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clubprogramacion;

/**
 *
 * @author emili
 */
import javax.swing.JOptionPane;

public class ejercico1 {

    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero entero"));
        int y = 0;
        String msg = "";
        msg += n;
        while (n > 1) {
            y = n;
            if (n % 2 == 0) {
                n /= 2;
                msg += " " + n;
            } else {
                y *= 2;
                n = (y + 1) + n;
                msg += " " + n;
            }
        }
        JOptionPane.showMessageDialog(null, msg);
    }
}
