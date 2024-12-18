package My_Classes;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JLabel;

public class Book {

    private Integer id;
    private String isbn;
    private String name;
    private String author_id;
    private String genre_id;
    private Integer quantity;
    private String publisher;
    private double price;
    private String date_received;
    private String description;
    private byte[] cover;

    public Book() {
    }

    public Book(Integer _id, String _isbn, String _name, String _author_id, String _genre_id, Integer _quantity,
            String _publisher, double _price, String _date_received, String _description, byte[] _cover) {
        this.id = _id;
        this.isbn = _isbn;
        this.name = _name;
        this.author_id = _author_id;
        this.genre_id = _genre_id;
        this.quantity = _quantity;
        this.publisher = _publisher;
        this.price = _price;
        this.date_received = _date_received;
        this.description = _description;
        this.cover = _cover;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor_id(String author_id) {
        this.author_id = author_id;
    }

    public void setGenre_id(String genre_id) {
        this.genre_id = genre_id;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDate_received(String date_received) {
        this.date_received = date_received;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCover(byte[] cover) {
        this.cover = cover;
    }

    public Integer getId() {
        return id;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getName() {
        return name;
    }

    public String getAuthor_id() {
        return author_id;
    }

    public String getGenre_id() {
        return genre_id;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public String getPublisher() {
        return publisher;
    }

    public double getPrice() {
        return price;
    }

    public String getDate_received() {
        return date_received;
    }

    public String getDescription() {
        return description;
    }

    public byte[] getCover() {
        return cover;
    }

    //function
    Func_Class func = new Func_Class();

    // insert a new book function
    public void addBook(String _isbn, String _name, String _author_id, String _genre_id, Integer _quantity,
            String _publisher, double _price, String _date_received, String _description, byte[] _cover) {
        String insertQuery = "INSERT INTO `books`(`isbn`, `name`, `author_id`, `genre_id`, `quantity`, `publisher`,"
                + " `price`, `date_received`, `description`, `cover_image`) VALUES (?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = DB.getConnection().prepareStatement(insertQuery);

            ps.setString(1, _isbn);
            ps.setString(2, _name);
            ps.setString(3, _author_id);
            ps.setString(4, _genre_id);
            ps.setInt(5, _quantity);
            ps.setString(6, _publisher);
            ps.setDouble(7, _price);
            ps.setString(8, _date_received);
            ps.setString(9, _description);
            ps.setBytes(10, _cover);

            if (ps.executeUpdate() != 0) {
                JOptionPane.showMessageDialog(null, "Book Added", "add Book", 1);
            } else {
                JOptionPane.showMessageDialog(null, "Book Not Added", "add Book", 2);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // edit the selected book info function 
    public void editBook(int _id, String _name, String _author_id, String _genre_id, Integer _quantity,
            String _publisher, double _price, String _date_received, String _description, byte[] _cover) {
        String updateQuery = "";
        PreparedStatement ps;

        try {
            if (_cover != null) // if you want to update the book image
            {
                updateQuery = "UPDATE `books` SET `name`=?,`author_id`=?,`genre_id`=?,`quantity`=?,`publisher`=?,`price`=?,`date_received`=?,`"
                        + "description`=?,`cover_image`=? WHERE `id`=?";
                ps = DB.getConnection().prepareStatement(updateQuery);

                //ps.setString(1, _isbn);
                ps.setString(1, _name);
                ps.setString(2, _author_id);
                ps.setString(3, _genre_id);
                ps.setInt(4, _quantity);
                ps.setString(5, _publisher);
                ps.setDouble(6, _price);
                ps.setString(7, _date_received);
                ps.setString(8, _description);
                ps.setBytes(9, _cover);
                ps.setInt(10, _id);
            } else // if not
            {
                updateQuery = "UPDATE `books` SET `name`=?,`author_id`=?,`genre_id`=?,`quantity`=?,`publisher`=?,`price`=?,`date_received`=?,`description`=? WHERE `id`=?";
                ps = DB.getConnection().prepareStatement(updateQuery);

                //ps.setString(1, _isbn);
                ps.setString(1, _name);
                ps.setString(2, _author_id);
                ps.setString(3, _genre_id);
                ps.setInt(4, _quantity);
                ps.setString(5, _publisher);
                ps.setDouble(6, _price);
                ps.setString(7, _date_received);
                ps.setString(8, _description);
                //ps.setBytes(9, _cover);
                ps.setInt(9, _id);
            }

            if (ps.executeUpdate() != 0) {
                JOptionPane.showMessageDialog(null, "Book Edited", "edit Book", 1);
            } else {
                JOptionPane.showMessageDialog(null, "Book Not Edited", "edit Book", 2);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // remove book by id function
    public void removeBook(int _id) {
        String removeQuery = "DELETE FROM `books` WHERE `id` = ?";
        try {
            PreparedStatement ps = DB.getConnection().prepareStatement(removeQuery);
            ps.setInt(1, _id);

            if (ps.executeUpdate() != 0) {
                JOptionPane.showMessageDialog(null, "Books Deleted", "remove", 1);
            } else {
                JOptionPane.showMessageDialog(null, "Books Not Deleted", "remove", 2);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // create a function to check if the isbn already exists
    public boolean isISBNexists(String _isbn) {
        String query = "SELECT * FROM `books` WHERE `isbn` = '" + _isbn + "'";
        ResultSet rs = func.getData(query);
        try {
            if (rs.next()) {
                return true; // if this isbn exists return true
            } else {
                return false; // if not return false
            }
        } catch (SQLException ex) {
            Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }

    public Book searchBookById_Isbn(int _id, String _isbn) {
        String query = "SELECT * FROM `books` WHERE `id` = " + _id + " or `isbn` = '" + _isbn + "'";

        ResultSet rs = func.getData(query);
        Book book = null;

        try {
            if (rs.next()) {
                book = new Book(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),
                        rs.getString(5), rs.getInt(6), rs.getString(7), rs.getDouble(8),
                        rs.getString(9), rs.getString(10), rs.getBytes(11));
            } else {
                return book;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, ex);
        }
        return book;
    }

    // function to populate an arrayList with books
    public ArrayList<Book> booksList(String query) {
        ArrayList<Book> bList = new ArrayList<>();

        try {
            if (query.equals("")) // if the user enter empty string make this the default select
            {
                query = "SELECT * FROM `books`";
            }
            ResultSet rs = func.getData(query);
            Book book;

            while (rs.next()) {
                book = new Book(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),
                        rs.getString(5), rs.getInt(6), rs.getString(7), rs.getDouble(8),
                        rs.getString(9), rs.getString(10), rs.getBytes(11));
                bList.add(book);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Author.class.getName()).log(Level.SEVERE, null, ex);
        }

        return bList;
    }

    //get book by id
    public Book getBookById(Integer _id) throws SQLException {
        // query to get the book by the id
        String query = "SELECT * FROM `books` WHERE `id`=" + _id;
        ResultSet rs = func.getData(query);
        if (rs.next()) {
            // return the book
            return new Book(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),
                    rs.getString(5), rs.getInt(6), rs.getString(7), rs.getDouble(8),
                    rs.getString(9), rs.getString(10), rs.getBytes(11));
        } else {
            // return null
            return null;
        }
    }

    // create a function to display the lastest 5 books
    // we will pass an array of JLabels as a parameter
    public void displayBooksCover(JLabel[] labels_tab) {
        ResultSet rs;
        Statement st;

        try {
            st = DB.getConnection().createStatement();
            rs = st.executeQuery("SELECT `cover_image` FROM `books`order by id desc LIMIT 5");
            byte[] image;
            int i = 0; // to populate the labels_tab items with image
            while (rs.next()) // this go through all the data
            {
                image = rs.getBytes("cover_image");
                func.displayImage(labels_tab[i].getWidth(), labels_tab[i].getHeight(), image, name, labels_tab[i]);
                i++;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void setQuantity_Minus_One(int _book_id, int _quantity) {
        String updatequantityQuery;
        PreparedStatement ps;

        try {

            updatequantityQuery = "UPDATE `books` SET `quantity`=? WHERE `id`=?";
            ps = DB.getConnection().prepareStatement(updatequantityQuery);

            ps.setInt(1, _quantity);
            ps.setInt(2, _book_id);

            if (ps.executeUpdate() != 0) {
                JOptionPane.showMessageDialog(null, "This Book Is Set To Lost -> The Quantity - 1", "edit Book Quantity", 1);
            } else {
                JOptionPane.showMessageDialog(null, "Book Quantity Not Edited", "edit Book Quantity", 2);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
