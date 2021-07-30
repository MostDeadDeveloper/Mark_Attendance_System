/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User_UI;

import java.awt.Color;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author NEK PC
 */
public class AdminEditStudent extends javax.swing.JFrame {

    /**
     * Creates new form AdminUI
     */
    public AdminEditStudent() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        sidepanel = new javax.swing.JPanel();
        home_btn = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        teacher_btn = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        student_btn = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        logout_btn = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        tag_btn = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        studentmanagement_lbl = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        txt_mothername = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txt_address = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        gender_box = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txt_fathername = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel20 = new javax.swing.JLabel();
        txt_age = new javax.swing.JTextField();
        txt_lname = new javax.swing.JTextField();
        edit_btn = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        txt_fname = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        txt_id = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        student_gradelvl = new javax.swing.JComboBox<>();
        student_section = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setSize(getPreferredSize());

        bg.setBackground(new java.awt.Color(51, 153, 255));
        bg.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        bg.setPreferredSize(new java.awt.Dimension(1200, 720));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sidepanel.setBackground(new java.awt.Color(0, 0, 204));
        sidepanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        home_btn.setBackground(new java.awt.Color(0, 51, 204));
        home_btn.setToolTipText("");
        home_btn.setMinimumSize(new java.awt.Dimension(260, 0));
        home_btn.setPreferredSize(new java.awt.Dimension(261, 70));
        home_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                home_btnMousePressed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Home");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/User_UI/images/icons8_home_32px.png"))); // NOI18N
        jLabel2.setToolTipText("");

        javax.swing.GroupLayout home_btnLayout = new javax.swing.GroupLayout(home_btn);
        home_btn.setLayout(home_btnLayout);
        home_btnLayout.setHorizontalGroup(
            home_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, home_btnLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );
        home_btnLayout.setVerticalGroup(
            home_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, home_btnLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(home_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        sidepanel.add(home_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 300, 70));

        teacher_btn.setBackground(new java.awt.Color(0, 51, 204));
        teacher_btn.setToolTipText("");
        teacher_btn.setMinimumSize(new java.awt.Dimension(260, 0));
        teacher_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                teacher_btnMousePressed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Teacher Management");
        jLabel5.setMaximumSize(new java.awt.Dimension(51, 25));
        jLabel5.setMinimumSize(new java.awt.Dimension(51, 25));
        jLabel5.setPreferredSize(new java.awt.Dimension(51, 25));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/User_UI/images/icons8_management_32px.png"))); // NOI18N
        jLabel3.setToolTipText("");

        javax.swing.GroupLayout teacher_btnLayout = new javax.swing.GroupLayout(teacher_btn);
        teacher_btn.setLayout(teacher_btnLayout);
        teacher_btnLayout.setHorizontalGroup(
            teacher_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, teacher_btnLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        teacher_btnLayout.setVerticalGroup(
            teacher_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(teacher_btnLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(teacher_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        sidepanel.add(teacher_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 300, 70));

        student_btn.setBackground(new java.awt.Color(0, 102, 255));
        student_btn.setToolTipText("");
        student_btn.setMinimumSize(new java.awt.Dimension(260, 0));
        student_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                student_btnMousePressed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Student Management");
        jLabel4.setMaximumSize(new java.awt.Dimension(51, 25));
        jLabel4.setMinimumSize(new java.awt.Dimension(51, 25));
        jLabel4.setPreferredSize(new java.awt.Dimension(51, 25));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/User_UI/images/icons8_student_male_26px.png"))); // NOI18N

        javax.swing.GroupLayout student_btnLayout = new javax.swing.GroupLayout(student_btn);
        student_btn.setLayout(student_btnLayout);
        student_btnLayout.setHorizontalGroup(
            student_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(student_btnLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        student_btnLayout.setVerticalGroup(
            student_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(student_btnLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(student_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10))
        );

        sidepanel.add(student_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 300, 70));

        jSeparator1.setPreferredSize(new java.awt.Dimension(50, 15));
        sidepanel.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 122, 260, 10));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Welcome Admin");
        sidepanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 210, 40));

        logout_btn.setBackground(new java.awt.Color(0, 51, 204));
        logout_btn.setToolTipText("");
        logout_btn.setMinimumSize(new java.awt.Dimension(260, 0));
        logout_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                logout_btnMousePressed(evt);
            }
        });

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Logout");
        jLabel9.setMaximumSize(new java.awt.Dimension(51, 25));
        jLabel9.setMinimumSize(new java.awt.Dimension(51, 25));
        jLabel9.setPreferredSize(new java.awt.Dimension(51, 25));

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/User_UI/images/icons8_logout_rounded_down_32px.png"))); // NOI18N

        javax.swing.GroupLayout logout_btnLayout = new javax.swing.GroupLayout(logout_btn);
        logout_btn.setLayout(logout_btnLayout);
        logout_btnLayout.setHorizontalGroup(
            logout_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logout_btnLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        logout_btnLayout.setVerticalGroup(
            logout_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logout_btnLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(logout_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        sidepanel.add(logout_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 630, 300, 50));

        tag_btn.setBackground(new java.awt.Color(0, 51, 204));
        tag_btn.setToolTipText("");
        tag_btn.setMinimumSize(new java.awt.Dimension(260, 0));
        tag_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tag_btnMousePressed(evt);
            }
        });

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Tag Student");
        jLabel11.setMaximumSize(new java.awt.Dimension(51, 25));
        jLabel11.setMinimumSize(new java.awt.Dimension(51, 25));
        jLabel11.setPreferredSize(new java.awt.Dimension(51, 25));

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/User_UI/images/icons8_tags_32px.png"))); // NOI18N

        javax.swing.GroupLayout tag_btnLayout = new javax.swing.GroupLayout(tag_btn);
        tag_btn.setLayout(tag_btnLayout);
        tag_btnLayout.setHorizontalGroup(
            tag_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tag_btnLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        tag_btnLayout.setVerticalGroup(
            tag_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tag_btnLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(tag_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10))
        );

        sidepanel.add(tag_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 300, 70));

        bg.add(sidepanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 720));

        studentmanagement_lbl.setBackground(new java.awt.Color(255, 255, 255));
        studentmanagement_lbl.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        studentmanagement_lbl.setForeground(new java.awt.Color(255, 255, 255));
        studentmanagement_lbl.setText("Edit Student");
        bg.add(studentmanagement_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 70, 260, 40));

        jPanel1.setBackground(new java.awt.Color(0, 102, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        bg.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 60, 900, 60));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Nirmala UI", 1, 15)); // NOI18N
        jLabel13.setText("Mother's Name:");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 210, 120, 30));

        txt_mothername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_mothernameActionPerformed(evt);
            }
        });
        jPanel2.add(txt_mothername, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 240, 200, 30));

        jLabel14.setFont(new java.awt.Font("Nirmala UI", 1, 15)); // NOI18N
        jLabel14.setText("Gender:");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 210, 70, 30));

        txt_address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_addressActionPerformed(evt);
            }
        });
        jPanel2.add(txt_address, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 200, 30));

        jLabel15.setFont(new java.awt.Font("Nirmala UI", 1, 15)); // NOI18N
        jLabel15.setText("Section:");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, 70, 30));

        jLabel16.setFont(new java.awt.Font("Nirmala UI", 1, 15)); // NOI18N
        jLabel16.setText("Address:");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 90, 30));

        gender_box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Male", "Female" }));
        jPanel2.add(gender_box, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 240, 120, 30));

        jLabel17.setFont(new java.awt.Font("Nirmala UI", 1, 15)); // NOI18N
        jLabel17.setText("Last Name:");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, 90, 30));

        jLabel18.setFont(new java.awt.Font("Nirmala UI", 1, 15)); // NOI18N
        jLabel18.setText("Father's Name:");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 130, 120, 30));

        txt_fathername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_fathernameActionPerformed(evt);
            }
        });
        jPanel2.add(txt_fathername, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 160, 200, 30));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel19.setText("Student Information");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 190, 40));

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 250, 10));

        jLabel20.setFont(new java.awt.Font("Nirmala UI", 1, 15)); // NOI18N
        jLabel20.setText("Age:");
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, 40, 30));

        txt_age.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ageActionPerformed(evt);
            }
        });
        jPanel2.add(txt_age, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, 60, 30));

        txt_lname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_lnameActionPerformed(evt);
            }
        });
        jPanel2.add(txt_lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, 200, 30));

        edit_btn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        edit_btn.setText("Edit");
        edit_btn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        edit_btn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        edit_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                edit_btnMouseClicked(evt);
            }
        });
        jPanel2.add(edit_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 490, 170, 40));

        jLabel22.setFont(new java.awt.Font("Nirmala UI", 1, 15)); // NOI18N
        jLabel22.setText("ID No.:");
        jPanel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 50, 30));

        txt_fname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_fnameActionPerformed(evt);
            }
        });
        jPanel2.add(txt_fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 200, 30));

        jLabel23.setFont(new java.awt.Font("Nirmala UI", 1, 15)); // NOI18N
        jLabel23.setText("First Name:");
        jPanel2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 90, 30));
        jPanel2.add(txt_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 60, 30));
        txt_id.setEditable(false);

        jLabel21.setFont(new java.awt.Font("Nirmala UI", 1, 15)); // NOI18N
        jLabel21.setText("Grade Level:");
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 100, 30));

        student_gradelvl.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "7", "8", "9", "10" }));
        student_gradelvl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                student_gradelvlActionPerformed(evt);
            }
        });
        jPanel2.add(student_gradelvl, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 50, 30));

        student_section.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Section", "Venus" }));
        jPanel2.add(student_section, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 320, 130, 30));

        bg.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 140, 860, 560));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void home_btnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_home_btnMousePressed
        // TODO add your handling code here:
        setColor(home_btn);
        resetColor(student_btn);
        resetColor(teacher_btn);
        resetColor(tag_btn);
        AdminHomeUI home = new AdminHomeUI();
        home.setVisible(true);
        home.setLocationRelativeTo(null);
        home.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_home_btnMousePressed

    private void teacher_btnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_teacher_btnMousePressed
        // TODO add your handling code here:
        setColor(teacher_btn);
        resetColor(home_btn);
        resetColor(student_btn);
        resetColor(tag_btn);
        AdminTeacherManagementUI teachermanage = new AdminTeacherManagementUI();
	teachermanage.setVisible(true);
	teachermanage.setLocationRelativeTo(null);
	teachermanage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_teacher_btnMousePressed

    private void student_btnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_student_btnMousePressed
        // TODO add your handling code here:
        setColor(student_btn);
        resetColor(home_btn);
        resetColor(teacher_btn);
        resetColor(tag_btn);
        AdminStudentManagementUI studentmanage= new AdminStudentManagementUI();
        studentmanage.setVisible(true);
        studentmanage.setLocationRelativeTo(null);
        studentmanage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_student_btnMousePressed

    private void logout_btnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logout_btnMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_logout_btnMousePressed

    private void tag_btnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tag_btnMousePressed
        // TODO add your handling code here:
        setColor(tag_btn);
        resetColor(home_btn);
        resetColor(teacher_btn);
        resetColor(student_btn);
        AdminTagStudentUI tag = new AdminTagStudentUI();
        tag.setVisible(true);
        tag.setLocationRelativeTo(null);
        tag.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_tag_btnMousePressed

    private void txt_fnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_fnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_fnameActionPerformed

    private void txt_lnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_lnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_lnameActionPerformed

    private void txt_ageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ageActionPerformed

    private void txt_fathernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_fathernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_fathernameActionPerformed

    private void txt_addressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_addressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_addressActionPerformed

    private void txt_mothernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_mothernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_mothernameActionPerformed

    private void student_gradelvlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_student_gradelvlActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_student_gradelvlActionPerformed

    private void edit_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_edit_btnMouseClicked
        // TODO add your handling code here:
        PreparedStatement pst;
        //ResultSet rs;
        String query = "UPDATE student_info SET student_fname=?, student_lname=?, student_address=?, student_gender=?, "
                + "fathers_name=?, mothers_name=?, age=?, gradelvl=?, section=? WHERE user_idfk=?";
        String fname = txt_fname.getText();
        String lname = txt_lname.getText();
        String address = txt_address.getText();
        String gender = gender_box.getSelectedItem().toString();
        String fathername = txt_fathername.getText();
        String mothername = txt_mothername.getText();
        String age = txt_age.getText();
        String gradelvl = student_gradelvl.getSelectedItem().toString();
        String section = student_section.getSelectedItem().toString();
        String id = txt_id.getText();
        try {
            pst = MySQL_Connection.getConnection().prepareStatement(query);

            pst.setString(1, fname);
            pst.setString(2, lname);
            pst.setString(3, address);
            pst.setString(4, gender);
            pst.setString(5, fathername);
            pst.setString(6, mothername);
            pst.setString(7, age);
            pst.setString(8, gradelvl);
            pst.setString(9, section);
            pst.setString(10, id);
            pst.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Record Updated");
            AdminStudentManagementUI studentmanage = new AdminStudentManagementUI();
            studentmanage.setVisible(true);
            this.dispose();
        } catch (SQLException ex) {
            Logger.getLogger(AdminEditTeacher.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_edit_btnMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminEditStudent().setVisible(true);
            }
        });
    }
    
    void setColor(JPanel panel){
        panel.setBackground(new Color(0, 102, 255));
    }
    
    void resetColor(JPanel panel){
        panel.setBackground(new Color(0, 51, 204));
    }
    
    


    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JButton edit_btn;
    public javax.swing.JComboBox<String> gender_box;
    private javax.swing.JPanel home_btn;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JPanel logout_btn;
    private javax.swing.JPanel sidepanel;
    private javax.swing.JPanel student_btn;
    public javax.swing.JComboBox<String> student_gradelvl;
    public javax.swing.JComboBox<String> student_section;
    private javax.swing.JLabel studentmanagement_lbl;
    private javax.swing.JPanel tag_btn;
    private javax.swing.JPanel teacher_btn;
    public javax.swing.JTextField txt_address;
    public javax.swing.JTextField txt_age;
    public javax.swing.JTextField txt_fathername;
    public javax.swing.JTextField txt_fname;
    public javax.swing.JTextField txt_id;
    public javax.swing.JTextField txt_lname;
    public javax.swing.JTextField txt_mothername;
    // End of variables declaration//GEN-END:variables
}
