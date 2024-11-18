/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package My_Classes;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.io.File;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 * @author Admin
 */
public class Func_Class {
    public void displayImage(int width, int height, byte[] imagebyte, String imagePath, JLabel label) {
        ImageIcon imgIco;
        // get the image
        if (imagebyte != null)//get image using bytes
        {
            imgIco = new ImageIcon(imagebyte);
        } else    //get image using path
        {
            try {
                //get image from the project resource
                imgIco = new ImageIcon(getClass().getResource(imagePath));

            } catch (Exception e) {
                //get icon from the desktop
                imgIco = new ImageIcon((imagePath));
            }
        }

        // make the image fit the jlabel
        Image image = imgIco.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
        Image image1 = imgIco.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
        Image image2 = imgIco.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
        Image image3 = imgIco.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
        Image image4 = imgIco.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
        Image image5 = imgIco.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);

        // set the image into the jlabel
        label.setIcon(new ImageIcon(image));
        label.setIcon(new ImageIcon(image1));
         label.setIcon(new ImageIcon(image2));
          label.setIcon(new ImageIcon(image3));
           label.setIcon(new ImageIcon(image4));
           label.setIcon(new ImageIcon(image5));
    }

    public void customTable(JTable table) {
        table.setSelectionBackground(new Color(249, 105, 14));
        table.setSelectionForeground(Color.white);
        table.setRowHeight(30);
        table.setShowGrid(false);
        // Set the background color of the JTable
        table.setBackground(new Color(248, 248, 248));
        table.setShowHorizontalLines(true);
        table.setGridColor(Color.ORANGE);

    }

    public void customTableHeader(JTable table, Color back_Color, Integer fontSize) {
        table.getTableHeader().setBackground(back_Color);    // Background color of the header
        table.getTableHeader().setForeground(Color.white);   // Text color of the header
        table.getTableHeader().setFont(new Font("Verdana", Font.BOLD, fontSize));   // Font style of the header
        table.getTableHeader().setOpaque(false);
    }

    public ResultSet getData(String query) {
        PreparedStatement ps;
        ResultSet rs = null;

        try {
            ps = DB.getConnection().prepareStatement(query);
            rs = ps.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(Author.class.getName()).log(Level.SEVERE, null, ex);
        }

        return rs;
    }

    public String selectImage() {
        // select picture from the computer
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Select Profile Picture");

        fileChooser.setCurrentDirectory(new File("C:\\Users\\Admin\\Documents\\NetBeansProjects\\Library_Management_System\\src\\My_Images\\books"));

        FileNameExtensionFilter extensionFilter = new FileNameExtensionFilter("Image", ".png", ".jpg", ".jpeg");
        fileChooser.addChoosableFileFilter(extensionFilter);

        int fileState = fileChooser.showSaveDialog(null);
        String path = "";
        if (fileState == JFileChooser.APPROVE_OPTION) {
            path = fileChooser.getSelectedFile().getAbsolutePath();
        }
        return path;
    }

    public int countData(String tableName) {
        int total = 0;
        ResultSet rs;
        Statement st;

        try {
            st = My_Classes.DB.getConnection().createStatement();
            rs = st.executeQuery("SELECT COUNT(*) as total FROM `" + tableName + "`");
            if (rs.next()) {
                total = rs.getInt("total");
            }
        } catch (SQLException ex) {
            Logger.getLogger(My_Classes.Func_Class.class.getName()).log(Level.SEVERE, null, ex);
        }
        return total;
    }
}
