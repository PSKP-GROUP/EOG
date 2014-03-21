/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eog;

/**
 *
 * @author Patrick
 */
public class EOG {

    private BeboerRegister bRegister;
    private OpgaveRegister oRegister;
    
    private BeboerHandler bHandler;
    private OpgaveHandler oHandler;
    
    private OpretBeboerGUI obGUI;
    private OpretOpgaveGUI ooGUI;
    private MenuGUI menuGUI;

    public EOG() {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(OpretBeboerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OpretBeboerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OpretBeboerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OpretBeboerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        bRegister = new BeboerRegister();
        oRegister = new OpgaveRegister();
        
        bHandler = new BeboerHandler(bRegister);
        oHandler = new OpgaveHandler(oRegister);
        
        obGUI = new OpretBeboerGUI(bHandler);
        ooGUI = new OpretOpgaveGUI(oHandler);
        menuGUI = new MenuGUI(obGUI, ooGUI);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EOG eog = new EOG();
        eog.oRegister.createOpgave("bæ", "bæ", "bæ", "bæ");
        eog.oRegister.setBeboer(5, null);
        eog.menuGUI.setVisible(true);
    }

}
