/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasprak3;

import javax.swing.*;

/**
 *
 * @author LENOVO
 */
public class TampilanJava extends JFrame {
    JLabel luname = new JLabel("Username : "); 
    JTextField funame = new JTextField (15);
    JLabel lpass = new JLabel("Password : ");
    JPasswordField fpass = new JPasswordField(15);
    JButton blogin = new JButton("Login");
    JButton bcancel = new JButton("Cancel");
    
    public TampilanJava() {
      
       setTitle("Login");
       setSize(300,250);
       
       setLayout(null);
       
       add(luname); add(funame); add(lpass); add(fpass); add(blogin); add(bcancel);
       
       
       luname.setBounds(20, 20, 95, 30); funame.setBounds(100, 20, 105, 30); lpass.setBounds(20, 60, 95, 30);
       fpass.setBounds(100, 60, 105, 30); blogin.setBounds(20, 150, 95, 25); bcancel.setBounds(150, 150, 95, 25);
       
       
       setVisible(true);
    }
    
}
