/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.coolapp;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
/**
 *
 * @author Mikeyks
 */
public class Coolappsrc extends JFrame implements ActionListener {
    
    private JLabel coolheader, buycool, coolnum;
    private JButton coolbutadd, coolbutminus, buynow;
    private JTextArea youbuy;
    private int youbought = 0;
    
    Coolappsrc() {
        setSize(400,400);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        coolheader = new JLabel ("Welcome to my Cool_Shoop B}");
        coolheader.setBounds(75, 50, 200, 20);
        add(coolheader);
        
        buycool = new JLabel ("Buy Cool");
        buycool.setBounds(80, 100, 150, 20);
        add(buycool);
        
        coolnum = new JLabel ("0");
        coolnum.setBounds(230, 100, 150, 20);
        add(coolnum);
        
        coolbutadd = new JButton ("+");
        coolbutadd.setBounds(50, 150, 100, 20);
        add(coolbutadd);
        
        coolbutminus = new JButton ("-");
        coolbutminus.setBounds(200, 150, 100, 20);
        add(coolbutminus);
        
        buynow = new JButton ("buy now!");
        buynow.setBounds(130, 190, 100, 20);
        add(buynow);
        
        youbuy = new JTextArea ();
        youbuy.setBounds(50, 250, 300, 80);
        youbuy.setEditable(false);
        add(youbuy);
        
        coolbutadd.addActionListener(this);
        coolbutminus.addActionListener(this);
        buynow.addActionListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == coolbutadd) {
            youbought++;
            coolnum.setText(String.valueOf(youbought));
        }
        else if (e.getSource() == coolbutminus) {
            youbought--;
             coolnum.setText(String.valueOf(youbought));
        }
        
        else if (e.getSource() == buynow) {
            youbuy.setText("you bought " + youbought + " cools B)");
        }
                
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        
    }
    
    
    
}
