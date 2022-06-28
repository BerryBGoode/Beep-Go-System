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
public class RecuCorreo extends javax.swing.JFrame {

    /**
     * Creates new form RecuperacionCorreo
     */
    public RecuCorreo() {
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

        PanelImg = new Controles_Personalizados.Paneles.PanelRound();
        PanelCampos = new Controles_Personalizados.Paneles.PanelRound();
        textoRest = new javax.swing.JLabel();
        btnGoBack = new javax.swing.JLabel();
        txtCorreo = new Controles_Personalizados.textfields.TextField();
        txtPIN = new Controles_Personalizados.textfields.TextField();
        btnRestablecer = new Controles_Personalizados.Botones.ButtonGradient();
        ImagenRecuCorreo = new javax.swing.JLabel();
        btnMinimizar = new javax.swing.JLabel();
        btnCerrar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelImg.setBackground(new java.awt.Color(42, 36, 56));
        PanelImg.setPreferredSize(new java.awt.Dimension(1366, 768));
        PanelImg.setRoundBottomLeft(40);
        PanelImg.setRoundBottomRight(40);
        PanelImg.setRoundTopLeft(40);
        PanelImg.setRoundTopRight(40);
        PanelImg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelCampos.setBackground(new java.awt.Color(254, 254, 254));
        PanelCampos.setPreferredSize(new java.awt.Dimension(698, 768));
        PanelCampos.setRoundBottomLeft(35);
        PanelCampos.setRoundTopLeft(35);
        PanelCampos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textoRest.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos_Proyecto/TextoRecuperacionCorreo.png"))); // NOI18N
        PanelCampos.add(textoRest, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, -1, -1));

        btnGoBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos_Proyecto/bxs-left-arrow-circle 1.png"))); // NOI18N
        btnGoBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGoBackMouseClicked(evt);
            }
        });
        PanelCampos.add(btnGoBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        txtCorreo.setBackground(new java.awt.Color(254, 254, 254));
        txtCorreo.setForeground(new java.awt.Color(42, 36, 56));
        txtCorreo.setCaretColor(new java.awt.Color(42, 36, 56));
        txtCorreo.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        txtCorreo.setLabelText("Correo electronico");
        txtCorreo.setLineColor(new java.awt.Color(42, 36, 56));
        txtCorreo.setSelectionColor(new java.awt.Color(58, 50, 75));
        PanelCampos.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 350, 310, 70));

        txtPIN.setBackground(new java.awt.Color(254, 254, 254));
        txtPIN.setForeground(new java.awt.Color(42, 36, 56));
        txtPIN.setToolTipText("");
        txtPIN.setCaretColor(new java.awt.Color(42, 36, 56));
        txtPIN.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        txtPIN.setLabelText("PIN recibido");
        txtPIN.setLineColor(new java.awt.Color(42, 36, 56));
        txtPIN.setSelectionColor(new java.awt.Color(58, 50, 75));
        PanelCampos.add(txtPIN, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 450, 310, 70));

        btnRestablecer.setText("Restablecer");
        btnRestablecer.setToolTipText("");
        btnRestablecer.setColor1(new java.awt.Color(42, 36, 56));
        btnRestablecer.setColor2(new java.awt.Color(42, 36, 56));
        btnRestablecer.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        btnRestablecer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestablecerActionPerformed(evt);
            }
        });
        PanelCampos.add(btnRestablecer, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 560, 300, -1));

        PanelImg.add(PanelCampos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        ImagenRecuCorreo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos_Proyecto/CorreoImg.png"))); // NOI18N
        PanelImg.add(ImagenRecuCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 140, -1, -1));

        btnMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos_Proyecto/Maximizar.png"))); // NOI18N
        btnMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMinimizarMouseClicked(evt);
            }
        });
        PanelImg.add(btnMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 20, -1, -1));

        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos_Proyecto/CerrarLogin.png"))); // NOI18N
        btnCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnCerrarMousePressed(evt);
            }
        });
        PanelImg.add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1330, 20, -1, -1));

        getContentPane().add(PanelImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGoBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGoBackMouseClicked
        // TODO add your handling code here:
        MenuRecu men = new MenuRecu();
        men.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnGoBackMouseClicked

    private void btnRestablecerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestablecerActionPerformed
        // TODO add your handling code here:
        FrmRestablecimiento fr = new FrmRestablecimiento(new javax.swing.JFrame(),true);
        fr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRestablecerActionPerformed

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
            java.util.logging.Logger.getLogger(RecuCorreo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RecuCorreo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RecuCorreo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RecuCorreo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RecuCorreo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ImagenRecuCorreo;
    private Controles_Personalizados.Paneles.PanelRound PanelCampos;
    private Controles_Personalizados.Paneles.PanelRound PanelImg;
    private javax.swing.JLabel btnCerrar;
    private javax.swing.JLabel btnGoBack;
    private javax.swing.JLabel btnMinimizar;
    private Controles_Personalizados.Botones.ButtonGradient btnRestablecer;
    private javax.swing.JLabel textoRest;
    private Controles_Personalizados.textfields.TextField txtCorreo;
    private Controles_Personalizados.textfields.TextField txtPIN;
    // End of variables declaration//GEN-END:variables
}
