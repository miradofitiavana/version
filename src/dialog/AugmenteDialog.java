/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dialog;

import fenetre.AugmenteBox;

/**
 *
 * @author Mirado
 */
public class AugmenteDialog extends javax.swing.JPanel {
    AugmenteBox ab;
    /**
     * Creates new form AugmenteBox
     */
    public AugmenteDialog(AugmenteBox ab) {
        this.ab = ab;
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

        demandeavance = new javax.swing.JButton();
        listedemandes = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(368, 152));
        setMinimumSize(new java.awt.Dimension(368, 152));
        setPreferredSize(new java.awt.Dimension(368, 152));

        demandeavance.setBackground(new java.awt.Color(204, 204, 204));
        demandeavance.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        demandeavance.setText("Demander augmentation");

        listedemandes.setBackground(new java.awt.Color(204, 204, 204));
        listedemandes.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        listedemandes.setText("Liste demandes");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(demandeavance, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                    .addComponent(listedemandes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(80, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(demandeavance, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(listedemandes, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton demandeavance;
    private javax.swing.JButton listedemandes;
    // End of variables declaration//GEN-END:variables
}
