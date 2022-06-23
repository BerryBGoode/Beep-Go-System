/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import com.sun.awt.AWTUtilities;
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;

/**
 *
 * @author danlo
 */
public class RecuQR extends javax.swing.JFrame {

    /**
     * Creates new form RecuperacionQR
     */
    public RecuQR() {
        initComponents();
        this.setLocationRelativeTo(null); 
         Shape forma= new RoundRectangle2D.Double(0,0, this.getBounds() .width, this.getBounds() .height,40,40);
         AWTUtilities. setWindowShape(this, forma);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelContenedor = new Controles_Personalizados.Paneles.PanelRound();
        PanelContenedorCampos = new Controles_Personalizados.Paneles.PanelRound();
        btnGoBack = new javax.swing.JLabel();
        textoRest = new javax.swing.JLabel();
        txtCorreo = new Controles_Personalizados.textfields.TextField();
        btnGenerar = new Controles_Personalizados.Botones.ButtonGradient();
        ContenedorCodigoQR = new Controles_Personalizados.Paneles.PanelRound();
        PanelCodigoQR = new Controles_Personalizados.Paneles.PanelRound();
        ImagenRecuQR = new javax.swing.JLabel();
        btnMinimizar = new javax.swing.JLabel();
        btnCerrar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelContenedor.setBackground(new java.awt.Color(42, 36, 56));
        PanelContenedor.setPreferredSize(new java.awt.Dimension(1366, 768));
        PanelContenedor.setRoundBottomLeft(40);
        PanelContenedor.setRoundBottomRight(40);
        PanelContenedor.setRoundTopLeft(40);
        PanelContenedor.setRoundTopRight(40);
        PanelContenedor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelContenedorCampos.setBackground(new java.awt.Color(254, 254, 254));
        PanelContenedorCampos.setPreferredSize(new java.awt.Dimension(698, 768));
        PanelContenedorCampos.setRoundBottomLeft(35);
        PanelContenedorCampos.setRoundTopLeft(35);
        PanelContenedorCampos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnGoBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos_Proyecto/bxs-left-arrow-circle 1.png"))); // NOI18N
        btnGoBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGoBackMouseClicked(evt);
            }
        });
        PanelContenedorCampos.add(btnGoBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        textoRest.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos_Proyecto/TextoRecuQR.png"))); // NOI18N
        PanelContenedorCampos.add(textoRest, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, -1, -1));

        txtCorreo.setBackground(new java.awt.Color(254, 254, 254));
        txtCorreo.setForeground(new java.awt.Color(42, 36, 56));
        txtCorreo.setCaretColor(new java.awt.Color(42, 36, 56));
        txtCorreo.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        txtCorreo.setLabelText("Correo electronico");
        txtCorreo.setLineColor(new java.awt.Color(42, 36, 56));
        txtCorreo.setSelectionColor(new java.awt.Color(58, 50, 75));
        PanelContenedorCampos.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 330, 310, 70));

        btnGenerar.setText("Generar Codigo");
        btnGenerar.setToolTipText("");
        btnGenerar.setColor1(new java.awt.Color(42, 36, 56));
        btnGenerar.setColor2(new java.awt.Color(42, 36, 56));
        btnGenerar.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        btnGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarActionPerformed(evt);
            }
        });
        PanelContenedorCampos.add(btnGenerar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 430, 310, -1));

        ContenedorCodigoQR.setBackground(new java.awt.Color(42, 36, 56));
        ContenedorCodigoQR.setPreferredSize(new java.awt.Dimension(259, 252));
        ContenedorCodigoQR.setRoundBottomLeft(40);
        ContenedorCodigoQR.setRoundBottomRight(40);
        ContenedorCodigoQR.setRoundTopLeft(40);
        ContenedorCodigoQR.setRoundTopRight(40);
        ContenedorCodigoQR.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelCodigoQR.setBackground(new java.awt.Color(42, 36, 56));
        PanelCodigoQR.setRoundBottomLeft(40);
        PanelCodigoQR.setRoundBottomRight(40);
        PanelCodigoQR.setRoundTopLeft(40);
        PanelCodigoQR.setRoundTopRight(40);
        PanelCodigoQR.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        ContenedorCodigoQR.add(PanelCodigoQR, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 220, 210));

        PanelContenedorCampos.add(ContenedorCodigoQR, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 490, -1, -1));

        PanelContenedor.add(PanelContenedorCampos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        ImagenRecuQR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos_Proyecto/QRimg.png"))); // NOI18N
        PanelContenedor.add(ImagenRecuQR, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 140, -1, -1));

        btnMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos_Proyecto/MinimizarLogin.png"))); // NOI18N
        PanelContenedor.add(btnMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 20, -1, -1));

        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos_Proyecto/CerrarLogin.png"))); // NOI18N
        btnCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnCerrarMousePressed(evt);
            }
        });
        PanelContenedor.add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1330, 20, -1, -1));

        getContentPane().add(PanelContenedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGoBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGoBackMouseClicked
        // TODO add your handling code here:
        MenuRecu men = new MenuRecu();
        men.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnGoBackMouseClicked

    private void btnGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarActionPerformed
        // TODO add your handling code here:
        FrmRestablecimiento fr = new FrmRestablecimiento(new javax.swing.JFrame(),true);
        fr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnGenerarActionPerformed

    private void btnCerrarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarMousePressed
        System.exit(0);
    }//GEN-LAST:event_btnCerrarMousePressed

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
            java.util.logging.Logger.getLogger(RecuQR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RecuQR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RecuQR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RecuQR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RecuQR().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Controles_Personalizados.Paneles.PanelRound ContenedorCodigoQR;
    private javax.swing.JLabel ImagenRecuQR;
    private Controles_Personalizados.Paneles.PanelRound PanelCodigoQR;
    private Controles_Personalizados.Paneles.PanelRound PanelContenedor;
    private Controles_Personalizados.Paneles.PanelRound PanelContenedorCampos;
    private javax.swing.JLabel btnCerrar;
    private Controles_Personalizados.Botones.ButtonGradient btnGenerar;
    private javax.swing.JLabel btnGoBack;
    private javax.swing.JLabel btnMinimizar;
    private javax.swing.JLabel textoRest;
    private Controles_Personalizados.textfields.TextField txtCorreo;
    // End of variables declaration//GEN-END:variables
}
