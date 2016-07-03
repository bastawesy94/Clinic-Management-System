
package ClinicGUI;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
import javax.swing.JPanel;
import java.awt.FlowLayout;
import java.awt.Label;


public class NewPatient extends javax.swing.JFrame {

   private final String driver = "com.mysql.jdbc.Driver";
    private final String db_url = "jdbc:mysql://localhost:3306/clinic?useUnicode=yes&characterEncoding=UTF-8";
    

    private final String user = "root";
    private final String pass_word = "";
    static Connection conn = null;
    static Statement stmt = null;
    public static String p_id = null;
    
    public NewPatient() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Sex = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Birth = new com.toedter.calendar.JDateChooser();
        Date = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLayeredPane3 = new javax.swing.JLayeredPane();
        jLabel13 = new javax.swing.JLabel();
        delete = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        Name1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        PatientInfo = new javax.swing.JTable();
        PatientName = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLayeredPane4 = new javax.swing.JLayeredPane();
        jLabel14 = new javax.swing.JLabel();
        Id = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        delete1 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        delete2 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 2, true));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("أسم المريض");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("النوع");

        Sex.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Sex.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ذكر", "أنثي" }));
        Sex.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 2, true));
        Sex.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                SexComponentShown(evt);
            }
        });
        Sex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SexActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("وقت التسجيل");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("الميلاد");

        Birth.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 2, true));

        Date.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 2, true));

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\M-Bastawesy\\Documents\\NetBeansProjects\\Clinic\\src\\Pics\\home.png")); // NOI18N
        jLabel7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 2, true));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\M-Bastawesy\\Documents\\NetBeansProjects\\Clinic\\src\\Pics\\update.jpg")); // NOI18N
        jLabel8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 2, true));
        jLabel8.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel8MouseDragged(evt);
            }
        });
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\M-Bastawesy\\Documents\\NetBeansProjects\\Clinic\\src\\Pics\\save.jpg")); // NOI18N
        jLabel9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 2, true));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("حـــــفـــــــظ");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("الرئــيـســيـة");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("تـــــعــــديــل");

        jLayeredPane3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel13.setText("بحث/حزف بيانات مريض");

        javax.swing.GroupLayout jLayeredPane3Layout = new javax.swing.GroupLayout(jLayeredPane3);
        jLayeredPane3.setLayout(jLayeredPane3Layout);
        jLayeredPane3Layout.setHorizontalGroup(
            jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addContainerGap())
        );
        jLayeredPane3Layout.setVerticalGroup(
            jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addGap(27, 27, 27))
        );
        jLayeredPane3.setLayer(jLabel13, javax.swing.JLayeredPane.DEFAULT_LAYER);

        delete.setIcon(new javax.swing.ImageIcon("C:\\Users\\M-Bastawesy\\Documents\\NetBeansProjects\\Clinic\\src\\Pics\\deleteone.png")); // NOI18N
        delete.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 2, true));
        delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteMouseClicked(evt);
            }
        });

        jLabel19.setIcon(new javax.swing.ImageIcon("C:\\Users\\M-Bastawesy\\Documents\\NetBeansProjects\\Clinic\\src\\Pics\\check.jpg")); // NOI18N
        jLabel19.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 2, true));
        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel19MouseClicked(evt);
            }
        });

        Name1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Name1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 2, true));
        Name1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Name1ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("مستخد النظام");

        PatientInfo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        PatientInfo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        PatientInfo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        PatientInfo.setRowHeight(21);
        PatientInfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PatientInfoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PatientInfoMouseEntered(evt);
            }
        });
        jScrollPane1.setViewportView(PatientInfo);

        PatientName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        PatientName.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 2, true));
        PatientName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PatientNameActionPerformed(evt);
            }
        });
        PatientName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                PatientNameKeyReleased(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("أسم المريض");

        jLayeredPane4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel14.setText("ادخال بيانات المريض");

        javax.swing.GroupLayout jLayeredPane4Layout = new javax.swing.GroupLayout(jLayeredPane4);
        jLayeredPane4.setLayout(jLayeredPane4Layout);
        jLayeredPane4Layout.setHorizontalGroup(
            jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addContainerGap())
        );
        jLayeredPane4Layout.setVerticalGroup(
            jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addGap(27, 27, 27))
        );
        jLayeredPane4.setLayer(jLabel14, javax.swing.JLayeredPane.DEFAULT_LAYER);

        Id.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Id.setForeground(new java.awt.Color(255, 0, 0));
        Id.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setText("حــــــــــــزف");

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setText("بحث الأسم");

        delete1.setIcon(new javax.swing.ImageIcon("C:\\Users\\M-Bastawesy\\Documents\\NetBeansProjects\\BarCodeClinic\\src\\ClinicPics\\Clean.png")); // NOI18N
        delete1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 2, true));
        delete1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                delete1MouseClicked(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setText("مسح الشاشة");

        delete2.setIcon(new javax.swing.ImageIcon("C:\\Users\\M-Bastawesy\\Documents\\NetBeansProjects\\BarCodeClinic\\src\\ClinicPics\\check-shortcut.png")); // NOI18N
        delete2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 2, true));
        delete2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                delete2MouseClicked(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel20.setText("حــجز/تـأكـيد ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 811, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLayeredPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(250, 250, 250))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(PatientName, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel15))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(45, 45, 45)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel16)
                                            .addComponent(delete)
                                            .addComponent(delete2)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel20)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel17)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(delete1)
                                            .addGap(8, 8, 8)))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING)))))
                        .addGap(198, 198, 198)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel11)
                                            .addComponent(jLabel7))
                                        .addGap(9, 9, 9)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel12))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel9)))
                                    .addComponent(Date, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel4))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLayeredPane4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, Short.MAX_VALUE)
                                    .addComponent(Name1)
                                    .addComponent(Birth, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                                    .addComponent(Sex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(44, 44, 44)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel5)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGap(22, 22, 22)
                                        .addComponent(jLabel2)))))
                        .addGap(18, 18, 18))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Id, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLayeredPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLayeredPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(Id, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Name1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Sex, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addGap(22, 22, 22)
                                .addComponent(Birth, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(16, 16, 16)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Date, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(88, 88, 88)
                                    .addComponent(jLabel12)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel10)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PatientName, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(delete)
                            .addComponent(jLabel19))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(jLabel18))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(delete1)
                            .addComponent(delete2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(jLabel20))))
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SexActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SexActionPerformed

    private void SexComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_SexComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_SexComponentShown

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
      
        try
   {
           SimpleDateFormat dateParser = new SimpleDateFormat("dd/MM/yyyy");
            Class.forName(driver);
            conn = DriverManager.getConnection(db_url, user, pass_word);
            stmt = conn.createStatement();
            String date =dateParser.format(Date.getDate());
            String birth = dateParser.format(Birth.getDate());     
            String sql = "INSERT INTO clinic.patient (nurse_id,name,sex,birth,date)"
            + " VALUES ("+UserLogin.value+",'"+Name1.getText()+"','"
            +Sex.getSelectedItem().toString()
            +"','"+birth+"','"+date+"')";
            stmt.executeUpdate(sql);     
            JOptionPane.showMessageDialog(null, "تمت عملية تسجيل " +Name1.getText()+ " بنجاح");
   } 
   catch(Exception ex)
   {
       JOptionPane.showMessageDialog(null, "يوجد خطأ في التسجيل !");
   }
    }//GEN-LAST:event_jLabel9MouseClicked

    private void Name1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Name1ActionPerformed
      
    }//GEN-LAST:event_Name1ActionPerformed

    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked
      try
        {
            Class.forName(driver);
            conn = DriverManager.getConnection(db_url, user, pass_word);
            stmt = conn.createStatement();
            String sql = "select * from patient "
                    + "where name like '%"+ PatientName.getText() +"%' ";
            System.out.println(sql);
            ResultSet rs = stmt.executeQuery(sql);
            PatientInfo.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "يوجد خطأ !");
        }
          
    }//GEN-LAST:event_jLabel19MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        new HomePage().setVisible(true);
          this.setVisible(false);
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel8MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseDragged
              try
   {   
           Class.forName(driver);
            conn = DriverManager.getConnection(db_url, user, pass_word);
            stmt = conn.createStatement();
             SimpleDateFormat dateParser = new SimpleDateFormat("dd/MM/yyyy");
             String date =dateParser.format(Date.getDate());
            String birth = dateParser.format(Birth.getDate());
            int p_id = Integer.parseInt(Id.getText());
            
    String sql = "UPDATE clinic.patient SET nurse_id ='"+UserLogin.value+"',name='"+Name1.getText()+
            "',date='"+date+ "',birth='"+birth+"' WHERE id = '"+p_id+"'";
   
    stmt.executeUpdate(sql);
    JOptionPane.showMessageDialog(null, "done :))");
       
   } 
   catch(Exception ex)
   {
       JOptionPane.showMessageDialog(null, "خطأ !");
       ex.printStackTrace();
   }
    }//GEN-LAST:event_jLabel8MouseDragged

    private void PatientNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PatientNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PatientNameActionPerformed

    private void PatientInfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PatientInfoMouseClicked
        try{
        int rowNum = PatientInfo.getSelectedRow();       
        String table =(PatientInfo.getModel().getValueAt(rowNum, 0).toString()) ;
         Class.forName(driver);
            conn = DriverManager.getConnection(db_url, user, pass_word);
            stmt = conn.createStatement();
            String sql = "select * from clinic.patient where id = "+table+" ";
            System.out.println(sql);
            ResultSet rs = stmt.executeQuery(sql);
            if(rs.next())
            {
            String name = rs.getString("name");
            Name1.setText(name);
            String sex = rs.getString("sex");
            Sex.setSelectedItem(sex);
            String patient_id = ""+rs.getInt("id");
            p_id = rs.getInt("id")+"";
          
            String date = rs.getString("date");
            SimpleDateFormat sdf = new SimpleDateFormat
        ("dd/MM/yyyy", Locale.US);
            Date date2 = sdf.parse(date);// all done
            Calendar cal = sdf.getCalendar();
            Date.setCalendar(cal);
            
            String birth = rs.getString("birth");
            SimpleDateFormat sdf2 = new SimpleDateFormat
        ("dd/MM/yyyy", Locale.US);
            Date date3 = sdf2.parse(birth);// all done
            Calendar cal2 = sdf2.getCalendar();
            Birth.setCalendar(cal2);
            
            }
        
        }
        catch (Exception ex)
        {
       
        JOptionPane.showMessageDialog(null, "يوجد خطأ في التسجيل !");
        }
    }//GEN-LAST:event_PatientInfoMouseClicked

    private void deleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseClicked
          try
        {
            Class.forName(driver);
            conn = DriverManager.getConnection(db_url, user, pass_word);
            stmt = conn.createStatement();
            String sql = "delete from clinic.patient "
                    + "where id = '"+p_id+"' ";
            int result = JOptionPane.showConfirmDialog(null,"هل أنت متأكد من حزف المريض رقم: " +p_id );
            if(result == 0){
            stmt.executeUpdate(sql);
            JOptionPane.showMessageDialog(null,"تم حزف بيانات المريض رقم : "+p_id );
            }
                
            
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "يوجد خطأ !");
        }
                                       
    }//GEN-LAST:event_deleteMouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
 try
   {   
           Class.forName(driver);
            conn = DriverManager.getConnection(db_url, user, pass_word);
            stmt = conn.createStatement();
             SimpleDateFormat dateParser = new SimpleDateFormat("dd/MM/yyyy");    
            String date =dateParser.format(Date.getDate());
            String birth = dateParser.format(Birth.getDate());
            
    String sql = "UPDATE clinic.patient SET nurse_id ='"+UserLogin.value
            +"',name='"+Name1.getText()+"',sex='"+Sex.getSelectedItem().toString()
            +"',date='"+date+ "',birth='"
            +birth+"' WHERE id = '"+p_id+"'";
       System.out.println(sql);
    stmt.executeUpdate(sql);
    JOptionPane.showMessageDialog(null, "تمت عملية التعديل بنجاح .");
       
   } 
   catch(Exception ex)
   {
       JOptionPane.showMessageDialog(null, "خطأ !");
       ex.printStackTrace();
   }
    }//GEN-LAST:event_jLabel8MouseClicked

    private void PatientInfoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PatientInfoMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_PatientInfoMouseEntered

    private void PatientNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PatientNameKeyReleased
      
    }//GEN-LAST:event_PatientNameKeyReleased

    private void delete1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delete1MouseClicked
        try{
        PatientName.setText("");
        Name1.setText("");
        Birth.setCalendar(null);
        Date.setCalendar(null);
        
        
        }
        catch(Exception ex){
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null , "يوجد خطأ !");
        }
    }//GEN-LAST:event_delete1MouseClicked

    private void delete2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delete2MouseClicked
        this.setVisible(false);
        Visit visit = new Visit();
        visit.setVisible(true);
        visit.name.setText(UserLogin.name);
    }//GEN-LAST:event_delete2MouseClicked

   
    public static void main(String args[]) {
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewPatient().setVisible(true);
                
      
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser Birth;
    private com.toedter.calendar.JDateChooser Date;
    public static javax.swing.JLabel Id;
    public static javax.swing.JTextField Name1;
    private javax.swing.JTable PatientInfo;
    private javax.swing.JTextField PatientName;
    private javax.swing.JComboBox Sex;
    private javax.swing.JLabel delete;
    private javax.swing.JLabel delete1;
    private javax.swing.JLabel delete2;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane3;
    private javax.swing.JLayeredPane jLayeredPane4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
