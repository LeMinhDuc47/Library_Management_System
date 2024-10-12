/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package My_Classes;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author Admin
 */
public class Func_Class {
          public void displayImage(int width, int height, String imagePath, JLabel label){
        ImageIcon imgIco = new ImageIcon(getClass().getResource(imagePath));  
        Image image = imgIco.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
        label.setIcon(new ImageIcon(image));
   
    }
}
