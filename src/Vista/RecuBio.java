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

/**
 *
 * @author danlo
 */
public class RecuBio extends javax.swing.JFrame {

    /**
     * Creates new form RecuperacionBio
     */
    public RecuBio() {
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

        PanelImagen = new Controles_Personalizados.Paneles.PanelRound();
        PanelCampos = new Controles_Personalizados.Paneles.PanelRound();
        textoRest = new javax.swing.JLabel();
        btnGoBack = new javax.swing.JLabel();
        txtUsuario = new Controles_Personalizados.textfields.TextField();
        btnVerificar = new Controles_Personalizados.Botones.ButtonGradient();
        ContenedorFoto = new Controles_Personalizados.Paneles.PanelRound();
        ImagenRecuBio = new javax.swing.JLabel();
        btnMinimizar = new javax.swing.JLabel();
        btnCerrar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelImagen.setBackground(new java.awt.Color(42, 36, 56));
        PanelImagen.setPreferredSize(new java.awt.Dimension(1366, 768));
        PanelImagen.setRoundBottomLeft(40);
        PanelImagen.setRoundBottomRight(40);
        PanelImagen.setRoundTopLeft(40);
        PanelImagen.setRoundTopRight(40);
        PanelImagen.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelCampos.setBackground(new java.awt.Color(254, 254, 254));
        PanelCampos.setPreferredSize(new java.awt.Dimension(698, 768));
        PanelCampos.setRoundBottomLeft(35);
        PanelCampos.setRoundTopLeft(35);
        PanelCampos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textoRest.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos_Proyecto/TextoRecuDatosBio.png"))); // NOI18N
        PanelCampos.add(textoRest, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, -1, -1));

        btnGoBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos_Proyecto/bxs-left-arrow-circle 1.png"))); // NOI18N
        btnGoBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGoBackMouseClicked(evt);
            }
        });
        PanelCampos.add(btnGoBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        txtUsuario.setBackground(new java.awt.Color(254, 254, 254));
        txtUsuario.setForeground(new java.awt.Color(42, 36, 56));
        txtUsuario.setCaretColor(new java.awt.Color(42, 36, 56));
        txtUsuario.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        txtUsuario.setLabelText("Correo electronico");
        txtUsuario.setLineColor(new java.awt.Color(42, 36, 56));
        txtUsuario.setSelectionColor(new java.awt.Color(58, 50, 75));
        PanelCampos.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 320, 310, 70));

        btnVerificar.setToolTipText("");
        btnVerificar.setColor1(new java.awt.Color(42, 36, 56));
        btnVerificar.setColor2(new java.awt.Color(42, 36, 56));
        btnVerificar.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        btnVerificar.setLabel("Comenzar Verificacion");
        btnVerificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerificarActionPerformed(evt);
            }
        });
        PanelCampos.add(btnVerificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 420, 310, -1));

        ContenedorFoto.setBackground(new java.awt.Color(42, 36, 56));
        ContenedorFoto.setPreferredSize(new java.awt.Dimension(259, 252));
        ContenedorFoto.setRoundBottomLeft(40);
        ContenedorFoto.setRoundBottomRight(40);
        ContenedorFoto.setRoundTopLeft(40);
        ContenedorFoto.setRoundTopRight(40);
        ContenedorFoto.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        PanelCampos.add(ContenedorFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 490, -1, -1));

        PanelImagen.add(PanelCampos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        ImagenRecuBio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos_Proyecto/Bioigm.png"))); // NOI18N
        PanelImagen.add(ImagenRecuBio, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 140, -1, -1));

        btnMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos_Proyecto/MinimizarLogin.png"))); // NOI18N
        PanelImagen.add(btnMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 20, -1, -1));

        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos_Proyecto/CerrarLogin.png"))); // NOI18N
        btnCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnCerrarMousePressed(evt);
            }
        });
        PanelImagen.add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1330, 20, -1, -1));

        getContentPane().add(PanelImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGoBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGoBackMouseClicked
        // TODO add your handling code here:
        MenuRecu men = new MenuRecu();
        men.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnGoBackMouseClicked

    private void btnVerificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerificarActionPerformed
        // TODO add your handling code here:
        FrmRestablecimiento fr = new FrmRestablecimiento(new javax.swing.JFrame(),true);
        fr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVerificarActionPerformed

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
            java.util.logging.Logger.getLogger(RecuBio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RecuBio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RecuBio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RecuBio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RecuBio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Controles_Personalizados.Paneles.PanelRound ContenedorFoto;
    private javax.swing.JLabel ImagenRecuBio;
    private Controles_Personalizados.Paneles.PanelRound PanelCampos;
    private Controles_Personalizados.Paneles.PanelRound PanelImagen;
    private javax.swing.JLabel btnCerrar;
    private javax.swing.JLabel btnGoBack;
    private javax.swing.JLabel btnMinimizar;
    private Controles_Personalizados.Botones.ButtonGradient btnVerificar;
    private javax.swing.JLabel textoRest;
    private Controles_Personalizados.textfields.TextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
