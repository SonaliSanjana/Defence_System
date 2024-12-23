
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package defencesystem.UI;

import defencesystem.SuperDefence;
import defencesystem.observer.enumcls.Strength;
import defencesystem.observer.Observer;
import static defencesystem.observer.enumcls.Strength.HIGH;
import static defencesystem.observer.enumcls.Strength.LOW;
import static defencesystem.observer.enumcls.Strength.MEDIUM;

/**
 *
 * @author Sonali Peiris
 */
public class Helicopter extends SuperDefence implements Observer{
    private static Helicopter helicopter;
    private static MainController main=null;
    private static Strength strength=Strength.LOW;
    
    public Helicopter() {
        initComponents();
        helicopterTextArea.setEditable(false);
        helicopterShootbtn.setEnabled(false);
        helicopterMissileOpBtn.setEnabled(false);
        helicopterLaserOpbtn.setEnabled(false);
        setResizable(false);
    }
    
    @Override
    public void setMessage(String msg){
        helicopterTextArea.append(msg+"\n");
    }
    
    @Override
    public void setArealbl(String lbl){
        helicopterANClbl.setText(lbl);
        helicopterTextArea.setText(null);
    }
    
    public static Helicopter getInstance(){
        if(helicopter == null) helicopter = new Helicopter();       
        return helicopter;
    }
    
    @Override
    public void clearTxtArea(){
        helicopterTextArea.setText(null);
   }
    
