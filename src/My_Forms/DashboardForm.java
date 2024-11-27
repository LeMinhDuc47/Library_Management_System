package My_Forms;

import My_Classes.Book;
import My_Classes.Func_Class;

import java.awt.Color;
import java.awt.Component;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class DashboardForm extends javax.swing.JFrame {

    public DashboardForm() {
        initComponents();
        setSize(1258, 715);
        //Center the form
        this.setLocationRelativeTo(null);
        displayImage();
        //Border for "Library" box
        Border panelHeaderBorder = BorderFactory.createMatteBorder(0, 0, 1, 0, Color.white);
        jPanel_Header.setBorder(panelHeaderBorder);
        //Border for 5 boxes
        Border panelHeader_1_Border = BorderFactory.createMatteBorder(0, 0, 3, 0, new Color(235, 125, 22));
        jPanel_1_header.setBorder(panelHeader_1_Border);
        Border panelHeader_2_Border = BorderFactory.createMatteBorder(0, 0, 3, 0, new Color(26, 138, 32));
        jPanel_2_header.setBorder(panelHeader_2_Border);
        Border panelHeader_3_Border = BorderFactory.createMatteBorder(0, 0, 3, 0, new Color(115, 40, 125));
        jPanel_3_header.setBorder(panelHeader_3_Border);
        Border panelHeader_4_Border = BorderFactory.createMatteBorder(0, 0, 3, 0, new Color(244, 82, 110));
        jPanel_4_header.setBorder(panelHeader_4_Border);
        Border panelHeader_5_Border = BorderFactory.createMatteBorder(0, 0, 3, 0, new Color(58, 83, 155));
        jPanel_5_header.setBorder(panelHeader_5_Border);

    }

    //Function to display a image
    public void displayImage() {
        //get the image
        ImageIcon imgIco = new ImageIcon(getClass().getResource("/My_Images/imageLibrary/male_user_50px.png"));
        ImageIcon imgIco1 = new ImageIcon(getClass().getResource("/My_Images/imageLibrary/icons8_Book_Shelf_50px.png"));
        ImageIcon imgIco2 = new ImageIcon(getClass().getResource("/My_Images/imageLibrary/icons8_People_50px.png"));
        ImageIcon imgIco3 = new ImageIcon(getClass().getResource("/My_Images/imageLibrary/icons8_Conference_26px.png"));
        ImageIcon imgIco4 = new ImageIcon(getClass().getResource("/My_Images/imageLibrary/icons8_List_of_Thumbnails_50px.png"));
        ImageIcon imgIco5 = new ImageIcon(getClass().getResource("/My_Images/imageLibrary/icons8_Home_26px_2.png"));

        //make the image fit the jlabel
        Image image = imgIco.getImage().getScaledInstance(jLabel_Dashboard_Logo.getWidth(), jLabel_Dashboard_Logo.getHeight(), Image.SCALE_SMOOTH);
        jLabel_Dashboard_Logo.setIcon(new ImageIcon(image));
        Image image1 = imgIco1.getImage().getScaledInstance(60, 60, Image.SCALE_SMOOTH);
        jLabel_BooksCount1.setIcon(new ImageIcon(image1));
        Image image2 = imgIco2.getImage().getScaledInstance(60, 60, Image.SCALE_SMOOTH);
        jLabel_MembersCount1.setIcon(new ImageIcon(image2));
        Image image3 = imgIco3.getImage().getScaledInstance(60, 60, Image.SCALE_SMOOTH);
        jLabel_AuthorsCount1.setIcon(new ImageIcon(image3));
        Image image4 = imgIco4.getImage().getScaledInstance(60, 60, Image.SCALE_SMOOTH);
        jLabel_GenresCount1.setIcon(new ImageIcon(image4));
        Image image5 = imgIco5.getImage().getScaledInstance(35, 35, Image.SCALE_SMOOTH);
        jLabel_Home.setIcon(new ImageIcon(image5));

        //Add borders to the buttons
        addBorders();

        //Hover Effect
        buttonHoverEffect();

        // display the count data
        displayCount();

        // display the lastest books cover in the bottom
        // 1 - add the jlabels to the label_tab
        labels_tab[0] = jLabel_Image_1;
        labels_tab[1] = jLabel_Image_2;
        labels_tab[2] = jLabel_Image_3;
        labels_tab[3] = jLabel_Image_4;
        labels_tab[4] = jLabel_Image_5;

        // 2 - display the images
        book.displayBooksCover(labels_tab);
    }

    //Function to add border to all the button in the jPanel Menu
    public void addBorders() {
        // Get all the components in the jPanel Menu
        Component[] comps = jPanel_Menu.getComponents();
        for (Component comp : comps) {
            // Check if the component is a button
            if (comp instanceof JButton) {
                JButton button = (JButton) comp; // Explicit casting
                button.setBorder(buttonBorder0);
            }
        }
    }

    //The button border
    Border buttonBorder1 = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.white);
    Border buttonBorder0 = BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(36, 37, 42));

    My_Classes.Func_Class func = new Func_Class();
    My_Classes.Book book = new Book();

    // create the jLabels array to display the lastest 5 books images
    JLabel[] labels_tab = new JLabel[5];

    //Function to add a hover effect on the menu buttons
    public void buttonHoverEffect() {
        // Get all the components in the jPanel Menu
        Component[] comps = jPanel_Menu.getComponents();
        for (Component comp : comps) {
            // Check if the component is a button
            if (comp instanceof JButton) {
                JButton button = (JButton) comp; // Explicit casting
                button.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseEntered(MouseEvent evt) {
                        button.setBorder(buttonBorder1);
                    }

                    @Override
                    public void mouseExited(MouseEvent evt) {
                        button.setBorder(buttonBorder0);
                    }
                });
            }
        }
    }

    public void displayCount() {
        jLabel_BooksCount.setText(String.valueOf(func.countData("books")));
        jLabel_AuthorsCount.setText(String.valueOf(func.countData("author")));
        jLabel_MembersCount.setText(String.valueOf(func.countData("members")));
        jLabel_GenresCount.setText(String.valueOf(func.countData("book_genres")));
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel_Menu = new javax.swing.JPanel();
        jPanel_Header = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jButton_Add_Member_ = new javax.swing.JButton();
        jButton_Edit_Member_ = new javax.swing.JButton();
        jButton_Delete_Member_ = new javax.swing.JButton();
        jButton_List_Member_ = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jButton_Manage_Genres_ = new javax.swing.JButton();
        jButton_Manage_Authors_ = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton_Add_Book = new javax.swing.JButton();
        jButton_Edit_Book = new javax.swing.JButton();
        jButton_Delete_Book = new javax.swing.JButton();
        jButton_List_Book = new javax.swing.JButton();
        jLabel1_Circulation = new javax.swing.JLabel();
        jButton_BorrowBook_ = new javax.swing.JButton();
        jButton_ReturnBook_ = new javax.swing.JButton();
        jButton_Gach = new javax.swing.JButton();
        jButton_Manage_users = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel_2 = new javax.swing.JPanel();
        jPanel_2_header = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel_MembersCount = new javax.swing.JLabel();
        jLabel_MembersCount1 = new javax.swing.JLabel();
        jPanel_3 = new javax.swing.JPanel();
        jLabel_AuthorsCount = new javax.swing.JLabel();
        jLabel_AuthorsCount1 = new javax.swing.JLabel();
        jPanel_3_header = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel_4 = new javax.swing.JPanel();
        jPanel_4_header = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel_GenresCount1 = new javax.swing.JLabel();
        jLabel_GenresCount = new javax.swing.JLabel();
        jPanel_1 = new javax.swing.JPanel();
        jPanel_1_header = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel_BooksCount = new javax.swing.JLabel();
        jLabel_BooksCount1 = new javax.swing.JLabel();
        jPanel_5 = new javax.swing.JPanel();
        jLabel_Image_1 = new javax.swing.JLabel();
        jLabel_Image_2 = new javax.swing.JLabel();
        jLabel_Image_3 = new javax.swing.JLabel();
        jLabel_Image_4 = new javax.swing.JLabel();
        jLabel_Image_5 = new javax.swing.JLabel();
        jPanel_5_header = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel_welcome = new javax.swing.JLabel();
        jLabel_Dashboard_Logo = new javax.swing.JLabel();
        jLabel_Home = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setToolTipText("");

        jPanel_Menu.setBackground(new java.awt.Color(36, 37, 42));
        jPanel_Menu.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N

        jPanel_Header.setBackground(new java.awt.Color(1, 50, 67));

        javax.swing.GroupLayout jPanel_HeaderLayout = new javax.swing.GroupLayout(jPanel_Header);
        jPanel_Header.setLayout(jPanel_HeaderLayout);
        jPanel_HeaderLayout.setHorizontalGroup(
            jPanel_HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel_HeaderLayout.setVerticalGroup(
            jPanel_HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 37, Short.MAX_VALUE)
        );

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Members");

        jButton_Add_Member_.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton_Add_Member_.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Add_Member_.setText("Add Member");
        jButton_Add_Member_.setContentAreaFilled(false);
        jButton_Add_Member_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Add_Member_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Add_Member_ActionPerformed(evt);
            }
        });

        jButton_Edit_Member_.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton_Edit_Member_.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Edit_Member_.setText("Edit Member");
        jButton_Edit_Member_.setContentAreaFilled(false);
        jButton_Edit_Member_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Edit_Member_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Edit_Member_ActionPerformed(evt);
            }
        });

        jButton_Delete_Member_.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton_Delete_Member_.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Delete_Member_.setText("Delete Member");
        jButton_Delete_Member_.setContentAreaFilled(false);
        jButton_Delete_Member_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Delete_Member_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Delete_Member_ActionPerformed(evt);
            }
        });

        jButton_List_Member_.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton_List_Member_.setForeground(new java.awt.Color(255, 255, 255));
        jButton_List_Member_.setText("List Member");
        jButton_List_Member_.setContentAreaFilled(false);
        jButton_List_Member_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_List_Member_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_List_Member_ActionPerformed(evt);
            }
        });

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Genres");

        jButton_Manage_Genres_.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton_Manage_Genres_.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Manage_Genres_.setText("Manage Genres");
        jButton_Manage_Genres_.setContentAreaFilled(false);
        jButton_Manage_Genres_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Manage_Genres_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Manage_Genres_ActionPerformed(evt);
            }
        });

        jButton_Manage_Authors_.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton_Manage_Authors_.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Manage_Authors_.setText("Manage Authors");
        jButton_Manage_Authors_.setContentAreaFilled(false);
        jButton_Manage_Authors_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Manage_Authors_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Manage_Authors_ActionPerformed(evt);
            }
        });

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Authors");

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Books");

        jButton_Add_Book.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton_Add_Book.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Add_Book.setText("Add Book");
        jButton_Add_Book.setContentAreaFilled(false);
        jButton_Add_Book.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Add_Book.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Add_BookActionPerformed(evt);
            }
        });

        jButton_Edit_Book.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton_Edit_Book.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Edit_Book.setText("Edit Book");
        jButton_Edit_Book.setContentAreaFilled(false);
        jButton_Edit_Book.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Edit_Book.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Edit_BookActionPerformed(evt);
            }
        });

        jButton_Delete_Book.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton_Delete_Book.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Delete_Book.setText("Delete Book");
        jButton_Delete_Book.setContentAreaFilled(false);
        jButton_Delete_Book.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Delete_Book.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Delete_BookActionPerformed(evt);
            }
        });

        jButton_List_Book.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton_List_Book.setForeground(new java.awt.Color(255, 255, 255));
        jButton_List_Book.setText("List Book");
        jButton_List_Book.setContentAreaFilled(false);
        jButton_List_Book.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_List_Book.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_List_BookActionPerformed(evt);
            }
        });

        jLabel1_Circulation.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1_Circulation.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel1_Circulation.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1_Circulation.setText("Circulation");

        jButton_BorrowBook_.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton_BorrowBook_.setForeground(new java.awt.Color(255, 255, 255));
        jButton_BorrowBook_.setText("Borrow Book");
        jButton_BorrowBook_.setContentAreaFilled(false);
        jButton_BorrowBook_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_BorrowBook_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_BorrowBook_ActionPerformed(evt);
            }
        });

        jButton_ReturnBook_.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton_ReturnBook_.setForeground(new java.awt.Color(255, 255, 255));
        jButton_ReturnBook_.setText("Return Book");
        jButton_ReturnBook_.setContentAreaFilled(false);
        jButton_ReturnBook_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_ReturnBook_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ReturnBook_ActionPerformed(evt);
            }
        });

        jButton_Gach.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton_Gach.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Gach.setText("|");
        jButton_Gach.setContentAreaFilled(false);
        jButton_Gach.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Gach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_GachActionPerformed(evt);
            }
        });

        jButton_Manage_users.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton_Manage_users.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Manage_users.setText("Manage Users");
        jButton_Manage_users.setContentAreaFilled(false);
        jButton_Manage_users.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Manage_users.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Manage_usersActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(1, 50, 67));
        jLabel1.setFont(new java.awt.Font("Segoe Print", 1, 17)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 0));
        jLabel1.setText(" Library management system");

        javax.swing.GroupLayout jPanel_MenuLayout = new javax.swing.GroupLayout(jPanel_Menu);
        jPanel_Menu.setLayout(jPanel_MenuLayout);
        jPanel_MenuLayout.setHorizontalGroup(
            jPanel_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_MenuLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel_Header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_MenuLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton_BorrowBook_)
                .addGap(155, 155, 155))
            .addGroup(jPanel_MenuLayout.createSequentialGroup()
                .addGroup(jPanel_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel_MenuLayout.createSequentialGroup()
                            .addGap(34, 34, 34)
                            .addGroup(jPanel_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel_MenuLayout.createSequentialGroup()
                                    .addGap(84, 84, 84)
                                    .addComponent(jButton_Gach, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jButton_ReturnBook_))
                                .addGroup(jPanel_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jButton_List_Book, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jButton_Delete_Book, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jButton_Edit_Book, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jButton_Add_Book, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jButton_List_Member_, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jButton_Delete_Member_, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(jButton_Edit_Member_, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jButton_Add_Member_, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jButton_Manage_Authors_, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                                                    .addComponent(jButton_Manage_Genres_, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))))
                        .addGroup(jPanel_MenuLayout.createSequentialGroup()
                            .addGap(24, 24, 24)
                            .addGroup(jPanel_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel14)
                                .addComponent(jLabel13)
                                .addComponent(jLabel7)
                                .addComponent(jLabel10)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_MenuLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel1_Circulation)
                            .addGap(120, 120, 120)))
                    .addGroup(jPanel_MenuLayout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jButton_Manage_users)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_MenuLayout.setVerticalGroup(
            jPanel_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_MenuLayout.createSequentialGroup()
                .addGroup(jPanel_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel_Header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Manage_Genres_, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14)
                .addGap(12, 12, 12)
                .addComponent(jButton_Manage_Authors_, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Add_Member_)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Edit_Member_)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Delete_Member_)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_List_Member_)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Add_Book)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Edit_Book)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Delete_Book)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_List_Book)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1_Circulation)
                .addGap(12, 12, 12)
                .addGroup(jPanel_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton_BorrowBook_, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Gach, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addComponent(jButton_ReturnBook_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Manage_users, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        jPanel_2.setBackground(new java.awt.Color(75, 192, 18));
        jPanel_2.setPreferredSize(new java.awt.Dimension(345, 220));

        jPanel_2_header.setBackground(new java.awt.Color(65, 160, 10));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Members");

        javax.swing.GroupLayout jPanel_2_headerLayout = new javax.swing.GroupLayout(jPanel_2_header);
        jPanel_2_header.setLayout(jPanel_2_headerLayout);
        jPanel_2_headerLayout.setHorizontalGroup(
            jPanel_2_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_2_headerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_2_headerLayout.setVerticalGroup(
            jPanel_2_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel_MembersCount.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_MembersCount.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel_MembersCount.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_MembersCount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_MembersCount.setText("10000");

        jLabel_MembersCount1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_MembersCount1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel_MembersCount1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_MembersCount1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel_2Layout = new javax.swing.GroupLayout(jPanel_2);
        jPanel_2.setLayout(jPanel_2Layout);
        jPanel_2Layout.setHorizontalGroup(
            jPanel_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_2_header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_MembersCount1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel_MembersCount, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4))
        );
        jPanel_2Layout.setVerticalGroup(
            jPanel_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_2Layout.createSequentialGroup()
                .addComponent(jPanel_2_header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                        .addComponent(jLabel_MembersCount)
                        .addGap(67, 67, 67))
                    .addGroup(jPanel_2Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel_MembersCount1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jPanel_3.setBackground(new java.awt.Color(155, 89, 182));
        jPanel_3.setPreferredSize(new java.awt.Dimension(345, 220));

        jLabel_AuthorsCount.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_AuthorsCount.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel_AuthorsCount.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_AuthorsCount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_AuthorsCount.setText("10000");

        jLabel_AuthorsCount1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_AuthorsCount1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel_AuthorsCount1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_AuthorsCount1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jPanel_3_header.setBackground(new java.awt.Color(155, 89, 182));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Authors");

        javax.swing.GroupLayout jPanel_3_headerLayout = new javax.swing.GroupLayout(jPanel_3_header);
        jPanel_3_header.setLayout(jPanel_3_headerLayout);
        jPanel_3_headerLayout.setHorizontalGroup(
            jPanel_3_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_3_headerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addContainerGap(157, Short.MAX_VALUE))
        );
        jPanel_3_headerLayout.setVerticalGroup(
            jPanel_3_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel_3Layout = new javax.swing.GroupLayout(jPanel_3);
        jPanel_3.setLayout(jPanel_3Layout);
        jPanel_3Layout.setHorizontalGroup(
            jPanel_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_3Layout.createSequentialGroup()
                .addGroup(jPanel_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel_3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel_3_header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel_3Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel_AuthorsCount1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel_AuthorsCount, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel_3Layout.setVerticalGroup(
            jPanel_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_3Layout.createSequentialGroup()
                .addComponent(jPanel_3_header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(jPanel_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_AuthorsCount1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel_3Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel_AuthorsCount)))
                .addGap(49, 49, 49))
        );

        jPanel_4.setBackground(new java.awt.Color(255, 153, 153));
        jPanel_4.setPreferredSize(new java.awt.Dimension(345, 220));

        jPanel_4_header.setBackground(new java.awt.Color(255, 102, 102));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Genres");

        javax.swing.GroupLayout jPanel_4_headerLayout = new javax.swing.GroupLayout(jPanel_4_header);
        jPanel_4_header.setLayout(jPanel_4_headerLayout);
        jPanel_4_headerLayout.setHorizontalGroup(
            jPanel_4_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_4_headerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_4_headerLayout.setVerticalGroup(
            jPanel_4_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel_GenresCount1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_GenresCount1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel_GenresCount1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_GenresCount1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel_GenresCount.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_GenresCount.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel_GenresCount.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_GenresCount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_GenresCount.setText("10000");

        javax.swing.GroupLayout jPanel_4Layout = new javax.swing.GroupLayout(jPanel_4);
        jPanel_4.setLayout(jPanel_4Layout);
        jPanel_4Layout.setHorizontalGroup(
            jPanel_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_4_header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel_4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_GenresCount1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(jLabel_GenresCount, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel_4Layout.setVerticalGroup(
            jPanel_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_4Layout.createSequentialGroup()
                .addComponent(jPanel_4_header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addGroup(jPanel_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_GenresCount)
                    .addComponent(jLabel_GenresCount1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 70, Short.MAX_VALUE))
        );

        jPanel_1.setBackground(new java.awt.Color(255, 178, 41));
        jPanel_1.setPreferredSize(new java.awt.Dimension(345, 220));

        jPanel_1_header.setBackground(new java.awt.Color(246, 145, 16));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Books");

        javax.swing.GroupLayout jPanel_1_headerLayout = new javax.swing.GroupLayout(jPanel_1_header);
        jPanel_1_header.setLayout(jPanel_1_headerLayout);
        jPanel_1_headerLayout.setHorizontalGroup(
            jPanel_1_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_1_headerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_1_headerLayout.setVerticalGroup(
            jPanel_1_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        jLabel_BooksCount.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_BooksCount.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel_BooksCount.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_BooksCount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_BooksCount.setText("10000");

        jLabel_BooksCount1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_BooksCount1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel_BooksCount1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_BooksCount1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel_1Layout = new javax.swing.GroupLayout(jPanel_1);
        jPanel_1.setLayout(jPanel_1Layout);
        jPanel_1Layout.setHorizontalGroup(
            jPanel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_1_header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel_1Layout.createSequentialGroup()
                .addComponent(jLabel_BooksCount1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(jLabel_BooksCount, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel_1Layout.setVerticalGroup(
            jPanel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_1Layout.createSequentialGroup()
                .addComponent(jPanel_1_header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jLabel_BooksCount)
                        .addContainerGap(71, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel_BooksCount1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55))))
        );

        jPanel_5.setBackground(new java.awt.Color(44, 130, 201));
        jPanel_5.setPreferredSize(new java.awt.Dimension(345, 220));

        jLabel_Image_1.setBackground(new java.awt.Color(153, 204, 255));
        jLabel_Image_1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel_Image_1.setOpaque(true);
        jLabel_Image_1.setPreferredSize(new java.awt.Dimension(34, 14));

        jLabel_Image_2.setBackground(new java.awt.Color(153, 204, 255));
        jLabel_Image_2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel_Image_2.setOpaque(true);
        jLabel_Image_2.setPreferredSize(new java.awt.Dimension(34, 14));

        jLabel_Image_3.setBackground(new java.awt.Color(153, 204, 255));
        jLabel_Image_3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel_Image_3.setOpaque(true);
        jLabel_Image_3.setPreferredSize(new java.awt.Dimension(34, 14));

        jLabel_Image_4.setBackground(new java.awt.Color(153, 204, 255));
        jLabel_Image_4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel_Image_4.setOpaque(true);
        jLabel_Image_4.setPreferredSize(new java.awt.Dimension(34, 14));

        jLabel_Image_5.setBackground(new java.awt.Color(153, 204, 255));
        jLabel_Image_5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel_Image_5.setOpaque(true);
        jLabel_Image_5.setPreferredSize(new java.awt.Dimension(34, 14));

        jPanel_5_header.setBackground(new java.awt.Color(68, 108, 179));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Lastest Books Added");

        javax.swing.GroupLayout jPanel_5_headerLayout = new javax.swing.GroupLayout(jPanel_5_header);
        jPanel_5_header.setLayout(jPanel_5_headerLayout);
        jPanel_5_headerLayout.setHorizontalGroup(
            jPanel_5_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_5_headerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_5_headerLayout.setVerticalGroup(
            jPanel_5_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_5_headerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel_5Layout = new javax.swing.GroupLayout(jPanel_5);
        jPanel_5.setLayout(jPanel_5Layout);
        jPanel_5Layout.setHorizontalGroup(
            jPanel_5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_Image_1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_Image_2, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_Image_3, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_Image_4, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_Image_5, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanel_5_header, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel_5Layout.setVerticalGroup(
            jPanel_5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_5Layout.createSequentialGroup()
                .addComponent(jPanel_5_header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(jPanel_5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel_Image_1, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                    .addComponent(jLabel_Image_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel_Image_3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel_Image_4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel_Image_5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(1, 50, 67));

        jLabel_welcome.setFont(new java.awt.Font("Segoe Print", 1, 17)); // NOI18N
        jLabel_welcome.setForeground(new java.awt.Color(255, 204, 0));
        jLabel_welcome.setText("Welcome back user");

        jLabel_Dashboard_Logo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_Dashboard_LogoMouseClicked(evt);
            }
        });

        jLabel_Home.setBackground(new java.awt.Color(1, 50, 67));
        jLabel_Home.setOpaque(true);
        jLabel_Home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_HomeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_HomeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_HomeMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel_Home, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel_Dashboard_Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_welcome, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel_welcome, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel_Dashboard_Logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel_Home, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel_Menu, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel_1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel_2, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel_3, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel_4, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel_5, javax.swing.GroupLayout.DEFAULT_SIZE, 973, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_Menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
                .addComponent(jPanel_5, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_Manage_usersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Manage_usersActionPerformed
        // TODO add your handling code here:
        // show manage users form (show only for user type: admin)
        ManageUsersForm mngUsersf = new ManageUsersForm();
        mngUsersf.setVisible(true);
    }//GEN-LAST:event_jButton_Manage_usersActionPerformed

    private void jButton_ReturnBook_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ReturnBook_ActionPerformed
        // show the books list form
        ReturnBookForm rtnBookf = new ReturnBookForm();
        rtnBookf.setVisible(true);
    }//GEN-LAST:event_jButton_ReturnBook_ActionPerformed

    private void jButton_BorrowBook_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_BorrowBook_ActionPerformed

        // show the books list form
        BorrowBookForm brwBookf = new BorrowBookForm();
        brwBookf.setVisible(true);
    }//GEN-LAST:event_jButton_BorrowBook_ActionPerformed

    private void jButton_List_BookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_List_BookActionPerformed
        // show the books list form
        BookListForm bookListf = new BookListForm();
        bookListf.setVisible(true);
    }//GEN-LAST:event_jButton_List_BookActionPerformed

    private void jButton_Delete_BookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Delete_BookActionPerformed
        // show the delete book form
        DeleteBookForm deleteBookf = new DeleteBookForm();
        deleteBookf.setVisible(true);
       
    }//GEN-LAST:event_jButton_Delete_BookActionPerformed

    private void jButton_Edit_BookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Edit_BookActionPerformed
        // show the edit book form
        EditBookForm editBookf = new EditBookForm();
        editBookf.setVisible(true);
    }//GEN-LAST:event_jButton_Edit_BookActionPerformed

    private void jButton_Add_BookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Add_BookActionPerformed
        // show the add book form
        AddBookForm addBookf = new AddBookForm();
        addBookf.setVisible(true);
    }//GEN-LAST:event_jButton_Add_BookActionPerformed

    private void jButton_Manage_Authors_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Manage_Authors_ActionPerformed
        // show the Manage_Authors form
        ManageAuthorsForm mngAuthorForm = new ManageAuthorsForm();
        mngAuthorForm.setVisible(true);
    }//GEN-LAST:event_jButton_Manage_Authors_ActionPerformed

    private void jButton_Manage_Genres_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Manage_Genres_ActionPerformed
        // show the Manage_Genres form
        ManageGenresForm mngGenreForm = new ManageGenresForm();
        mngGenreForm.setVisible(true);

    }//GEN-LAST:event_jButton_Manage_Genres_ActionPerformed

    private void jButton_List_Member_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_List_Member_ActionPerformed
        // show the Member_List form
        MemberListForm memberListForm = new MemberListForm();
        memberListForm.setVisible(true);
    }//GEN-LAST:event_jButton_List_Member_ActionPerformed

    private void jButton_Delete_Member_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Delete_Member_ActionPerformed
        // show the Delete_Member form
        DeleteMemberForm deleteMemberForm = new DeleteMemberForm();
        deleteMemberForm.setVisible(true);
    }//GEN-LAST:event_jButton_Delete_Member_ActionPerformed

    private void jButton_Edit_Member_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Edit_Member_ActionPerformed
        // show the Edit_Member form
        EditMemberForm editMemberForm = new EditMemberForm();
        editMemberForm.setVisible(true);
    }//GEN-LAST:event_jButton_Edit_Member_ActionPerformed

    private void jButton_Add_Member_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Add_Member_ActionPerformed
        // show the Add_Member form
        AddMemberForm addMemberForm = new AddMemberForm();
        addMemberForm.setVisible(true);
    }//GEN-LAST:event_jButton_Add_Member_ActionPerformed

    private void jButton_GachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_GachActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_GachActionPerformed

    private void jLabel_HomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_HomeMouseClicked
        // TODO add your handling code here:
        displayCount();
         book.displayBooksCover(labels_tab);
    }//GEN-LAST:event_jLabel_HomeMouseClicked

    private void jLabel_HomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_HomeMouseEntered
        // TODO add your handling code here:
          jLabel_Home.setBackground(new Color(1, 50, 67, 100));
    }//GEN-LAST:event_jLabel_HomeMouseEntered

    private void jLabel_HomeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_HomeMouseExited
        // TODO add your handling code here:
        jLabel_Home.setBackground(new Color(1, 50, 67));
    }//GEN-LAST:event_jLabel_HomeMouseExited

    private void jLabel_Dashboard_LogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Dashboard_LogoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_Dashboard_LogoMouseClicked

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getSystemLookAndFeelClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DashboardForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DashboardForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DashboardForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DashboardForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            new DashboardForm().setVisible(true);
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Add_Book;
    private javax.swing.JButton jButton_Add_Member_;
    public javax.swing.JButton jButton_BorrowBook_;
    private javax.swing.JButton jButton_Delete_Book;
    private javax.swing.JButton jButton_Delete_Member_;
    private javax.swing.JButton jButton_Edit_Book;
    private javax.swing.JButton jButton_Edit_Member_;
    public javax.swing.JButton jButton_Gach;
    private javax.swing.JButton jButton_List_Book;
    private javax.swing.JButton jButton_List_Member_;
    private javax.swing.JButton jButton_Manage_Authors_;
    private javax.swing.JButton jButton_Manage_Genres_;
    public javax.swing.JButton jButton_Manage_users;
    public javax.swing.JButton jButton_ReturnBook_;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    public javax.swing.JLabel jLabel1_Circulation;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_AuthorsCount;
    private javax.swing.JLabel jLabel_AuthorsCount1;
    private javax.swing.JLabel jLabel_BooksCount;
    private javax.swing.JLabel jLabel_BooksCount1;
    private javax.swing.JLabel jLabel_Dashboard_Logo;
    private javax.swing.JLabel jLabel_GenresCount;
    private javax.swing.JLabel jLabel_GenresCount1;
    private javax.swing.JLabel jLabel_Home;
    private javax.swing.JLabel jLabel_Image_1;
    private javax.swing.JLabel jLabel_Image_2;
    private javax.swing.JLabel jLabel_Image_3;
    private javax.swing.JLabel jLabel_Image_4;
    private javax.swing.JLabel jLabel_Image_5;
    private javax.swing.JLabel jLabel_MembersCount;
    private javax.swing.JLabel jLabel_MembersCount1;
    public javax.swing.JLabel jLabel_welcome;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel_1;
    private javax.swing.JPanel jPanel_1_header;
    private javax.swing.JPanel jPanel_2;
    private javax.swing.JPanel jPanel_2_header;
    private javax.swing.JPanel jPanel_3;
    private javax.swing.JPanel jPanel_3_header;
    private javax.swing.JPanel jPanel_4;
    private javax.swing.JPanel jPanel_4_header;
    private javax.swing.JPanel jPanel_5;
    private javax.swing.JPanel jPanel_5_header;
    private javax.swing.JPanel jPanel_Header;
    private javax.swing.JPanel jPanel_Menu;
    // End of variables declaration//GEN-END:variables
}
