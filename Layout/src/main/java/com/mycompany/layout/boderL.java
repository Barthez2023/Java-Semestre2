/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.layout;


import java.awt.*;
import javax.swing.*;


/**
 *
 * @author PC
 */
public class boderL {
    
    public boderL(){
        JFrame frame=new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        
        //  border layout 
        /*frame.setLayout(new BorderLayout(10,5));
        JPanel panel1= new JPanel();
        JPanel panel2= new JPanel();
        JPanel panel3= new JPanel();
        JPanel panel4= new JPanel();
        JPanel panel5= new JPanel();
        JPanel panel6= new JPanel();

        JButton btu=new JButton("but1");
        JButton btu1=new JButton("but2");
        JButton btu2=new JButton("but3");
        
        panel1.setBackground(Color.red);
        panel1.add(btu,BorderLayout.SOUTH);
        panel1.add(btu1,BorderLayout.NORTH);
        panel1.add(btu2,BorderLayout.CENTER);
        
        
        
        
        panel2.setBackground(Color.BLUE);
        panel3.setBackground(Color.YELLOW);
        panel4.setBackground(Color.darkGray);
        panel5.setBackground(Color.magenta);
        panel6.setBackground(Color.green);

        panel1.setPreferredSize(new Dimension(100,100));
        panel2.setPreferredSize(new Dimension(100,100));
        panel3.setPreferredSize(new Dimension(100,100));
        panel4.setPreferredSize(new Dimension(100,100));
        panel5.setPreferredSize(new Dimension(100,100));
        panel6.setPreferredSize(new Dimension(100,100));
        
        frame.add(panel1,BorderLayout.PAGE_START);
        frame.add(panel2,BorderLayout.PAGE_END);
        frame.add(panel3,BorderLayout.CENTER);
        frame.add(panel4,BorderLayout.WEST);
        frame.add(panel5,BorderLayout.EAST);
        //frame.add(panel1,BorderLayout.SOUTH);
        //frame.add(panel6,BorderLayout.BEFORE_FIRST_LINE);*/
        
        
        // FlowLayout 
        /*frame.setLayout(new FlowLayout(FlowLayout.RIGHT));
        frame.add(new JButton("1"));
        frame.add(new JButton("2"));
        frame.add(new JButton("3"));
        frame.add(new JButton("4"));
        frame.add(new JButton("5"));
        frame.add(new JButton("6"));
        frame.add(new JButton("7"));
        frame.add(new JButton("8"));
        frame.add(new JButton("9"));*/
        
        
        //GridLayout
        /*frame.setLayout(new GridLayout(3,3));
        frame.add(new JButton("1"));
        frame.add(new JButton("2"));
        frame.add(new JButton("3"));
        frame.add(new JButton("4"));
        frame.add(new JButton("5"));
        frame.add(new JButton("6"));
        frame.add(new JButton("7"));
        frame.add(new JButton("8"));
        frame.add(new JButton("9"));*/
        
        //representation
        
        frame.setLayout(new BorderLayout());
        String ligne="KUZEY,5,GUNEY,2,MERKEZ,3,BATI,0,DOGU,4";
        String parca[]=ligne.split(",");
        int k=0;
        if(parca[k].equals("KUZEY")){
           JButton but =new JButton(parca[k+1]);
           frame.add(but,BorderLayout.PAGE_START);
           k=k+2;
        }
        if(parca[k].equals("GUNEY")){
           JButton but =new JButton(parca[k+1]);
           frame.add(but,BorderLayout.PAGE_END);
           k=k+2;
        }
        if(parca[k].equals("MERKEZ")){
           JButton but =new JButton(parca[k+1]);
           frame.add(but,BorderLayout.CENTER);
           k=k+2;
        }
        if(parca[k].equals("BATI")){
           JButton but =new JButton(parca[k+1]);
           frame.add(but,BorderLayout.WEST);
           k=k+2;
        }
        if(parca[k].equals("DOGU")){
           JButton but =new JButton(parca[k+1]);
           frame.add(but,BorderLayout.EAST);
           k=k+2;
        }
        
        
        
       frame.setVisible(true);
       frame.revalidate();
       frame.repaint();
    }
    
}
