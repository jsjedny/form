
package Mpi;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;


public class CiSir extends JFrame{    
    // IMPORT ELEMENT
    private ImageIcon icon,img;
    private JLabel imgLabel,userName,passward;
    private Container c;
    private Font f,f2;
    private JButton submit,clear;
    private JTextField jText;
    private JPasswordField pass;
    
    public static void main(String[] args) {       
        
        CiSir frame = new CiSir();
        frame.setVisible(true);
                
    }
    // END THE MAIN MATHOD
    
    CiSir(){
        Initelement();
    }
    
    public void Initelement(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(150, 50, 500, 600);
        this.setTitle("Class no: 1");
        this.setResizable(false);
        
        // MAKE A FONT
        f = new Font("Arial Black",Font.BOLD,14);
        f2 = new Font("Arial",Font.ITALIC + Font.BOLD,14);
        
        // INIT CONTAINER
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.DARK_GRAY);
       
        // SET ICON
        icon = new ImageIcon("F:\\\\java\\\\java\\\\src\\\\main\\\\java\\\\swing\\\\swing.png");
        this.setIconImage(icon.getImage());
        
        // SET IMG
        imgLabel = new JLabel(icon);
        imgLabel.setBounds(150, 50, 180, 200);
        c.add(imgLabel);
        
        //SET USERNAME LABEL
        userName = new JLabel("Enter your username :");
        userName.setBounds(50, 260, 180, 30);
        userName.setForeground(Color.BLACK);
        userName.setOpaque(true);
        userName.setBackground(Color.YELLOW);
        userName.setFont(f);
        c.add(userName);
        
        // SET TEXTFIELD FOR USERNAME LABEL
        jText = new JTextField();
        jText.setBounds(240,260,180,30);
        jText.setFont(f2);
        jText.setForeground(Color.WHITE);
        jText.setOpaque(true);
        jText.setBackground(Color.BLACK);
        jText.setHorizontalAlignment(JTextField.RIGHT);
        c.add(jText);
        
        // MAKE A ACTION LICANER
        jText.addActionListener(new ActionListener(){
            
            @Override
            public void actionPerformed(ActionEvent e){
                
                String s = jText.getText();
                JOptionPane.showMessageDialog(null, "User name is = "+s);
                
            }
            
        });
        
        //SET PASSWRAD LABEL
        passward = new JLabel("Enter your passward :");
        passward.setBounds(50, 300, 180, 30);
        passward.setForeground(Color.BLACK);
        passward.setOpaque(true);
        passward.setBackground(Color.YELLOW);
        passward.setFont(f);
        c.add(passward);
        
        // SET PASSWARD FIELD FOR PASSWARD LABEL
        pass = new JPasswordField();
        pass.setBounds(240,300,180,30);
        pass.setFont(f2);
        pass.setForeground(Color.WHITE);
        pass.setOpaque(true);
        pass.setBackground(Color.BLACK);
        pass.setHorizontalAlignment(JPasswordField.RIGHT);
        c.add(pass);
        
        
        pass.addActionListener(new ActionListener(){
            
            String s2 = pass.getText();
            
            @Override
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(null, "You enter = "+s2);
            }
            
        });
        
        // SET THE SUBMIT BUTTON
        submit = new JButton("Submit");
        submit.setBounds(75, 400, 100, 30);
        submit.setFont(f);        
        c.add(submit);
        
        // SET THE SUBMIT BUTTON
        clear = new JButton("Clear");
        clear.setBounds(280, 400, 100, 30);
        clear.setFont(f);        
        c.add(clear);
        
        
        
        
    }
    
}
// END THE MAIN CLASS
