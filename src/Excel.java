
import java.awt.Color;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFileChooser;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JATIN
 */
public class Excel extends javax.swing.JFrame {
Connection con;
ResultSet rs;
Statement stmt;
int b;
String sec2;
int dl;
String s;

    /**
     * Creates new form Excel
     */
    public Excel() {
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
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        IMPORT = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        t1 = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        c1 = new javax.swing.JComboBox<>();
        ADDstudents = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        sh1 = new javax.swing.JTextField();
        l2 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

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
        jLabel1.setText("IMPORTING FROM EXCEL");

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

        IMPORT.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        IMPORT.setText("IMPORT EXCEL FILE");
        IMPORT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IMPORTActionPerformed(evt);
            }
        });

        t1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ROLL NO", "First Name", "Surname", "ID", "BatchCode", "Class", "Section"
            }
        ));
        jScrollPane1.setViewportView(t1);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 102, 255));
        jLabel9.setText("ID");

        c1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                c1ItemStateChanged(evt);
            }
        });
        c1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                c1MouseClicked(evt);
            }
        });
        c1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c1ActionPerformed(evt);
            }
        });

        ADDstudents.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        ADDstudents.setText("ADD STUDENTS");
        ADDstudents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADDstudentsActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 102, 255));
        jLabel13.setText("SHEET");

        sh1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        sh1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                sh1FocusLost(evt);
            }
        });
        sh1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                sh1KeyPressed(evt);
            }
        });

        l2.setText("* necessary field");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 255));
        jLabel2.setText("NOTE");

        jLabel3.setText("1.MAKE SURE THERE ARE SEPERATE COLUMNS FOR NAME AND SURNAME IN THE EXCEL SHEET");

        jLabel5.setText("2.INDEX FOR SHEET STARTS WITH '0'");

        jLabel6.setText("3.SELECT YOUR ID FIRST THEN CLICK THE BUTTON \"IMPORT FROM EXCEL\"");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(214, 214, 214)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(15, 15, 15)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(sh1)
                                    .addComponent(c1, 0, 149, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(l2))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(IMPORT)
                        .addGap(29, 29, 29)
                        .addComponent(ADDstudents, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 854, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(23, 44, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(c1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sh1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l2))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IMPORT, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ADDstudents, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        StudentRegistration st=new StudentRegistration();
        st.setVisible(true);
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel11MouseClicked

    private void IMPORTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IMPORTActionPerformed
        try {
            DefaultTableModel tm=(DefaultTableModel)t1.getModel();
            tm.setRowCount(0);
            int a = 0;
            if (sh1.getText().isEmpty()) 
            {
                l2.setForeground(Color.RED);
                JOptionPane.showMessageDialog(null, "Empty Field");
            } 
            else 
            {
                int sh2 = Integer.parseInt(sh1.getText());

                JFileChooser jf = new JFileChooser();
                int jt = jf.showOpenDialog(null);
                File file = jf.getSelectedFile();
                InputStream targetStream = new FileInputStream(file);
                //Create Workbook instance holding reference to .xlsx file
                Workbook workbook = WorkbookFactory.create(targetStream);
                DataFormatter objDataformatter = new DataFormatter();
                // FormulaEvaluator objformulaevaluator=new XSSFFormulaEvaluator((XSSFWorkbook)workbook); 
                //Get first/desired sheet from the workbook
                Sheet sheet = workbook.getSheetAt(sh2);
                int larow = sheet.getLastRowNum();
                int rno = 0;
                //Iterate through each rows one by one
                for (int i = 2; i <= sheet.getLastRowNum(); i++) {
                    Row row = sheet.getRow(i);
                    Cell cell_firstName = row.getCell(1);
                    Cell cell_Surname = row.getCell(2);
                    rno++;

                    Class.forName("com.mysql.jdbc.Driver");
                    con = DriverManager.getConnection("jdbc:mysql://localhost/jatin", "root", "1234");
                    stmt = con.createStatement();
                    b = Integer.parseInt(c1.getSelectedItem().toString());
                    String sq = "Select * from batchrgstr where ID=" + b + ";";
                    rs = stmt.executeQuery(sq);
                    while (rs.next()) {
                        s = rs.getString(1);
                        sec2 = rs.getString(6);
                        dl = rs.getInt(4);

                    }

                    
                   
                    String firstName = cell_firstName.getStringCellValue();
                    String Surname = cell_Surname.getStringCellValue();
                    DefaultTableModel t = (DefaultTableModel) t1.getModel();
                    t.addRow(new Object[]{rno, firstName, Surname, b, s, dl, sec2});
                }
                System.out.println(t1.getRowCount());
                c1.setEnabled(false);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
                
        // TODO add your handling code here:
    }//GEN-LAST:event_IMPORTActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
try{
    
     c1.setEnabled(true);
     c1.removeAllItems();
 Class.forName("com.mysql.jdbc.Driver");
 con = DriverManager.getConnection("jdbc:mysql://localhost/jatin", "root", "1234");
 stmt=con.createStatement();
 String sql="Select * from batchrgstr;";
 rs=stmt.executeQuery(sql);
 while(rs.next())
 {
    int a=rs.getInt(7);
      c1.addItem(""+a);
 }
}
catch(Exception e)
{
    JOptionPane.showMessageDialog(null, e.getMessage());
}

// TODO add your handling code here:
    }//GEN-LAST:event_formWindowActivated

    private void c1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c1ActionPerformed


// TODO add your handling code here:
    }//GEN-LAST:event_c1ActionPerformed

    private void c1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_c1ItemStateChanged


        // TODO add your handling code here:
    }//GEN-LAST:event_c1ItemStateChanged

    private void c1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_c1MouseClicked
