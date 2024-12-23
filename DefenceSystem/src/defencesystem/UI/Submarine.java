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
public class Submarine extends SuperDefence implements Observer{
    private static Submarine sub;
    private static MainController main=null;
    private static Strength strength=Strength.LOW;
    
    public static Submarine getInstance(){
        if(sub==null) sub = new Submarine();
        return sub;
    }
    
    public Submarine() {
        initComponents();
        submarineTextArea.setEditable(false);
        submarineShootbtn.setEnabled(false);
        submarineSonarOpbtn.setEnabled(false);
        submarineTomahawkMissilebtn.setEnabled(false);
        tridentbtn.setEnabled(false);
        setResizable(false);
    }
    
    @Override
    public void setMessage(String msg){
        submarineTextArea.append(msg+"\n");
    }
    
    @Override
    public void setArealbl(String lbl){
        submarineANCLbl.setText(lbl);
    }
    
    @Override
    public void clearTxtArea(){
        submarineTextArea.setText(null);
   }
    
    @Override
    public void setButtonState(Strength s){
        this.strength=s;
        if(submarinepositionBox.isSelected()){
            switch(strength){
            case LOW:
                submarineShootbtn.setEnabled(false);
                submarineSonarOpbtn.setEnabled(false);
                submarineTomahawkMissilebtn.setEnabled(false);
                tridentbtn.setEnabled(false);
                break;
            case MEDIUM:
                submarineShootbtn.setEnabled(true);
                submarineSonarOpbtn.setEnabled(false);
                submarineTomahawkMissilebtn.setEnabled(false);
                tridentbtn.setEnabled(false);
                break;
            case HIGH:
                submarineShootbtn.setEnabled(true);
                submarineSonarOpbtn.setEnabled(true);
                submarineTomahawkMissilebtn.setEnabled(false);
                tridentbtn.setEnabled(false);
                break;
            case STRONG:
                submarineShootbtn.setEnabled(true);
                submarineSonarOpbtn.setEnabled(true);
                submarineTomahawkMissilebtn.setEnabled(true);
                tridentbtn.setEnabled(false);
                break;
            default:
                submarineShootbtn.setEnabled(true);
                submarineSonarOpbtn.setEnabled(true);
                submarineTomahawkMissilebtn.setEnabled(true);
                tridentbtn.setEnabled(true);
                break;
            }
        }else{
            submarineShootbtn.setEnabled(false);
            submarineSonarOpbtn.setEnabled(false);
            submarineTomahawkMissilebtn.setEnabled(false);
            tridentbtn.setEnabled(false);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSlider1 = new javax.swing.JSlider();
        submarineANCLbl = new javax.swing.JLabel();
        submarineShootbtn = new javax.swing.JButton();
        submarineSonarOpbtn = new javax.swing.JButton();
        submarineTomahawkMissilebtn = new javax.swing.JButton();
        submarineSolidCountlbl = new javax.swing.JLabel();
        submarineAmmoCountlbl = new javax.swing.JLabel();
        submarineSolidCountSpinne = new javax.swing.JSpinner();
        jScrollPane1 = new javax.swing.JScrollPane();
        submarineTextArea = new javax.swing.JTextArea();
        submarineAmmoCountspinner = new javax.swing.JSpinner();
        submarineTextField = new javax.swing.JTextField();
        submarineSendBtn = new javax.swing.JButton();
        submarinepositionBox = new javax.swing.JCheckBox();
        tridentbtn = new javax.swing.JButton();
        enegySlider = new javax.swing.JSlider();
        oxygenSlider = new javax.swing.JSlider();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        jSlider1.setMajorTickSpacing(20);
        jSlider1.setMinorTickSpacing(10);
        jSlider1.setOrientation(javax.swing.JSlider.VERTICAL);
        jSlider1.setPaintLabels(true);
        jSlider1.setPaintTicks(true);
        jSlider1.setSnapToTicks(true);
        jSlider1.setAlignmentX(1.0F);
        jSlider1.setAlignmentY(1.0F);
        jSlider1.setAutoscrolls(true);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Submarine");

        submarineANCLbl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        submarineANCLbl.setText("Area Not Cleared");

        submarineShootbtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        submarineShootbtn.setText("shoot");
        submarineShootbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submarineShootbtnActionPerformed(evt);
            }
        });

        submarineSonarOpbtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        submarineSonarOpbtn.setText("Sonar Operation");

        submarineTomahawkMissilebtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        submarineTomahawkMissilebtn.setText("Tomahawk Missile");

        submarineSolidCountlbl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        submarineSolidCountlbl.setText("Solidier Count");

        submarineAmmoCountlbl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        submarineAmmoCountlbl.setText("Ammo Count");

        submarineSolidCountSpinne.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        submarineSolidCountSpinne.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                soldierCountUpdate(evt);
            }
        });

        submarineTextArea.setColumns(20);
        submarineTextArea.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        submarineTextArea.setRows(5);
        jScrollPane1.setViewportView(submarineTextArea);

        submarineAmmoCountspinner.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        submarineAmmoCountspinner.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                ammoCountUpdate(evt);
            }
        });

        submarineTextField.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        submarineTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submarineTextFieldActionPerformed(evt);
            }
        });

        submarineSendBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        submarineSendBtn.setText("Send");
        submarineSendBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submarineSendBtnActionPerformed(evt);
            }
        });

        submarinepositionBox.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        submarinepositionBox.setText("Position");
        submarinepositionBox.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                submarinepositionBoxStateChanged(evt);
            }
        });

        tridentbtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tridentbtn.setText("Trident-2 Missile");

        enegySlider.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        enegySlider.setMajorTickSpacing(20);
        enegySlider.setMinorTickSpacing(10);
        enegySlider.setOrientation(javax.swing.JSlider.VERTICAL);
        enegySlider.setPaintLabels(true);
        enegySlider.setPaintTicks(true);
        enegySlider.setSnapToTicks(true);
        enegySlider.setAlignmentX(1.0F);
        enegySlider.setAlignmentY(1.0F);
        enegySlider.setAutoscrolls(true);

        oxygenSlider.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        oxygenSlider.setMajorTickSpacing(20);
        oxygenSlider.setMinorTickSpacing(10);
        oxygenSlider.setOrientation(javax.swing.JSlider.VERTICAL);
        oxygenSlider.setPaintLabels(true);
        oxygenSlider.setPaintTicks(true);
        oxygenSlider.setSnapToTicks(true);
        oxygenSlider.setAlignmentX(1.0F);
        oxygenSlider.setAlignmentY(1.0F);
        oxygenSlider.setAutoscrolls(true);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Enegy");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Oxygen");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(submarineTomahawkMissilebtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tridentbtn))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(submarineANCLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(submarineShootbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(submarineSonarOpbtn)))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(submarineAmmoCountlbl)
                                    .addComponent(submarineSolidCountlbl))
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(submarineAmmoCountspinner, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(submarineSolidCountSpinne, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(submarinepositionBox, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(submarineTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(submarineSendBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addComponent(jLabel5)
                        .addGap(22, 22, 22))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(enegySlider, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addComponent(oxygenSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(enegySlider, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(oxygenSlider, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(submarineANCLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(submarineSolidCountlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(submarineSolidCountSpinne, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(submarineShootbtn)
                            .addComponent(submarineSonarOpbtn)
                            .addComponent(submarineAmmoCountlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(submarineAmmoCountspinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(submarineTomahawkMissilebtn)
                            .addComponent(tridentbtn)
                            .addComponent(submarinepositionBox, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(submarineSendBtn)
                            .addComponent(submarineTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submarineShootbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submarineShootbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_submarineShootbtnActionPerformed

    private void submarineTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submarineTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_submarineTextFieldActionPerformed

    private void submarineSendBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submarineSendBtnActionPerformed
        main=MainController.getInstance();
        main.setMessage("Submarine : "+submarineTextField.getText());
        submarineTextField.setText(null);
    }//GEN-LAST:event_submarineSendBtnActionPerformed

    private void soldierCountUpdate(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_soldierCountUpdate
       super.setSoldierCount((int)submarineSolidCountSpinne.getValue());
    }//GEN-LAST:event_soldierCountUpdate

    private void ammoCountUpdate(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_ammoCountUpdate
        super.setAmmoCount((int) submarineAmmoCountspinner.getValue());
    }//GEN-LAST:event_ammoCountUpdate

    private void submarinepositionBoxStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_submarinepositionBoxStateChanged
        if(submarinepositionBox.isSelected()){
            setButtonState(strength);
        }else{
            submarineShootbtn.setEnabled(false);
            submarineSonarOpbtn.setEnabled(false);
            submarineTomahawkMissilebtn.setEnabled(false);
            tridentbtn.setEnabled(false);        }
    }//GEN-LAST:event_submarinepositionBoxStateChanged

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
            java.util.logging.Logger.getLogger(Submarine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Submarine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Submarine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Submarine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Submarine().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSlider enegySlider;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JSlider oxygenSlider;
    private javax.swing.JLabel submarineANCLbl;
    private javax.swing.JLabel submarineAmmoCountlbl;
    private javax.swing.JSpinner submarineAmmoCountspinner;
    private javax.swing.JButton submarineSendBtn;
    private javax.swing.JButton submarineShootbtn;
    private javax.swing.JSpinner submarineSolidCountSpinne;
    private javax.swing.JLabel submarineSolidCountlbl;
    private javax.swing.JButton submarineSonarOpbtn;
    public javax.swing.JTextArea submarineTextArea;
    private static javax.swing.JTextField submarineTextField;
    private javax.swing.JButton submarineTomahawkMissilebtn;
    private javax.swing.JCheckBox submarinepositionBox;
    private javax.swing.JButton tridentbtn;
    // End of variables declaration//GEN-END:variables
}
