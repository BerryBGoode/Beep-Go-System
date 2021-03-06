/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

/**
 *
 * @author danlo
 */
public class PanelAjustes extends javax.swing.JPanel {

    /**
     * Creates new form PanelAjustes
     */
    public PanelAjustes() {
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

        panelRound3 = new Controles_Personalizados.Paneles.PanelRound();
        PanelFondo = new Controles_Personalizados.Paneles.PanelRound();
        PanelContenedorCambioContra = new Controles_Personalizados.Paneles.PanelRound();
        txtConfirmarClave = new Controles_Personalizados.textfields.TextField();
        txtClaveActual = new Controles_Personalizados.textfields.TextField();
        txtClveNueva = new Controles_Personalizados.textfields.TextField();
        lblCambioClave = new javax.swing.JLabel();
        imgCambio = new javax.swing.JLabel();
        btnCambio = new Controles_Personalizados.Botones.UWPButton();
        PanelContenedorIdiomas = new Controles_Personalizados.Paneles.PanelRound();
        lblIdiomas = new javax.swing.JLabel();
        panelRound5 = new Controles_Personalizados.Paneles.PanelRound();
        lblAjustes = new javax.swing.JLabel();
        PanelContenedorConfiguracion = new Controles_Personalizados.Paneles.PanelRound();
        textoConfig = new javax.swing.JLabel();
        VerificarTipo = new Controles_Personalizados.Botones.UWPButton();
        PanelContenedorTemas = new Controles_Personalizados.Paneles.PanelRound();
        lblTemas = new javax.swing.JLabel();
        panelRound1 = new Controles_Personalizados.Paneles.PanelRound();
        panelRound2 = new Controles_Personalizados.Paneles.PanelRound();
        panelRound4 = new Controles_Personalizados.Paneles.PanelRound();

        panelRound3.setBackground(new java.awt.Color(58, 50, 75));
        panelRound3.setRoundBottomLeft(30);
        panelRound3.setRoundBottomRight(30);
        panelRound3.setRoundTopLeft(30);
        panelRound3.setRoundTopRight(30);
        panelRound3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelFondo.setBackground(new java.awt.Color(231, 234, 239));
        PanelFondo.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        PanelFondo.setPreferredSize(new java.awt.Dimension(1270, 620));
        PanelFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelContenedorCambioContra.setBackground(new java.awt.Color(42, 36, 56));
        PanelContenedorCambioContra.setRoundBottomLeft(30);
        PanelContenedorCambioContra.setRoundBottomRight(30);
        PanelContenedorCambioContra.setRoundTopLeft(30);
        PanelContenedorCambioContra.setRoundTopRight(30);
        PanelContenedorCambioContra.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtConfirmarClave.setBackground(new java.awt.Color(42, 36, 56));
        txtConfirmarClave.setForeground(new java.awt.Color(231, 234, 239));
        txtConfirmarClave.setCaretColor(new java.awt.Color(231, 234, 239));
        txtConfirmarClave.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        txtConfirmarClave.setLabelText("Confirma tu contrase??a");
        txtConfirmarClave.setLineColor(new java.awt.Color(231, 234, 239));
        PanelContenedorCambioContra.add(txtConfirmarClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 180, 70));

