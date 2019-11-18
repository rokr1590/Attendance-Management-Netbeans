
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JATIN
 */
public class UpdateBatch extends javax.swing.JFrame {
Connection con;
Statement stmt;
ResultSet rs;
    /**
     * Creates new form UpdateBatch
     */
    public UpdateBatch() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btchcode = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btchstream = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btchclass = new javax.swing.JTextField();
        btchsec = new javax.swing.JTextField();
        Update = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        btchteach = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        btchyear = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        btchid = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        nxt = new javax.swing.JButton();
        prvs = new javax.swing.JButton();
        frst = new javax.swing.JButton();
        lst = new javax.swing.JButton();
        DataSrch = new javax.swing.JButton();
        delete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        jPanel1.setBackground(new java.awt.Color(153, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(0, 0, 0)));
        jPanel1.setForeground(new java.awt.Color(51, 102, 255));

        jLabel1.setFont(new java.awt.Font("Freestyle Script", 1, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("UPDATE BATCH");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 102, 255));
        jLabel2.setText("BATCH CODE");

        btchcode.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btchcode.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                btchcodeFocusLost(evt);
            }
        });
        btchcode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btchcodeKeyPressed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(51, 51, 255));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("X");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/back.jpg"))); // NOI18N
        jLabel11.setText("jLabel11");
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 102, 255));
        jLabel5.setText("STREAM");

        btchstream.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btchstream.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                btchstreamFocusLost(evt);
            }
        });
        btchstream.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btchstreamKeyPressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 102, 255));
        jLabel3.setText("CLASS");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 102, 255));
        jLabel6.setText("SECTION");

        btchclass.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btchclass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                btchclassFocusLost(evt);
            }
        });
        btchclass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btchclassKeyPressed(evt);
            }
        });

        btchsec.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btchsec.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                btchsecFocusLost(evt);
            }
        });
        btchsec.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btchsecKeyPressed(evt);
            }
        });

        Update.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Update.setText("UPDATE");
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 102, 255));
        jLabel7.setText("TEACHER");

        btchteach.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btchteach.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                btchteachFocusLost(evt);
            }
        });
        btchteach.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btchteachKeyPressed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 102, 255));
        jLabel8.setText("BATCH YEAR");

        btchyear.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btchyear.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                btchyearFocusLost(evt);
            }
        });
        btchyear.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btchyearKeyPressed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 102, 255));
        jLabel9.setText("ID");

        btchid.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btchid.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                btchidFocusLost(evt);
            }
        });
        btchid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btchidKeyPressed(evt);
            }
        });

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(153, 255, 255));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(2);
        jTextArea1.setTabSize(5);
        jTextArea1.setText("*this is a compulsory field .Batch Updation will happen on the basis of ID.");
        jTextArea1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jScrollPane2.setViewportView(jTextArea1);

        nxt.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        nxt.setText("NEXT");
        nxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nxtActionPerformed(evt);
            }
        });

        prvs.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        prvs.setText("PREVIOUS");
        prvs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prvsActionPerformed(evt);
            }
        });

        frst.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        frst.setText("FIRST");
        frst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frstActionPerformed(evt);
            }
        });

        lst.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lst.setText("LAST");
        lst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lstActionPerformed(evt);
            }
        });

        DataSrch.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        DataSrch.setText("DATA SEARCH");
        DataSrch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DataSrchActionPerformed(evt);
            }
        });

        delete.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        delete.setText("DELETE  BATCH");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(345, 345, 345))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(106, 106, 106)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btchstream, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btchsec, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btchteach, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(btchclass, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(DataSrch, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(btchyear, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(btchcode, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(77, 77, 77)
                                            .addComponent(Update, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(106, 106, 106)
                                .addComponent(btchid, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(nxt, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(prvs, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(frst, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lst, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(314, 314, 314)
                        .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(Update, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btchid, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btchcode, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btchyear, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btchclass, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DataSrch, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btchstream, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btchsec, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btchteach, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nxt, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(prvs, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(frst, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lst, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
try{
    
    Class.forName("java.sql.Driver");
    con=DriverManager.getConnection("jdbc:mysql://localhost/jatin", "root", "1234");
    stmt=con.createStatement();
    String q="Select * from batchrgstr;";
    rs=stmt.executeQuery(q);
    
    if(rs.first()==true);{
        int id=rs.getInt(7);
        String code=rs.getString(1);
        int year=rs.getInt(2);
        String teach=rs.getString(3);
        String class1=rs.getString(4);
        String stream=rs.getString(5);
        String section=rs.getString(6);
       btchid.setText(""+id);
       btchcode.setText(code);
       btchyear.setText(""+year);
       btchteach.setText(teach);
       btchclass.setText(class1);
       btchstream.setText(stream);
       btchsec.setText(section);
}
    if(rs.first()==false)
    {
        JOptionPane.showMessageDialog(null,"There are no records in the database for Updation");
        BatchRegistration bn=new BatchRegistration();
        bn.setVisible(true);
        this.dispose();
    }
    
}
catch(Exception e)
{
    JOptionPane.showMessageDialog(null,e.getMessage());
}


        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowActivated

    private void btchcodeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btchcodeFocusLost

    }//GEN-LAST:event_btchcodeFocusLost

    private void btchcodeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btchcodeKeyPressed

    }//GEN-LAST:event_btchcodeKeyPressed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        MainPage mn=new MainPage();
        mn.setVisible(true);
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel11MouseClicked

    private void btchstreamFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btchstreamFocusLost

    }//GEN-LAST:event_btchstreamFocusLost

    private void btchstreamKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btchstreamKeyPressed

    }//GEN-LAST:event_btchstreamKeyPressed

    private void btchclassFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btchclassFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_btchclassFocusLost

    private void btchclassKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btchclassKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btchclassKeyPressed

    private void btchsecFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btchsecFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_btchsecFocusLost

    private void btchsecKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btchsecKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btchsecKeyPressed

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
if(btchid.getText().equals(""))
{
  JOptionPane.showMessageDialog(null,"Please type Id");
} 
else{
    try{    String code=btchcode.getText();
            int id=Integer.parseInt(btchid.getText());
            String class1=btchclass.getText();
            String stream=btchstream.getText();
            String sec=btchsec.getText();
            String tech=btchteach.getText();
            int a=Integer.parseInt(btchyear.getText());
            String q="Update batchrgstr set batchcode='"+code+"' ,batchyear="+a+" ,teacher='"+tech+"' ,Class='"+class1+"' ,Stream='"+stream+"' ,Section='"+sec+"' where ID="+id+";";
            System.out.println(q);
            stmt.executeUpdate(q);
            JOptionPane.showMessageDialog(null,"Updated");        }
        catch(Exception e)
        { JOptionPane.showMessageDialog(null,e.getMessage());   }
}
        // TODO add your handling code here:
    }//GEN-LAST:event_UpdateActionPerformed

    private void btchteachFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btchteachFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_btchteachFocusLost

    private void btchteachKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btchteachKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btchteachKeyPressed

    private void btchyearFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btchyearFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_btchyearFocusLost

    private void btchyearKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btchyearKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btchyearKeyPressed

    private void btchidFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btchidFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_btchidFocusLost

    private void btchidKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btchidKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btchidKeyPressed

    private void nxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nxtActionPerformed
        try{  rs.next();
            int id=rs.getInt(7);
            String code=rs.getString(1);
            int year=rs.getInt(2);
            String teach=rs.getString(3);
            String class1=rs.getString(4);
            String stream=rs.getString(5);
            String section=rs.getString(6);
            btchid.setText(""+id);
            btchcode.setText(code);
            btchyear.setText(""+year);
            btchteach.setText(teach);
            btchclass.setText(class1);
            btchstream.setText(stream);
            btchsec.setText(section);
        }
        catch(Exception e)
        {JOptionPane.showMessageDialog(null,e.getMessage()); }
        // TODO add your handling code here:
    }//GEN-LAST:event_nxtActionPerformed

    private void prvsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prvsActionPerformed
        try{

            rs.previous();

            int id=rs.getInt(7);
            String code=rs.getString(1);
            int year=rs.getInt(2);
            String teach=rs.getString(3);
            String class1=rs.getString(4);
            String stream=rs.getString(5);
            String section=rs.getString(6);
            btchid.setText(""+id);
            btchcode.setText(code);
            btchyear.setText(""+year);
            btchteach.setText(teach);
            btchclass.setText(class1);
            btchstream.setText(stream);
            btchsec.setText(section);

        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_prvsActionPerformed

    private void frstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frstActionPerformed
        try{

            rs.first();

            int id=rs.getInt(7);
            String code=rs.getString(1);
            int year=rs.getInt(2);
            String teach=rs.getString(3);
            String class1=rs.getString(4);
            String stream=rs.getString(5);
            String section=rs.getString(6);
            btchid.setText(""+id);
            btchcode.setText(code);
            btchyear.setText(""+year);
            btchteach.setText(teach);
            btchclass.setText(class1);
            btchstream.setText(stream);
            btchsec.setText(section);

        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_frstActionPerformed

    private void lstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lstActionPerformed
        try{

            rs.last();

            int id=rs.getInt(7);
            String code=rs.getString(1);
            int year=rs.getInt(2);
            String teach=rs.getString(3);
            String class1=rs.getString(4);
            String stream=rs.getString(5);
            String section=rs.getString(6);
            btchid.setText(""+id);
            btchcode.setText(code);
            btchyear.setText(""+year);
            btchteach.setText(teach);
            btchclass.setText(class1);
            btchstream.setText(stream);
            btchsec.setText(section);

        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_lstActionPerformed

    private void DataSrchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DataSrchActionPerformed
        try{
            Class.forName("java.sql.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/jatin","root","1234");
            stmt=con.createStatement();
            String a=btchcode.getText();
            String b=btchid.getText();
            String q="Select * from batchrgstr where ID="+b+";"; rs=stmt.executeQuery(q);rs.first();
            int id=rs.getInt(7);
            String code=rs.getString(1);
            int year=rs.getInt(2);
            String teach=rs.getString(3);
            String class1=rs.getString(4);
            String stream=rs.getString(5);
            String section=rs.getString(6);
            btchid.setText(""+id);
            btchcode.setText(code);
            btchyear.setText(""+year);
            btchteach.setText(teach);
            btchclass.setText(class1);
            btchstream.setText(stream);
            btchsec.setText(section);  }
        catch(Exception e)
        {  JOptionPane.showMessageDialog(null,e.getMessage()); }

        // TODO add your handling code here:
    }//GEN-LAST:event_DataSrchActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
try{int cnfrm=JOptionPane.showConfirmDialog(null,"Are You sure you want to delete your batch?. This may delete your student details!!!! ");
if(cnfrm==JOptionPane.YES_OPTION){
            Class.forName("java.sql.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/jatin","root","1234");
            stmt=con.createStatement();
            int a=Integer.parseInt(btchid.getText());
            String sql="Delete from batchrgstr where Id="+a+";";
            stmt.executeUpdate(sql);
            System.out.println(stmt);
            JOptionPane.showMessageDialog(null,"Batch DELETED");
}
else if(cnfrm==JOptionPane.NO_OPTION)
{
   JOptionPane.showMessageDialog(null,"You pressed NO"); 
}
else
    JOptionPane.showMessageDialog(null,"You Pressed CANCEL");
}
catch(Exception e)
{
   JOptionPane.showMessageDialog(null,e.getMessage()); 
}
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UpdateBatch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateBatch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateBatch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateBatch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateBatch().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DataSrch;
    private javax.swing.JButton Update;
    private javax.swing.JTextField btchclass;
    private javax.swing.JTextField btchcode;
    private javax.swing.JTextField btchid;
    private javax.swing.JTextField btchsec;
    private javax.swing.JTextField btchstream;
    private javax.swing.JTextField btchteach;
    private javax.swing.JTextField btchyear;
    private javax.swing.JButton delete;
    private javax.swing.JButton frst;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton lst;
    private javax.swing.JButton nxt;
    private javax.swing.JButton prvs;
    // End of variables declaration//GEN-END:variables
}
