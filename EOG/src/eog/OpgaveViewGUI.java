/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eog;

import java.util.Iterator;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author Patrick
 */
public class OpgaveViewGUI extends javax.swing.JFrame {

    private BeboerHandler bHandler;
    private OpgaveHandler oHandler;
    
    /**
     * Creates new form OpgaveViewGUI
     * @param oHandler
     * @param bHandler
     */
    public OpgaveViewGUI(OpgaveHandler oHandler, BeboerHandler bHandler) {
        initComponents();
        this.oHandler = oHandler;
        this.bHandler = bHandler;
        
    }
    
    private void populateList() {
        DefaultComboBoxModel dcbm = new DefaultComboBoxModel();
        Iterator<Opgave> i = oHandler.getOpgaver().iterator();
        
        while(i.hasNext()) {
            dcbm.addElement(i.next());
        }
        jComboBox1.setModel(dcbm);
    }
    
    private void setInfos(Opgave o) {
        title_Label.setText(o.getTitle());
        desc_Label.setText(o.getDescription());
        datething_Label.setText(o.getDateForTask());
        afbudsdato_Label.setText(o.getAfbudsdato());
        Beboer b = bHandler.getBeboer(o.getIdBeboer());
        if(b != null) {
            beboer_Label.setText(b.toString());
        } else {
            beboer_Label.setText("Ingen beboer tildelt");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        beboer_Label = new javax.swing.JLabel();
        datething_Label = new javax.swing.JLabel();
        desc_Label = new javax.swing.JLabel();
        title_Label = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        afbudsdato_Label = new javax.swing.JLabel();
        afmeldButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Vis opgaver");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });

        jLabel1.setText("Opgaver");

        jLabel2.setText("Title:");

        jLabel3.setText("Beskrivelse:");

        jLabel4.setText("Dato for udførelse:");

        jLabel5.setText("Tildelt beboer:");

        beboer_Label.setText("jLabel6");

        datething_Label.setText("jLabel7");

        desc_Label.setText("jLabel8");

        title_Label.setText("jLabel9");

        jLabel6.setText("Afbudsdato");

        afbudsdato_Label.setText("jLabel7");

        afmeldButton.setText("Afmeld");
        afmeldButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                afmeldButtonActionPerformed(evt);
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
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(afbudsdato_Label)
                            .addComponent(datething_Label)
                            .addComponent(desc_Label)
                            .addComponent(title_Label)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(beboer_Label)
                                .addGap(18, 18, 18)
                                .addComponent(afmeldButton)))
                        .addGap(0, 291, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(title_Label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(desc_Label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(datething_Label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(afbudsdato_Label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(beboer_Label)
                    .addComponent(afmeldButton))
                .addContainerGap(215, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        setInfos((Opgave)jComboBox1.getSelectedItem());
    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void afmeldButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_afmeldButtonActionPerformed
        Opgave opgave = (Opgave)jComboBox1.getSelectedItem();
        oHandler.setBeboer(opgave.getId(), 0);
        setInfos(opgave);
    }//GEN-LAST:event_afmeldButtonActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        populateList();
        setInfos((Opgave)jComboBox1.getSelectedItem());
    }//GEN-LAST:event_formWindowActivated

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel afbudsdato_Label;
    private javax.swing.JButton afmeldButton;
    private javax.swing.JLabel beboer_Label;
    private javax.swing.JLabel datething_Label;
    private javax.swing.JLabel desc_Label;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel title_Label;
    // End of variables declaration//GEN-END:variables
}
