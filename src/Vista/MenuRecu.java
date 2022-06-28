/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import com.sun.awt.AWTUtilities;
import java.awt.Image;
import java.awt.Shape;
import java.awt.Toolkit;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JFrame;

/**
 *
 * @author danlo
 */
public class MenuRecu extends javax.swing.JFrame {

    /**
     * Creates new form MenuRecuperacion
     */
    public MenuRecu() {
        initComponents();
        this.setLocationRelativeTo(null); 
         Shape forma= new RoundRectangle2D.Double(0,0, this.getBounds() .width, this.getBounds() .height,40,40);
         AWTUtilities. setWindowShape(this, forma);
         setIconImage(Logo());
    }
public Image Logo(){
    Image retvalue=Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Recursos_Proyecto/LogoB&GDash.png"));
    return retvalue;
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelFondo = new Controles_Personalizados.Paneles.PanelRound();
        QR1 = new javax.swing.JLabel();
        btnDatosBio = new Controles_Personalizados.Botones.UWPButton();
        PanelContenedorImg = new Controles_Personalizados.Paneles.PanelRound();
        Iamgen = new javax.swing.JLabel();
        btnGoBack = new javax.swing.JLabel();
        btnCorreo = new Controles_Personalizados.Botones.UWPButton();
        QR = new javax.swing.JLabel();
        btnQR = new Controles_Personalizados.Botones.UWPButton();
        PIN = new javax.swing.JLabel();
        btnPIN = new Controles_Personalizados.Botones.UWPButton();
        Sobre = new javax.swing.JLabel();
        lblText = new javax.swing.JLabel();
        btnMinimizar = new javax.swing.JLabel();
        btnCerrar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelFondo.setBackground(new java.awt.Color(42, 36, 56));
        PanelFondo.setPreferredSize(new java.awt.Dimension(1366, 768));
        PanelFondo.setRoundBottomLeft(40);
        PanelFondo.setRoundBottomRight(40);
        PanelFondo.setRoundTopLeft(40);
        PanelFondo.setRoundTopRight(40);
        PanelFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        QR1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos_Proyecto/bxs-face-mask 1.png"))); // NOI18N
        PanelFondo.add(QR1, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 560, -1, 50));

        btnDatosBio.setBackground(new java.awt.Color(42, 36, 56));
        btnDatosBio.setForeground(new java.awt.Color(254, 254, 254));
        btnDatosBio.setText("Datos Biometricos");
        btnDatosBio.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        btnDatosBio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDatosBioActionPerformed(evt);
            }
        });
        PanelFondo.add(btnDatosBio, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 560, 240, 50));

        PanelContenedorImg.setBackground(new java.awt.Color(254, 254, 254));
        PanelContenedorImg.setPreferredSize(new java.awt.Dimension(698, 768));
        PanelContenedorImg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Iamgen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos_Proyecto/OlvideImg.png"))); // NOI18N
        PanelContenedorImg.add(Iamgen, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, -1, -1));

        btnGoBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos_Proyecto/bxs-left-arrow-circle 1.png"))); // NOI18N
        btnGoBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGoBackMouseClicked(evt);
            }
        });
        PanelContenedorImg.add(btnGoBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        PanelFondo.add(PanelContenedorImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        btnCorreo.setBackground(new java.awt.Color(42, 36, 56));
        btnCorreo.setForeground(new java.awt.Color(254, 254, 254));
        btnCorreo.setText("Correo Electronico");
        btnCorreo.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        btnCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCorreoActionPerformed(evt);
            }
        });
        PanelFondo.add(btnCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 320, 240, 50));

        QR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos_Proyecto/bx-qr 1.png"))); // NOI18N
        PanelFondo.add(QR, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 480, -1, 50));

        btnQR.setBackground(new java.awt.Color(42, 36, 56));
        btnQR.setForeground(new java.awt.Color(254, 254, 254));
        btnQR.setText("Codigo QR");
        btnQR.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        btnQR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQRActionPerformed(evt);
            }
        });
        PanelFondo.add(btnQR, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 480, 240, 50));

        PIN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos_Proyecto/bxs-lock-alt 1.png"))); // NOI18N
        PanelFondo.add(PIN, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 400, -1, 50));

        btnPIN.setBackground(new java.awt.Color(42, 36, 56));
        btnPIN.setForeground(new java.awt.Color(254, 254, 254));
        btnPIN.setText("PIN de seguridad");
        btnPIN.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        btnPIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPINActionPerformed(evt);
            }
        });
        PanelFondo.add(btnPIN, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 400, 240, 50));

        Sobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos_Proyecto/bxs-envelope 1.png"))); // NOI18N
        PanelFondo.add(Sobre, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 320, -1, 50));

        lblText.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos_Proyecto/OlvideContraText.png"))); // NOI18N
        PanelFondo.add(lblText, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 120, -1, -1));

        btnMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos_Proyecto/MinimizarLogin.png"))); // NOI18N
        btnMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMinimizarMouseClicked(evt);
            }
        });
        PanelFondo.add(btnMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 20, -1, -1));

        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos_Proyecto/CerrarLogin.png"))); // NOI18N
        btnCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnCerrarMousePressed(evt);
            }
        });
        PanelFondo.add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1330, 20, -1, -1));

        getContentPane().add(PanelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDatosBioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDatosBioActionPerformed
        // TODO add your handling code here:
        RecuBio rec = new RecuBio();
        rec.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnDatosBioActionPerformed

    private void btnGoBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGoBackMouseClicked
        // TODO add your handling code here:
        FrmLogin log = new FrmLogin();
        log.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnGoBackMouseClicked

    private void btnCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCorreoActionPerformed
        // TODO add your handling code here:
        RecuCorreo rec = new RecuCorreo();
        rec.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCorreoActionPerformed

    private void btnQRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQRActionPerformed
        // TODO add your handling code here:
        RecuQR rec = new RecuQR();
        rec.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnQRActionPerformed

    private void btnPINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPINActionPerformed
        // TODO add your handling code here:
        RecuPIN rec = new RecuPIN();
        rec.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnPINActionPerformed

    private void btnCerrarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarMousePressed
        System.exit(0);
    }//GEN-LAST:event_btnCerrarMousePressed

    private void btnMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizarMouseClicked
        // TODO add your handling code here:
        this.setExtendedState(JFrame.ICONIFIED);
    }//GEN-LAST:event_btnMinimizarMouseClicked

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
            java.util.logging.Logger.getLogger(MenuRecu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuRecu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuRecu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuRecu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuRecu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Iamgen;
    private javax.swing.JLabel PIN;
    private Controles_Personalizados.Paneles.PanelRound PanelContenedorImg;
    private Controles_Personalizados.Paneles.PanelRound PanelFondo;
    private javax.swing.JLabel QR;
    private javax.swing.JLabel QR1;
    private javax.swing.JLabel Sobre;
    private javax.swing.JLabel btnCerrar;
    private Controles_Personalizados.Botones.UWPButton btnCorreo;
    private Controles_Personalizados.Botones.UWPButton btnDatosBio;
    private javax.swing.JLabel btnGoBack;
    private javax.swing.JLabel btnMinimizar;
    private Controles_Personalizados.Botones.UWPButton btnPIN;
    private Controles_Personalizados.Botones.UWPButton btnQR;
    private javax.swing.JLabel lblText;
    // End of variables declaration//GEN-END:variables
}
