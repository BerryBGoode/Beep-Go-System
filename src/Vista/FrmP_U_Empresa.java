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
public class FrmP_U_Empresa extends javax.swing.JFrame {

    /**
     * Creates new form PrimerUsoEmpresa
     */
    public FrmP_U_Empresa() {
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

        PanelFondo = new Controles_Personalizados.Paneles.PanelRound();
        PanelContenedorCampos = new Controles_Personalizados.Paneles.PanelRound();
        btnContinuar = new Controles_Personalizados.Botones.ButtonGradient();
        txtNombreEmpresa = new Controles_Personalizados.textfields.TextField();
        txtDireccionEmpresa = new Controles_Personalizados.textfields.TextField();
        txtCNR = new Controles_Personalizados.textfields.TextField();
        txtRepresentanteLegal = new Controles_Personalizados.textfields.TextField();
        txtNIT = new Controles_Personalizados.textfields.TextField();
        btnExaminar = new Controles_Personalizados.Botones.ButtonGradient();
        PanelFt = new Controles_Personalizados.Paneles.PanelRound();
        lblLogo = new javax.swing.JLabel();
        Imagen = new javax.swing.JLabel();
        btnCerrar = new javax.swing.JLabel();
        btnMinimizar = new javax.swing.JLabel();

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

        PanelContenedorCampos.setBackground(new java.awt.Color(254, 254, 254));
        PanelContenedorCampos.setPreferredSize(new java.awt.Dimension(698, 768));
        PanelContenedorCampos.setRoundBottomLeft(35);
        PanelContenedorCampos.setRoundTopLeft(35);
        PanelContenedorCampos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnContinuar.setText("Continuar");
        btnContinuar.setColor1(new java.awt.Color(42, 36, 56));
        btnContinuar.setColor2(new java.awt.Color(42, 36, 56));
        btnContinuar.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        btnContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinuarActionPerformed(evt);
            }
        });
        PanelContenedorCampos.add(btnContinuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 710, 150, -1));

        txtNombreEmpresa.setBackground(new java.awt.Color(254, 254, 254));
        txtNombreEmpresa.setForeground(new java.awt.Color(42, 36, 56));
        txtNombreEmpresa.setCaretColor(new java.awt.Color(42, 36, 56));
        txtNombreEmpresa.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        txtNombreEmpresa.setLabelText("Nombre - Empresa");
        txtNombreEmpresa.setLineColor(new java.awt.Color(42, 36, 56));
        txtNombreEmpresa.setSelectionColor(new java.awt.Color(58, 50, 75));
        PanelContenedorCampos.add(txtNombreEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 310, 70));

        txtDireccionEmpresa.setBackground(new java.awt.Color(254, 254, 254));
        txtDireccionEmpresa.setForeground(new java.awt.Color(42, 36, 56));
        txtDireccionEmpresa.setCaretColor(new java.awt.Color(42, 36, 56));
        txtDireccionEmpresa.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        txtDireccionEmpresa.setLabelText("Direccion - Empresa");
        txtDireccionEmpresa.setLineColor(new java.awt.Color(42, 36, 56));
        txtDireccionEmpresa.setSelectionColor(new java.awt.Color(58, 50, 75));
        PanelContenedorCampos.add(txtDireccionEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 310, 70));

        txtCNR.setBackground(new java.awt.Color(254, 254, 254));
        txtCNR.setForeground(new java.awt.Color(42, 36, 56));
        txtCNR.setCaretColor(new java.awt.Color(42, 36, 56));
        txtCNR.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        txtCNR.setLabelText("CNR - Empresa");
        txtCNR.setLineColor(new java.awt.Color(42, 36, 56));
        txtCNR.setSelectionColor(new java.awt.Color(58, 50, 75));
        PanelContenedorCampos.add(txtCNR, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 310, 70));

        txtRepresentanteLegal.setBackground(new java.awt.Color(254, 254, 254));
        txtRepresentanteLegal.setForeground(new java.awt.Color(42, 36, 56));
        txtRepresentanteLegal.setCaretColor(new java.awt.Color(42, 36, 56));
        txtRepresentanteLegal.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        txtRepresentanteLegal.setLabelText("Representante Legal");
        txtRepresentanteLegal.setLineColor(new java.awt.Color(42, 36, 56));
        txtRepresentanteLegal.setSelectionColor(new java.awt.Color(58, 50, 75));
        PanelContenedorCampos.add(txtRepresentanteLegal, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, 310, 70));

        txtNIT.setBackground(new java.awt.Color(254, 254, 254));
        txtNIT.setForeground(new java.awt.Color(42, 36, 56));
        txtNIT.setCaretColor(new java.awt.Color(42, 36, 56));
        txtNIT.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        txtNIT.setLabelText("NIT - Representante Legal");
        txtNIT.setLineColor(new java.awt.Color(42, 36, 56));
        txtNIT.setSelectionColor(new java.awt.Color(58, 50, 75));
        PanelContenedorCampos.add(txtNIT, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 520, 310, 70));

        btnExaminar.setText("Examinar");
        btnExaminar.setToolTipText("");
        btnExaminar.setColor1(new java.awt.Color(42, 36, 56));
        btnExaminar.setColor2(new java.awt.Color(42, 36, 56));
        btnExaminar.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        PanelContenedorCampos.add(btnExaminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(447, 420, 150, -1));

        PanelFt.setBackground(new java.awt.Color(254, 254, 254));
        PanelFt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(42, 36, 56), 2));
        PanelFt.setPreferredSize(new java.awt.Dimension(154, 192));
        PanelContenedorCampos.add(PanelFt, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 200, -1, -1));

        lblLogo.setFont(new java.awt.Font("Roboto Thin", 0, 18)); // NOI18N
        lblLogo.setForeground(new java.awt.Color(91, 91, 95));
        lblLogo.setText("Logo - Empresa");
        PanelContenedorCampos.add(lblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 170, -1, -1));

        PanelFondo.add(PanelContenedorCampos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos_Proyecto/Learning-amico 1.png"))); // NOI18N
        PanelFondo.add(Imagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 140, -1, -1));

        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos_Proyecto/CerrarLogin.png"))); // NOI18N
        btnCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnCerrarMousePressed(evt);
            }
        });
        PanelFondo.add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1330, 20, -1, -1));

        btnMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos_Proyecto/MinimizarLogin.png"))); // NOI18N
        PanelFondo.add(btnMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 20, -1, -1));

        getContentPane().add(PanelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinuarActionPerformed
        // TODO add your handling code here:
        FrmP_U_Personal pu = new FrmP_U_Personal();
        pu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnContinuarActionPerformed

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
            java.util.logging.Logger.getLogger(FrmP_U_Empresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmP_U_Empresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmP_U_Empresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmP_U_Empresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmP_U_Empresa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Imagen;
    private Controles_Personalizados.Paneles.PanelRound PanelContenedorCampos;
    private Controles_Personalizados.Paneles.PanelRound PanelFondo;
    private Controles_Personalizados.Paneles.PanelRound PanelFt;
    private javax.swing.JLabel btnCerrar;
    private Controles_Personalizados.Botones.ButtonGradient btnContinuar;
    private Controles_Personalizados.Botones.ButtonGradient btnExaminar;
    private javax.swing.JLabel btnMinimizar;
    private javax.swing.JLabel lblLogo;
    private Controles_Personalizados.textfields.TextField txtCNR;
    private Controles_Personalizados.textfields.TextField txtDireccionEmpresa;
    private Controles_Personalizados.textfields.TextField txtNIT;
    private Controles_Personalizados.textfields.TextField txtNombreEmpresa;
    private Controles_Personalizados.textfields.TextField txtRepresentanteLegal;
    // End of variables declaration//GEN-END:variables
}
