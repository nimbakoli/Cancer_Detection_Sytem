/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cancerdetection;

import cancerdetection.jdbcconnection.JDBCTemplate;

/**
 *
 * @author RAHUL
 */
public class AdvancedQuetions2 extends javax.swing.JFrame {

    /**
     * Creates new form PositiveResult3
     */
    String id,name,quetion;
    public AdvancedQuetions2(String ID) {
        initComponents();
        id=new String(ID);
        System.out.println("advanced quetion 2 user = "+id);
        
        try
		    {
		     java.sql.Connection c=null;
		     c=JDBCTemplate.getConnection();
		     java.sql.Statement str=c.createStatement();
                     
		     str.execute("update user set win_status=4 where email='"+id+"'");
		     System.out.println("update win status with 4 by advanced qution 2");
                     
                     java.sql.ResultSet rs3=str.executeQuery("SELECT name  FROM user WHERE email='"+id+"'");
		    if(rs3.next())
		    {
                        System.out.println(rs3.getString(1));
                        name=rs3.getString(1);
                        jLabel7.setText(name);
                    }
                    
                    java.sql.ResultSet rs4=str.executeQuery("SELECT quetion  FROM dataset WHERE qid='E1'");
                    if(rs4.next())
		    {
                        System.out.println(rs4.getString(1));
                        quetion=rs4.getString(1);
                        jLabel2.setText(quetion);
                    }
                     
                    java.sql.ResultSet rs6=str.executeQuery("SELECT quetion  FROM dataset WHERE qid='F1'");
                    if(rs6.next())
		    {
                        System.out.println(rs6.getString(1));
                        quetion=rs6.getString(1);
                        jLabel3.setText(quetion);
                    }
                    
                    java.sql.ResultSet rs7=str.executeQuery("SELECT quetion  FROM dataset WHERE qid='F1-1'");
                    if(rs7.next())
		    {
                        System.out.println(rs7.getString(1));
                        quetion=rs7.getString(1);
                        jLabel4.setText(quetion);
                    }
                    
                    java.sql.ResultSet rs8=str.executeQuery("SELECT quetion  FROM dataset WHERE qid='F1-2'");
                    if(rs8.next())
		    {
                        System.out.println(rs8.getString(1));
                        quetion=rs8.getString(1);
                        jLabel5.setText(quetion);
                    }
                    
                    java.sql.ResultSet rs9=str.executeQuery("SELECT quetion  FROM dataset WHERE qid='G1'");
                    if(rs9.next())
		    {
                        System.out.println(rs9.getString(1));
                        quetion=rs9.getString(1);
                        jLabel6.setText(quetion);
                    }
                    
                    java.sql.ResultSet rs10=str.executeQuery("SELECT quetion  FROM dataset WHERE qid='H1'");
                    if(rs10.next())
		    {
                        System.out.println(rs10.getString(1));
                        quetion=rs10.getString(1);
                        jLabel8.setText(quetion);
                    }
                    
                    java.sql.ResultSet rs11=str.executeQuery("SELECT quetion  FROM dataset WHERE qid='H1-2'");
                    if(rs11.next())
		    {
                        System.out.println(rs11.getString(1));
                        quetion=rs11.getString(1);
                        jLabel9.setText(quetion);
                    }
                    
                    
                    java.sql.ResultSet rs5=str.executeQuery("SELECT quetion  FROM dataset WHERE qid='H1-3'");
                    if(rs5.next())
		    {
                        System.out.println(rs5.getString(1));
                        quetion=rs5.getString(1);
                        jLabel10.setText(quetion);
                    }
                    
		    }
		    catch(Exception e)
		    {
                         System.out.println(e);  
		    }
        jLabel3.setVisible(false);r2.setVisible(false);r7.setVisible(false);
        jLabel4.setVisible(false);r3.setVisible(false);r8.setVisible(false);
        jLabel5.setVisible(false);r4.setVisible(false);r9.setVisible(false);
        jLabel6.setVisible(false);r5.setVisible(false);r10.setVisible(false);
        jLabel8.setVisible(false);r11.setVisible(false);r12.setVisible(false);
        jLabel9.setVisible(false);r13.setVisible(false);r14.setVisible(false);
        jLabel10.setVisible(false);r15.setVisible(false);r16.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        buttonGroup7 = new javax.swing.ButtonGroup();
        buttonGroup8 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        r1 = new javax.swing.JRadioButton();
        r6 = new javax.swing.JRadioButton();
        r2 = new javax.swing.JRadioButton();
        r7 = new javax.swing.JRadioButton();
        r3 = new javax.swing.JRadioButton();
        r8 = new javax.swing.JRadioButton();
        r9 = new javax.swing.JRadioButton();
        r4 = new javax.swing.JRadioButton();
        r5 = new javax.swing.JRadioButton();
        r10 = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        r11 = new javax.swing.JRadioButton();
        r12 = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        r13 = new javax.swing.JRadioButton();
        r14 = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        r15 = new javax.swing.JRadioButton();
        r16 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1375, 1678));

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText(" .....Check that you are suffring from following sympotoms.....");

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Some time you have bone pain?");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("You have more breathing dificulties?");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("You have abdominal or back pain from last few days?");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setText("You have chest pain from last 2-3 monts?");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setText("Some time you have speech dificulties?");

        buttonGroup1.add(r1);
        r1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        r1.setText("Yes");
        r1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(r6);
        r6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        r6.setText("No");
        r6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r6ActionPerformed(evt);
            }
        });

        buttonGroup2.add(r2);
        r2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        r2.setText("Yes");
        r2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r2ActionPerformed(evt);
            }
        });

        buttonGroup2.add(r7);
        r7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        r7.setText("No");
        r7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r7ActionPerformed(evt);
            }
        });

        buttonGroup3.add(r3);
        r3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        r3.setText("Yes");
        r3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r3ActionPerformed(evt);
            }
        });

        buttonGroup3.add(r8);
        r8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        r8.setText("No");
        r8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r8ActionPerformed(evt);
            }
        });

        buttonGroup4.add(r9);
        r9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        r9.setText("No");
        r9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r9ActionPerformed(evt);
            }
        });

        buttonGroup4.add(r4);
        r4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        r4.setText("Yes");
        r4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r4ActionPerformed(evt);
            }
        });

        buttonGroup5.add(r5);
        r5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        r5.setText("Yes");
        r5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r5ActionPerformed(evt);
            }
        });

        buttonGroup5.add(r10);
        r10.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        r10.setText("No");
        r10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r10ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setText("Some time you have speech dificulties?");

        buttonGroup6.add(r11);
        r11.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        r11.setText("Yes");
        r11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r11ActionPerformed(evt);
            }
        });

        buttonGroup6.add(r12);
        r12.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        r12.setText("No");
        r12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r12ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setText("Some time you have speech dificulties?");

        buttonGroup7.add(r13);
        r13.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        r13.setText("Yes");
        r13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r13ActionPerformed(evt);
            }
        });

        buttonGroup7.add(r14);
        r14.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        r14.setText("No");
        r14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r14ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel10.setText("Some time you have speech dificulties?");

        buttonGroup8.add(r15);
        r15.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        r15.setText("Yes");
        r15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r15ActionPerformed(evt);
            }
        });

        buttonGroup8.add(r16);
        r16.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        r16.setText("No");
        r16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r16ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(r2)
                    .addComponent(r3)
                    .addComponent(r5)
                    .addComponent(r11)
                    .addComponent(r13)
                    .addComponent(r15)
                    .addComponent(r4)
                    .addComponent(r1))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(r9)
                    .addComponent(r12)
                    .addComponent(r7)
                    .addComponent(r8)
                    .addComponent(r10)
                    .addComponent(r6)
                    .addComponent(r14)
                    .addComponent(r16))
                .addGap(181, 181, 181))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(r1)
                        .addComponent(r6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r2)
                    .addComponent(r7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r3)
                    .addComponent(r8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r4)
                    .addComponent(r9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r5)
                    .addComponent(r10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r11)
                    .addComponent(r12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r13)
                    .addComponent(r14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r15)
                    .addComponent(r16))
                .addContainerGap(61, Short.MAX_VALUE))
        );

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton1.setText("Next->");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 153)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton2.setText("<-Back");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 204)));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(160, 160, 160))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(239, 239, 239)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 31, Short.MAX_VALUE))
        );

        jPanel8.setBackground(new java.awt.Color(0, 204, 204));
        jPanel8.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel13.setText("Enhancing Performance of Medical Expert System by Crisp Logic");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 0, 0));
        jLabel7.setText("jLabel7");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(94, 94, 94)
                .addComponent(jLabel7)
                .addGap(40, 40, 40))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7))
                .addGap(6, 6, 6))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void r8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r8ActionPerformed
        // TODO add your handling code here:
        try
		    {
		     java.sql.Connection c=null;
		     c=JDBCTemplate.getConnection();
		     java.sql.Statement str=c.createStatement();
                     
		     str.execute("update result set F1_1='NO' where email='"+id+"'");
		     System.out.println("update F1_1 with NO by basic qution 2  ");
                     
                     java.sql.ResultSet rs3=str.executeQuery("SELECT F1_1  FROM result WHERE email='"+id+"'");
		    if(rs3.next())
		      {
                        System.out.println(rs3.getString(1));
                        
                      }
                    
		    }
		    catch(Exception e)
		    {
                         System.out.println(e);  
		    }
        jLabel6.setVisible(true);r5.setVisible(true);r10.setVisible(true);
    }//GEN-LAST:event_r8ActionPerformed

    private void r4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r4ActionPerformed
        // TODO add your handling code here:
        try
		    {
		     java.sql.Connection c=null;
		     c=JDBCTemplate.getConnection();
		     java.sql.Statement str=c.createStatement();
                     
		     str.execute("update result set F1_2='YES' where email='"+id+"'");
		     System.out.println("update F1_2 with YES by basic qution 2  ");
                     
                     java.sql.ResultSet rs3=str.executeQuery("SELECT F1_2  FROM result WHERE email='"+id+"'");
		    if(rs3.next())
		      {
                        System.out.println(rs3.getString(1));
                        
                      }
                    
		    }
		    catch(Exception e)
		    {
                         System.out.println(e);  
		    }
        jLabel6.setVisible(true);r5.setVisible(true);r10.setVisible(true);
    }//GEN-LAST:event_r4ActionPerformed

    private void r9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r9ActionPerformed
        // TODO add your handling code here:
        try
		    {
		     java.sql.Connection c=null;
		     c=JDBCTemplate.getConnection();
		     java.sql.Statement str=c.createStatement();
                     
		     str.execute("update result set F1_2='NO' where email='"+id+"'");
		     System.out.println("update F1_2 with NO by basic qution 2  ");
                     
                     java.sql.ResultSet rs3=str.executeQuery("SELECT F1_2  FROM result WHERE email='"+id+"'");
		    if(rs3.next())
		      {
                        System.out.println(rs3.getString(1));
                        
                      }
                    
		    }
		    catch(Exception e)
		    {
                         System.out.println(e);  
		    }
        jLabel6.setVisible(true);r5.setVisible(true);r10.setVisible(true);
    }//GEN-LAST:event_r9ActionPerformed

    private void r5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r5ActionPerformed
        // TODO add your handling code here:
        try
		    {
		     java.sql.Connection c=null;
		     c=JDBCTemplate.getConnection();
		     java.sql.Statement str=c.createStatement();
                     
		     str.execute("update result set G1='YES' where email='"+id+"'");
		     System.out.println("update G1 with YES by basic qution 2  ");
                     
                     java.sql.ResultSet rs3=str.executeQuery("SELECT G1  FROM result WHERE email='"+id+"'");
		    if(rs3.next())
		      {
                        System.out.println(rs3.getString(1));
                        
                      }
                    
		    }
		    catch(Exception e)
		    {
                         System.out.println(e);  
		    }
        jLabel8.setVisible(true);r11.setVisible(true);r12.setVisible(true);
    }//GEN-LAST:event_r5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
           dispose();
         new BasicTest(id).setVisible(true);
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        dispose();
        
        new AdvanceQuetions1(id).setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void r11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r11ActionPerformed
        // TODO add your handling code here:
        try
		    {
		     java.sql.Connection c=null;
		     c=JDBCTemplate.getConnection();
		     java.sql.Statement str=c.createStatement();
                     
		     str.execute("update result set H1='YES' where email='"+id+"'");
		     System.out.println("update H1 with YES by basic qution 2  ");
                     
                     java.sql.ResultSet rs3=str.executeQuery("SELECT H1  FROM result WHERE email='"+id+"'");
		    if(rs3.next())
		      {
                        System.out.println(rs3.getString(1));
                        
                      }
                    
		    }
		    catch(Exception e)
		    {
                         System.out.println(e);  
		    }
        jLabel9.setVisible(true);r13.setVisible(true);r14.setVisible(true);
    }//GEN-LAST:event_r11ActionPerformed

    private void r13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r13ActionPerformed
        // TODO add your handling code here:
        try
		    {
		     java.sql.Connection c=null;
		     c=JDBCTemplate.getConnection();
		     java.sql.Statement str=c.createStatement();
                     
		     str.execute("update result set H1_2='YES' where email='"+id+"'");
		     System.out.println("update H1_2 with YES by basic qution 2  ");
                     
                     java.sql.ResultSet rs3=str.executeQuery("SELECT H1_2  FROM result WHERE email='"+id+"'");
		    if(rs3.next())
		      {
                        System.out.println(rs3.getString(1));
                        
                      }
                    
		    }
		    catch(Exception e)
		    {
                         System.out.println(e);  
		    }
        jLabel10.setVisible(true);r15.setVisible(true);r16.setVisible(true);
    }//GEN-LAST:event_r13ActionPerformed

    private void r15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r15ActionPerformed
        // TODO add your handling code here:
        try
		    {
		     java.sql.Connection c=null;
		     c=JDBCTemplate.getConnection();
		     java.sql.Statement str=c.createStatement();
                     
		     str.execute("update result set H1_3='YES' where email='"+id+"'");
		     System.out.println("update H1_3 with YES by basic qution 2  ");
                     
                     java.sql.ResultSet rs3=str.executeQuery("SELECT H1_3  FROM result WHERE email='"+id+"'");
		    if(rs3.next())
		      {
                        System.out.println(rs3.getString(1));
                        
                      }
                    
		    }
		    catch(Exception e)
		    {
                         System.out.println(e);  
		    }
    }//GEN-LAST:event_r15ActionPerformed

    private void r1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r1ActionPerformed
        // TODO add your handling code here:
        try
		    {
		     java.sql.Connection c=null;
		     c=JDBCTemplate.getConnection();
		     java.sql.Statement str=c.createStatement();
                     
		     str.execute("update result set E1='YES' where email='"+id+"'");
		     System.out.println("update E1 with YES by basic qution 2  ");
                     
                     java.sql.ResultSet rs3=str.executeQuery("SELECT E1  FROM result WHERE email='"+id+"'");
		    if(rs3.next())
		      {
                        System.out.println(rs3.getString(1));
                        
                      }
                    
		    }
		    catch(Exception e)
		    {
                         System.out.println(e);  
		    }
        jLabel3.setVisible(true);r2.setVisible(true);r7.setVisible(true);
    }//GEN-LAST:event_r1ActionPerformed

    private void r6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r6ActionPerformed
        // TODO add your handling code here:
        try
		    {
		     java.sql.Connection c=null;
		     c=JDBCTemplate.getConnection();
		     java.sql.Statement str=c.createStatement();
                     
		     str.execute("update result set E1='NO' where email='"+id+"'");
		     System.out.println("update E1 with NO by basic qution 2  ");
                     
                     java.sql.ResultSet rs3=str.executeQuery("SELECT E1  FROM result WHERE email='"+id+"'");
		    if(rs3.next())
		      {
                        System.out.println(rs3.getString(1));
                        
                      }
                    
		    }
		    catch(Exception e)
		    {
                         System.out.println(e);  
		    }
        jLabel3.setVisible(true);r2.setVisible(true);r7.setVisible(true);
    }//GEN-LAST:event_r6ActionPerformed

    private void r2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r2ActionPerformed
        // TODO add your handling code here:
        try
		    {
		     java.sql.Connection c=null;
		     c=JDBCTemplate.getConnection();
		     java.sql.Statement str=c.createStatement();
                     
		     str.execute("update result set F1='YES' where email='"+id+"'");
		     System.out.println("update F1 with YES by basic qution 2  ");
                     
                     java.sql.ResultSet rs3=str.executeQuery("SELECT F1  FROM result WHERE email='"+id+"'");
		    if(rs3.next())
		      {
                        System.out.println(rs3.getString(1));
                        
                      }
                    
		    }
		    catch(Exception e)
		    {
                         System.out.println(e);  
		    }
        jLabel4.setVisible(true);r3.setVisible(true);r8.setVisible(true);
        jLabel5.setVisible(false);r4.setVisible(false);r9.setVisible(false);
    }//GEN-LAST:event_r2ActionPerformed

    private void r7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r7ActionPerformed
        // TODO add your handling code here:
        try
		    {
		     java.sql.Connection c=null;
		     c=JDBCTemplate.getConnection();
		     java.sql.Statement str=c.createStatement();
                     
		     str.execute("update result set F1='NO' where email='"+id+"'");
		     System.out.println("update F1 with NO by basic qution 2  ");
                     
                     java.sql.ResultSet rs3=str.executeQuery("SELECT F1  FROM result WHERE email='"+id+"'");
		    if(rs3.next())
		      {
                        System.out.println(rs3.getString(1));
                        
                      }
                    
		    }
		    catch(Exception e)
		    {
                         System.out.println(e);  
		    }
        jLabel5.setVisible(true);r4.setVisible(true);r9.setVisible(true);
        jLabel4.setVisible(false);r3.setVisible(false);r8.setVisible(false);
    }//GEN-LAST:event_r7ActionPerformed

    private void r3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r3ActionPerformed
        // TODO add your handling code here:
        try
		    {
		     java.sql.Connection c=null;
		     c=JDBCTemplate.getConnection();
		     java.sql.Statement str=c.createStatement();
                     
		     str.execute("update result set F1_1='YES' where email='"+id+"'");
		     System.out.println("update F1_1 with YES by basic qution 2  ");
                     
                     java.sql.ResultSet rs3=str.executeQuery("SELECT F1_1  FROM result WHERE email='"+id+"'");
		    if(rs3.next())
		      {
                        System.out.println(rs3.getString(1));
                        
                      }
                    
		    }
		    catch(Exception e)
		    {
                         System.out.println(e);  
		    }
        jLabel6.setVisible(true);r5.setVisible(true);r10.setVisible(true);
    }//GEN-LAST:event_r3ActionPerformed

    private void r10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r10ActionPerformed
        // TODO add your handling code here:
        try
		    {
		     java.sql.Connection c=null;
		     c=JDBCTemplate.getConnection();
		     java.sql.Statement str=c.createStatement();
                     
		     str.execute("update result set G1='NO' where email='"+id+"'");
		     System.out.println("update G1 with NO by basic qution 2  ");
                     
                     java.sql.ResultSet rs3=str.executeQuery("SELECT G1  FROM result WHERE email='"+id+"'");
		    if(rs3.next())
		      {
                        System.out.println(rs3.getString(1));
                        
                      }
                    
		    }
		    catch(Exception e)
		    {
                         System.out.println(e);  
		    }
        jLabel8.setVisible(true);r11.setVisible(true);r12.setVisible(true);
    }//GEN-LAST:event_r10ActionPerformed

    private void r12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r12ActionPerformed
        // TODO add your handling code here:
        try
		    {
		     java.sql.Connection c=null;
		     c=JDBCTemplate.getConnection();
		     java.sql.Statement str=c.createStatement();
                     
		     str.execute("update result set H1='NO' where email='"+id+"'");
		     System.out.println("update H1 with NO by basic qution 2  ");
                     
                     java.sql.ResultSet rs3=str.executeQuery("SELECT H1  FROM result WHERE email='"+id+"'");
		    if(rs3.next())
		      {
                        System.out.println(rs3.getString(1));
                        
                      }
                    
		    }
		    catch(Exception e)
		    {
                         System.out.println(e);  
		    }
        jLabel9.setVisible(false);r13.setVisible(false);r14.setVisible(false);
        jLabel10.setVisible(false);r15.setVisible(false);r16.setVisible(false);
    }//GEN-LAST:event_r12ActionPerformed

    private void r16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r16ActionPerformed
        // TODO add your handling code here:
        try
		    {
		     java.sql.Connection c=null;
		     c=JDBCTemplate.getConnection();
		     java.sql.Statement str=c.createStatement();
                     
		     str.execute("update result set H1_3='NO' where email='"+id+"'");
		     System.out.println("update H1_3 with NO by basic qution 2  ");
                     
                     java.sql.ResultSet rs3=str.executeQuery("SELECT H1_3  FROM result WHERE email='"+id+"'");
		    if(rs3.next())
		      {
                        System.out.println(rs3.getString(1));
                        
                      }
                    
		    }
		    catch(Exception e)
		    {
                         System.out.println(e);  
		    }
    }//GEN-LAST:event_r16ActionPerformed

    private void r14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r14ActionPerformed
        // TODO add your handling code here:
        try
		    {
		     java.sql.Connection c=null;
		     c=JDBCTemplate.getConnection();
		     java.sql.Statement str=c.createStatement();
                     
		     str.execute("update result set H1_2='NO' where email='"+id+"'");
		     System.out.println("update H1_2 with NO by basic qution 2  ");
                     
                     java.sql.ResultSet rs3=str.executeQuery("SELECT H1_2  FROM result WHERE email='"+id+"'");
		    if(rs3.next())
		      {
                        System.out.println(rs3.getString(1));
                        
                      }
                    
		    }
		    catch(Exception e)
		    {
                         System.out.println(e);  
		    }
        jLabel10.setVisible(true);r15.setVisible(true);r16.setVisible(true);
    }//GEN-LAST:event_r14ActionPerformed

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
            java.util.logging.Logger.getLogger(AdvancedQuetions2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdvancedQuetions2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdvancedQuetions2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdvancedQuetions2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                //new AdvancedQuetions2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.ButtonGroup buttonGroup7;
    private javax.swing.ButtonGroup buttonGroup8;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
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
    private javax.swing.JPanel jPanel8;
    private javax.swing.JRadioButton r1;
    private javax.swing.JRadioButton r10;
    private javax.swing.JRadioButton r11;
    private javax.swing.JRadioButton r12;
    private javax.swing.JRadioButton r13;
    private javax.swing.JRadioButton r14;
    private javax.swing.JRadioButton r15;
    private javax.swing.JRadioButton r16;
    private javax.swing.JRadioButton r2;
    private javax.swing.JRadioButton r3;
    private javax.swing.JRadioButton r4;
    private javax.swing.JRadioButton r5;
    private javax.swing.JRadioButton r6;
    private javax.swing.JRadioButton r7;
    private javax.swing.JRadioButton r8;
    private javax.swing.JRadioButton r9;
    // End of variables declaration//GEN-END:variables
}
