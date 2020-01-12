
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
public class UpdateStudent extends javax.swing.JFrame {
    Connection con;
    Statement stmt;
    ResultSet rs;
    
    /**
     * Creates new form UpdateStudent
     */
    public UpdateStudent() {
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
        rollno = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        class1 = new javax.swing.JTextField();
        Update = new javax.swing.JButton();
        DataSrch = new javax.swing.JButton();
        last = new javax.swing.JButton();
        nxt = new javax.swing.JButton();
        prvs = new javax.swing.JButton();
        frst = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        sec = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        sname = new javax.swing.JTextField();
        Delete = new javax.swing.JButton();

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
        jLabel1.setText("UPDATE STUDENT");

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
        jLabel5.setText("ROLL NO");

        rollno.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        rollno.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                rollnoFocusLost(evt);
            }
        });
        rollno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                rollnoKeyPressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 102, 255));
        jLabel3.setText("STUDENT NAME");

        class1.setEditable(false);
        class1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        class1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                class1FocusLost(evt);
            }
        });
        class1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                class1KeyPressed(evt);
            }
        });

        Update.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Update.setText("UPDATE");
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });

        DataSrch.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        DataSrch.setText("DATA SEARCH");
        DataSrch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DataSrchActionPerformed(evt);
            }
        });

        last.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        last.setText("LAST");
        last.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastActionPerformed(evt);
            }
        });

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

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 102, 255));
        jLabel6.setText("SECTION");

        sec.setEditable(false);
        sec.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        sec.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                secFocusLost(evt);
            }
        });
        sec.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                secKeyPressed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 102, 255));
        jLabel7.setText("CLASS");

        sname.setEditable(false);
        sname.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        sname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                snameFocusLost(evt);
            }
        });
        sname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                snameKeyPressed(evt);
            }
        });

        Delete.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Delete.setText("DELETE STUDENT");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(125, 125, 125)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btchcode, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                    .addComponent(sname)
                    .addComponent(rollno)
                    .addComponent(class1)
                    .addComponent(sec))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(262, 262, 262)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(nxt, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(prvs, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(frst, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(last, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(DataSrch, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Update, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(95, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btchcode, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sname, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rollno, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(class1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sec, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DataSrch, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Update, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nxt, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(prvs, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(frst, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(last, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59))
        );

        getContentPane().add(jPanel1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void frstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frstActionPerformed
 try{

            rs.first();
 int id=rs.getInt("ID");
        String code=rs.getString("batchcode");
      String name=rs.getString("StudentName");
      int rol=rs.getInt("ROllno");
      String sec1=rs.getString("Section");
      int f=rs.getInt("Class");
      btchcode.setText(code);
      class1.setText(name);
      rollno.setText(""+rol);
      sec.setText(sec1);
      sname.setText(name);
      class1.setText(""+f);
            

        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }         
        // TODO add your handling code here:
    }//GEN-LAST:event_frstActionPerformed

    private void prvsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prvsActionPerformed
 try{

            rs.previous();
 int id=rs.getInt("ID");
        String code=rs.getString("batchcode");
      String name=rs.getString("StudentName");
      int rol=rs.getInt("ROllno");
      String sec1=rs.getString("Section");
      int f=rs.getInt("Class");
      btchcode.setText(code);
      class1.setText(name);
      rollno.setText(""+rol);
      sec.setText(sec1);
      sname.setText(name);
      class1.setText(""+f);
            

        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }      
        // TODO add your handling code here:
    }//GEN-LAST:event_prvsActionPerformed

    private void nxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nxtActionPerformed
      try{
          rs.next();
          int id=rs.getInt("ID");
        String code=rs.getString("batchcode");
      String name=rs.getString("StudentName");
      int rol=rs.getInt("ROllno");
      String sec1=rs.getString("Section");
      int f=rs.getInt("Class");
      btchcode.setText(code);
      class1.setText(name);
      rollno.setText(""+rol);
      sec.setText(sec1);
      sname.setText(name);
      class1.setText(""+f);
                  
      }
      catch(Exception e)
      {
          JOptionPane.showMessageDialog(null, e.getMessage());
      }
    }//GEN-LAST:event_nxtActionPerformed

    private void lastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastActionPerformed
 try{

            rs.last();
 int id=rs.getInt("ID");
        String code=rs.getString("batchcode");
      String name=rs.getString("StudentName");
      int rol=rs.getInt("ROllno");
      String sec1=rs.getString("Section");
      int f=rs.getInt("Class");
      btchcode.setText(code);
      class1.setText(name);
      rollno.setText(""+rol);
      sec.setText(sec1);
      sname.setText(name);
      class1.setText(""+f);

        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }         
        // TODO add your handling code here:
    }//GEN-LAST:event_lastActionPerformed

    private void DataSrchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DataSrchActionPerformed
        
        // TODO add your handling code here:
    }//GEN-LAST:event_DataSrchActionPerformed

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed

        if(btchcode.getText().equals(""))
{
  JOptionPane.showMessageDialog(null,"Please type Id");
} 
else{
    try{

            String code=btchcode.getText();
            String name=sname.getText();
            int a=Integer.parseInt(rollno.getText());
            String sec1=sec.getText();
            int s=Integer.parseInt(class1.getText());
            String q="Update studentrgstr set StudentName='"+name+"',Rollno="+a+",Section='"+sec1+"',Class="+s+" where batchcode='"+code+"';";
            System.out.println(q);
            stmt.executeUpdate(q);
            JOptionPane.showMessageDialog(null,"Updated");

        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
}        
    }//GEN-LAST:event_UpdateActionPerformed

    private void class1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_class1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_class1KeyPressed

    private void class1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_class1FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_class1FocusLost

    private void rollnoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rollnoKeyPressed

    }//GEN-LAST:event_rollnoKeyPressed

    private void rollnoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_rollnoFocusLost

    }//GEN-LAST:event_rollnoFocusLost

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

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
try{
    
    Class.forName("java.sql.Driver");
    con=DriverManager.getConnection("jdbc:mysql://localhost/jatin", "root", "1234");
    stmt=con.createStatement();
    String q="Select * from studentrgstr;";
    rs=stmt.executeQuery(q);
    
    if(rs.first()==true);{
        int id=rs.getInt("ID");
        String code=rs.getString("batchcode");
      String name=rs.getString("StudentName");
      int rol=rs.getInt("ROllno");
      String sec1=rs.getString("Section");
      int f=rs.getInt("Class");
      btchcode.setText(code);
      class1.setText(name);
      rollno.setText(""+rol);
      sec.setText(sec1);
      sname.setText(name);
      class1.setText(""+f);
      
       
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

    private void secFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_secFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_secFocusLost

    private void secKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_secKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_secKeyPressed

    private void snameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_snameFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_snameFocusLost

    private void snameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_snameKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_snameKeyPressed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
try{int cnfrm=JOptionPane.showConfirmDialog(null,"Are You sure you want to delete this student info?.");
if(cnfrm==JOptionPane.YES_OPTION){
            Class.forName("java.sql.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/jatin","root","1234");
            stmt=con.createStatement();
            String a=btchcode.getText();
            int b=Integer.parseInt(rollno.getText());
            String c=sec.getText();
            String d=class1.getText();
            String sql="Delete from studentrgstr where Rollno="+b+" and BatchCode='"+a+"' and  Section='"+c+"' and Class="+d+";";
            stmt.executeUpdate(sql);
            JOptionPane.showMessageDialog(null,"Student Deleted");
}
else if(cnfrm==JOptionPane.NO_OPTION)
{
   JOptionPane.showMessageDialog(null,"You pressed NO"); 
}
else
{
   JOptionPane.showMessageDialog(null,"You pressed Cancel"); 
}
}
catch(Exception e)
{
   JOptionPane.showMessageDialog(null,e.getMessage()); 
}
        // TODO add your handling code here:
    }//GEN-LAST:event_DeleteActionPerformed

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
            java.util.logging.Logger.getLogger(UpdateStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateStudent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DataSrch;
    private javax.swing.JButton Delete;
    private javax.swing.JButton Update;
    private javax.swing.JTextField btchcode;
    private javax.swing.JTextField class1;
    private javax.swing.JButton frst;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton last;
    private javax.swing.JButton nxt;
    private javax.swing.JButton prvs;
    private javax.swing.JTextField rollno;
    private javax.swing.JTextField sec;
    private javax.swing.JTextField sname;
    // End of variables declaration//GEN-END:variables
}
