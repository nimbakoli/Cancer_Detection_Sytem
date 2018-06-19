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
public class DetectTypeQuetions extends javax.swing.JFrame {

    /**
     * Creates new form TypesOfCancer
     */
    String id,name,quetion;
    int f1=0,f2=0,fv=0;
    public DetectTypeQuetions(String ID) {
        initComponents();
        id=new String(ID);
        System.out.println("detect type qutions user = "+id);
        
        
        try
		    {
		     java.sql.Connection c=null;
		     c=JDBCTemplate.getConnection();
		     java.sql.Statement str=c.createStatement();
                     
		     str.execute("update user set win_status=7 where email='"+id+"'");
		     System.out.println("update win status with 7 by detectype qutions");
                     
                     java.sql.ResultSet rs3=str.executeQuery("SELECT name  FROM user WHERE email='"+id+"'");
		    if(rs3.next())
		    {
                        System.out.println(rs3.getString(1));
                        name=rs3.getString(1);
                        jLabel4.setText(name);
                    }
                    
                    java.sql.ResultSet rs4=str.executeQuery("SELECT quetion  FROM dataset WHERE qid='I1'");
                    if(rs4.next())
		    {
                        System.out.println(rs4.getString(1));
                        quetion=rs4.getString(1);
                        jLabel5.setText(quetion);
                    }
                    
                    java.sql.ResultSet rs5=str.executeQuery("SELECT quetion  FROM dataset WHERE qid='I2'");
                    if(rs5.next())
		    {
                        System.out.println(rs5.getString(1));
                        quetion=rs5.getString(1);
                        jLabel6.setText(quetion);
                    }
                    
                    java.sql.ResultSet rs6=str.executeQuery("SELECT quetion  FROM dataset WHERE qid='I3'");
                    if(rs6.next())
		    {
                        System.out.println(rs6.getString(1));
                        quetion=rs6.getString(1);
                        jLabel7.setText(quetion);
                    }
                    
                    java.sql.ResultSet rs7=str.executeQuery("SELECT quetion  FROM dataset WHERE qid='I4'");
                    if(rs7.next())
		    {
                        System.out.println(rs7.getString(1));
                        quetion=rs7.getString(1);
                        jLabel8.setText(quetion);
                    }
                    
                    java.sql.ResultSet rs8=str.executeQuery("SELECT quetion  FROM dataset WHERE qid='I5'");
                    if(rs8.next())
		    {
                        System.out.println(rs8.getString(1));
                        quetion=rs8.getString(1);
                        jLabel9.setText(quetion);
                    }
                    
                    java.sql.ResultSet rs9=str.executeQuery("SELECT quetion  FROM dataset WHERE qid='I6'");
                    if(rs9.next())
		    {
                        System.out.println(rs9.getString(1));
                        quetion=rs9.getString(1);
                        jLabel10.setText(quetion);
                    }
                    
                    java.sql.ResultSet rs10=str.executeQuery("SELECT quetion  FROM dataset WHERE qid='I7'");
                    if(rs10.next())
		    {
                        System.out.println(rs10.getString(1));
                        quetion=rs10.getString(1);
                        jLabel11.setText(quetion);
                    }
                    
                    java.sql.ResultSet rs11=str.executeQuery("SELECT quetion  FROM dataset WHERE qid='I8'");
                    if(rs11.next())
		    {
                        System.out.println(rs11.getString(1));
                        quetion=rs11.getString(1);
                        jLabel13.setText(quetion);
                    }
                    
                    java.sql.ResultSet rs12=str.executeQuery("SELECT quetion  FROM dataset WHERE qid='I9'");
                    if(rs12.next())
		    {
                        System.out.println(rs12.getString(1));
                        quetion=rs12.getString(1);
                        jLabel14.setText(quetion);
                    }
                    
                    java.sql.ResultSet rs13=str.executeQuery("SELECT quetion  FROM dataset WHERE qid='I10'");
                    if(rs13.next())
		    {
                        System.out.println(rs13.getString(1));
                        quetion=rs13.getString(1);
                        jLabel15.setText(quetion);
                    }
                    
                    java.sql.ResultSet rs14=str.executeQuery("SELECT quetion  FROM dataset WHERE qid='I11'");
                    if(rs14.next())
		    {
                        System.out.println(rs14.getString(1));
                        quetion=rs14.getString(1);
                        jLabel17.setText(quetion);
                    }
                    
                    java.sql.ResultSet rs15=str.executeQuery("SELECT quetion  FROM dataset WHERE qid='I12'");
                    if(rs15.next())
		    {
                        System.out.println(rs15.getString(1));
                        quetion=rs15.getString(1);
                        jLabel18.setText(quetion);
                    }
                    
                    java.sql.ResultSet rs16=str.executeQuery("SELECT quetion  FROM dataset WHERE qid='I13'");
                    if(rs16.next())
		    {
                        System.out.println(rs16.getString(1));
                        quetion=rs16.getString(1);
                        jLabel21.setText(quetion);
                    }
                    
                    java.sql.ResultSet rs17=str.executeQuery("SELECT quetion  FROM dataset WHERE qid='I14'");
                    if(rs17.next())
		    {
                        System.out.println(rs17.getString(1));
                        quetion=rs17.getString(1);
                        jLabel22.setText(quetion);
                    }
                    
                    java.sql.ResultSet rs18=str.executeQuery("SELECT quetion  FROM dataset WHERE qid='I15'");
                    if(rs18.next())
		    {
                        System.out.println(rs18.getString(1));
                        quetion=rs18.getString(1);
                        jLabel23.setText(quetion);
                    }
                    
                    java.sql.ResultSet rs19=str.executeQuery("SELECT quetion  FROM dataset WHERE qid='I16'");
                    if(rs19.next())
		    {
                        System.out.println(rs19.getString(1));
                        quetion=rs19.getString(1);
                        jLabel24.setText(quetion);
                    }
                    
		    }
		    catch(Exception e)
		    {
                         System.out.println(e);  
		    }
        
        jLabel6.setVisible(false);t2.setVisible(false);p2.setVisible(false);
        jLabel7.setVisible(false);t3.setVisible(false);p3.setVisible(false);
        jLabel8.setVisible(false);t4.setVisible(false);p4.setVisible(false);
        jLabel9.setVisible(false);t5.setVisible(false);p5.setVisible(false);
        jLabel10.setVisible(false);t6.setVisible(false);p6.setVisible(false);
        jLabel11.setVisible(false);t7.setVisible(false);p7.setVisible(false);
        jLabel13.setVisible(false);t8.setVisible(false);p8.setVisible(false);
        jLabel14.setVisible(false);t9.setVisible(false);p9.setVisible(false);
        jLabel15.setVisible(false);t10.setVisible(false);p10.setVisible(false);
        jLabel17.setVisible(false);t11.setVisible(false);p11.setVisible(false);
        jLabel18.setVisible(false);t12.setVisible(false);p12.setVisible(false);
        jLabel21.setVisible(false);t13.setVisible(false);p13.setVisible(false);
        jLabel22.setVisible(false);t14.setVisible(false);p14.setVisible(false);
        jLabel23.setVisible(false);t15.setVisible(false);p15.setVisible(false);
        jLabel24.setVisible(false);t16.setVisible(false);p16.setVisible(false);
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
        buttonGroup9 = new javax.swing.ButtonGroup();
        buttonGroup10 = new javax.swing.ButtonGroup();
        buttonGroup11 = new javax.swing.ButtonGroup();
        buttonGroup12 = new javax.swing.ButtonGroup();
        buttonGroup13 = new javax.swing.ButtonGroup();
        buttonGroup14 = new javax.swing.ButtonGroup();
        buttonGroup15 = new javax.swing.ButtonGroup();
        buttonGroup16 = new javax.swing.ButtonGroup();
        jPanel4 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        t1 = new javax.swing.JRadioButton();
        p1 = new javax.swing.JRadioButton();
        t2 = new javax.swing.JRadioButton();
        p2 = new javax.swing.JRadioButton();
        t3 = new javax.swing.JRadioButton();
        p3 = new javax.swing.JRadioButton();
        t4 = new javax.swing.JRadioButton();
        p4 = new javax.swing.JRadioButton();
        t5 = new javax.swing.JRadioButton();
        p5 = new javax.swing.JRadioButton();
        t6 = new javax.swing.JRadioButton();
        p6 = new javax.swing.JRadioButton();
        t7 = new javax.swing.JRadioButton();
        p7 = new javax.swing.JRadioButton();
        t8 = new javax.swing.JRadioButton();
        p8 = new javax.swing.JRadioButton();
        t9 = new javax.swing.JRadioButton();
        p9 = new javax.swing.JRadioButton();
        t10 = new javax.swing.JRadioButton();
        p10 = new javax.swing.JRadioButton();
        t11 = new javax.swing.JRadioButton();
        p11 = new javax.swing.JRadioButton();
        t12 = new javax.swing.JRadioButton();
        p12 = new javax.swing.JRadioButton();
        t13 = new javax.swing.JRadioButton();
        p13 = new javax.swing.JRadioButton();
        t14 = new javax.swing.JRadioButton();
        p14 = new javax.swing.JRadioButton();
        t15 = new javax.swing.JRadioButton();
        p15 = new javax.swing.JRadioButton();
        t16 = new javax.swing.JRadioButton();
        p16 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1375, 1678));

        jPanel4.setBackground(new java.awt.Color(0, 204, 204));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel16.setText("Enhancing Performance of Medical Expert System by Crisp Logic");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText("jLabel4");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(74, 74, 74)
                .addComponent(jLabel4)
                .addGap(60, 60, 60))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4))
                .addContainerGap())
        );

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText(".....As your responce to system you are suffering from lung cancer, There are two types of Lung Cancer..... ");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("               .....To know what type of lung cancer you have? Answer the following questions.....");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setText("jLabel5");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setText("jLabel6");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setText("jLabel7");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setText("jLabel8");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel10.setText("jLabel10");

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel11.setText("jLabel11");

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel13.setText("jLabel13");

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel14.setText("jLabel14");

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel15.setText("jLabel15");

        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel17.setText("jLabel17");

        jLabel18.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel18.setText("jLabel18");

        jLabel21.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel21.setText("jLabel21");

        jLabel22.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel22.setText("jLabel22");

        jLabel23.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel23.setText("jLabel23");

        jLabel24.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel24.setText("jLabel24");

        jPanel2.setBackground(new java.awt.Color(255, 204, 204));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 186, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 659, Short.MAX_VALUE)
        );

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setText("jLabel9");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Next->");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255), 2));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("<-Back");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 255), 2));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(t1);
        t1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        t1.setText("Yes");
        t1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(p1);
        p1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        p1.setText("No");
        p1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p1ActionPerformed(evt);
            }
        });

        buttonGroup10.add(t2);
        t2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        t2.setText("Yes");
        t2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t2ActionPerformed(evt);
            }
        });

        buttonGroup10.add(p2);
        p2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        p2.setText("No");
        p2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p2ActionPerformed(evt);
            }
        });

        buttonGroup11.add(t3);
        t3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        t3.setText("Yes");
        t3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t3ActionPerformed(evt);
            }
        });

        buttonGroup11.add(p3);
        p3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        p3.setText("No");
        p3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p3ActionPerformed(evt);
            }
        });

        buttonGroup12.add(t4);
        t4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        t4.setText("Yes");
        t4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t4ActionPerformed(evt);
            }
        });

        buttonGroup12.add(p4);
        p4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        p4.setText("No");
        p4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p4ActionPerformed(evt);
            }
        });

        buttonGroup13.add(t5);
        t5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        t5.setText("Yes");
        t5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t5ActionPerformed(evt);
            }
        });

        buttonGroup13.add(p5);
        p5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        p5.setText("No");
        p5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p5ActionPerformed(evt);
            }
        });

        buttonGroup14.add(t6);
        t6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        t6.setText("Yes");
        t6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t6ActionPerformed(evt);
            }
        });

        buttonGroup14.add(p6);
        p6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        p6.setText("No");
        p6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p6ActionPerformed(evt);
            }
        });

        buttonGroup15.add(t7);
        t7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        t7.setText("Yes");
        t7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t7ActionPerformed(evt);
            }
        });

        buttonGroup15.add(p7);
        p7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        p7.setText("No");
        p7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p7ActionPerformed(evt);
            }
        });

        buttonGroup16.add(t8);
        t8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        t8.setText("Yes");
        t8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t8ActionPerformed(evt);
            }
        });

        buttonGroup16.add(p8);
        p8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        p8.setText("No");
        p8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p8ActionPerformed(evt);
            }
        });

        buttonGroup2.add(t9);
        t9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        t9.setText("Yes");
        t9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t9ActionPerformed(evt);
            }
        });

        buttonGroup2.add(p9);
        p9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        p9.setText("No");
        p9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p9ActionPerformed(evt);
            }
        });

        buttonGroup3.add(t10);
        t10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        t10.setText("Yes");
        t10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t10ActionPerformed(evt);
            }
        });

        buttonGroup3.add(p10);
        p10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        p10.setText("No");
        p10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p10ActionPerformed(evt);
            }
        });

        buttonGroup4.add(t11);
        t11.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        t11.setText("Yes");
        t11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t11ActionPerformed(evt);
            }
        });

        buttonGroup4.add(p11);
        p11.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        p11.setText("No");
        p11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p11ActionPerformed(evt);
            }
        });

        buttonGroup5.add(t12);
        t12.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        t12.setText("Yes");
        t12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t12ActionPerformed(evt);
            }
        });

        buttonGroup5.add(p12);
        p12.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        p12.setText("No");
        p12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p12ActionPerformed(evt);
            }
        });

        buttonGroup6.add(t13);
        t13.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        t13.setText("Yes");
        t13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t13ActionPerformed(evt);
            }
        });

        buttonGroup6.add(p13);
        p13.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        p13.setText("No");
        p13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p13ActionPerformed(evt);
            }
        });

        buttonGroup7.add(t14);
        t14.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        t14.setText("Yes");
        t14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t14ActionPerformed(evt);
            }
        });

        buttonGroup7.add(p14);
        p14.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        p14.setText("No");
        p14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p14ActionPerformed(evt);
            }
        });

        buttonGroup8.add(t15);
        t15.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        t15.setText("Yes");
        t15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t15ActionPerformed(evt);
            }
        });

        buttonGroup8.add(p15);
        p15.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        p15.setText("No");
        p15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p15ActionPerformed(evt);
            }
        });

        buttonGroup9.add(t16);
        t16.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        t16.setText("Yes");
        t16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t16ActionPerformed(evt);
            }
        });

        buttonGroup9.add(p16);
        p16.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        p16.setText("No");
        p16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p16ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 726, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(t1)
                                        .addGap(18, 18, 18)
                                        .addComponent(p1))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(t2)
                                        .addGap(18, 18, 18)
                                        .addComponent(p2))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(t3)
                                        .addGap(18, 18, 18)
                                        .addComponent(p3))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(t4)
                                        .addGap(18, 18, 18)
                                        .addComponent(p4))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(t5)
                                        .addGap(18, 18, 18)
                                        .addComponent(p5))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(t6)
                                        .addGap(18, 18, 18)
                                        .addComponent(p6))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(t7)
                                        .addGap(18, 18, 18)
                                        .addComponent(p7))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(t8)
                                        .addGap(18, 18, 18)
                                        .addComponent(p8))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(t9)
                                        .addGap(18, 18, 18)
                                        .addComponent(p9))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(t10)
                                        .addGap(18, 18, 18)
                                        .addComponent(p10))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(t11)
                                        .addGap(18, 18, 18)
                                        .addComponent(p11))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(t12)
                                        .addGap(18, 18, 18)
                                        .addComponent(p12))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(t13)
                                        .addGap(18, 18, 18)
                                        .addComponent(p13))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(t14)
                                        .addGap(18, 18, 18)
                                        .addComponent(p14))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(t15)
                                        .addGap(18, 18, 18)
                                        .addComponent(p15))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(t16)
                                        .addGap(18, 18, 18)
                                        .addComponent(p16)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(41, 41, 41))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(399, 399, 399)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(44, 44, 44)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(t1)
                                            .addComponent(p1))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(t2)
                                            .addComponent(p2))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(t3)
                                            .addComponent(p3))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(t4)
                                            .addComponent(p4))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(t5)
                                            .addComponent(p5))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(t6)
                                            .addComponent(p6))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(t7)
                                            .addComponent(p7))
                                        .addGap(13, 13, 13)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(t8)
                                            .addComponent(p8))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(t9)
                                            .addComponent(p9))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(t10)
                                            .addComponent(p10))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(t11)
                                            .addComponent(p11))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(t12)
                                        .addComponent(p12)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(t13)
                                    .addComponent(p13))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(t14)
                                    .addComponent(p14))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(t15)
                                .addComponent(p15)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(t16)
                                .addComponent(p16)))))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(165, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1125, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 779, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void p1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p1ActionPerformed
        // TODO add your handling code here:
        
        try
		    {
		     java.sql.Connection c=null;
		     c=JDBCTemplate.getConnection();
		     java.sql.Statement str=c.createStatement();
                     
		     str.execute("update result set I1='NO' where email='"+id+"'");
		     System.out.println("update I1 with NO by type detection  ");
                     
                     java.sql.ResultSet rs3=str.executeQuery("SELECT I1  FROM result WHERE email='"+id+"'");
		    if(rs3.next())
		      {
                        System.out.println(rs3.getString(1));
                        
                      }
                    
		    }
		    catch(Exception e)
		    {
                         System.out.println(e);  
		    }
        
        if(p1.isSelected())
            fv++;
        System.out.println("p1="+fv);
        
        jLabel6.setVisible(true);t2.setVisible(true);p2.setVisible(true);
    }//GEN-LAST:event_p1ActionPerformed

    private void p2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p2ActionPerformed
        // TODO add your handling code here:
        try
		    {
		     java.sql.Connection c=null;
		     c=JDBCTemplate.getConnection();
		     java.sql.Statement str=c.createStatement();
                     
		     str.execute("update result set I2='NO' where email='"+id+"'");
		     System.out.println("update I2 with NO by type detection  ");
                     
                     java.sql.ResultSet rs3=str.executeQuery("SELECT I2  FROM result WHERE email='"+id+"'");
		    if(rs3.next())
		      {
                        System.out.println(rs3.getString(1));
                        
                      }
                    
		    }
		    catch(Exception e)
		    {
                         System.out.println(e);  
		    }
        
        if(p2.isSelected())
            fv++;
        System.out.println("p2="+fv);
        
        jLabel7.setVisible(true);t3.setVisible(true);p3.setVisible(true);
    }//GEN-LAST:event_p2ActionPerformed

    private void t1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t1ActionPerformed
        // TODO add your handling code here:
        
        try
		    {
		     java.sql.Connection c=null;
		     c=JDBCTemplate.getConnection();
		     java.sql.Statement str=c.createStatement();
                     
		     str.execute("update result set I1='YES' where email='"+id+"'");
		     System.out.println("update I1 with YES by type detection  ");
                     
                     java.sql.ResultSet rs3=str.executeQuery("SELECT I1  FROM result WHERE email='"+id+"'");
		    if(rs3.next())
		      {
                        System.out.println(rs3.getString(1));
                        
                      }
                    
		    }
		    catch(Exception e)
		    {
                         System.out.println(e);  
		    }
        
        if(t1.isSelected())
           f1++;
        System.out.println("t1="+f1);
        jLabel6.setVisible(true);t2.setVisible(true);p2.setVisible(true);
    }//GEN-LAST:event_t1ActionPerformed

    private void t2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t2ActionPerformed
        // TODO add your handling code here:
        
        try
		    {
		     java.sql.Connection c=null;
		     c=JDBCTemplate.getConnection();
		     java.sql.Statement str=c.createStatement();
                     
		     str.execute("update result set I2='YES' where email='"+id+"'");
		     System.out.println("update I2 with YES by type detection  ");
                     
                     java.sql.ResultSet rs3=str.executeQuery("SELECT I2  FROM result WHERE email='"+id+"'");
		    if(rs3.next())
		      {
                        System.out.println(rs3.getString(1));
                        
                      }
                    
		    }
		    catch(Exception e)
		    {
                         System.out.println(e);  
		    }
        
        if(t2.isSelected())
           f1++;
        
        System.out.println("t2="+f1);
        
        jLabel7.setVisible(true);t3.setVisible(true);p3.setVisible(true);
    }//GEN-LAST:event_t2ActionPerformed

    private void t3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t3ActionPerformed
        // TODO add your handling code here:
        
        try
		    {
		     java.sql.Connection c=null;
		     c=JDBCTemplate.getConnection();
		     java.sql.Statement str=c.createStatement();
                     
		     str.execute("update result set I3='YES' where email='"+id+"'");
		     System.out.println("update I3 with YES by type detection  ");
                     
                     java.sql.ResultSet rs3=str.executeQuery("SELECT I3  FROM result WHERE email='"+id+"'");
		    if(rs3.next())
		      {
                        System.out.println(rs3.getString(1));
                        
                      }
                    
		    }
		    catch(Exception e)
		    {
                         System.out.println(e);  
		    }
        
        if(t3.isSelected())
           f1++;
        
        System.out.println("t3="+f1);
        
        jLabel8.setVisible(true);t4.setVisible(true);p4.setVisible(true);
    }//GEN-LAST:event_t3ActionPerformed

    private void t8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t8ActionPerformed
        // TODO add your handling code here:
        
        try
		    {
		     java.sql.Connection c=null;
		     c=JDBCTemplate.getConnection();
		     java.sql.Statement str=c.createStatement();
                     
		     str.execute("update result set I8='YES' where email='"+id+"'");
		     System.out.println("update I8 with YES by type detection  ");
                     
                     java.sql.ResultSet rs3=str.executeQuery("SELECT I8  FROM result WHERE email='"+id+"'");
		    if(rs3.next())
		      {
                        System.out.println(rs3.getString(1));
                        
                      }
                    
		    }
		    catch(Exception e)
		    {
                         System.out.println(e);  
		    }
        
        if(t8.isSelected())
            f1++;
        
        System.out.println("T8 f1="+f1);
        
         if(f1<5)
        {
          jLabel14.setVisible(true);t9.setVisible(true);p9.setVisible(true);
        }
        
        
    }//GEN-LAST:event_t8ActionPerformed

    private void p6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p6ActionPerformed
        // TODO add your handling code here:
        
        try
		    {
		     java.sql.Connection c=null;
		     c=JDBCTemplate.getConnection();
		     java.sql.Statement str=c.createStatement();
                     
		     str.execute("update result set I6='NO' where email='"+id+"'");
		     System.out.println("update I6 with NO by type detection  ");
                     
                     java.sql.ResultSet rs3=str.executeQuery("SELECT I6  FROM result WHERE email='"+id+"'");
		    if(rs3.next())
		      {
                        System.out.println(rs3.getString(1));
                        
                      }
                    
		    }
		    catch(Exception e)
		    {
                         System.out.println(e);  
		    }
        
        if(p6.isSelected())
            fv++;
        System.out.println("p6="+fv);
        
        jLabel11.setVisible(true);t7.setVisible(true);p7.setVisible(true);
    }//GEN-LAST:event_p6ActionPerformed

    private void p4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p4ActionPerformed
        // TODO add your handling code here:
        
        try
		    {
		     java.sql.Connection c=null;
		     c=JDBCTemplate.getConnection();
		     java.sql.Statement str=c.createStatement();
                     
		     str.execute("update result set I4='NO' where email='"+id+"'");
		     System.out.println("update I4 with NO by type detection  ");
                     
                     java.sql.ResultSet rs3=str.executeQuery("SELECT I4  FROM result WHERE email='"+id+"'");
		    if(rs3.next())
		      {
                        System.out.println(rs3.getString(1));
                        
                      }
                    
		    }
		    catch(Exception e)
		    {
                         System.out.println(e);  
		    }
        
        if(p4.isSelected())
            fv++;
        System.out.println("p4="+fv);
        
        jLabel9.setVisible(true);t5.setVisible(true);p5.setVisible(true);
    }//GEN-LAST:event_p4ActionPerformed

    private void t7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t7ActionPerformed
        // TODO add your handling code here:
        
        try
		    {
		     java.sql.Connection c=null;
		     c=JDBCTemplate.getConnection();
		     java.sql.Statement str=c.createStatement();
                     
		     str.execute("update result set I7='YES' where email='"+id+"'");
		     System.out.println("update I7 with YES by type detection  ");
                     
                     java.sql.ResultSet rs3=str.executeQuery("SELECT I7  FROM result WHERE email='"+id+"'");
		    if(rs3.next())
		      {
                        System.out.println(rs3.getString(1));
                        
                      }
                    
		    }
		    catch(Exception e)
		    {
                         System.out.println(e);  
		    }
        
        if(t7.isSelected())
           f1++;
        
        System.out.println("t7="+f1);
        jLabel13.setVisible(true);t8.setVisible(true);p8.setVisible(true);
        
       
    }//GEN-LAST:event_t7ActionPerformed

    private void p5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p5ActionPerformed
        // TODO add your handling code here:
        
        try
		    {
		     java.sql.Connection c=null;
		     c=JDBCTemplate.getConnection();
		     java.sql.Statement str=c.createStatement();
                     
		     str.execute("update result set I5='NO' where email='"+id+"'");
		     System.out.println("update I5 with NO by type detection  ");
                     
                     java.sql.ResultSet rs3=str.executeQuery("SELECT I5  FROM result WHERE email='"+id+"'");
		    if(rs3.next())
		      {
                        System.out.println(rs3.getString(1));
                        
                      }
                    
		    }
		    catch(Exception e)
		    {
                         System.out.println(e);  
		    }
        
        if(p5.isSelected())
            fv++;
        System.out.println("p5="+fv);
        
        jLabel10.setVisible(true);t6.setVisible(true);p6.setVisible(true);
    }//GEN-LAST:event_p5ActionPerformed

    private void p7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p7ActionPerformed
        // TODO add your handling code here:
        
        try
		    {
		     java.sql.Connection c=null;
		     c=JDBCTemplate.getConnection();
		     java.sql.Statement str=c.createStatement();
                     
		     str.execute("update result set I7='NO' where email='"+id+"'");
		     System.out.println("update I7 with N0 by type detection  ");
                     
                     java.sql.ResultSet rs3=str.executeQuery("SELECT I7  FROM result WHERE email='"+id+"'");
		    if(rs3.next())
		      {
                        System.out.println(rs3.getString(1));
                        
                      }
                    
		    }
		    catch(Exception e)
		    {
                         System.out.println(e);  
		    }
        
        if(p7.isSelected())
            fv++;
        System.out.println("p7="+fv);
        
        jLabel13.setVisible(true);t8.setVisible(true);p8.setVisible(true);
        
    }//GEN-LAST:event_p7ActionPerformed

    private void p3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p3ActionPerformed
        // TODO add your handling code here:
        try
		    {
		     java.sql.Connection c=null;
		     c=JDBCTemplate.getConnection();
		     java.sql.Statement str=c.createStatement();
                     
		     str.execute("update result set I3='NO' where email='"+id+"'");
		     System.out.println("update I3 with NO by type detection  ");
                     
                     java.sql.ResultSet rs3=str.executeQuery("SELECT I3  FROM result WHERE email='"+id+"'");
		    if(rs3.next())
		      {
                        System.out.println(rs3.getString(1));
                        
                      }
                    
		    }
		    catch(Exception e)
		    {
                         System.out.println(e);  
		    }
        
        if(p3.isSelected())
            fv++;
        System.out.println("p3="+fv);
        
        jLabel8.setVisible(true);t4.setVisible(true);p4.setVisible(true);
    }//GEN-LAST:event_p3ActionPerformed

    private void t4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t4ActionPerformed
        // TODO add your handling code here:
        
        try
		    {
		     java.sql.Connection c=null;
		     c=JDBCTemplate.getConnection();
		     java.sql.Statement str=c.createStatement();
                     
		     str.execute("update result set I4='YES' where email='"+id+"'");
		     System.out.println("update I4 with YES by type detection  ");
                     
                     java.sql.ResultSet rs3=str.executeQuery("SELECT I4  FROM result WHERE email='"+id+"'");
		    if(rs3.next())
		      {
                        System.out.println(rs3.getString(1));
                        
                      }
                    
		    }
		    catch(Exception e)
		    {
                         System.out.println(e);  
		    }
        
        
        if(t4.isSelected())
           f1++;
        
        System.out.println("t4="+f1);
        
        jLabel9.setVisible(true);t5.setVisible(true);p5.setVisible(true);
    }//GEN-LAST:event_t4ActionPerformed

    private void t5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t5ActionPerformed
        // TODO add your handling code here:
        
        try
		    {
		     java.sql.Connection c=null;
		     c=JDBCTemplate.getConnection();
		     java.sql.Statement str=c.createStatement();
                     
		     str.execute("update result set I5='YES' where email='"+id+"'");
		     System.out.println("update I5 with YES by type detection  ");
                     
                     java.sql.ResultSet rs3=str.executeQuery("SELECT I5  FROM result WHERE email='"+id+"'");
		    if(rs3.next())
		      {
                        System.out.println(rs3.getString(1));
                        
                      }
                    
		    }
		    catch(Exception e)
		    {
                         System.out.println(e);  
		    }
        
        if(t5.isSelected())
           f1++;
       
        System.out.println("t5="+f1);
        
        jLabel10.setVisible(true);t6.setVisible(true);p6.setVisible(true);
    }//GEN-LAST:event_t5ActionPerformed

    private void t6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t6ActionPerformed
        // TODO add your handling code here
        
        try
		    {
		     java.sql.Connection c=null;
		     c=JDBCTemplate.getConnection();
		     java.sql.Statement str=c.createStatement();
                     
		     str.execute("update result set I6='YES' where email='"+id+"'");
		     System.out.println("update I6 with YES by type detection  ");
                     
                     java.sql.ResultSet rs3=str.executeQuery("SELECT I6  FROM result WHERE email='"+id+"'");
		    if(rs3.next())
		      {
                        System.out.println(rs3.getString(1));
                        
                      }
                    
		    }
		    catch(Exception e)
		    {
                         System.out.println(e);  
		    }
        
        if(t6.isSelected())
           f1++;
        System.out.println("t6="+f1);
        
        jLabel11.setVisible(true);t7.setVisible(true);p7.setVisible(true);
    }//GEN-LAST:event_t6ActionPerformed

    private void p8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p8ActionPerformed
        // TODO add your handling code here:
        
        try
		    {
		     java.sql.Connection c=null;
		     c=JDBCTemplate.getConnection();
		     java.sql.Statement str=c.createStatement();
                     
		     str.execute("update result set I8='NO' where email='"+id+"'");
		     System.out.println("update I8 with NO by type detection  ");
                     
                     java.sql.ResultSet rs3=str.executeQuery("SELECT I8  FROM result WHERE email='"+id+"'");
		    if(rs3.next())
		      {
                        System.out.println(rs3.getString(1));
                        
                      }
                    
		    }
		    catch(Exception e)
		    {
                         System.out.println(e);  
		    }
        
        if(p8.isSelected())
            fv++;
        System.out.println("p8 fv"+fv);
        
            if(fv>3)
        {
          jLabel14.setVisible(true);t9.setVisible(true);p9.setVisible(true);    
        }
        
        
    }//GEN-LAST:event_p8ActionPerformed

    private void t9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t9ActionPerformed
        // TODO add your handling code here:
        
        try
		    {
		     java.sql.Connection c=null;
		     c=JDBCTemplate.getConnection();
		     java.sql.Statement str=c.createStatement();
                     
		     str.execute("update result set I9='YES' where email='"+id+"'");
		     System.out.println("update I9 with YES by type detection  ");
                     
                     java.sql.ResultSet rs3=str.executeQuery("SELECT I9  FROM result WHERE email='"+id+"'");
		    if(rs3.next())
		      {
                        System.out.println(rs3.getString(1));
                        
                      }
                    
		    }
		    catch(Exception e)
		    {
                         System.out.println(e);  
		    }
        
        jLabel15.setVisible(true);t10.setVisible(true);p10.setVisible(true);
    }//GEN-LAST:event_t9ActionPerformed

    private void p9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p9ActionPerformed
        // TODO add your handling code here:
        
        try
		    {
		     java.sql.Connection c=null;
		     c=JDBCTemplate.getConnection();
		     java.sql.Statement str=c.createStatement();
                     
		     str.execute("update result set I9='NO' where email='"+id+"'");
		     System.out.println("update I9 with NO by type detection  ");
                     
                     java.sql.ResultSet rs3=str.executeQuery("SELECT I9  FROM result WHERE email='"+id+"'");
		    if(rs3.next())
		      {
                        System.out.println(rs3.getString(1));
                        
                      }
                    
		    }
		    catch(Exception e)
		    {
                         System.out.println(e);  
		    }
        
        jLabel15.setVisible(true);t10.setVisible(true);p10.setVisible(true);
    }//GEN-LAST:event_p9ActionPerformed

    private void t10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t10ActionPerformed
        // TODO add your handling code here:
        
        try
		    {
		     java.sql.Connection c=null;
		     c=JDBCTemplate.getConnection();
		     java.sql.Statement str=c.createStatement();
                     
		     str.execute("update result set I10='YES' where email='"+id+"'");
		     System.out.println("update I10 with YES by type detection  ");
                     
                     java.sql.ResultSet rs3=str.executeQuery("SELECT I10  FROM result WHERE email='"+id+"'");
		    if(rs3.next())
		      {
                        System.out.println(rs3.getString(1));
                        
                      }
                    
		    }
		    catch(Exception e)
		    {
                         System.out.println(e);  
		    }
        
        jLabel17.setVisible(true);t11.setVisible(true);p11.setVisible(true);
        
    }//GEN-LAST:event_t10ActionPerformed

    private void p10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p10ActionPerformed
        // TODO add your handling code here:
        
        try
		    {
		     java.sql.Connection c=null;
		     c=JDBCTemplate.getConnection();
		     java.sql.Statement str=c.createStatement();
                     
		     str.execute("update result set I10='NO' where email='"+id+"'");
		     System.out.println("update I10 with NO by type detection  ");
                     
                     java.sql.ResultSet rs3=str.executeQuery("SELECT I10  FROM result WHERE email='"+id+"'");
		    if(rs3.next())
		      {
                        System.out.println(rs3.getString(1));
                        
                      }
                    
		    }
		    catch(Exception e)
		    {
                         System.out.println(e);  
		    }
        
        jLabel17.setVisible(true);t11.setVisible(true);p11.setVisible(true);
    }//GEN-LAST:event_p10ActionPerformed

    private void t11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t11ActionPerformed
        // TODO add your handling code here:
        try
		    {
		     java.sql.Connection c=null;
		     c=JDBCTemplate.getConnection();
		     java.sql.Statement str=c.createStatement();
                     
		     str.execute("update result set I11='YES' where email='"+id+"'");
		     System.out.println("update I11 with YES by type detection  ");
                     
                     java.sql.ResultSet rs3=str.executeQuery("SELECT I11  FROM result WHERE email='"+id+"'");
		    if(rs3.next())
		      {
                        System.out.println(rs3.getString(1));
                        
                      }
                    
		    }
		    catch(Exception e)
		    {
                         System.out.println(e);  
		    }
        
        jLabel18.setVisible(true);t12.setVisible(true);p12.setVisible(true);
        
    }//GEN-LAST:event_t11ActionPerformed

    private void p11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p11ActionPerformed
        // TODO add your handling code here:
        try
		    {
		     java.sql.Connection c=null;
		     c=JDBCTemplate.getConnection();
		     java.sql.Statement str=c.createStatement();
                     
		     str.execute("update result set I11='NO' where email='"+id+"'");
		     System.out.println("update I11 with NO by type detection  ");
                     
                     java.sql.ResultSet rs3=str.executeQuery("SELECT I11  FROM result WHERE email='"+id+"'");
		    if(rs3.next())
		      {
                        System.out.println(rs3.getString(1));
                        
                      }
                    
		    }
		    catch(Exception e)
		    {
                         System.out.println(e);  
		    }
        
        jLabel18.setVisible(true);t12.setVisible(true);p12.setVisible(true);
    }//GEN-LAST:event_p11ActionPerformed

    private void t12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t12ActionPerformed
        // TODO add your handling code here:
        try
		    {
		     java.sql.Connection c=null;
		     c=JDBCTemplate.getConnection();
		     java.sql.Statement str=c.createStatement();
                     
		     str.execute("update result set I12='YES' where email='"+id+"'");
		     System.out.println("update I12 with YES by type detection  ");
                     
                     java.sql.ResultSet rs3=str.executeQuery("SELECT I12  FROM result WHERE email='"+id+"'");
		    if(rs3.next())
		      {
                        System.out.println(rs3.getString(1));
                        
                      }
                    
		    }
		    catch(Exception e)
		    {
                         System.out.println(e);  
		    }
        
        jLabel21.setVisible(true);t13.setVisible(true);p13.setVisible(true);
       
    }//GEN-LAST:event_t12ActionPerformed

    private void p12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p12ActionPerformed
        // TODO add your handling code here:
        try
		    {
		     java.sql.Connection c=null;
		     c=JDBCTemplate.getConnection();
		     java.sql.Statement str=c.createStatement();
                     
		     str.execute("update result set I12='NO' where email='"+id+"'");
		     System.out.println("update I12 with NO by type detection  ");
                     
                     java.sql.ResultSet rs3=str.executeQuery("SELECT I12  FROM result WHERE email='"+id+"'");
		    if(rs3.next())
		      {
                        System.out.println(rs3.getString(1));
                        
                      }
                    
		    }
		    catch(Exception e)
		    {
                         System.out.println(e);  
		    }
     jLabel21.setVisible(true);t13.setVisible(true);p13.setVisible(true);
    }//GEN-LAST:event_p12ActionPerformed

    private void t13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t13ActionPerformed
        // TODO add your handling code here:
        try
		    {
		     java.sql.Connection c=null;
		     c=JDBCTemplate.getConnection();
		     java.sql.Statement str=c.createStatement();
                     
		     str.execute("update result set I13='YES' where email='"+id+"'");
		     System.out.println("update I13 with YES by type detection  ");
                     
                     java.sql.ResultSet rs3=str.executeQuery("SELECT I13  FROM result WHERE email='"+id+"'");
		    if(rs3.next())
		      {
                        System.out.println(rs3.getString(1));
                        
                      }
                    
		    }
		    catch(Exception e)
		    {
                         System.out.println(e);  
		    }
        
        jLabel22.setVisible(true);t14.setVisible(true);p14.setVisible(true);
        
    }//GEN-LAST:event_t13ActionPerformed

    private void p13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p13ActionPerformed
        // TODO add your handling code here:
        try
		    {
		     java.sql.Connection c=null;
		     c=JDBCTemplate.getConnection();
		     java.sql.Statement str=c.createStatement();
                     
		     str.execute("update result set I13='NO' where email='"+id+"'");
		     System.out.println("update I13 with NO by type detection  ");
                     
                     java.sql.ResultSet rs3=str.executeQuery("SELECT I13  FROM result WHERE email='"+id+"'");
		    if(rs3.next())
		      {
                        System.out.println(rs3.getString(1));
                        
                      }
                    
		    }
		    catch(Exception e)
		    {
                         System.out.println(e);  
		    }
        jLabel22.setVisible(true);t14.setVisible(true);p14.setVisible(true);
    }//GEN-LAST:event_p13ActionPerformed

    private void t14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t14ActionPerformed
        // TODO add your handling code here:
        try
		    {
		     java.sql.Connection c=null;
		     c=JDBCTemplate.getConnection();
		     java.sql.Statement str=c.createStatement();
                     
		     str.execute("update result set I14='YES' where email='"+id+"'");
		     System.out.println("update I14 with YES by type detection  ");
                     
                     java.sql.ResultSet rs3=str.executeQuery("SELECT I14  FROM result WHERE email='"+id+"'");
		    if(rs3.next())
		      {
                        System.out.println(rs3.getString(1));
                        
                      }
                    
		    }
		    catch(Exception e)
		    {
                         System.out.println(e);  
		    }
        
        jLabel23.setVisible(true);t15.setVisible(true);p15.setVisible(true);
        
    }//GEN-LAST:event_t14ActionPerformed

    private void p14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p14ActionPerformed
        // TODO add your handling code here:
        try
		    {
		     java.sql.Connection c=null;
		     c=JDBCTemplate.getConnection();
		     java.sql.Statement str=c.createStatement();
                     
		     str.execute("update result set I14='NO' where email='"+id+"'");
		     System.out.println("update I14 with NO by type detection  ");
                     
                     java.sql.ResultSet rs3=str.executeQuery("SELECT I14  FROM result WHERE email='"+id+"'");
		    if(rs3.next())
		      {
                        System.out.println(rs3.getString(1));
                        
                      }
                    
		    }
		    catch(Exception e)
		    {
                         System.out.println(e);  
		    }
        
        jLabel23.setVisible(true);t15.setVisible(true);p15.setVisible(true);
    }//GEN-LAST:event_p14ActionPerformed

    private void t15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t15ActionPerformed
        // TODO add your handling code here:
        try
		    {
		     java.sql.Connection c=null;
		     c=JDBCTemplate.getConnection();
		     java.sql.Statement str=c.createStatement();
                     
		     str.execute("update result set I15='YES' where email='"+id+"'");
		     System.out.println("update I15 with YES by type detection  ");
                     
                     java.sql.ResultSet rs3=str.executeQuery("SELECT I15  FROM result WHERE email='"+id+"'");
		    if(rs3.next())
		      {
                        System.out.println(rs3.getString(1));
                        
                      }
                    
		    }
		    catch(Exception e)
		    {
                         System.out.println(e);  
		    }
        jLabel24.setVisible(true);t16.setVisible(true);p16.setVisible(true);
        
    }//GEN-LAST:event_t15ActionPerformed

    private void p15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p15ActionPerformed
        // TODO add your handling code here:
        try
		    {
		     java.sql.Connection c=null;
		     c=JDBCTemplate.getConnection();
		     java.sql.Statement str=c.createStatement();
                     
		     str.execute("update result set I15='NO' where email='"+id+"'");
		     System.out.println("update I15 with NO by type detection  ");
                     
                     java.sql.ResultSet rs3=str.executeQuery("SELECT I15  FROM result WHERE email='"+id+"'");
		    if(rs3.next())
		      {
                        System.out.println(rs3.getString(1));
                        
                      }
                    
		    }
		    catch(Exception e)
		    {
                         System.out.println(e);  
		    }
        jLabel24.setVisible(true);t16.setVisible(true);p16.setVisible(true);
    }//GEN-LAST:event_p15ActionPerformed

    private void t16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t16ActionPerformed
        // TODO add your handling code here:
        try
		    {
		     java.sql.Connection c=null;
		     c=JDBCTemplate.getConnection();
		     java.sql.Statement str=c.createStatement();
                     
		     str.execute("update result set I16='YES' where email='"+id+"'");
		     System.out.println("update I16 with YES by type detection  ");
                     
                     java.sql.ResultSet rs3=str.executeQuery("SELECT I16  FROM result WHERE email='"+id+"'");
		    if(rs3.next())
		      {
                        System.out.println(rs3.getString(1));
                        
                      }
                    
		    }
		    catch(Exception e)
		    {
                         System.out.println(e);  
		    }
        
        
    }//GEN-LAST:event_t16ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        int flag1=0;

        if(t1.isSelected())
        flag1++;
        
        if(t2.isSelected())
        flag1++;
        
        if(t3.isSelected())
        flag1++;
        
        if(t4.isSelected())
        flag1++;
        
        if(t5.isSelected())
        flag1++;
        
        if(t6.isSelected())
        flag1++;
        
        if(t7.isSelected())
        flag1++;
        
        if(t8.isSelected())
            flag1++;
        
           System.out.println("\nflag 1= %d"+flag1); 
           
       if(flag1>=5)
        {
            try
		    {
		     java.sql.Connection c=null;
		     c=JDBCTemplate.getConnection();
		     java.sql.Statement str=c.createStatement();
                     
                     str.execute("update result set result='YOU HAVE LUNG CANCER' where email='"+id+"'");
		     str.execute("update result set type='SmallCell Lung Cancer' where email='"+id+"'");
		     System.out.println("update type with SmallCell Lung Cancer by type AND RESULT YOU HAVE LUNG CANCER  ");
                     
                     java.sql.ResultSet rs3=str.executeQuery("SELECT type  FROM result WHERE email='"+id+"'");
		    if(rs3.next())
		      {
                        System.out.println(rs3.getString(1));
                        
                      }
                    
		    }
		    catch(Exception e)
		    {
                         System.out.println(e);  
		    }
            
            dispose();
            new SmallCell(id).setVisible(true);
        }
        else{
             int flag2=0;
            
            
            if(t9.isSelected())
            flag2++;
            
            if(t10.isSelected())
            flag2++;
            
            if(t11.isSelected())
            flag2++;
            
            if(t12.isSelected())
            flag2++;
            
            if(t13.isSelected())
            flag2++;
            
            if(t14.isSelected())
            flag2++;
            
            if(t15.isSelected())
            flag2++;
            
            if(t16.isSelected())
            flag2++;
            
            System.out.println("\nflag 2= %d"+flag2);
            if(flag2>=5)
            {
                
                try
		    {
		     java.sql.Connection c=null;
		     c=JDBCTemplate.getConnection();
		     java.sql.Statement str=c.createStatement();
                     
                     str.execute("update result set result='YOU HAVE LUNG CANCER' where email='"+id+"'");
		     str.execute("update result set type='Non SmallCell Lung Cancer' where email='"+id+"'");
		     System.out.println("update type with Non SmallCell Lung Cancer by type AND RESULT YOU HAVE LUNG CANCER  ");
                     
                     java.sql.ResultSet rs3=str.executeQuery("SELECT type  FROM result WHERE email='"+id+"'");
		    if(rs3.next())
		      {
                        System.out.println(rs3.getString(1));
                        
                      }
                    
		    }
		    catch(Exception e)
		    {
                         System.out.println(e);  
		    }
                
                dispose();
                new NoSmallCellLungCancer(id).setVisible(true);
            }
            /*else
            {
                dispose();
                new SmallCell().setVisible(true);
            }*/
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        dispose();
        new AdvanceTest(id).setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void p16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p16ActionPerformed
        // TODO add your handling code here:
        try
		    {
		     java.sql.Connection c=null;
		     c=JDBCTemplate.getConnection();
		     java.sql.Statement str=c.createStatement();
                     
		     str.execute("update result set I16='NO' where email='"+id+"'");
		     System.out.println("update I16 with NO by type detection  ");
                     
                     java.sql.ResultSet rs3=str.executeQuery("SELECT I16  FROM result WHERE email='"+id+"'");
		    if(rs3.next())
		      {
                        System.out.println(rs3.getString(1));
                        
                      }
                    
		    }
		    catch(Exception e)
		    {
                         System.out.println(e);  
		    }
    }//GEN-LAST:event_p16ActionPerformed

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
            java.util.logging.Logger.getLogger(DetectTypeQuetions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DetectTypeQuetions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DetectTypeQuetions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DetectTypeQuetions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new DetectTypeQuetions().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup10;
    private javax.swing.ButtonGroup buttonGroup11;
    private javax.swing.ButtonGroup buttonGroup12;
    private javax.swing.ButtonGroup buttonGroup13;
    private javax.swing.ButtonGroup buttonGroup14;
    private javax.swing.ButtonGroup buttonGroup15;
    private javax.swing.ButtonGroup buttonGroup16;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.ButtonGroup buttonGroup7;
    private javax.swing.ButtonGroup buttonGroup8;
    private javax.swing.ButtonGroup buttonGroup9;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton p1;
    private javax.swing.JRadioButton p10;
    private javax.swing.JRadioButton p11;
    private javax.swing.JRadioButton p12;
    private javax.swing.JRadioButton p13;
    private javax.swing.JRadioButton p14;
    private javax.swing.JRadioButton p15;
    private javax.swing.JRadioButton p16;
    private javax.swing.JRadioButton p2;
    private javax.swing.JRadioButton p3;
    private javax.swing.JRadioButton p4;
    private javax.swing.JRadioButton p5;
    private javax.swing.JRadioButton p6;
    private javax.swing.JRadioButton p7;
    private javax.swing.JRadioButton p8;
    private javax.swing.JRadioButton p9;
    private javax.swing.JRadioButton t1;
    private javax.swing.JRadioButton t10;
    private javax.swing.JRadioButton t11;
    private javax.swing.JRadioButton t12;
    private javax.swing.JRadioButton t13;
    private javax.swing.JRadioButton t14;
    private javax.swing.JRadioButton t15;
    private javax.swing.JRadioButton t16;
    private javax.swing.JRadioButton t2;
    private javax.swing.JRadioButton t3;
    private javax.swing.JRadioButton t4;
    private javax.swing.JRadioButton t5;
    private javax.swing.JRadioButton t6;
    private javax.swing.JRadioButton t7;
    private javax.swing.JRadioButton t8;
    private javax.swing.JRadioButton t9;
    // End of variables declaration//GEN-END:variables
}
