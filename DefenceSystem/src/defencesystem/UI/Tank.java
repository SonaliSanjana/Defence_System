/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package defencesystem.UI;

import defencesystem.SuperDefence;
import defencesystem.UI.MainController;
import defencesystem.observer.enumcls.Strength;
import defencesystem.observer.Observer;
import static defencesystem.observer.enumcls.Strength.HIGH;
import static defencesystem.observer.enumcls.Strength.LOW;
import static defencesystem.observer.enumcls.Strength.MEDIUM;
import static defencesystem.observer.enumcls.Strength.STRONG;

/**
 *
 * @author Sonali Peiris
 */
public class Tank extends SuperDefence implements Observer{
    private static Tank tank;
    private static MainController main=null;
     private static Strength strength=Strength.LOW;
    
    public static Tank getInstance(){
            if(tank==null)tank=new Tank();
            return tank;
    }
    
    public Tank() {
        initComponents();
        tankTextArea.setEditable(false);
        tankshootBtn.setEnabled(false);
        tankMObtn.setEnabled(false);
        rederOpBtn.setEnabled(false);
        rotateShootBtn.setEnabled(false);
        setResizable(false);
    }
    
    @Override
    public void setMessage(String msg){
        tankTextArea.append(msg+"\n");
    }
    
    @Override
    public void setArealbl(String lbl){
        tankArealbl.setText(lbl);
        tankTextArea.setText(null);
    }
    
    @Override
    public void clearTxtArea(){
        tankTextArea.setText(null);
   }
    
