/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package My_Classes;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 * @author Admin
 */
public class Author {

    private int id;
    private String firstName;
    private String lastName;
    private String field_Of_Expertise;
    private String about;

    public Author() {
    }

    public Author(int id, String fname, String lname, String expertise, String about) {
        this.id = id;
        this.firstName = fname;
        this.lastName = lname;
        this.field_Of_Expertise = expertise;
        this.about = about;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getField_Of_Expertise() {
        return field_Of_Expertise;
    }

    public String getAbout() {
        return about;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setField_Of_Expertise(String field_Of_Expertise) {
        this.field_Of_Expertise = field_Of_Expertise;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    My_Classes.Func_Class func = new My_Classes.Func_Class();

    public void addAuthor(String _fname, String _lname, String _expertise, String _about) {
        String insertQuery = "INSERT INTO `author`(`firstName`, `lastName`, `expertise`, `about`) VALUES (?, ?, ?, ?)";
        try {
            PreparedStatement ps = DB.getConnection().prepareStatement(insertQuery);
            ps.setString(1, _fname);
            ps.setString(2, _lname);
            ps.setString(3, _expertise);
            ps.setString(4, _about);
            if (ps.executeUpdate() != 0) {
                JOptionPane.showMessageDialog(null, "Author Added", "add author", 1);
            } else {
                JOptionPane.showMessageDialog(null, "Author Not Added", "add author", 2);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Author.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void editAuthor(int _id, String _fname, String _lname, String _expertise, String _about) {
        String editQuery = "UPDATE `author` SET `firstname` = ?, `lastname` = ?, `expertise` = ?, `about` = ? WHERE `id` = ?";
        try {
            PreparedStatement ps = DB.getConnection().prepareStatement(editQuery);
            ps.setString(1, _fname);
            ps.setString(2, _lname);
            ps.setString(3, _expertise);
            ps.setString(4, _about);
            ps.setInt(5, _id);
            if (ps.executeUpdate() != 0) {
                JOptionPane.showMessageDialog(null, "Author Edited", "edit author", 1);
            } else {
                JOptionPane.showMessageDialog(null, "Author Not Edited", "edit author", 2);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Author.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void removeAuthor(int _id) {
        String removeQuery = "DELETE FROM `author` WHERE `id` = ?";
        try {
            PreparedStatement ps = DB.getConnection().prepareStatement(removeQuery);
            ps.setInt(1, _id);
            if (ps.executeUpdate() != 0) {
                JOptionPane.showMessageDialog(null, "Author Deleted", "remove", 1);
            } else {
                JOptionPane.showMessageDialog(null, "Author Not Deleted", "remove", 2);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Author.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public ArrayList<Author> authorsList() {
        ArrayList<Author> aList = new ArrayList<>();
        My_Classes.Func_Class func = new Func_Class();
        try {
            ResultSet rs = func.getData("SELECT * FROM `author`");
            Author author;
            while (rs.next()) {
                author = new Author(rs.getInt("id"), rs.getString("firstname"), rs.getString("lastname"), rs.getString("expertise"), rs.getString("about"));
                aList.add(author);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Author.class.getName()).log(Level.SEVERE, null, ex);
        }
        return aList;
    }


    public My_Classes.Author getAuthorById(Integer id) {
        ResultSet rs = func.getData("SELECT * FROM `author` where id = " + id);
        My_Classes.Author author = null;

        try {
            if (rs.next()) {
                author = new My_Classes.Author(rs.getInt("id"), rs.getString("firstName"), rs.getString("lastName"), rs.getString("expertise"), rs.getString("about"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(My_Classes.Author.class.getName()).log(Level.SEVERE, null, ex);
        }
        return author;
    }
}