try{DefaultTableModel t=(DefaultTableModel) t1.getModel();
        Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/jatin", "root", "1234");
            stmt=con.createStatement();
             b=Integer.parseInt(c1.getSelectedItem().toString());
            String sq="Select * from batchrgstr where ID="+b+";";
            rs=stmt.executeQuery(sq);
            while(rs.next())
            {
                String s=rs.getString(1);
                 sec2=rs.getString(6);
                 dl=rs.getInt(4);   
               
            }
}
catch(Exception e)
{
    JOptionPane.showMessageDialog(null,e.getMessage());
}
        // TODO add your handling code here:
    }//GEN-LAST:event_c1MouseClicked

    private void ADDstudentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADDstudentsActionPerformed
try
{int rows=t1.getRowCount();
int qw = 0;
        for(int row=0;row<rows;row++){
    int roll=(int)t1.getValueAt(row,0);
    String NAme =(String)t1.getValueAt(row, 1);
    String sname=(String)t1.getValueAt(row, 2);
     int ID =(int)t1.getValueAt(row, 3);
    String Batchcode=(String)t1.getValueAt(row, 4);
    int class1=(int)t1.getValueAt(row, 5);
    String class2=""+class1;
    String sec=(String)t1.getValueAt(row, 6);
     String fullname=NAme+" "+sname;
     String sql6="Select Rollno from studentrgstr where Section='"+sec+"' and Class="+class1+";";
     rs=stmt.executeQuery(sql6);
     while(rs.next())
     {
        qw=rs.getInt(1);
     }
    if(qw==roll)
    {
        JOptionPane.showMessageDialog(null,"Sorry!!A Record with same rollno in your class ,section already exists");
        MainPage mn=new MainPage();
        mn.setVisible(true);
        this.dispose();
    }
    else{
    
    String sql5 = "INSERT INTO studentrgstr VALUES("+roll+",'"+fullname+"',"+ID+",'"+Batchcode+"','"+sec+"',"+class1+");";
    stmt.executeUpdate(sql5);
    }
    JOptionPane.showMessageDialog(null,"Students Added!!!");
        }
}
catch(Exception e)
{
    JOptionPane.showMessageDialog(null,e.getMessage());
}
        // TODO add your handling code here:
    }//GEN-LAST:event_ADDstudentsActionPerformed

    private void sh1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_sh1FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_sh1FocusLost

    private void sh1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sh1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_sh1KeyPressed
public boolean checkRollno(String class1,String Section)
{ 
 PreparedStatement ps;
 ResultSet rs;
 boolean checkRoll = false;
 String query = "SELECT  Rollno  FROM `studentrgstr` WHERE `Class` =? and 'Section'=?";	
 try {
            ps = MyConnection.getConnection().prepareStatement(query);
            ps.setString(1, class1);
            ps.setString(2, Section);
            System.out.println(query);
            rs = ps.executeQuery();
            
            if(rs.next())
            {
                checkRoll = true;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
         return checkRoll;
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
            java.util.logging.Logger.getLogger(Excel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Excel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Excel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Excel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Excel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ADDstudents;
    private javax.swing.JButton IMPORT;
    private javax.swing.JComboBox<String> c1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel l2;
    private javax.swing.JTextField sh1;
    private javax.swing.JTable t1;
    // End of variables declaration//GEN-END:variables
}
