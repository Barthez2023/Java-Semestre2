/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculatrice;

import  java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;


/**
 *
 * @author PC
 */
public class Calcul{
    double number1;
    double number2;
    String operande;
    double result;
    JLabel resultat;
    private void Enter_number(String s){
        try {
            int valeur = Integer.parseInt(s);
            String sol =resultat.getText() + s;
            resultat.setText(sol);
        } catch (NumberFormatException e) {}
        
    }
    public Calcul(){
        JFrame frame=new JFrame("Calculatrice");
        frame.setLayout(new BorderLayout() );
        frame.setBounds(300, 300, 400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
        JPanel resultpanel=new JPanel();
        resultpanel.setLayout(new BorderLayout(15,5));
        resultpanel.setPreferredSize(new Dimension(400, 50));
        resultat =new JLabel();
        resultat.setOpaque(true);
        resultat.setBackground(Color.white);
        resultat.setSize(new Dimension(400,50));
        resultat.setBorder(null);
        resultat.setFont(new Font("Arial",Font.BOLD, 20));
        
        resultpanel.add(resultat,BorderLayout.CENTER);
        frame.add(resultpanel,BorderLayout.NORTH);
        
        
        JFileChooser file=new JFileChooser();
        file.setCurrentDirectory(new File("C:\\Users\\PC\\Desktop\\github1\\Java-Semestre2\\Calculatrice"));
        file.showOpenDialog(frame);
        try {
            FileReader fr=new FileReader(file.getSelectedFile().getAbsoluteFile());
            BufferedReader br =new BufferedReader(fr);
            String line=br.readLine();
            String line1="";
            while(line!=null){
                System.out.println(line);
                line1=line;
                line=br.readLine();
            }
            br.close();
            String parca[]=line1.split(",");
            int k=0;
            JPanel panel=new JPanel();
            panel.setLayout(new GridLayout(5,4,3,3));
            for(int i=0;i<5;i++){
                for(int j=0;j<4;j++){
                    JButton button=new JButton(parca[k]);
                    panel.add(button);
                    k++;
                    //button.addActionListener((ActionListener) this);
                    button.addActionListener(new ActionListener(){
                         public void actionPerformed(ActionEvent evt){
                            JButton but= (JButton)evt.getSource(); 
                            Enter_number(but.getText());
                            
                            if(but.getText().equals(".")){
                                if(!resultat.getText().contains(".")){
                                    resultat.setText(resultat.getText()+".");
                                }
                            }
                            if(but.getText().equals("C/AC")){
                                resultat.setText("");
                            }
                            if(but.getText().equals("Del")){
                                String sback;
                                if(resultat.getText().length()>0){
                                    StringBuilder sb =new StringBuilder(resultat.getText());
                                    sb.deleteCharAt(resultat.getText().length()-1);
                                    sback=sb.toString();
                                    resultat.setText(sback);
                                }
                            }
                            if(but.getText().equals("Bck")){
                                resultat.setText(String.valueOf(result));
                            }
                            if(but.getText().equals("*")){
                                number1=Double.parseDouble(resultat.getText());
                                resultat.setText("");
                                operande="*";
                            }
                            if(but.getText().equals("-")){
                                number1=Double.parseDouble(resultat.getText());
                                resultat.setText("");
                                operande="-";
                            }
                            if(but.getText().equals("+")){
                                number1=Double.parseDouble(resultat.getText());
                                resultat.setText("");
                                operande="+";
                            }
                            if(but.getText().equals("/")){
                                number1=Double.parseDouble(resultat.getText());
                                resultat.setText("");
                                operande="/";
                            }
                            
                            if(but.getText().equals("=") && operande.equals("*") ){
                                number2=Double.parseDouble(resultat.getText());
                                result=number1*number2;
                                String reslut1=result+"";
                                resultat.setText(reslut1);
                            }
                            if(but.getText().equals("=") && operande.equals("+") ){
                                number2=Double.parseDouble(resultat.getText());
                                result=number1+number2;
                                String reslut1=result+"";
                                resultat.setText(reslut1);
                            }
                            if(but.getText().equals("=") && operande.equals("-") ){
                                number2=Double.parseDouble(resultat.getText());
                                result=number1-number2;
                                String reslut1=result+"";
                                resultat.setText(reslut1);
                            }
                            if(but.getText().equals("=") && operande.equals("/") ){
                                number2=Double.parseDouble(resultat.getText());
                                result=number1/number2;
                                String reslut1=result+"";
                                resultat.setText(reslut1);
                            }
                            
                            
                        }
                    
                    
                    
                    });
                }
            }
            frame.add(panel);
            frame.setVisible(true);
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(frame, "Fichier non trouver");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(frame, "Lecture impossible");
        }
        
    }
    
}
