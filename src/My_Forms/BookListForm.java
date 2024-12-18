package My_Forms;

import My_Classes.DragUtility;
import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.logging.Logger;
import java.util.logging.Level;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;

public class BookListForm extends javax.swing.JFrame {

    //Creates new form BooksListForm
    My_Classes.Book book = new My_Classes.Book();
    My_Classes.Func_Class func = new My_Classes.Func_Class();
    My_Classes.Author author = new My_Classes.Author();
    My_Classes.Genre genre = new My_Classes.Genre();

    public BookListForm() {
        initComponents();
        // center the form
        this.setLocationRelativeTo(null);
// Add movement feature
        DragUtility.addDragFunctionality(this);
        // add border to the panel
        Border panelHeaderBorder = BorderFactory.createMatteBorder(3, 3, 3, 3, new Color(211, 84, 0));
        jPanel1.setBorder(panelHeaderBorder);

        // display image in the top
        My_Classes.Func_Class func = new My_Classes.Func_Class();
        func.displayImage(50, 50, null, "/My_Images/imageLibrary/bookList.png", jLabel_FormTitle);

        // customize the jtable
        func.customTable(jTable_ListTable_);

        // customize the jtable header row
        func.customTableHeader(jTable_ListTable_, new Color(36, 37, 42), 16);

        //add a black border to the jlabelImage
        Border JlabelImageBorder = BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 0, 0));
        jLabel_Image.setBorder(JlabelImageBorder);

        // add a default image to the jlabel
        func.displayImage(112, 93, null, "/Images/blank-profile.png", jLabel_Image);

        // display books in the jtable
        populateJtableWithBooks("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel_FormTitle = new javax.swing.JLabel();
        jLabel_CloseForm_ = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable_ListTable_ = new javax.swing.JTable();
        jLabel_Image = new javax.swing.JLabel();
        jLabel_ISBN = new javax.swing.JLabel();
        jLabel_Name = new javax.swing.JLabel();
        jLabel_Publisher = new javax.swing.JLabel();
        jLabel_Price = new javax.swing.JLabel();
        jLabel_Author = new javax.swing.JLabel();
        jLabel_Genre = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton_SearchBetweenTwoDates_ = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jTextField_Search = new javax.swing.JTextField();
        jButton_SearchByNameOrDescription_ = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel_FormTitle.setBackground(new java.awt.Color(211, 84, 0));
        jLabel_FormTitle.setDisplayedMnemonic('0');
        jLabel_FormTitle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel_FormTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_FormTitle.setText("Books List");
        jLabel_FormTitle.setOpaque(true);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel_FormTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 1215, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel_FormTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel_CloseForm_.setBackground(new java.awt.Color(255, 0, 51));
        jLabel_CloseForm_.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel_CloseForm_.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_CloseForm_.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_CloseForm_.setText("X");
        jLabel_CloseForm_.setToolTipText("0");
        jLabel_CloseForm_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_CloseForm_.setOpaque(true);
        jLabel_CloseForm_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_CloseForm_MouseClicked(evt);
            }
        });

        jTable_ListTable_.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable_ListTable_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_ListTable_MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable_ListTable_);

        jLabel_Image.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_Image.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel_Image.setOpaque(true);
        jLabel_Image.setPreferredSize(new java.awt.Dimension(34, 14));

        jLabel_ISBN.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel_ISBN.setForeground(new java.awt.Color(0, 51, 153));
        jLabel_ISBN.setText("ISBN");

        jLabel_Name.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel_Name.setForeground(new java.awt.Color(0, 51, 153));
        jLabel_Name.setText("Name");

        jLabel_Publisher.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel_Publisher.setForeground(new java.awt.Color(0, 51, 153));
        jLabel_Publisher.setText("Publisher");

        jLabel_Price.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel_Price.setForeground(new java.awt.Color(0, 51, 153));
        jLabel_Price.setText("Price");

        jLabel_Author.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel_Author.setForeground(new java.awt.Color(0, 51, 153));
        jLabel_Author.setText("Author");

        jLabel_Genre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel_Genre.setForeground(new java.awt.Color(0, 51, 153));
        jLabel_Genre.setText("Genre");

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel2.setText("and:");

        jButton_SearchBetweenTwoDates_.setBackground(java.awt.Color.lightGray);
        jButton_SearchBetweenTwoDates_.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton_SearchBetweenTwoDates_.setText("search");
        jButton_SearchBetweenTwoDates_.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton_SearchBetweenTwoDates_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SearchBetweenTwoDates_ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setText("search book between two date");

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel5.setText("Date Received between:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(jButton_SearchBetweenTwoDates_, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(115, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton_SearchBetweenTwoDates_, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(31, 31, 31)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5))
                            .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel3.setText("Value to Search:");

        jTextField_Search.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        jButton_SearchByNameOrDescription_.setBackground(java.awt.Color.lightGray);
        jButton_SearchByNameOrDescription_.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton_SearchByNameOrDescription_.setText("search");
        jButton_SearchByNameOrDescription_.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton_SearchByNameOrDescription_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SearchByNameOrDescription_ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 204));
        jLabel4.setText("search by book name or description");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_SearchByNameOrDescription_, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField_Search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_SearchByNameOrDescription_, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 993, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_Image, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_Name)
                    .addComponent(jLabel_Author)
                    .addComponent(jLabel_Genre)
                    .addComponent(jLabel_Publisher)
                    .addComponent(jLabel_Price)
                    .addComponent(jLabel_ISBN, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel_CloseForm_, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel_CloseForm_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel_Image, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_ISBN, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel_Name)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel_Author)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel_Genre)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel_Publisher)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel_Price))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1263, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel_CloseForm_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_CloseForm_MouseClicked
        // close the form
        this.dispose();
    }//GEN-LAST:event_jLabel_CloseForm_MouseClicked

    private void jButton_SearchBetweenTwoDates_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SearchBetweenTwoDates_ActionPerformed
        // search and display data in the jtable

        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("YYYY-MM-dd");
            String date1 = dateFormat.format(jDateChooser1.getDate()); // get date1
            String date2 = dateFormat.format(jDateChooser2.getDate()); // get date 2
            // search book between two date
            String query = "SELECT * FROM `books` WHERE `date_received` BETWEEN '" + date1 + "' AND '" + date2 + "'";
            populateJtableWithBooks(query);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Select The Two Date Before Clicking Search", "No Dates Selected", 2);
        }


    }//GEN-LAST:event_jButton_SearchBetweenTwoDates_ActionPerformed

    private void jTable_ListTable_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_ListTable_MouseClicked
        // display the selected book data
        My_Classes.Book SelectedBook;
        try {
            //search member by id and display data
            Integer rowIndex = jTable_ListTable_.getSelectedRow(); // get the selected jtable row index
            // get the member id from the jtable (the id is in the first column [0])
            Integer id = Integer.parseInt(jTable_ListTable_.getModel().getValueAt(rowIndex, 0).toString());

            SelectedBook = book.getBookById(id);

            if (SelectedBook != null) {
                jLabel_ISBN.setText(SelectedBook.getIsbn());
                jLabel_Name.setText(SelectedBook.getName());

                // we need to display the author name
                jLabel_Author.setText(SelectedBook.getAuthor_id());

                // we need to display the genre name
                jLabel_Genre.setText(SelectedBook.getGenre_id());

                jLabel_Publisher.setText(SelectedBook.getPublisher());
                jLabel_Price.setText(String.valueOf(SelectedBook.getPrice()));

                //display the book cover image
                byte[] image = SelectedBook.getCover();
                //we will display the image using the imagetype
                //so we will make the image path empty

                func.displayImage(112, 93, image, "", jLabel_Image);
            } else {
                JOptionPane.showMessageDialog(null, "No Member With This Id Is Found", "Invalid Id", 3);
            }

        } catch (Exception ex) {
            Logger.getLogger(EditMemberForm.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Enter a Valid Member Id", "Invalid Id", 3);

        }
    }//GEN-LAST:event_jTable_ListTable_MouseClicked

    private void jButton_SearchByNameOrDescription_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SearchByNameOrDescription_ActionPerformed
        // search and display data in the jtable
        String value = jTextField_Search.getText();
        // search by name, publisher and description
        String query = "SELECT * FROM `books` WHERE `name` LIKE '%" + value + "%' OR `publisher` LIKE '%" + value + "%' or `description` LIKE '%" + value + "%'";
        populateJtableWithBooks(query);
    }//GEN-LAST:event_jButton_SearchByNameOrDescription_ActionPerformed

    // create a function to populate the jtable with books
    public void populateJtableWithBooks(String query) {

        ArrayList<My_Classes.Book> booksList = book.booksList(query);

        // jTable columns
        // we will not display the book description and cover
        String[] colNames = {"ID", "ISBN", "Title", "Author", "Genre", "Quantity", "Publisher", "Price", "Date-RCV"};

        // row
        Object[][] rows = new Object[booksList.size()][colNames.length];

        for (int i = 0; i < booksList.size(); i++) {
            rows[i][0] = booksList.get(i).getId();
            rows[i][1] = booksList.get(i).getIsbn();
            rows[i][2] = booksList.get(i).getName();
            rows[i][3] = booksList.get(i).getAuthor_id();
            rows[i][4] = booksList.get(i).getGenre_id();
            rows[i][5] = booksList.get(i).getQuantity();
            rows[i][6] = booksList.get(i).getPublisher();
            rows[i][7] = booksList.get(i).getPrice();
            rows[i][8] = booksList.get(i).getDate_received();
        }

        DefaultTableModel model = new DefaultTableModel(rows, colNames);
        jTable_ListTable_.setModel(model);

    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    //javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getSystemLookAndFeelClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BookListForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookListForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookListForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookListForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookListForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_SearchBetweenTwoDates_;
    private javax.swing.JButton jButton_SearchByNameOrDescription_;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel_Author;
    private javax.swing.JLabel jLabel_CloseForm_;
    private javax.swing.JLabel jLabel_FormTitle;
    private javax.swing.JLabel jLabel_Genre;
    private javax.swing.JLabel jLabel_ISBN;
    private javax.swing.JLabel jLabel_Image;
    private javax.swing.JLabel jLabel_Name;
    private javax.swing.JLabel jLabel_Price;
    private javax.swing.JLabel jLabel_Publisher;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable_ListTable_;
    private javax.swing.JTextField jTextField_Search;
    // End of variables declaration//GEN-END:variables

    //private void populateJtableWithMembers(String query) {
    // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    //}
}