    @Override
    public void setButtonState(Strength s){
        this.strength=s;
        if(positionBox.isSelected()){
            switch( strength){
            case LOW:
                helicopterShootbtn.setEnabled(false);
                helicopterMissileOpBtn.setEnabled(false);
                helicopterLaserOpbtn.setEnabled(false);
                break;
            case MEDIUM:
                helicopterShootbtn.setEnabled(true);
                helicopterMissileOpBtn.setEnabled(false);
                helicopterLaserOpbtn.setEnabled(false);
                break;
            case HIGH:
                helicopterShootbtn.setEnabled(true);
                helicopterMissileOpBtn.setEnabled(true);
                helicopterLaserOpbtn.setEnabled(false);
                break;
            default://Strong and Close
                helicopterShootbtn.setEnabled(true);
                helicopterMissileOpBtn.setEnabled(true);
                helicopterLaserOpbtn.setEnabled(true);
                break;
            }
        }else{
           helicopterShootbtn.setEnabled(false);
           helicopterMissileOpBtn.setEnabled(false);
           helicopterLaserOpbtn.setEnabled(false); 
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        helicopterANClbl = new javax.swing.JLabel();
        helicopterShootbtn = new javax.swing.JButton();
        helicopterMissileOpBtn = new javax.swing.JButton();
        helicopterLaserOpbtn = new javax.swing.JButton();
        helicopterSolidCountLbl = new javax.swing.JLabel();
        helicopterSlider = new javax.swing.JSlider();
        helicopterAmmoCountLbl = new javax.swing.JLabel();
        helicopterAmmoCountSpinner = new javax.swing.JSpinner();
        jScrollPane1 = new javax.swing.JScrollPane();
        helicopterTextArea = new javax.swing.JTextArea();
        helicopterSolidCountSpinner = new javax.swing.JSpinner();
        helicopterTextField = new javax.swing.JTextField();
        helicopterSendBtn = new javax.swing.JButton();
        positionBox = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Helicopter");

        helicopterANClbl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        helicopterANClbl.setText("Area Not Cleared");

        helicopterShootbtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        helicopterShootbtn.setText("shoot");
        helicopterShootbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helicopterShootbtnActionPerformed(evt);
            }
        });

        helicopterMissileOpBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        helicopterMissileOpBtn.setText("Missile Operation");
        helicopterMissileOpBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helicopterMissileOpBtnActionPerformed(evt);
            }
        });

        helicopterLaserOpbtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        helicopterLaserOpbtn.setText("Laser Operation");

        helicopterSolidCountLbl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        helicopterSolidCountLbl.setText("Solidier Count");

        helicopterSlider.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        helicopterSlider.setMajorTickSpacing(20);
        helicopterSlider.setMinorTickSpacing(10);
        helicopterSlider.setOrientation(javax.swing.JSlider.VERTICAL);
        helicopterSlider.setPaintLabels(true);
        helicopterSlider.setPaintTicks(true);
        helicopterSlider.setAlignmentX(5.0F);
        helicopterSlider.setAlignmentY(1.0F);
        helicopterSlider.setAutoscrolls(true);

        helicopterAmmoCountLbl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        helicopterAmmoCountLbl.setText("Ammo Count");

        helicopterAmmoCountSpinner.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        helicopterAmmoCountSpinner.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                ammoCountUpdate(evt);
            }
        });

        helicopterTextArea.setColumns(20);
        helicopterTextArea.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        helicopterTextArea.setRows(5);
        jScrollPane1.setViewportView(helicopterTextArea);

        helicopterSolidCountSpinner.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        helicopterSolidCountSpinner.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                SoldierCountUpdate(evt);
            }
        });

        helicopterTextField.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        helicopterTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helicopterTextFieldActionPerformed(evt);
            }
        });

        helicopterSendBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        helicopterSendBtn.setText("Send");
        helicopterSendBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helicopterSendBtnActionPerformed(evt);
            }
        });

        positionBox.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        positionBox.setText("Position");
        positionBox.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                positionBoxStateChanged(evt);
            }
        });
        positionBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                positionBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(helicopterANClbl, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(87, 87, 87)
                        .addComponent(helicopterSolidCountLbl)
                        .addGap(34, 34, 34)
                        .addComponent(helicopterSolidCountSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(helicopterShootbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(helicopterMissileOpBtn)
                        .addGap(31, 31, 31)
                        .addComponent(helicopterAmmoCountLbl)
                        .addGap(41, 41, 41)
                        .addComponent(helicopterAmmoCountSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(helicopterLaserOpbtn)
                        .addGap(313, 313, 313)
                        .addComponent(positionBox, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(helicopterTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addComponent(helicopterSendBtn)))
                .addGap(12, 12, 12)
                .addComponent(helicopterSlider, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(helicopterANClbl, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(helicopterSolidCountLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(helicopterSolidCountSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(helicopterShootbtn)
                            .addComponent(helicopterMissileOpBtn)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(helicopterAmmoCountLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(helicopterAmmoCountSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(helicopterLaserOpbtn)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(positionBox)))
                        .addGap(17, 17, 17)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(helicopterTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(helicopterSendBtn)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(helicopterSlider, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void helicopterShootbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_helicopterShootbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_helicopterShootbtnActionPerformed

    private void helicopterTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_helicopterTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_helicopterTextFieldActionPerformed

    private void helicopterSendBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_helicopterSendBtnActionPerformed
        main=MainController.getInstance();
        main.setMessage("Helicopter : "+helicopterTextField.getText());
        helicopterTextField.setText(null);
    }//GEN-LAST:event_helicopterSendBtnActionPerformed

    private void SoldierCountUpdate(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_SoldierCountUpdate
        super.setSoldierCount((int) helicopterSolidCountSpinner.getValue());
    }//GEN-LAST:event_SoldierCountUpdate

    private void ammoCountUpdate(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_ammoCountUpdate
       super.setAmmoCount((int) helicopterAmmoCountSpinner.getValue());
    }//GEN-LAST:event_ammoCountUpdate

    private void positionBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_positionBoxActionPerformed
        if(positionBox.isSelected()==false){
         helicopterShootbtn.setEnabled(false);
         helicopterMissileOpBtn.setEnabled(false);
         helicopterLaserOpbtn.setEnabled(false);
        }
    }//GEN-LAST:event_positionBoxActionPerformed

    private void positionBoxStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_positionBoxStateChanged
        if(positionBox.isSelected()){
            setButtonState(strength);
        }else{
            helicopterShootbtn.setEnabled(false);
            helicopterMissileOpBtn.setEnabled(false);
            helicopterLaserOpbtn.setEnabled(false); 
        }
    }//GEN-LAST:event_positionBoxStateChanged

    private void helicopterMissileOpBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_helicopterMissileOpBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_helicopterMissileOpBtnActionPerformed

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
            java.util.logging.Logger.getLogger(Helicopter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Helicopter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Helicopter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Helicopter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Helicopter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel helicopterANClbl;
    private javax.swing.JLabel helicopterAmmoCountLbl;
    private javax.swing.JSpinner helicopterAmmoCountSpinner;
    private javax.swing.JButton helicopterLaserOpbtn;
    private javax.swing.JButton helicopterMissileOpBtn;
    private javax.swing.JButton helicopterSendBtn;
    private javax.swing.JButton helicopterShootbtn;
    private javax.swing.JSlider helicopterSlider;
    private javax.swing.JLabel helicopterSolidCountLbl;
    private javax.swing.JSpinner helicopterSolidCountSpinner;
    private javax.swing.JTextArea helicopterTextArea;
    public static javax.swing.JTextField helicopterTextField;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JCheckBox positionBox;
    // End of variables declaration//GEN-END:variables
}
