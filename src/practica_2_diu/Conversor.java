package practica_2_diu;

import javax.swing.JLabel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Exulonk
 */
public class Conversor extends javax.swing.JFrame {
    private String amount = "";
    /**
     * Creates new form Conversor
     */
    public Conversor() {
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
        java.awt.GridBagConstraints gridBagConstraints;

        panel = new javax.swing.JPanel();
        fromCurrency = new javax.swing.JLabel();
        fromValue = new javax.swing.JLabel();
        fromCombo = new javax.swing.JComboBox<>();
        toCurrency = new javax.swing.JLabel();
        toValue = new javax.swing.JLabel();
        toCombo = new javax.swing.JComboBox<>();
        CButton = new javax.swing.JButton();
        DButton = new javax.swing.JButton();
        sevenB = new javax.swing.JButton();
        eightB = new javax.swing.JButton();
        nineB = new javax.swing.JButton();
        fourB = new javax.swing.JButton();
        fiveB = new javax.swing.JButton();
        sixB = new javax.swing.JButton();
        oneB = new javax.swing.JButton();
        twoB = new javax.swing.JButton();
        threeB = new javax.swing.JButton();
        ceroB = new javax.swing.JButton();
        pointB = new javax.swing.JButton();
        InterChange = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel.setBackground(new java.awt.Color(244, 255, 253));
        panel.setLayout(new java.awt.GridBagLayout());

        fromCurrency.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        fromCurrency.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        fromCurrency.setText("???");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(15, 15, 0, 5);
        panel.add(fromCurrency, gridBagConstraints);

        fromValue.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        fromValue.setText("0");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(15, 0, 0, 0);
        panel.add(fromValue, gridBagConstraints);

        fromCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "EUR", "USD", "GBP" }));
        fromCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fromComboActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        panel.add(fromCombo, gridBagConstraints);

        toCurrency.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        toCurrency.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        toCurrency.setText("???");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(15, 15, 0, 5);
        panel.add(toCurrency, gridBagConstraints);

        toValue.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        toValue.setText("0");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(15, 0, 0, 0);
        panel.add(toValue, gridBagConstraints);

        toCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "EUR", "USD", "GBP" }));
        toCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toComboActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        panel.add(toCombo, gridBagConstraints);

        CButton.setText("C");
        CButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        panel.add(CButton, gridBagConstraints);

        DButton.setText("DEL");
        DButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        panel.add(DButton, gridBagConstraints);

        sevenB.setText("7");
        sevenB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sevenBActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(sevenB, gridBagConstraints);

        eightB.setText("8");
        eightB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eightBActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(eightB, gridBagConstraints);

        nineB.setText("9");
        nineB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nineBActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(nineB, gridBagConstraints);

        fourB.setText("4");
        fourB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fourBActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(fourB, gridBagConstraints);

        fiveB.setText("5");
        fiveB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fiveBActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(fiveB, gridBagConstraints);

        sixB.setText("6");
        sixB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sixBActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(sixB, gridBagConstraints);

        oneB.setText("1");
        oneB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oneBActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(oneB, gridBagConstraints);

        twoB.setText("2");
        twoB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twoBActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(twoB, gridBagConstraints);

        threeB.setText("3");
        threeB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                threeBActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(threeB, gridBagConstraints);

        ceroB.setText("0");
        ceroB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ceroBActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(ceroB, gridBagConstraints);

        pointB.setText(".");
        pointB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pointBActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(pointB, gridBagConstraints);

        InterChange.setText("EXC");
        InterChange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InterChangeActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        panel.add(InterChange, gridBagConstraints);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 153, 153));
        jLabel4.setText("From");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        panel.add(jLabel4, gridBagConstraints);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 153, 153));
        jLabel5.setText("To");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        panel.add(jLabel5, gridBagConstraints);

        jPanel1.setBackground(new java.awt.Color(224, 252, 248));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Currency Converter");
        jPanel1.add(jLabel2, new java.awt.GridBagConstraints());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 429, Short.MAX_VALUE)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fromComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fromComboActionPerformed
        String currentFromCurrency = (String) fromCombo.getSelectedItem();
        updateSimbol(currentFromCurrency,"from");
        updResult();
    }//GEN-LAST:event_fromComboActionPerformed

    private void toComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toComboActionPerformed
        String currentToCurrency = (String) toCombo.getSelectedItem();
        updateSimbol(currentToCurrency,"to");
        updResult();
    }//GEN-LAST:event_toComboActionPerformed

    private void sevenBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sevenBActionPerformed
        // TODO add your handling code here:
        updValue("7");
        updResult();
    }//GEN-LAST:event_sevenBActionPerformed

    private void eightBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eightBActionPerformed
        // TODO add your handling code here:
        updValue("8");
        updResult();
    }//GEN-LAST:event_eightBActionPerformed

    private void nineBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nineBActionPerformed
        // TODO add your handling code here:
        updValue("9");
        updResult();
    }//GEN-LAST:event_nineBActionPerformed

    private void fourBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fourBActionPerformed
        // TODO add your handling code here:
        updValue("4");
        updResult();
    }//GEN-LAST:event_fourBActionPerformed

    private void fiveBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fiveBActionPerformed
        // TODO add your handling code here:
        updValue("5");
        updResult();
    }//GEN-LAST:event_fiveBActionPerformed

    private void sixBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sixBActionPerformed
        // TODO add your handling code here:
        updValue("6");
        updResult();
    }//GEN-LAST:event_sixBActionPerformed

    private void oneBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oneBActionPerformed
        // TODO add your handling code here:
        updValue("1");
        updResult();
    }//GEN-LAST:event_oneBActionPerformed

    private void twoBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twoBActionPerformed
        // TODO add your handling code here:
        updValue("2");
        updResult();
    }//GEN-LAST:event_twoBActionPerformed

    private void threeBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_threeBActionPerformed
        // TODO add your handling code here:
        updValue("3");
        updResult();
    }//GEN-LAST:event_threeBActionPerformed

    private void ceroBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ceroBActionPerformed
        // TODO add your handling code here:
        if(!amount.equals("")) updValue("0");
        updResult();
    }//GEN-LAST:event_ceroBActionPerformed

    private void pointBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pointBActionPerformed
        // TODO add your handling code here:
        if (amount.equals("")){
            updValue("0.");
        }else{
            int n = pointsCount();
            if(pointsCount()==0) updValue(".");
        }
        updResult();
    }//GEN-LAST:event_pointBActionPerformed

    private void CButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CButtonActionPerformed
        // TODO add your handling code here:
        amount = ""; 
        updValue("");
        updResult();
    }//GEN-LAST:event_CButtonActionPerformed

    private void DButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DButtonActionPerformed
        // TODO add your handling code here:
        if(amount.length()==1){
            amount = "";
            updValue("");
        }else{
            amount = amount.substring(0, amount.length()-1);
            updValue("");
        }
        updResult();
        
    }//GEN-LAST:event_DButtonActionPerformed

    private void InterChangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InterChangeActionPerformed
        // TODO add your handling code here:
        int i = fromCombo.getSelectedIndex();
        fromCombo.setSelectedIndex(toCombo.getSelectedIndex());
        toCombo.setSelectedIndex(i);
        updResult();
    }//GEN-LAST:event_InterChangeActionPerformed

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
            java.util.logging.Logger.getLogger(Conversor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Conversor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Conversor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Conversor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Conversor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CButton;
    private javax.swing.JButton DButton;
    private javax.swing.JButton InterChange;
    private javax.swing.JButton ceroB;
    private javax.swing.JButton eightB;
    private javax.swing.JButton fiveB;
    private javax.swing.JButton fourB;
    private javax.swing.JComboBox<String> fromCombo;
    private javax.swing.JLabel fromCurrency;
    private javax.swing.JLabel fromValue;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton nineB;
    private javax.swing.JButton oneB;
    private javax.swing.JPanel panel;
    private javax.swing.JButton pointB;
    private javax.swing.JButton sevenB;
    private javax.swing.JButton sixB;
    private javax.swing.JButton threeB;
    private javax.swing.JComboBox<String> toCombo;
    private javax.swing.JLabel toCurrency;
    private javax.swing.JLabel toValue;
    private javax.swing.JButton twoB;
    // End of variables declaration//GEN-END:variables

    private void updateSimbol(String currentCurrency, String type) {
        //EUR, USD, GBP
        String res ="";
        switch(currentCurrency){
            case "EUR":
                res = "???";
                break;
            case "USD":
                res = "$";
                break;
            case "GBP":
                res = "??";
                break;
        }
        if(type.equals("from")){
            fromCurrency.setText(res);
        }else{
            toCurrency.setText(res);
        }
        
    }
    
    private void updValue(String num){
        amount += num;
        if(pointsCount() == 0){
            if(amount.equals("")){
                fromValue.setText("0");
            }else{
                fromValue.setText(amount);
            }
            
        }else{
            fromValue.setText(String.format("%.2f", Double.parseDouble(amount)));
        }
    }
    
    private void updResult(){
        if(!amount.equals("")){
            Double current = Double.parseDouble(amount);
            Double result = new Converter().convert((String)fromCombo.getSelectedItem(),(String)toCombo.getSelectedItem(),current);
            toValue.setText(String.format("%.2f", result));
        }else{
            toValue.setText("0");
        }
    }
    
    private int pointsCount(){
        int count = 0;
        for (int i = 0; i < amount.length(); i++) {
            if(amount.charAt(i) == '.') count++;
        }
        return count;
    }
}
