package foodcatalog;

import javax.swing.JOptionPane;

public class FruitsJDialog extends javax.swing.JFrame {

    public FruitsJDialog() {
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

        fruitsJPanel = new javax.swing.JPanel();
        peachRB = new javax.swing.JRadioButton();
        mangosteenRB = new javax.swing.JRadioButton();
        pitayaRB = new javax.swing.JRadioButton();
        quitlJLabel3 = new javax.swing.JButton();
        viewJLabel4 = new javax.swing.JButton();
        clearJLabel4 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        mainMenuButton3 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fruitsJPanel.setBackground(new java.awt.Color(204, 0, 0));
        fruitsJPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true), "Fruit Menu", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Showcard Gothic", 2, 46), new java.awt.Color(255, 255, 0))); // NOI18N

        peachRB.setBackground(new java.awt.Color(255, 255, 0));
        peachRB.setFont(new java.awt.Font("Showcard Gothic", 2, 11)); // NOI18N
        peachRB.setText("Peach");
        peachRB.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        peachRB.setBorderPainted(true);
        peachRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                peachRBActionPerformed(evt);
            }
        });

        mangosteenRB.setBackground(new java.awt.Color(255, 255, 0));
        mangosteenRB.setFont(new java.awt.Font("Showcard Gothic", 2, 11)); // NOI18N
        mangosteenRB.setText("Mangosteen");
        mangosteenRB.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        mangosteenRB.setBorderPainted(true);
        mangosteenRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mangosteenRBActionPerformed(evt);
            }
        });

        pitayaRB.setBackground(new java.awt.Color(255, 255, 0));
        pitayaRB.setFont(new java.awt.Font("Showcard Gothic", 2, 11)); // NOI18N
        pitayaRB.setText("Pitaya");
        pitayaRB.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        pitayaRB.setBorderPainted(true);
        pitayaRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pitayaRBActionPerformed(evt);
            }
        });

        quitlJLabel3.setBackground(new java.awt.Color(255, 255, 0));
        quitlJLabel3.setFont(new java.awt.Font("Showcard Gothic", 2, 11)); // NOI18N
        quitlJLabel3.setText("Quit");
        quitlJLabel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        quitlJLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        quitlJLabel3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitlJLabel3ActionPerformed(evt);
            }
        });

        viewJLabel4.setBackground(new java.awt.Color(255, 255, 0));
        viewJLabel4.setFont(new java.awt.Font("Showcard Gothic", 2, 11)); // NOI18N
        viewJLabel4.setText("View Item");
        viewJLabel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        viewJLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        viewJLabel4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewJLabel4ActionPerformed(evt);
            }
        });

        clearJLabel4.setBackground(new java.awt.Color(255, 255, 0));
        clearJLabel4.setFont(new java.awt.Font("Showcard Gothic", 2, 11)); // NOI18N
        clearJLabel4.setText("Clear");
        clearJLabel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        clearJLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        clearJLabel4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearJLabel4ActionPerformed(evt);
            }
        });

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Food Catalog Pictures/Mangosteen.jpg"))); // NOI18N
        jLabel10.setText("fruit 3");

        mainMenuButton3.setBackground(new java.awt.Color(255, 255, 0));
        mainMenuButton3.setFont(new java.awt.Font("Showcard Gothic", 2, 11)); // NOI18N
        mainMenuButton3.setText("Main Menu");
        mainMenuButton3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        mainMenuButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mainMenuButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainMenuButton3ActionPerformed(evt);
            }
        });

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Food Catalog Pictures/Peaches.jpg"))); // NOI18N
        jLabel11.setText("fruit 1");

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Food Catalog Pictures/Dragonfruit.jpg"))); // NOI18N
        jLabel12.setText("fruit 2");
        jLabel12.setToolTipText("");

        javax.swing.GroupLayout fruitsJPanelLayout = new javax.swing.GroupLayout(fruitsJPanel);
        fruitsJPanel.setLayout(fruitsJPanelLayout);
        fruitsJPanelLayout.setHorizontalGroup(
            fruitsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fruitsJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fruitsJPanelLayout.createSequentialGroup()
                .addGroup(fruitsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(fruitsJPanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(viewJLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(fruitsJPanelLayout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(peachRB, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pitayaRB, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(fruitsJPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(fruitsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(quitlJLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mainMenuButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(clearJLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(110, 110, 110)
                .addComponent(mangosteenRB, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91))
        );
        fruitsJPanelLayout.setVerticalGroup(
            fruitsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fruitsJPanelLayout.createSequentialGroup()
                .addGroup(fruitsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fruitsJPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(fruitsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pitayaRB))
                    .addGroup(fruitsJPanelLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(fruitsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(peachRB)
                            .addComponent(mangosteenRB))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(viewJLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(clearJLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(mainMenuButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(quitlJLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fruitsJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fruitsJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void peachRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_peachRBActionPerformed
        // changing radio buttons to select only one
        if (peachRB.isSelected()){
            pitayaRB.setSelected(false);
            mangosteenRB.setSelected(false);
        }
    }//GEN-LAST:event_peachRBActionPerformed

    private void mangosteenRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mangosteenRBActionPerformed
        // changing radio buttons so only one is selected
        if (mangosteenRB.isSelected()){
            pitayaRB.setSelected(false);
            peachRB.setSelected(false);
        }
    }//GEN-LAST:event_mangosteenRBActionPerformed

    private void pitayaRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pitayaRBActionPerformed
        // changing radio buttons so only one is selected

        if (pitayaRB.isSelected()){
            peachRB.setSelected(false);
            mangosteenRB.setSelected(false);
        }
    }//GEN-LAST:event_pitayaRBActionPerformed

    private void quitlJLabel3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitlJLabel3ActionPerformed
        // cancel
        System.exit(0);
    }//GEN-LAST:event_quitlJLabel3ActionPerformed

    private void viewJLabel4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewJLabel4ActionPerformed

        if (peachRB.isSelected()){
            JOptionPane.showMessageDialog(null, "The peach (Prunus persica) is a deciduous tree native to the region of Northwest China"
                    + "\nbetween the Tarim Basin and the north slopes of the Kunlun Mountains, where it was first domesticated and cultivated."
                    + "\nIt bears an edible juicy fruit called a peach or a nectarine." 
                    + "\nThe peach is classified with the almond in the subgenus Amygdalus, distinguished from the other subgenera by the corrugated seed shell. Due to their close relatedness, "
                    + "\nthe inside of a peach stone tastes remarkably similar to almond, and peach stones are often used to make a cheap version of marzipan, known as persipan.");
            dispose();
            FruitsJDialog obj = new FruitsJDialog();
            obj.setVisible(true);
        }
        else if(pitayaRB.isSelected()){
            JOptionPane.showMessageDialog(null, "These fruits are commonly known in English as dragon fruit, a name used since around 1993, apparently resulting from the leather-like skin"
                    + "\nand prominent scaly spikes on the fruit exterior. The names pitahaya and pitaya derive from Mexico, and pitaya roja in Central America and northern South America,"
                    + "\npossibly relating to pitahaya for names of tall cacti species with flowering fruit.The fruit may also be known as a strawberry pear or thang. "
                    + "\nThese fruits are commonly known in English as dragon fruit, a name used since around 1993, apparently resulting from the leather-like skin"
                    + "\nand prominent scaly spikes on the fruit exterior. The names pitahaya and pitaya derive from Mexico, and pitaya roja in Central America and northern South America, "
                    + "\npossibly relating to pitahaya for names of tall cacti species with flowering fruit.[2][4] The fruit may also be known as a strawberry pear or thang");
            dispose();
            FruitsJDialog obj = new FruitsJDialog();
            obj.setVisible(true);
        }
        else if(mangosteenRB.isSelected()){
            JOptionPane.showMessageDialog(null, "Mangosteen (Garcinia mangostana), also known as the purple mangosteen,"
                    + "\nis a tropical evergreen tree with edible fruit native to Island Southeast Asia. Its exact origins "
                    + "\nare unknown due to its widespread cultivation since ancient times, but it is believed to have been somewhere "
                    + "\nbetween the Sunda Islands and the Moluccas.It grows mainly in Southeast Asia, southwest India and other tropical areas such as Colombia, "
                    + "\nPuerto Rico and Florida, where the tree has been introduced."
                    + "\nThe fruit of the mangosteen is sweet and tangy, juicy, somewhat fibrous, with fluid-filled vesicles (like the flesh of citrus fruits), "
                    + "\nwith an inedible, deep reddish-purple colored rind (exocarp) when ripe.");
            dispose();
            FruitsJDialog obj = new FruitsJDialog();
            obj.setVisible(true);
        }
    }//GEN-LAST:event_viewJLabel4ActionPerformed

    private void clearJLabel4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearJLabel4ActionPerformed
        //      clears all selections and text fields
        peachRB.setSelected(false);
        pitayaRB.setSelected(false);
        mangosteenRB.setSelected(false);
    }//GEN-LAST:event_clearJLabel4ActionPerformed

    private void mainMenuButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainMenuButton3ActionPerformed
        dispose();
        MainMenuJDialog obj = new MainMenuJDialog();
        obj.setVisible(true);
    }//GEN-LAST:event_mainMenuButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(FruitsJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FruitsJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FruitsJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FruitsJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FruitsJDialog().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clearJLabel4;
    private javax.swing.JPanel fruitsJPanel;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JButton mainMenuButton3;
    private javax.swing.JRadioButton mangosteenRB;
    private javax.swing.JRadioButton peachRB;
    private javax.swing.JRadioButton pitayaRB;
    private javax.swing.JButton quitlJLabel3;
    private javax.swing.JButton viewJLabel4;
    // End of variables declaration//GEN-END:variables
}
