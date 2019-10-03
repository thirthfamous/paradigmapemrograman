/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.paradigmapemrograman;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author fhblu
 */
public class Welcome {
   private JFrame mainFrame;
   private JLabel headerLabel;
   private JLabel statusLabel;
   private JPanel controlPanel;
   private JLabel msglabel;
   
   public Welcome(){
      prepareGUI();
   }
   
   private void prepareGUI(){
      mainFrame = new JFrame("Java SWING Examples");
      mainFrame.setSize(400,400);
      mainFrame.setLayout(new GridLayout(3, 1));

      headerLabel = new JLabel("",JLabel.CENTER );
      statusLabel = new JLabel("",JLabel.CENTER);        
      statusLabel.setSize(350,100);
      
      mainFrame.addWindowListener(new WindowAdapter() {
         public void windowClosing(WindowEvent windowEvent){
            System.exit(0);
         }        
      });    
      controlPanel = new JPanel();
      controlPanel.setLayout(new FlowLayout());

      mainFrame.add(headerLabel);
      mainFrame.add(controlPanel);
      mainFrame.add(statusLabel);
      mainFrame.setVisible(true);  
   }
   public void showGridLayoutDemo(){
      headerLabel.setText("Silahkan klik salah satu button dibawah");  
      
      JPanel panel = new JPanel();
      panel.setSize(300,300);
      GridLayout layout = new GridLayout(0,3);
      layout.setHgap(10);
      layout.setVgap(10);
      
      panel.setLayout(layout);
      JButton btnIndonesia = new JButton("Indonesia");
      JButton btnJepang = new JButton("Jepang");
      JButton btnSunda = new JButton("Sunda");
      
      btnIndonesia.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent ae) {
              headerLabel.setText("Selamat Datang");
          }
      });
      
      btnJepang.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent ae) {
              headerLabel.setText("Irasshaimase いらっしゃいませ");
          }
      });
      
      btnSunda.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent ae) {
              headerLabel.setText("Wilujeng Sumping");
          }
      });
              
              
      panel.add(btnIndonesia);
      panel.add(btnJepang);
      panel.add(btnSunda);
      controlPanel.add(panel);
      mainFrame.setVisible(true);
   }
   
}
