package My_Forms;

import My_Classes.DragUtility;
import java.awt.Color;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.border.Border;

public class EditBookForm extends javax.swing.JFrame {

    //Creates Edit book form
    My_Classes.Book book = new My_Classes.Book();
    My_Classes.Member member = new My_Classes.Member();
    My_Classes.Author author = new My_Classes.Author();
    My_Classes.Func_Class func = new My_Classes.Func_Class();
    My_Classes.Genre genre = new My_Classes.Genre();
    HashMap<String, Integer> genresMap = genre.getGenresMap();

    String imagePath = "";

    public EditBookForm() {
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
        func.displayImage(50, 50, null, "/My_Images/imageLibrary/edit_book.png", jLabel_FormTitle);

        // populated jcombobox with genres
        fillJComboBoxWithGenres();
        // add a black border to the jlabelImage
        Border JlabelImageBorder = BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 0, 0));
        jLabel_Image.setBorder(JlabelImageBorder);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel_FormTitle = new javax.swing.JLabel();
        jLabel_CloseForm_ = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField_ISBN = new javax.swing.JTextField();
        jTextField_Name = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField_Author = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextField_Publisher = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jTextField_Price = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_Description = new javax.swing.JTextArea();
        jLabel18 = new javax.swing.JLabel();
        jLabel_Image = new javax.swing.JLabel();
        jLabel_ImagePath = new javax.swing.JLabel();
        jButton_Select_Image = new javax.swing.JButton();
        jButton_Edit_ = new javax.swing.JButton();
        jButton_Cancel_ = new javax.swing.JButton();
        jDateChooser_Date = new com.toedter.calendar.JDateChooser();
        jSpinner_Quantity = new javax.swing.JSpinner();
        jButton_select_author = new javax.swing.JButton();
        jButton_Clear_ = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jTextField_ID = new javax.swing.JTextField();
        jButton_Search_ = new javax.swing.JButton();
        jTextField_Genre = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel_FormTitle.setBackground(new java.awt.Color(211, 84, 0));
        jLabel_FormTitle.setDisplayedMnemonic('0');
        jLabel_FormTitle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel_FormTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_FormTitle.setText("Edit Book");
        jLabel_FormTitle.setOpaque(true);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel_FormTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel_FormTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
        );

        jLabel_CloseForm_.setBackground(new java.awt.Color(255, 0, 51));
        jLabel_CloseForm_.setDisplayedMnemonic('0');
        jLabel_CloseForm_.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel_CloseForm_.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_CloseForm_.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_CloseForm_.setText("X");
        jLabel_CloseForm_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_CloseForm_.setOpaque(true);
        jLabel_CloseForm_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_CloseForm_MouseClicked(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel9.setText("ISBN:");

        jTextField_ISBN.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jTextField_ISBN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_ISBNActionPerformed(evt);
            }
        });

        jTextField_Name.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jTextField_Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_NameActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel10.setText("Name:");

        jTextField_Author.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField_Author.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_AuthorActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel11.setText("Author:");

        jLabel12.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel12.setText("Quantity:");

        jTextField_Publisher.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jTextField_Publisher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_PublisherActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel13.setText("Publisher:");

        jLabel14.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel14.setText("Price:");

        jTextField_Price.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jTextField_Price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_PriceActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel15.setText("Date Received:");

        jLabel16.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel16.setText("Genre:");

        jLabel17.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel17.setText("Book Description:");

        jTextArea_Description.setColumns(20);
        jTextArea_Description.setRows(5);
        jScrollPane1.setViewportView(jTextArea_Description);
        jTextArea_Description.setLineWrap(true);
        jTextArea_Description.setWrapStyleWord(true);

        jLabel18.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel18.setText("Book Cover:");

        jLabel_Image.setBackground(new java.awt.Color(153, 204, 255));
        jLabel_Image.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel_Image.setOpaque(true);
        jLabel_Image.setPreferredSize(new java.awt.Dimension(34, 14));

        jLabel_ImagePath.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel_ImagePath.setForeground(new java.awt.Color(0, 51, 204));
        jLabel_ImagePath.setText("picture path........");
        jLabel_ImagePath.setMaximumSize(new java.awt.Dimension(97, 23));
        jLabel_ImagePath.setMinimumSize(new java.awt.Dimension(97, 23));
        jLabel_ImagePath.setPreferredSize(new java.awt.Dimension(97, 23));

        jButton_Select_Image.setBackground(new java.awt.Color(0, 153, 102));
        jButton_Select_Image.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton_Select_Image.setText("Select Picture");
        jButton_Select_Image.setOpaque(true);
        jButton_Select_Image.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Select_ImageActionPerformed(evt);
            }
        });

        jButton_Edit_.setBackground(new java.awt.Color(204, 204, 204));
        jButton_Edit_.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton_Edit_.setText("Edit Book");
        jButton_Edit_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_Edit_MouseClicked(evt);
            }
        });
        jButton_Edit_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Edit_ActionPerformed(evt);
            }
        });

        jButton_Cancel_.setBackground(new java.awt.Color(204, 204, 204));
        jButton_Cancel_.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton_Cancel_.setText("Cancel");
        jButton_Cancel_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_Cancel_MouseClicked(evt);
            }
        });
        jButton_Cancel_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Cancel_ActionPerformed(evt);
            }
        });

        jSpinner_Quantity.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jButton_select_author.setText("Change Author");
        jButton_select_author.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton_select_author.setBorderPainted(false);
        jButton_select_author.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_select_authorActionPerformed(evt);
            }
        });

        jButton_Clear_.setBackground(new java.awt.Color(204, 204, 204));
        jButton_Clear_.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton_Clear_.setText("Clear");
        jButton_Clear_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_Clear_MouseClicked(evt);
            }
        });
        jButton_Clear_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Clear_ActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel19.setText("ID:");

        jTextField_ID.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jTextField_ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_IDActionPerformed(evt);
            }
        });

        jButton_Search_.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton_Search_.setText("search by id or isbn");
        jButton_Search_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Search_ActionPerformed(evt);
            }
        });

        jTextField_Genre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField_Genre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_GenreActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jLabel_CloseForm_, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jDateChooser_Date, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel16)
                            .addComponent(jLabel12)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14)
                            .addComponent(jLabel9)
                            .addComponent(jLabel19))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_Publisher)
                            .addComponent(jSpinner_Quantity)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField_ID, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                                    .addComponent(jTextField_ISBN))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton_Search_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jTextField_Name)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextField_Price, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 165, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextField_Author, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton_select_author, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextField_Genre, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton_Select_Image, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                    .addComponent(jLabel_Image, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel_ImagePath, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(25, 25, 25))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton_Clear_, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jButton_Edit_, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jButton_Cancel_, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel_CloseForm_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_ImagePath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_Image, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_Select_Image))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel19)
                                    .addComponent(jTextField_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(jTextField_ISBN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton_Search_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(1, 1, 1)))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jTextField_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jTextField_Author, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_select_author, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(jTextField_Genre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(jSpinner_Quantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(jTextField_Publisher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_Price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel15)
                            .addComponent(jDateChooser_Date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(57, 57, 57)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_Clear_, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Edit_, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Cancel_, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel_CloseForm_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_CloseForm_MouseClicked
        // close the form
        this.dispose();
    }//GEN-LAST:event_jLabel_CloseForm_MouseClicked

    private void jTextField_ISBNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_ISBNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_ISBNActionPerformed

    private void jTextField_NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_NameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_NameActionPerformed

    private void jTextField_AuthorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_AuthorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_AuthorActionPerformed

    private void jTextField_PublisherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_PublisherActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_PublisherActionPerformed

    private void jTextField_PriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_PriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_PriceActionPerformed

    private void jButton_Select_ImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Select_ImageActionPerformed

        //select picture from computer
        String path = func.selectImage();
        jLabel_ImagePath.setText(path);

        //display the image
        func.displayImage(140, 134, null, path, jLabel_Image);
        imagePath = path;

    }//GEN-LAST:event_jButton_Select_ImageActionPerformed

    private void jButton_Edit_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_Edit_MouseClicked


    }//GEN-LAST:event_jButton_Edit_MouseClicked

    private void jButton_Edit_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Edit_ActionPerformed
        //edit the selected book
        // we will not edit the isbn

        My_Classes.Book book = new My_Classes.Book();
        String isbn = jTextField_ISBN.getText();

        if (!verif()) {
            JOptionPane.showMessageDialog(null, "one or more fields are empty", "Empty Data", 2);
        } /*
      // we will not check if the isbn already exists
      // because we will not edit it
      else if(book.isISBNexists(isbn))
      {
          JOptionPane.showMessageDialog(null, "This ISBN already exists", "Empty DataWrong ISBN", 2);
      }
         */ else {
            try {
                //get value
                int id = Integer.parseInt(jTextField_ID.getText());
                String name = jTextField_Name.getText();
                String publisher = jTextField_Publisher.getText();
                String descripstion = jTextArea_Description.getText();

                String author = jTextField_Author.getText();//get the author id
                String genre = jTextField_Genre.getText();
                Integer quantity = Integer.parseInt(jSpinner_Quantity.getValue().toString());

                Double price = Double.parseDouble(jTextField_Price.getText());
                SimpleDateFormat dateFormat = new SimpleDateFormat("YYYY-MM-dd");
                String received_date = dateFormat.format(jDateChooser_Date.getDate());
                Path path = Paths.get(imagePath);

                try {
                    // if the user want to update the cover image to
                    //get the image byte
                    byte[] img = Files.readAllBytes(path);
                    book.editBook(id, name, author, genre, quantity, publisher, price, received_date, descripstion, img);
                } catch (IOException ex) // if not
                {
                    book.editBook(id, name, author, genre, quantity, publisher, price, received_date, descripstion, null);
                }

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "You Entred Wrong Data In a Number Field", "Wrong Data", 2);
            } catch (NullPointerException ex) {
                JOptionPane.showMessageDialog(null, "You Need To Select a Date", "Select Date", 2);
            }
        }
    }//GEN-LAST:event_jButton_Edit_ActionPerformed

    private void jButton_Cancel_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_Cancel_MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_Cancel_MouseClicked

    private void jButton_Cancel_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Cancel_ActionPerformed
        // close the window
        this.dispose();
    }//GEN-LAST:event_jButton_Cancel_ActionPerformed

    private void jButton_select_authorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_select_authorActionPerformed
        //show a form
        //the form will have a jtable populated with author 
        //the user can select an author from the table and he will be displayed in the jtextfield
        AuthorsListForm authorsForm = new AuthorsListForm();
        authorsForm.formType = "edit";
        authorsForm.setVisible(true);


    }//GEN-LAST:event_jButton_select_authorActionPerformed

    private void jButton_Clear_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_Clear_MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_Clear_MouseClicked

    private void jButton_Clear_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Clear_ActionPerformed
        // clear all fields
        jTextField_ID.setText((""));
        jTextField_ISBN.setText("");
        jTextField_Name.setText("");
        jTextField_Author.setText("");
        //jLabel_Author_ID.setText("ID");
        jTextField_Genre.setText("");
        jTextField_Price.setText("");
        jTextField_Publisher.setText("");
        jTextArea_Description.setText("");
        jSpinner_Quantity.setValue(0);
        jDateChooser_Date.setDate(new java.util.Date());

        jLabel_Image.setIcon(null);
        jLabel_ImagePath.setText("picture path .........");

    }//GEN-LAST:event_jButton_Clear_ActionPerformed

    private void jTextField_IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_IDActionPerformed

    private void jButton_Search_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Search_ActionPerformed
        // search book by ID or ISBN
        // check if the id fields or the isbn are empty
        if (jTextField_ID.getText().equals("") && jTextField_ISBN.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "You Need To Enter The ID or The ISBN To Complete The Search", "Empty ID & ISBN", 2);
        } else {
            try {
                int id = 0;
                String isbn = jTextField_ISBN.getText();
                My_Classes.Book selectedBook = null;
                try {
                    id = Integer.parseInt(jTextField_ID.getText());
                    selectedBook = book.searchBookById_Isbn(id, isbn);
                } catch (NumberFormatException ex) {
                    selectedBook = book.searchBookById_Isbn(id, isbn);
                }

                jTextField_ID.setText(String.valueOf(selectedBook.getId()));
                jTextField_ISBN.setText(selectedBook.getIsbn());
                jTextField_Name.setText(selectedBook.getName());
                jTextField_Publisher.setText(selectedBook.getPublisher());
                jTextField_Price.setText(Double.toString(selectedBook.getPrice()));
                jTextArea_Description.setText(selectedBook.getDescription());
                jSpinner_Quantity.setValue(selectedBook.getQuantity());
                jTextField_Author.setText(selectedBook.getAuthor_id());

                // display the author fullname
                //jTextField_Author.setText(fullName);
                jTextField_Genre.setText(selectedBook.getGenre_id());

//                // display the selected book genre in the jcombobox
//                for (Map.Entry<String, Integer> entry : genresMap.entrySet()) {
//                    if (Objects.equals(selectedBook.getGenre_id(), entry.getValue())) {
//                        jTextField_Genre.setSelectedItem(entry.getKey());
//                        System.out.println(entry.getKey());
//                    }
//                }
                // display the date
                Date date_receive = new SimpleDateFormat("yyyy-MM-dd").parse(selectedBook.getDate_received());
                jDateChooser_Date.setDate(date_receive);

                byte[] image = selectedBook.getCover();
                //we will display the image using the imagetype
                //so we will set the image path to null
                func.displayImage(140, 134, image, "", jLabel_Image);

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "This Book Does Not Exists " + ex.getMessage(), "Book Not Found", 2);
            }
        }


    }//GEN-LAST:event_jButton_Search_ActionPerformed

    private void jTextField_GenreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_GenreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_GenreActionPerformed

    //display the selected author data
    public static void displayAuthorData(int id, String fullName) {
        jTextField_Author.setText(fullName);
        //jLabel_Author_ID.setText(String.valueOf(id));
    }

    // create a function to verify the required fields
    public boolean verif() {
        if (jTextField_ISBN.getText().equals("") || jTextField_Author.getText().equals("")
                || jTextField_Price.getText().equals("") || jTextField_Name.getText().equals("")
                || jTextField_Genre.getText().equals("")) {
            return false;
        } else {
            return true;
        }
    }

    // create a function to populate the combobox with the genre name and id using hashmap
    public void fillJComboBoxWithGenres() {
        for (String genreName : genresMap.keySet()) {
            //jComboBox_Genre_.addItem(genreName);
        }
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
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EditBookForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditBookForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditBookForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditBookForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditBookForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Cancel_;
    private javax.swing.JButton jButton_Clear_;
    private javax.swing.JButton jButton_Edit_;
    private javax.swing.JButton jButton_Search_;
    private javax.swing.JButton jButton_Select_Image;
    private javax.swing.JButton jButton_select_author;
    private com.toedter.calendar.JDateChooser jDateChooser_Date;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_CloseForm_;
    private javax.swing.JLabel jLabel_FormTitle;
    private javax.swing.JLabel jLabel_Image;
    private javax.swing.JLabel jLabel_ImagePath;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner_Quantity;
    private javax.swing.JTextArea jTextArea_Description;
    private static javax.swing.JTextField jTextField_Author;
    private static javax.swing.JTextField jTextField_Genre;
    private javax.swing.JTextField jTextField_ID;
    private javax.swing.JTextField jTextField_ISBN;
    private javax.swing.JTextField jTextField_Name;
    private javax.swing.JTextField jTextField_Price;
    private javax.swing.JTextField jTextField_Publisher;
    // End of variables declaration//GEN-END:variables
}
