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
 * @author ferna
 */
public class FrmAgg_Acceso extends javax.swing.JFrame {

    /** Creates new form FrmAgg_Acceso */
    public FrmAgg_Acceso() {
        initComponents();
        setLocationRelativeTo(null);
        Shape forma= new RoundRectangle2D.Double(0,0, this.getBounds() .width, this.getBounds() .height,40,40);
        AWTUtilities. setWindowShape(this, forma);
        setIconImage(Logo());
    }
public Image Logo(){
    Image retvalue=Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Recursos_Proyecto/LogoB&GDash.png"));
    return retvalue;
}
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelRound1 = new Controles_Personalizados.Paneles.PanelRound();
        btnMinimizar = new javax.swing.JLabel();
        btnCerrar = new javax.swing.JLabel();
        lblVehiculos = new javax.swing.JLabel();
        PanelTabla = new javax.swing.JScrollPane();
        TbUsuariosWhite4 = new Controles_Personalizados.Tables.Table();
        ScrollTabla = new Controles_Personalizados.ScrollBar.ScrollBarCustom();
        txtBuscar = new Controles_Personalizados.BarraBusqueda.TextFieldAnimation();
        btnListo = new Controles_Personalizados.Botones.ButtonGradient();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound1.setBackground(new java.awt.Color(58, 50, 75));
        panelRound1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos_Proyecto/MinimizarLogin.png"))); // NOI18N
        btnMinimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelRound1.add(btnMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 10, -1, -1));

        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos_Proyecto/CerrarLogin.png"))); // NOI18N
        btnCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnCerrarMousePressed(evt);
            }
        });
        panelRound1.add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 10, -1, -1));

        lblVehiculos.setFont(new java.awt.Font("Roboto Medium", 0, 30)); // NOI18N
        lblVehiculos.setForeground(new java.awt.Color(253, 255, 254));
        lblVehiculos.setText("PERSONAL");
        panelRound1.add(lblVehiculos, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 20, -1, -1));

        PanelTabla.setHorizontalScrollBar(null);
        PanelTabla.setVerticalScrollBar(ScrollTabla);
        PanelTabla.setWheelScrollingEnabled(false);

        TbUsuariosWhite4.setBackground(new java.awt.Color(231, 234, 239));
        TbUsuariosWhite4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "CARNET", "NOMBRES", "APELLIDOS", "CORREO", "TIPO USUARIO", "ACCIONES"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TbUsuariosWhite4.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        TbUsuariosWhite4.setGridColor(new java.awt.Color(58, 50, 75));
        TbUsuariosWhite4.setName(""); // NOI18N
        TbUsuariosWhite4.setSelectionBackground(new java.awt.Color(58, 50, 75));
        TbUsuariosWhite4.setShowVerticalLines(false);
        PanelTabla.setViewportView(TbUsuariosWhite4);

        panelRound1.add(PanelTabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 1020, 370));

        ScrollTabla.setBackground(new java.awt.Color(58, 50, 75));
        ScrollTabla.setForeground(new java.awt.Color(58, 50, 75));
        panelRound1.add(ScrollTabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 160, 10, 40));

        txtBuscar.setBackground(new java.awt.Color(253, 255, 254));
        txtBuscar.setForeground(new java.awt.Color(42, 36, 56));
        txtBuscar.setAnimationColor(new java.awt.Color(42, 36, 56));
        txtBuscar.setHintText("Buscar");
        txtBuscar.setPreferredSize(new java.awt.Dimension(712, 52));
        txtBuscar.setSelectionColor(new java.awt.Color(42, 36, 56));
        txtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarActionPerformed(evt);
            }
        });
        panelRound1.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 1020, 40));

        btnListo.setBackground(new java.awt.Color(42, 36, 56));
        btnListo.setForeground(new java.awt.Color(58, 50, 75));
        btnListo.setText("Listo");
        btnListo.setColor1(new java.awt.Color(253, 255, 254));
        btnListo.setColor2(new java.awt.Color(253, 255, 254));
        btnListo.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        btnListo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListoActionPerformed(evt);
            }
        });
        panelRound1.add(btnListo, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 520, 150, 40));

        getContentPane().add(panelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //EN LA TABLA, EN LA COL DE ACCIONES PONER LOS CHECBOX PARA SELECCIONAR SI ENTRADA O SALIDA 
    private void btnCerrarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarMousePressed
        this.dispose();
        
    }//GEN-LAST:event_btnCerrarMousePressed

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarActionPerformed

    private void btnListoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListoActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnListoActionPerformed

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
            java.util.logging.Logger.getLogger(FrmAgg_Acceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmAgg_Acceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmAgg_Acceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmAgg_Acceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmAgg_Acceso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane PanelTabla;
    private Controles_Personalizados.ScrollBar.ScrollBarCustom ScrollTabla;
    private Controles_Personalizados.Tables.Table TbUsuariosWhite4;
    private javax.swing.JLabel btnCerrar;
    private Controles_Personalizados.Botones.ButtonGradient btnListo;
    private javax.swing.JLabel btnMinimizar;
    private javax.swing.JLabel lblVehiculos;
    private Controles_Personalizados.Paneles.PanelRound panelRound1;
    private Controles_Personalizados.BarraBusqueda.TextFieldAnimation txtBuscar;
    // End of variables declaration//GEN-END:variables

}