    @Override
    public void setButtonState(Strength s){
        this.strength=s;
        if(tankPositionbox.isSelected()){
            switch(strength){
            case LOW:
                tankshootBtn.setEnabled(false);
                tankMObtn.setEnabled(false);
                rederOpBtn.setEnabled(false);
                rotateShootBtn.setEnabled(false);
                break;
            case MEDIUM:
                tankshootBtn.setEnabled(true);
                tankMObtn.setEnabled(false);
                rederOpBtn.setEnabled(false);
                rotateShootBtn.setEnabled(false);
                break;
            case HIGH:
                tankshootBtn.setEnabled(true);
                tankMObtn.setEnabled(true);
                rederOpBtn.setEnabled(false);
                rotateShootBtn.setEnabled(false);
                break;
            case STRONG:
                tankshootBtn.setEnabled(true);
                tankMObtn.setEnabled(true);
                rederOpBtn.setEnabled(true);
                rotateShootBtn.setEnabled(false);
                break;
            default:
                tankshootBtn.setEnabled(true);
                tankMObtn.setEnabled(true);
                rederOpBtn.setEnabled(true);
                rotateShootBtn.setEnabled(true);
                break;
            }
        }else{
            tankshootBtn.setEnabled(false);
            tankMObtn.setEnabled(false);
            rederOpBtn.setEnabled(false);
            rotateShootBtn.setEnabled(false);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tankArealbl = new javax.swing.JLabel();
        tankshootBtn = new javax.swing.JButton();
        tankMObtn = new javax.swing.JButton();
        rederOpBtn = new javax.swing.JButton();
        tankSCLbl = new javax.swing.JLabel();
        tankjSlider = new javax.swing.JSlider();
        tankAmmoCoountlbl = new javax.swing.JLabel();
        tankAmmoCountSpinner = new javax.swing.JSpinner();
        jScrollPane1 = new javax.swing.JScrollPane();
        tankTextArea = new javax.swing.JTextArea();
        tankSolidCounterSpinner = new javax.swing.JSpinner();
        tankTextField = new javax.swing.JTextField();
        tankSendBtn = new javax.swing.JButton();
        tankPositionbox = new javax.swing.JCheckBox();
        rotateShootBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tank");

        tankArealbl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tankArealbl.setText("Area Not Cleared");

        tankshootBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tankshootBtn.setText("shoot");
        tankshootBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tankshootBtnActionPerformed(evt);
            }
        });

        tankMObtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tankMObtn.setText("Missile Operation");

        rederOpBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rederOpBtn.setText("Redar Operation");

        tankSCLbl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tankSCLbl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        tankSCLbl.setText("Solidier Count");

        tankjSlider.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tankjSlider.setMajorTickSpacing(20);
        tankjSlider.setMinorTickSpacing(10);
        tankjSlider.setOrientation(javax.swing.JSlider.VERTICAL);
        tankjSlider.setPaintLabels(true);
        tankjSlider.setPaintTicks(true);
        tankjSlider.setSnapToTicks(true);
        tankjSlider.setAlignmentX(1.0F);
        tankjSlider.setAlignmentY(1.0F);
        tankjSlider.setAutoscrolls(true);

        tankAmmoCoountlbl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tankAmmoCoountlbl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        tankAmmoCoountlbl.setText("Ammo Count");

        tankAmmoCountSpinner.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tankAmmoCountSpinner.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                ammoCountUpdate(evt);
            }
        });

        tankTextArea.setColumns(20);
        tankTextArea.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tankTextArea.setRows(5);
        jScrollPane1.setViewportView(tankTextArea);

        tankSolidCounterSpinner.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tankSolidCounterSpinner.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                soldierCountUpdate(evt);
            }
        });

        tankTextField.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tankTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tankTextFieldActionPerformed(evt);
            }
        });

        tankSendBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tankSendBtn.setText("Send");
        tankSendBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tankSendBtnActionPerformed(evt);
            }
        });

        tankPositionbox.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tankPositionbox.setText("Position");
        tankPositionbox.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                tankPositionboxStateChanged(evt);
            }
        });

        rotateShootBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rotateShootBtn.setText("Rotate Shooting");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(tankTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tankSendBtn))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(17, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tankArealbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(tankshootBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(rederOpBtn))
                                .addGap(57, 57, 57)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tankMObtn)
                                    .addComponent(rotateShootBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(tankSCLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(tankSolidCounterSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(tankAmmoCoountlbl, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                                        .addGap(20, 20, 20)
                                        .addComponent(tankAmmoCountSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(tankPositionbox, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tankjSlider, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tankjSlider, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tankSCLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tankSolidCounterSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tankAmmoCoountlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tankAmmoCountSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(tankPositionbox)
                                .addGap(15, 15, 15))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(tankArealbl, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tankshootBtn)
                                    .addComponent(tankMObtn))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(rederOpBtn)
                                    .addComponent(rotateShootBtn))
                                .addGap(26, 26, 26)))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tankTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tankSendBtn))))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tankshootBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tankshootBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tankshootBtnActionPerformed

    private void tankTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tankTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tankTextFieldActionPerformed

    private void tankSendBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tankSendBtnActionPerformed
        main=MainController.getInstance();
        main.setMessage("Tank : "+tankTextField.getText());
        tankTextField.setText(null);
    }//GEN-LAST:event_tankSendBtnActionPerformed

    private void soldierCountUpdate(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_soldierCountUpdate
        super.setSoldierCount((int)tankSolidCounterSpinner.getValue());
    }//GEN-LAST:event_soldierCountUpdate

    private void ammoCountUpdate(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_ammoCountUpdate
       super.setAmmoCount((int) tankAmmoCountSpinner.getValue());
    }//GEN-LAST:event_ammoCountUpdate

    private void tankPositionboxStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_tankPositionboxStateChanged
        if(tankPositionbox.isSelected()){
            setButtonState(strength);
        }else{
            tankshootBtn.setEnabled(false);
            tankMObtn.setEnabled(false);
            rederOpBtn.setEnabled(false);
            rotateShootBtn.setEnabled(false);
        }
    }//GEN-LAST:event_tankPositionboxStateChanged

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
            java.util.logging.Logger.getLogger(Tank.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tank.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tank.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tank.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tank().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton rederOpBtn;
    private javax.swing.JButton rotateShootBtn;
    private javax.swing.JLabel tankAmmoCoountlbl;
    private javax.swing.JSpinner tankAmmoCountSpinner;
    private javax.swing.JLabel tankArealbl;
    private javax.swing.JButton tankMObtn;
    private javax.swing.JCheckBox tankPositionbox;
    private javax.swing.JLabel tankSCLbl;
    private javax.swing.JButton tankSendBtn;
    private javax.swing.JSpinner tankSolidCounterSpinner;
    private javax.swing.JTextArea tankTextArea;
    public static javax.swing.JTextField tankTextField;
    private javax.swing.JSlider tankjSlider;
    private javax.swing.JButton tankshootBtn;
    // End of variables declaration//GEN-END:variables
}