        txtClaveActual.setBackground(new java.awt.Color(42, 36, 56));
        txtClaveActual.setForeground(new java.awt.Color(231, 234, 239));
        txtClaveActual.setCaretColor(new java.awt.Color(231, 234, 239));
        txtClaveActual.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        txtClaveActual.setLabelText("Contrase??a actual");
        txtClaveActual.setLineColor(new java.awt.Color(231, 234, 239));
        PanelContenedorCambioContra.add(txtClaveActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 180, 70));

        txtClveNueva.setBackground(new java.awt.Color(42, 36, 56));
        txtClveNueva.setForeground(new java.awt.Color(231, 234, 239));
        txtClveNueva.setCaretColor(new java.awt.Color(231, 234, 239));
        txtClveNueva.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        txtClveNueva.setLabelText("Nueva contrase??a");
        txtClveNueva.setLineColor(new java.awt.Color(231, 234, 239));
        PanelContenedorCambioContra.add(txtClveNueva, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 180, 70));

        lblCambioClave.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        lblCambioClave.setForeground(new java.awt.Color(231, 234, 239));
        lblCambioClave.setText("Cambio de contrase??a");
        PanelContenedorCambioContra.add(lblCambioClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        imgCambio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos_Proyecto/reset-adentrosystem.png"))); // NOI18N
        PanelContenedorCambioContra.add(imgCambio, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, -1, -1));

        btnCambio.setBackground(new java.awt.Color(42, 36, 56));
        btnCambio.setText("Confirmar Cambio");
        btnCambio.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        btnCambio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambioActionPerformed(evt);
            }
        });
        PanelContenedorCambioContra.add(btnCambio, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 245, 140, 40));

        PanelFondo.add(PanelContenedorCambioContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 310, 460, 300));

        PanelContenedorIdiomas.setBackground(new java.awt.Color(42, 36, 56));
        PanelContenedorIdiomas.setRoundBottomLeft(30);
        PanelContenedorIdiomas.setRoundBottomRight(30);
        PanelContenedorIdiomas.setRoundTopLeft(30);
        PanelContenedorIdiomas.setRoundTopRight(30);
        PanelContenedorIdiomas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblIdiomas.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        lblIdiomas.setForeground(new java.awt.Color(231, 234, 239));
        lblIdiomas.setText("Idiomas - Beep&Go");
        PanelContenedorIdiomas.add(lblIdiomas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        panelRound5.setBackground(new java.awt.Color(58, 50, 75));
        panelRound5.setRoundBottomLeft(30);
        panelRound5.setRoundBottomRight(30);
        panelRound5.setRoundTopLeft(30);
        panelRound5.setRoundTopRight(30);

        javax.swing.GroupLayout panelRound5Layout = new javax.swing.GroupLayout(panelRound5);
        panelRound5.setLayout(panelRound5Layout);
        panelRound5Layout.setHorizontalGroup(
            panelRound5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 330, Short.MAX_VALUE)
        );
        panelRound5Layout.setVerticalGroup(
            panelRound5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 160, Short.MAX_VALUE)
        );

        PanelContenedorIdiomas.add(panelRound5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 90, -1, -1));

        PanelFondo.add(PanelContenedorIdiomas, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 750, 300));

        lblAjustes.setFont(new java.awt.Font("Roboto Medium", 0, 40)); // NOI18N
        lblAjustes.setForeground(new java.awt.Color(58, 50, 75));
        lblAjustes.setText("Ajustes");
        PanelFondo.add(lblAjustes, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        PanelContenedorConfiguracion.setBackground(new java.awt.Color(42, 36, 56));
        PanelContenedorConfiguracion.setRoundBottomLeft(30);
        PanelContenedorConfiguracion.setRoundBottomRight(30);
        PanelContenedorConfiguracion.setRoundTopLeft(30);
        PanelContenedorConfiguracion.setRoundTopRight(30);
        PanelContenedorConfiguracion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textoConfig.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos_Proyecto/Indicacion Config.png"))); // NOI18N
        PanelContenedorConfiguracion.add(textoConfig, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, -1));

        VerificarTipo.setBackground(new java.awt.Color(42, 36, 56));
        VerificarTipo.setText("Verificar mi usuario");
        VerificarTipo.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        VerificarTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerificarTipoActionPerformed(evt);
            }
        });
        PanelContenedorConfiguracion.add(VerificarTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 170, 50));

        PanelFondo.add(PanelContenedorConfiguracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 70, 460, 230));

        PanelContenedorTemas.setBackground(new java.awt.Color(42, 36, 56));
        PanelContenedorTemas.setRoundBottomLeft(30);
        PanelContenedorTemas.setRoundBottomRight(30);
        PanelContenedorTemas.setRoundTopLeft(30);
        PanelContenedorTemas.setRoundTopRight(30);
        PanelContenedorTemas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTemas.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        lblTemas.setForeground(new java.awt.Color(231, 234, 239));
        lblTemas.setText("Temas - Beep&Go");
        PanelContenedorTemas.add(lblTemas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        panelRound1.setBackground(new java.awt.Color(58, 50, 75));
        panelRound1.setRoundBottomLeft(30);
        panelRound1.setRoundBottomRight(30);
        panelRound1.setRoundTopLeft(30);
        panelRound1.setRoundTopRight(30);
        panelRound1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        PanelContenedorTemas.add(panelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 330, 160));

        panelRound2.setBackground(new java.awt.Color(58, 50, 75));
        panelRound2.setRoundBottomLeft(30);
        panelRound2.setRoundBottomRight(30);
        panelRound2.setRoundTopLeft(30);
        panelRound2.setRoundTopRight(30);

        javax.swing.GroupLayout panelRound2Layout = new javax.swing.GroupLayout(panelRound2);
        panelRound2.setLayout(panelRound2Layout);
        panelRound2Layout.setHorizontalGroup(
            panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 330, Short.MAX_VALUE)
        );
        panelRound2Layout.setVerticalGroup(
            panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 160, Short.MAX_VALUE)
        );

        PanelContenedorTemas.add(panelRound2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 50, 330, 160));

        PanelFondo.add(PanelContenedorTemas, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 750, 230));

        panelRound4.setBackground(new java.awt.Color(58, 50, 75));
        panelRound4.setRoundBottomLeft(30);
        panelRound4.setRoundBottomRight(30);
        panelRound4.setRoundTopLeft(30);
        panelRound4.setRoundTopRight(30);
        panelRound4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(panelRound3, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(888, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(PanelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panelRound4, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(402, Short.MAX_VALUE)
                .addComponent(panelRound3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(PanelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panelRound4, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    public static int exitdash = 0;

    public static int getExitdash() {
        return exitdash;
    }
    
    //FrmDashboard dash = new FrmDashboard();
    FrmLogin login = new FrmLogin();
    
    private void VerificarTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerificarTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VerificarTipoActionPerformed

    private void btnCambioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCambioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Controles_Personalizados.Paneles.PanelRound PanelContenedorCambioContra;
    private Controles_Personalizados.Paneles.PanelRound PanelContenedorConfiguracion;
    private Controles_Personalizados.Paneles.PanelRound PanelContenedorIdiomas;
    private Controles_Personalizados.Paneles.PanelRound PanelContenedorTemas;
    private Controles_Personalizados.Paneles.PanelRound PanelFondo;
    private Controles_Personalizados.Botones.UWPButton VerificarTipo;
    private Controles_Personalizados.Botones.UWPButton btnCambio;
    private javax.swing.JLabel imgCambio;
    private javax.swing.JLabel lblAjustes;
    private javax.swing.JLabel lblCambioClave;
    private javax.swing.JLabel lblIdiomas;
    private javax.swing.JLabel lblTemas;
    private Controles_Personalizados.Paneles.PanelRound panelRound1;
    private Controles_Personalizados.Paneles.PanelRound panelRound2;
    private Controles_Personalizados.Paneles.PanelRound panelRound3;
    private Controles_Personalizados.Paneles.PanelRound panelRound4;
    private Controles_Personalizados.Paneles.PanelRound panelRound5;
    private javax.swing.JLabel textoConfig;
    private Controles_Personalizados.textfields.TextField txtClaveActual;
    private Controles_Personalizados.textfields.TextField txtClveNueva;
    private Controles_Personalizados.textfields.TextField txtConfirmarClave;
    // End of variables declaration//GEN-END:variables
}
