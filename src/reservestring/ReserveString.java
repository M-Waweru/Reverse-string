/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reservestring;
import com.sun.java.accessibility.util.AWTEventMonitor;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;
import java.util.*;

/**
 *
 * @author mathe
 */
public class ReserveString extends JFrame implements ActionListener, KeyListener{
    private JLabel lblMessage, lblNormal, lblReverse;
    private JTextField txtNormal, txtReverse;
    private JButton btnReverse;
    
    public ReserveString(){
        setSize(400, 400);
        setLayout(null);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Reverse of string");
        
        lblMessage = new JLabel("Reserve a string");
        lblMessage.setBounds(125, 20, 250, 50);
        lblMessage.setFont(new Font("Arial", Font.BOLD, 20));
        add(lblMessage);
        
        lblNormal = new JLabel("Enter anything");
        lblNormal.setBounds(50, 70, 100, 50);
        add(lblNormal);
        
        lblReverse = new JLabel("Reverse");
        lblReverse.setBounds(50, 120, 100, 50);
        add(lblReverse);
        
        txtNormal = new JTextField();
        txtNormal.setBounds(180, 90, 100, 20);
        txtNormal.addKeyListener(this);
        add(txtNormal);
        
        txtReverse = new JTextField();
        txtReverse.setBounds(180, 140, 100, 20);
        add(txtReverse);  
        
        btnReverse = new JButton("Reverse");
        btnReverse.setBounds(150, 190, 100, 25);
        add(btnReverse); 
        btnReverse.addActionListener(this);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new ReserveString();
    }
    
    public void reversethestring(String x){
        char chararray[] = x.toCharArray();
        char reversearray[] = new char[x.length()];
        int m = 0;
        for (int n=x.length()-1;n>-1;n--){
            reversearray[n]=chararray[m];
            m++;
        }
        System.out.print("Reversed string: ");
        String reverseString = String.valueOf(reversearray);
        System.out.print(reverseString + "\n");
        txtReverse.setText(reverseString);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==btnReverse){
            String normal = txtNormal.getText();
            reversethestring(normal);
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        String normal = txtNormal.getText();
        reversethestring(normal);
    }

    @Override
    public void keyTyped(KeyEvent e) {}

    @Override
    public void keyPressed(KeyEvent e) {}
}
