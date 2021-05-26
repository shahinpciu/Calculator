
package Calculator;


public class Calculator extends javax.swing.JFrame {

    double firstnum ;
    double secondnum;
    double result;
    String operations;  
    
    
    
    public Calculator() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButtondot = new javax.swing.JButton();
        jButtonmod = new javax.swing.JButton();
        jButtonsum = new javax.swing.JButton();
        jButtonmul = new javax.swing.JButton();
        jButtonmin = new javax.swing.JButton();
        jButtonc = new javax.swing.JButton();
        jButtondiv = new javax.swing.JButton();
        jButtonequal = new javax.swing.JButton();
        jtxtdisplay = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton0 = new javax.swing.JButton();
        jtxtdisplay2 = new javax.swing.JTextField();
        jButtondel = new javax.swing.JButton();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton7.setText("7");
        jButton7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton7.setBorderPainted(false);
        jButton7.setPreferredSize(new java.awt.Dimension(86, 52));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton8.setText("8");
        jButton8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton8.setBorderPainted(false);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton9.setText("9");
        jButton9.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton9.setBorderPainted(false);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton4.setText("4");
        jButton4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton4.setBorderPainted(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton5.setText("5");
        jButton5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton5.setBorderPainted(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton6.setText("6");
        jButton6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton6.setBorderPainted(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setText("2");
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.setBorderPainted(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton3.setText("3");
        jButton3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton3.setBorderPainted(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButtondot.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtondot.setText(".");
        jButtondot.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtondot.setBorderPainted(false);
        jButtondot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtondotActionPerformed(evt);
            }
        });

        jButtonmod.setBackground(new java.awt.Color(0, 0, 0));
        jButtonmod.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonmod.setForeground(new java.awt.Color(240, 240, 240));
        jButtonmod.setText("%");
        jButtonmod.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonmod.setBorderPainted(false);
        jButtonmod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonmodActionPerformed(evt);
            }
        });

        jButtonsum.setBackground(new java.awt.Color(0, 0, 0));
        jButtonsum.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonsum.setForeground(new java.awt.Color(240, 240, 240));
        jButtonsum.setText("+");
        jButtonsum.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonsum.setBorderPainted(false);
        jButtonsum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonsumActionPerformed(evt);
            }
        });

        jButtonmul.setBackground(new java.awt.Color(0, 0, 0));
        jButtonmul.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonmul.setForeground(new java.awt.Color(240, 240, 240));
        jButtonmul.setText("x");
        jButtonmul.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonmul.setBorderPainted(false);
        jButtonmul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonmulActionPerformed(evt);
            }
        });

        jButtonmin.setBackground(new java.awt.Color(0, 0, 0));
        jButtonmin.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonmin.setForeground(new java.awt.Color(240, 240, 240));
        jButtonmin.setText("-");
        jButtonmin.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonmin.setBorderPainted(false);
        jButtonmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonminActionPerformed(evt);
            }
        });

        jButtonc.setBackground(new java.awt.Color(255, 80, 80));
        jButtonc.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonc.setForeground(new java.awt.Color(240, 240, 240));
        jButtonc.setText("C");
        jButtonc.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonc.setBorderPainted(false);
        jButtonc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtoncActionPerformed(evt);
            }
        });

        jButtondiv.setBackground(new java.awt.Color(0, 0, 0));
        jButtondiv.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtondiv.setForeground(new java.awt.Color(240, 240, 240));
        jButtondiv.setText("/");
        jButtondiv.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtondiv.setBorderPainted(false);
        jButtondiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtondivActionPerformed(evt);
            }
        });

        jButtonequal.setBackground(new java.awt.Color(0, 0, 0));
        jButtonequal.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonequal.setForeground(new java.awt.Color(240, 240, 240));
        jButtonequal.setText("=");
        jButtonequal.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonequal.setBorderPainted(false);
        jButtonequal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonequalActionPerformed(evt);
            }
        });

        jtxtdisplay.setEditable(false);
        jtxtdisplay.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jtxtdisplay.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jtxtdisplay.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jtxtdisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtdisplayActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("1");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.setBorderPainted(false);
        jButton1.setMaximumSize(new java.awt.Dimension(86, 52));
        jButton1.setMinimumSize(new java.awt.Dimension(86, 52));
        jButton1.setPreferredSize(new java.awt.Dimension(86, 52));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton0.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton0.setText("0");
        jButton0.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton0.setBorderPainted(false);
        jButton0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton0ActionPerformed(evt);
            }
        });

        jtxtdisplay2.setEditable(false);
        jtxtdisplay2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jtxtdisplay2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jtxtdisplay2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtdisplay2ActionPerformed(evt);
            }
        });

        jButtondel.setBackground(new java.awt.Color(0, 0, 0));
        jButtondel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtondel.setForeground(new java.awt.Color(240, 240, 240));
        jButtondel.setText("DEL");
        jButtondel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtondel.setBorderPainted(false);
        jButtondel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtondelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButtonc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButtondel, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addComponent(jButton0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtondiv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtondot, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButtonmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButtonsum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButtonequal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButtonmul, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jButtonmod, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addComponent(jtxtdisplay2)
                    .addComponent(jtxtdisplay))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jtxtdisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtxtdisplay2, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonc, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtondel, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton0, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonmul, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonmin, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonsum, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonmod, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonequal, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtondiv, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(64, 64, 64))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(58, 58, 58)
                                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtondot, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
       String Enternumber = jtxtdisplay.getText() + jButton7.getText();
       jtxtdisplay.setText(Enternumber);
        
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButtondivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtondivActionPerformed
               
            firstnum = Double.parseDouble(jtxtdisplay.getText());
            operations="/";
            jtxtdisplay2.setText(jtxtdisplay.getText()+" " +operations);
            jtxtdisplay.setText("");             
    }//GEN-LAST:event_jButtondivActionPerformed

    private void jButtonmodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonmodActionPerformed
              
             firstnum = Double.parseDouble(jtxtdisplay.getText());
            operations="%";
            jtxtdisplay2.setText(jtxtdisplay.getText()+" " +operations);
            jtxtdisplay.setText("");               
    }//GEN-LAST:event_jButtonmodActionPerformed

    private void jButtondotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtondotActionPerformed
        
        String s = jtxtdisplay.getText();
        if (s.contains(".")==true)
        {
          
        }
        else{
            String Enternumber = jtxtdisplay.getText() + jButtondot.getText();
         jtxtdisplay.setText(Enternumber);
        }     
                 
               
        
    }//GEN-LAST:event_jButtondotActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String Enternumber = jtxtdisplay.getText() + jButton1.getText();
        jtxtdisplay.setText(Enternumber);        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       String Enternumber = jtxtdisplay.getText() + jButton2.getText();
        jtxtdisplay.setText(Enternumber);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String Enternumber = jtxtdisplay.getText() + jButton3.getText();
        jtxtdisplay.setText(Enternumber);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String Enternumber = jtxtdisplay.getText() + jButton4.getText();
        jtxtdisplay.setText(Enternumber);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        String Enternumber = jtxtdisplay.getText() + jButton5.getText();
        jtxtdisplay.setText(Enternumber);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        String Enternumber = jtxtdisplay.getText() + jButton6.getText();
        jtxtdisplay.setText(Enternumber);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        String Enternumber = jtxtdisplay.getText() + jButton8.getText();
        jtxtdisplay.setText(Enternumber);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        String Enternumber = jtxtdisplay.getText() + jButton9.getText();
        jtxtdisplay.setText(Enternumber);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButtonequalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonequalActionPerformed
        String answer;           
        secondnum = Double.parseDouble(jtxtdisplay.getText());                  
                
                    if (operations == "+")
          {
               result = firstnum + secondnum;
               if(result%2!=0){
                    answer = String.format("%.2f",result);         
                    jtxtdisplay.setText(answer); 
                    jtxtdisplay2.setText(jtxtdisplay2.getText()+" "+secondnum);
               }
               else{
                   answer = String.format("%.0f",result);         
                   jtxtdisplay.setText(answer); 
                   jtxtdisplay2.setText(jtxtdisplay2.getText()+" "+secondnum);
               }
           }
           else   if (operations == "-")
          {
               result = firstnum - secondnum;
               if(result%2!=0){
                    answer = String.format("%.2f",result);         
                    jtxtdisplay.setText(answer); 
                    jtxtdisplay2.setText(jtxtdisplay2.getText()+" "+secondnum);
               }
               else{
                   answer = String.format("%.0f",result);         
                   jtxtdisplay.setText(answer); 
                   jtxtdisplay2.setText(jtxtdisplay2.getText()+" "+secondnum);
               }
          }
           else   if (operations == "X")
          {
               result = firstnum * secondnum;
               if(result%2!=0){
                    answer = String.format("%.2f",result);         
                    jtxtdisplay.setText(answer);
                    jtxtdisplay2.setText(jtxtdisplay2.getText()+" "+secondnum);
               }
               else{
                   answer = String.format("%.0f",result);         
                   jtxtdisplay.setText(answer); 
                   jtxtdisplay2.setText(jtxtdisplay2.getText()+" "+secondnum);
               }              
          }
            else   if (operations == "/")
          {
              if(secondnum==0)
              {
                  jtxtdisplay.setText("");
                  jtxtdisplay2.setText("");
              }
              else{
                     result = firstnum / secondnum;
                     if(result%2!=0){
                        answer = String.format("%.2f",result);         
                         jtxtdisplay.setText(answer);      
                    }    
                     else{
                         answer = String.format("%.0f",result);         
                         jtxtdisplay.setText(answer);  
                    }    
                     jtxtdisplay2.setText(jtxtdisplay2.getText()+" "+secondnum); 
                }
          }
            
             else  if (operations == "%")
          {
               result = firstnum % secondnum;
               if(result%2!=0){
                    answer = String.format("%.2f",result);         
                    jtxtdisplay.setText(answer);
                    jtxtdisplay2.setText(jtxtdisplay2.getText()+" "+secondnum);
               }
               else{
                   answer = String.format("%.0f",result);         
                   jtxtdisplay.setText(answer);
                   jtxtdisplay2.setText(jtxtdisplay2.getText()+" "+secondnum);
               }             
              }
              //jtxtdisplay2.setText(jtxtdisplay2.getText()+" "+secondnum);
             
           
        
        
        
        
          
            
          
    }//GEN-LAST:event_jButtonequalActionPerformed

    private void jButtonsumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonsumActionPerformed
              
            firstnum = Double.parseDouble(jtxtdisplay.getText());
            operations="+";
            jtxtdisplay2.setText(jtxtdisplay.getText()+" " +operations);
            jtxtdisplay.setText(""); 
              
    }//GEN-LAST:event_jButtonsumActionPerformed

    private void jButtonminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonminActionPerformed
            firstnum = Double.parseDouble(jtxtdisplay.getText());
            operations="-";
            jtxtdisplay2.setText(jtxtdisplay.getText()+" " +operations);
            jtxtdisplay.setText("");
            

    }//GEN-LAST:event_jButtonminActionPerformed

    private void jButtonmulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonmulActionPerformed
       
            firstnum = Double.parseDouble(jtxtdisplay.getText());
            operations="X";
            jtxtdisplay2.setText(jtxtdisplay.getText()+" " +operations);
            jtxtdisplay.setText("");
    }//GEN-LAST:event_jButtonmulActionPerformed

    private void jButtoncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtoncActionPerformed
        jtxtdisplay.setText("");
        jtxtdisplay2.setText("");
       
    }//GEN-LAST:event_jButtoncActionPerformed

    private void jButton0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton0ActionPerformed
       String Enternumber = jtxtdisplay.getText() + jButton0.getText();
        jtxtdisplay.setText(Enternumber);
    }//GEN-LAST:event_jButton0ActionPerformed

    private void jtxtdisplay2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtdisplay2ActionPerformed
        
    }//GEN-LAST:event_jtxtdisplay2ActionPerformed

    private void jtxtdisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtdisplayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtdisplayActionPerformed

    private void jButtondelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtondelActionPerformed
       String backSpace = null;
       if(jtxtdisplay.getText().length() > 0)
       {
           StringBuilder s = new StringBuilder (jtxtdisplay.getText());
           s.deleteCharAt(jtxtdisplay.getText().length() - 1);
           backSpace = s.toString();
           jtxtdisplay.setText(backSpace);
       }
    }//GEN-LAST:event_jButtondelActionPerformed

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
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton0;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JButton jButtonc;
    private javax.swing.JButton jButtondel;
    private javax.swing.JButton jButtondiv;
    private javax.swing.JButton jButtondot;
    private javax.swing.JButton jButtonequal;
    private javax.swing.JButton jButtonmin;
    private javax.swing.JButton jButtonmod;
    private javax.swing.JButton jButtonmul;
    private javax.swing.JButton jButtonsum;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jtxtdisplay;
    private javax.swing.JTextField jtxtdisplay2;
    // End of variables declaration//GEN-END:variables
}
