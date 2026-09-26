package com.mycompany.apppractice;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class calculator extends JFrame implements ActionListener{
    
    private JLabel lbl_fvalue, lbl_svalue, lbl_operation, lbl_total, hdr_mycalc;
    private JComboBox<String> cmb_operation;
    private JTextArea  txt_total;
    private JButton btn_calculate;
    private JTextField txt_fvalue, txt_svalue;
    private static final String[] operator = {"Addition", "Subtraction", "Multiplication", "Division"};
    
    
    calculator() {
        setSize (400,350);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //Header
        hdr_mycalc = new JLabel("My Calculator");
        hdr_mycalc.setBounds(150, 20, 200, 20);
        add(hdr_mycalc);
        
        lbl_fvalue = new JLabel("First Value");
        lbl_fvalue.setBounds(93, 75, 90, 30);
        add(lbl_fvalue);
        
        lbl_svalue = new JLabel("Second Value");
        lbl_svalue.setBounds(75, 105, 90, 30);
        add(lbl_svalue);
        
        lbl_operation = new JLabel("Operation");
        lbl_operation.setBounds(95, 135, 90, 30);
        add(lbl_operation);
        
        lbl_fvalue = new JLabel("TOTAL");
        lbl_fvalue.setBounds(113, 165, 90, 30);
        add(lbl_fvalue);
        
        btn_calculate = new JButton("Calculate");
        btn_calculate.setBounds(165, 195, 90, 20);
        add(btn_calculate);
        
        //Txt Field
        txt_fvalue = new JTextField();
        txt_fvalue.setBounds(165, 80, 150, 20);
        add(txt_fvalue);
        
        txt_svalue = new JTextField();
        txt_svalue.setBounds(165, 110, 150, 20);
        add(txt_svalue);
        
        //Cmb Box
        cmb_operation = new JComboBox<>(operator);
        cmb_operation.setBounds(165, 140, 150, 20);
        add(cmb_operation);
        
        //Txt Area
        txt_total = new JTextArea();
        txt_total.setBounds(165, 170, 150, 20);
        txt_total.setEditable(false);
        add(txt_total);
        
        //ActionListener
        btn_calculate.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btn_calculate) {
            double doublefvalue = Double.parseDouble(txt_fvalue.getText());
            double doublesvalue = Double.parseDouble(txt_svalue.getText());                    
            double total = 0.0;
            
            String operatorused = (String) cmb_operation.getSelectedItem();
            
            if (operatorused.equals("Addition")){
                total = doublefvalue + doublesvalue;
            } else if (operatorused.equals("Subtraction")){
                total = doublefvalue - doublesvalue;
            } else if (operatorused.equals("Multiplication")){
                total = doublefvalue * doublesvalue; 
            } else if (operatorused.equals("Division")){
                if(doublesvalue != 0) {
                    total = doublefvalue / doublesvalue;
                } else {
                    txt_total.setText("Error!");
                    return;
                }
            }
            
            txt_total.setText(String.valueOf(total));
        } 
    }
    
}
