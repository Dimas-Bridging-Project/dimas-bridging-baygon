/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.dimas.bridging.utils;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JWindow;

/**
 *
 * @author Bagus Winarno
 */
public class SplashScreen extends JWindow{
    private int duration;
  
  public SplashScreen(int d) {
    duration = d;
    
    JPanel content = (JPanel) getContentPane();
    content.setBackground(Color.white);
    int width = 100;
    int height = 100;
    Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (screen.width - width) / 2;
    int y = (screen.height - height) / 2;
    setBounds(x, y, width, height);

    //content.add(new JLabel("asdf"), BorderLayout.CENTER);
    Color oraRed = new Color(156, 20, 20, 255);
    content.setBorder(BorderFactory.createLineBorder(oraRed, 20));
    setVisible(true);
    try {
      Thread.sleep(duration);
    } catch (Exception e) {
    }
    setVisible(false);
  }
  public static void main(String[] args) {
        SplashScreen splash = new SplashScreen(5000);
  }
}
