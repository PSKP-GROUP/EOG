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
public class UpdateOpgaveGUI extends javax.swing.JFrame {

    private OpgaveHandler opgaveHandler;
    private BeboerHandler beboerHandler;

    /**
     * Creates new form UpdateOpgaveGUI
     * @param opgaveHandler
     * @param beboerHandler
     */
    public UpdateOpgaveGUI(OpgaveHandler opgaveHandler, BeboerHandler beboerHandler) {
        initComponents();
        this.opgaveHandler = opgaveHandler;
        this.beboerHandler = beboerHandler;
    }

    private void populateLists() {
        DefaultComboBoxModel dcbmBeboer = new DefaultComboBoxModel();
        Iterator<Beboer> iteratorBeboer = beboerHandler.getBeboere().iterator();

        while (iteratorBeboer.hasNext()) {
            Beboer beboer = iteratorBeboer.next();
            dcbmBeboer.addElement(beboer);
        }
        BeboerComboBox.setModel(dcbmBeboer);

        DefaultComboBoxModel dcbmOpgave = new DefaultComboBoxModel();
        Iterator<Opgave> iteratorOpgave = opgaveHandler.getOpgaver().iterator();

        while (iteratorOpgave.hasNext()) {
            Opgave opgave = iteratorOpgave.next();
            dcbmOpgave.addElement(opgave);
        }

        OpgaveComboBox.setModel(dcbmOpgave);
    }

    public void showInfo(Opgave opgave) {
        Beboer beboer = beboerHandler.getBeboer(opgave.getIdBeboer());
        BeboerComboBox.setSelectedItem(beboer);
        DatoTF.setText(opgave.getDateForTask());
        TidTF.setText(opgave.getDeadlineTime());
        DescTA.setText(opgave.getDescription());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        OpgaveLabel = new javax.swing.JLabel();
        OpgaveComboBox = new javax.swing.JComboBox();
        InfoLabel = new javax.swing.JLabel();
        DatoTF = new javax.swing.JTextField();
        TidTF = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        DescTA = new javax.swing.JTextArea();
        BeboerComboBox = new javax.swing.JComboBox();
        BeboerLabel = new javax.swing.JLabel();
        DatoLabel = new javax.swing.JLabel();
        TidLabel = new javax.swing.JLabel();
        CancelButton = new javax.swing.JButton();
        GemButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        AfbudsdatoTF = new javax.swing.JTextField();
        BekrivelseLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Rediger Opgave");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        OpgaveLabel.setText("Opgaver");

        OpgaveComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        OpgaveComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpgaveComboBoxActionPerformed(evt);
            }
        });

        InfoLabel.setText("Info om Opgave");

        DescTA.setColumns(20);
        DescTA.setRows(5);
        jScrollPane1.setViewportView(DescTA);

        BeboerComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        BeboerLabel.setText("Beboer");

        DatoLabel.setText("Dato");

        TidLabel.setText("Tid");

        CancelButton.setText("Cancel");
        CancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelButtonActionPerformed(evt);
            }
        });

        GemButton.setText("Gem");
        GemButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GemButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Afbudsdato");

        BekrivelseLabel.setText("Beskrivelse");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(OpgaveLabel)
                    .addComponent(OpgaveComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 142, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BekrivelseLabel)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(CancelButton)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(GemButton))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(InfoLabel))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(DatoLabel, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TidLabel, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BeboerLabel, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(DatoTF)
                                .addComponent(TidTF)
                                .addComponent(BeboerComboBox, 0, 68, Short.MAX_VALUE))
                            .addComponent(AfbudsdatoTF, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(OpgaveLabel)
                    .addComponent(InfoLabel))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(OpgaveComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BeboerComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BeboerLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DatoLabel)
                    .addComponent(DatoTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TidLabel)
                    .addComponent(TidTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(AfbudsdatoTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addComponent(BekrivelseLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CancelButton)
                    .addComponent(GemButton))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        populateLists();
        showInfo((Opgave) OpgaveComboBox.getSelectedItem());
    }//GEN-LAST:event_formWindowOpened

    private void OpgaveComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpgaveComboBoxActionPerformed
        Opgave opgave = (Opgave) OpgaveComboBox.getSelectedItem();
        showInfo(opgave);
    }//GEN-LAST:event_OpgaveComboBoxActionPerformed

    private void CancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelButtonActionPerformed
        dispose();
    }//GEN-LAST:event_CancelButtonActionPerformed

    private void GemButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GemButtonActionPerformed
        Opgave opgave = (Opgave) OpgaveComboBox.getSelectedItem();
        Beboer beboer = (Beboer) BeboerComboBox.getSelectedItem();
        int opgaveId = opgave.getId();
        String description = DescTA.getText();
        String dateForTask = DatoTF.getText();
        String deadlineTime = TidTF.getText();
        String afbudsdato = AfbudsdatoTF.getText();
        int beboerId = beboer.getId();
        if(description.isEmpty() || dateForTask.isEmpty() || deadlineTime.isEmpty() || afbudsdato.isEmpty()){
            System.out.println("Udfyld alle felter");   
        } else{
        opgaveHandler.updateOpgave(opgaveId, description, dateForTask, deadlineTime, afbudsdato, beboerId);
        }
    }//GEN-LAST:event_GemButtonActionPerformed

    /**
     * @param args the command line arguments
     */



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AfbudsdatoTF;
    private javax.swing.JComboBox BeboerComboBox;
    private javax.swing.JLabel BeboerLabel;
    private javax.swing.JLabel BekrivelseLabel;
    private javax.swing.JButton CancelButton;
    private javax.swing.JLabel DatoLabel;
    private javax.swing.JTextField DatoTF;
    private javax.swing.JTextArea DescTA;
    private javax.swing.JButton GemButton;
    private javax.swing.JLabel InfoLabel;
    private javax.swing.JComboBox OpgaveComboBox;
    private javax.swing.JLabel OpgaveLabel;
    private javax.swing.JLabel TidLabel;
    private javax.swing.JTextField TidTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
