
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.Statement;
import javax.swing.JTable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JATIN
 */
public class BatchRegistration extends javax.swing.JFrame {

    /**
     * Creates new form StudentRegistration
     */
    public BatchRegistration() {
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tb1 = new javax.swing.JTable();
        Register = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        btchteach = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        btchyear = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        btchid = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

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
        jLabel1.setText("BATCH REGISTRATION");

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

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/back.jpg"))); // NOI18N
        jLabel11.setText("BACK");
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
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        tb1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Batch Code", "Batch Year", "Teacher", "Class", "Stream", "Section "
            }
        ));
        tb1.setSelectionBackground(new java.awt.Color(255, 0, 51));
        jScrollPane1.setViewportView(tb1);

        Register.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Register.setText("REGISTARTIONS");
        Register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterActionPerformed(evt);
            }
        });

        b5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        b5.setText("UPDATE");
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
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
        btchid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btchidActionPerformed(evt);
            }
        });
        btchid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btchidKeyPressed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("REMEMBER YOUR ID.");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("<HTML><BODY>PLEASE DO NOT USE ANY SINGLE <BR>OR DOUBLE QUOTES</body></html>");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
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
                                    .addComponent(btchyear, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btchcode, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btchclass, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btchstream, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btchsec, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btchteach, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(106, 106, 106)
                                .addComponent(btchid, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(Register)
                                    .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel12)))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 606, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(597, 597, 597)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btchid, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btchcode, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Register, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btchyear, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btchclass, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btchstream, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btchsec, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btchteach, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
       MainPage mn=new MainPage();
       mn.setVisible(true);
       this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void btchcodeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btchcodeKeyPressed

    }//GEN-LAST:event_btchcodeKeyPressed

    private void btchcodeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btchcodeFocusLost
    
    }//GEN-LAST:event_btchcodeFocusLost

    private void btchstreamFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btchstreamFocusLost
        
    }//GEN-LAST:event_btchstreamFocusLost

    private void btchstreamKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btchstreamKeyPressed
       
    }//GEN-LAST:event_btchstreamKeyPressed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated

        try
        {
            Class.forName("java.sql.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/jatin","root","1234");
            Statement st=con.createStatement();
            String sql1="Select * from batchrgstr;";
            System.out.println(sql1);
            DefaultTableModel tm=(DefaultTableModel)tb1.getModel();
            tm.setRowCount(0);
            ResultSet rs=st.executeQuery(sql1);
            while(rs.next())
            {   int id=rs.getInt(7);
                String code=rs.getString(1);
                int year=rs.getInt(2);
                String teach=rs.getString(3);
                String class1=rs.getString(4);
                String stream=rs.getString(5);
                String section=rs.getString(6);
                tm.addRow(new Object[]{""+id,code,""+year,teach,class1,stream,section});
                
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
        
    }//GEN-LAST:event_formWindowActivated

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

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed
UpdateBatch up=new UpdateBatch();
up.setVisible(true);
this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_b5ActionPerformed

    private void RegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterActionPerformed
String class1=btchclass.getText();
String code=btchcode.getText();
int id=Integer.parseInt(btchid.getText());
String id5="" +id;
String stream=btchstream.getText();
String sec=btchsec.getText();
String tech=btchteach.getText();
int a=Integer.parseInt(btchyear.getText());
String year5=""+a;
if(btchstream.equals(""))
        {
            stream="NULL"; 
        }
else if(class1.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Enter Class");
        }
else if(stream.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Enter Stream");
        }
else if(sec.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Enter Section");
        }
 else if(tech.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Enter Teacher name");
        }
 else if(code.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Enter Batch code");
        }
 else if(year5.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Enter Year");
        }
 else if(id5.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Enter Id");
        }
 else if(checkSection(class1).equals(sec))
 {
     JOptionPane.showMessageDialog(null,"This Section Already exists for this class");
 }
 else{
try{
    Class.forName("java.sql.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost/jatin","root","1234");
Statement stmt=con.createStatement();
String sql="INSERT INTO batchrgstr(batchcode,batchyear,teacher,Class,Stream,Section,ID) VALUES ('"+code+"',"+a+",'"+tech+"','"+class1+"','"+stream+"','"+sec+"',"+id+");";
PreparedStatement ps;
ps = MyConnection.getConnection().prepareStatement(sql);                      
            int c=ps.executeUpdate(sql);
               System.out.println(sql);
            if(c > 0)
            {
             JOptionPane.showMessageDialog(null,"Batch Addded");
             DefaultTableModel tm=(DefaultTableModel)tb1.getModel();
             tm.setRowCount(0);
             Statement st=con.createStatement();
             String sql1="Select * from batchrgstr;";
             System.out.println(sql1);
             ResultSet rs=st.executeQuery(sql1);
             while(rs.next())
             {  String code1=rs.getString("batchcode");
                int year=rs.getInt("batchyear");
                String teach1=rs.getString("teacher");
                String class2=rs.getString("Class");
                String stream1=rs.getString("Stream");
                String section=rs.getString("Section");
                int id1=rs.getInt("ID");
                tm.addRow(new Object[]{""+id1,code1,""+year,teach1,class2,stream1,section});
                
            }
             btchstream.setText("");
             btchid.setText("");
             btchclass.setText("");
             btchsec.setText("");
             btchyear.setText("");
             btchcode.setText("");
             btchteach.setText("");
                
            }
}
 
catch(Exception e)
{
    JOptionPane.showMessageDialog(null,e.getMessage());
}
 } 

    }//GEN-LAST:event_RegisterActionPerformed

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

    private void btchidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btchidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btchidActionPerformed
public String checkSection(String class1)
{ 
 PreparedStatement ps;
 ResultSet rs;
 boolean checkSec = false;
 String sf = null;
 String query = "SELECT Section  FROM `batchrgstr` WHERE `Class` =?";	
 try {
            ps = MyConnection.getConnection().prepareStatement(query);
            ps.setString(1, class1);
            
            rs = ps.executeQuery();
           
            
            while(rs.next())
            {
               
                sf=rs.getString(1);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
         return sf;        
}
    
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
            java.util.logging.Logger.getLogger(BatchRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BatchRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BatchRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BatchRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BatchRegistration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Register;
    private javax.swing.JButton b5;
    private javax.swing.JTextField btchclass;
    private javax.swing.JTextField btchcode;
    private javax.swing.JTextField btchid;
    private javax.swing.JTextField btchsec;
    private javax.swing.JTextField btchstream;
    private javax.swing.JTextField btchteach;
    private javax.swing.JTextField btchyear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tb1;
    // End of variables declaration//GEN-END:variables

    private void toExcel(JTable t1, File file) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}