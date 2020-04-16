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
    public static void main(String[]args){
    int n=Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero entero"));
    int x=n;
    int y=0;
    int z=n;
    String msg="";
    if(n>0){
        msg+=n+" ";
       while(z>0){     
        if(z%2==0){
          y=z/2;
         msg+=+(z/2)+" ";
        }else{
         y=x+(z/2)+1;
        msg+=y+x+(z/2)+1+" ";
         
        }
        if(y==1)break;
        x=y; z=y;
       }
      }else{
        msg+=n;
    }
    JOptionPane.showMessageDialog(null,msg);
}
}
