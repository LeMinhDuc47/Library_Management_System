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
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
 * @author Admin
 */
public class Genre {
    private int id;
    private String name;

    public Genre() {

    }

    public Genre(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    My_Classes.Func_Class func = new My_Classes.Func_Class();

    public void addGenre(String name) {
        String insertQuery = "INSERT INTO `book_genres`(`name`) VALUES (?)";
        try {
            PreparedStatement ps = DB.getConnection().prepareStatement(insertQuery);
            ps.setString(1, name);
            if (ps.executeUpdate() != 0) {
                JOptionPane.showMessageDialog(null, "Genre Added", "add genre", 1);
            } else {
                JOptionPane.showMessageDialog(null, "Genre Not Added", "add genre", 2);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Genre.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void editGenre(int id, String name) {
        String editQuery = "UPDATE `book_genres` SET `name` = ? WHERE `id` = ?";
        try {
            PreparedStatement ps = DB.getConnection().prepareStatement(editQuery);
            ps.setString(1, name);
            ps.setInt(2, id);
            if (ps.executeUpdate() != 0) {
                JOptionPane.showMessageDialog(null, "Genre Edited", "edit genre", 1);
            } else {
                JOptionPane.showMessageDialog(null, "Genre Not Edited", "edit genre", 2);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Genre.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void removeGenre(int id) {
        String removeQuery = "DELETE FROM `book_genres` WHERE `id` = ?";
        try {
            PreparedStatement ps = DB.getConnection().prepareStatement(removeQuery);
            ps.setInt(1, id);
            if (ps.executeUpdate() != 0) {
                JOptionPane.showMessageDialog(null, "Genre Deleted", "remove", 1);
            } else {
                JOptionPane.showMessageDialog(null, "Genre Not Deleted", "remove", 2);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Genre.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public ArrayList<Genre> genreList() {
        ArrayList<Genre> gList = new ArrayList<>();
        My_Classes.Func_Class func = new Func_Class();
        try {
            ResultSet rs = func.getData("SELECT * FROM `book_genres`");
            Genre genre;
            while (rs.next()) {
                genre = new Genre(rs.getInt("id"), rs.getString("name"));
                gList.add(genre);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Genre.class.getName()).log(Level.SEVERE, null, ex);
        }
        return gList;
    }

    public HashMap<String, Integer> getGenresMap() {
        HashMap<String, Integer> map = new HashMap<>();
        try {
            ResultSet rs = func.getData("SELECT * FROM `book_genres`");
            My_Classes.Genre genre;

            while (rs.next()) {
                genre = new My_Classes.Genre(rs.getInt("id"), rs.getString("name"));
                map.put(genre.getName(), genre.getId());
            }
        } catch (SQLException ex) {
            Logger.getLogger(My_Classes.Genre.class.getName()).log(Level.SEVERE, null, ex);
        }
        return map;
    }

    // create a function to get genre by id
    public My_Classes.Genre getGenreById(Integer id) {
        ResultSet rs = func.getData("SELECT * FROM `book_genres` where id = " + id);

        My_Classes.Genre genre = null;

        try {
            if (rs.next()) {
                genre = new My_Classes.Genre(rs.getInt("id"), rs.getString("name"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(My_Classes.Genre.class.getName()).log(Level.SEVERE, null, ex);
        }
        return genre;
    }
}
