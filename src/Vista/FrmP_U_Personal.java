/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.ControllerP_U_Personal;
import Controlador.ControllerP_U_Usuarios;
import Controles_Personalizados.Calendario.SelectedDate;
import ValidacionesSistema.ValidacionesBeep_Go;
import com.sun.awt.AWTUtilities;

import java.awt.Image;
import java.awt.Shape;
import java.awt.Toolkit;
import java.awt.event.ItemEvent;
import java.awt.geom.RoundRectangle2D;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.filechooser.FileNameExtensionFilter;
import necesario.RSFileChooser;

/**
 *
 * @author danlo
 */
public class FrmP_U_Personal extends javax.swing.JFrame {

    DefaultComboBoxModel<String> modelocombo = new DefaultComboBoxModel<>();
    DefaultComboBoxModel<String> modelcombogenero = new DefaultComboBoxModel<>();
    private int tipod = 0;
    private int genero = 0;
    private List myArrayList;
    private String fecha;
    private SimpleDateFormat formatos;
    private List ListGenero;
    ControllerP_U_Personal controllerp = new ControllerP_U_Personal();
    ControllerP_U_Usuarios controlleru = new ControllerP_U_Usuarios();
    byte[] fotou;
    ImageIcon fotoicon;

    /**
     * Creates new form PrimerUsoPersonal
     */
    public FrmP_U_Personal() {
        initComponents();
        this.setLocationRelativeTo(null);
        Shape forma = new RoundRectangle2D.Double(0, 0, this.getBounds().width, this.getBounds().height, 40, 40);
        AWTUtilities.setWindowShape(this, forma);
        setIconImage(Logo());
        cargarlista();
        validarpusuario();

    }

    public Image Logo() {
        Image retvalue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Recursos_Proyecto/B&G Morado 2.png"));
        return retvalue;
    }

    void validarpusuario() {
        if (controlleru.checkControllerUsuario() == false && controllerp.checkcontrollerPersonal() == true) {
            txtApellido.setEnabled(false);
            txtCorreo.setEnabled(false);
            txtNombre.setEnabled(false);
            txtDirecion.setEnabled(false);
            txtDocumento.setEnabled(false);
            DtFechanac.setEnabled(false);
            CmbGenero.setEnabled(false);
            CmbTipoDocumento.setEnabled(false);
            TxtUsuario.setEnabled(true);
            BtnExaminar.setEnabled(true);
            btnContinuar.setEnabled(true);
        }
    }

    void ExaminarImagen() {
        RSFileChooser jcargarfoto = new RSFileChooser();
        FileNameExtensionFilter extension = new FileNameExtensionFilter("jpeg", "jpg", "png", "gif");
        jcargarfoto.setFileFilter(extension);
        int ver = jcargarfoto.showOpenDialog(this);
        if (ver == JFileChooser.APPROVE_OPTION) {
            String url = jcargarfoto.getSelectedFile().getAbsolutePath();
            try {
                File ruta = new File(url);
                fotou = new byte[(int) ruta.length()];
                InputStream input = new FileInputStream(ruta);
                input.read(fotou);
                controllerp.setLogo(fotou);
            } catch (Exception e) {
                controllerp.setLogo(fotou);
            }
            try {
                byte[] imagen = controllerp.getLogo();
                BufferedImage image = null;
                InputStream input = new ByteArrayInputStream(imagen);
                image = ImageIO.read(input);
                fotoicon = new ImageIcon(image.getScaledInstance(220, 250, 0));
                LblFoto.setIcon(fotoicon);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.toString());
            }
        }

    }

    void IngresarRegistros() {
        if (controllerp.checkcontrollerPersonal() == false & controlleru.checkControllerUsuario() == false) {
            IngresarUsuario();
            InsercionPPersonal();
            FrmLogin iniciarSesion = new FrmLogin();
            iniciarSesion.setVisible(true);
            this.dispose();
        } else if (controlleru.checkControllerUsuario() == false) {
            IngresarUsuario();
            FrmLogin iniciarSesion = new FrmLogin();
            iniciarSesion.setVisible(true);
            this.dispose();
        }
    }

    void IngresarUsuario() {
        if (TxtUsuario.getText().trim().isEmpty() || LblFoto.getIcon() == null) {
            JOptionPane.showMessageDialog(null, "Ingresar los respectivos campos");
        } else {
            BtnExaminar.setEnabled(true);
            TxtUsuario.setEnabled(true);
            txtApellido.setEnabled(false);
            txtCorreo.setEnabled(false);
            txtNombre.setEnabled(false);
            txtDirecion.setEnabled(false);
            txtDocumento.setEnabled(false);
            DtFechanac.setEnabled(false);
            CmbGenero.setEnabled(false);
            CmbTipoDocumento.setEnabled(false);
            String clave = TxtUsuario.getText() + "123";
            controlleru.setUsuario(TxtUsuario.getText());
            controlleru.setClave(ValidacionesBeep_Go.EncriptarContra(clave));
            controlleru.setFoto(fotou);
            if (controlleru.IngresarPUsuarioController() == true) {
                JOptionPane.showMessageDialog(null, "Su usuario ha sido ingresado correctamente", "Proceso Completado", JOptionPane.INFORMATION_MESSAGE);
            }
        }

    }

    void InsercionPPersonal() {
        BtnExaminar.setEnabled(false);
        TxtUsuario.setEnabled(false);
        if (CmbTipoDocumento.getSelectedItem() == "" || CmbGenero.getSelectedItem() == "") {
            JOptionPane.showMessageDialog(null, "Escoja una opcion");
        } else if (txtNombre.getText().trim().isEmpty() || txtApellido.getText().trim().isEmpty() || txtCorreo.getText().trim().isEmpty() || txtDirecion.getText().trim().isEmpty() || txtDocumento.getText().trim().isEmpty() || DtFechanac.getFechaSeleccionada().isEmpty()) {
            JOptionPane.showMessageDialog(null, "No se permiten campos vacios");
        } else {
            controllerp.nombre = txtNombre.getText();
            controllerp.apellido = txtApellido.getText();
            controllerp.correo = txtCorreo.getText();
            controllerp.direccion = txtDirecion.getText();
            controllerp.dui = txtDocumento.getText();
            controllerp.idtipoDocumento = tipod;
            controllerp.idgenero = genero;
            controllerp.fechanac = DtFechanac.getFechaSeleccionada();
            if (controllerp.IngresarPPersonalController() == true) {
                JOptionPane.showMessageDialog(null, "Su registro ha sido ingresado correctamente", "Proceso Completado", JOptionPane.INFORMATION_MESSAGE);
            }
        }

    }

    void cargarlista() {
        CargarTipoDocumento();
        CargarGeneroPersonal();
    }

    final void CargarGeneroPersonal() {
        ListGenero = new ArrayList();
        try {
            ResultSet rs = controllerp.cargarGeneroController();
            if (rs.next()) {
                modelcombogenero.addElement("");
                do {
                    ListGenero.add(rs.getInt("idGenero"));
                    modelcombogenero.addElement(rs.getString("genero"));
                    CmbGenero.setModel(modelcombogenero);
                } while (rs.next());
            } else {
                System.out.println("No existen campos");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se logro cargar la informacion", "Error al cargar", JOptionPane.ERROR_MESSAGE);
        }
    }

    final void CargarTipoDocumento() {
        myArrayList = new ArrayList();
        try {
            ResultSet rs = controllerp.cargarTipoDocumentoController();
            if (rs.next()) {
                modelocombo.addElement("");
                do {
                    myArrayList.add(rs.getInt("idTipoDocumento"));
                    modelocombo.addElement(rs.getString("tipo_documento"));
                    CmbTipoDocumento.setModel(modelocombo);
                } while (rs.next());
            } else {
                System.out.println("No existen campos");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se lograron cargar los datos", "Error al cargar", JOptionPane.ERROR_MESSAGE);
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

        PanelFondo = new Controles_Personalizados.Paneles.PanelRound();
        Logo = new Controles_Personalizados.Paneles.PanelRound();
        btnContinuar = new Controles_Personalizados.Botones.ButtonGradient();
        txtDocumento = new Controles_Personalizados.textfields.TextField();
        txtNombre = new Controles_Personalizados.textfields.TextField();
        txtApellido = new Controles_Personalizados.textfields.TextField();
        txtCorreo = new Controles_Personalizados.textfields.TextField();
        txtDirecion = new Controles_Personalizados.textfields.TextField();
        CmbGenero = new Controles_Personalizados.ComboBox.combobox();
        CmbTipoDocumento = new Controles_Personalizados.ComboBox.combobox();
        DtFechanac = new rojerusan.RSDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        LblFoto = new javax.swing.JLabel();
        BtnExaminar = new Controles_Personalizados.Botones.UWPButton();
        TxtUsuario = new Controles_Personalizados.textfields.TextField();
        btnMinimizar = new javax.swing.JLabel();
        btnCerrar = new javax.swing.JLabel();
        Imagen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1392, 842));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelFondo.setBackground(new java.awt.Color(42, 36, 56));
        PanelFondo.setPreferredSize(new java.awt.Dimension(1366, 768));
        PanelFondo.setRoundBottomLeft(40);
        PanelFondo.setRoundBottomRight(40);
        PanelFondo.setRoundTopLeft(40);
        PanelFondo.setRoundTopRight(40);
        PanelFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Logo.setBackground(new java.awt.Color(254, 254, 254));
        Logo.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Logo.setPreferredSize(new java.awt.Dimension(698, 768));
        Logo.setRoundBottomLeft(35);
        Logo.setRoundTopLeft(35);
        Logo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnContinuar.setText("Continuar");
        btnContinuar.setToolTipText("");
        btnContinuar.setColor1(new java.awt.Color(42, 36, 56));
        btnContinuar.setColor2(new java.awt.Color(42, 36, 56));
        btnContinuar.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        btnContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinuarActionPerformed(evt);
            }
        });
        Logo.add(btnContinuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 780, 150, -1));

        txtDocumento.setBackground(new java.awt.Color(254, 254, 254));
        txtDocumento.setForeground(new java.awt.Color(42, 36, 56));
        txtDocumento.setCaretColor(new java.awt.Color(42, 36, 56));
        txtDocumento.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        txtDocumento.setLabelText("Documento (DUI)");
        txtDocumento.setLineColor(new java.awt.Color(42, 36, 56));
        txtDocumento.setSelectionColor(new java.awt.Color(58, 50, 75));
        txtDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDocumentoActionPerformed(evt);
            }
        });
        Logo.add(txtDocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 460, 310, 70));

        txtNombre.setBackground(new java.awt.Color(254, 254, 254));
        txtNombre.setForeground(new java.awt.Color(42, 36, 56));
        txtNombre.setCaretColor(new java.awt.Color(42, 36, 56));
        txtNombre.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        txtNombre.setLabelText("Nombres");
        txtNombre.setLineColor(new java.awt.Color(42, 36, 56));
        txtNombre.setSelectionColor(new java.awt.Color(58, 50, 75));
        Logo.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 310, 70));

        txtApellido.setBackground(new java.awt.Color(254, 254, 254));
        txtApellido.setForeground(new java.awt.Color(42, 36, 56));
        txtApellido.setCaretColor(new java.awt.Color(42, 36, 56));
        txtApellido.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        txtApellido.setLabelText("Apellidos");
        txtApellido.setLineColor(new java.awt.Color(42, 36, 56));
        txtApellido.setSelectionColor(new java.awt.Color(58, 50, 75));
        Logo.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 310, 70));

        txtCorreo.setBackground(new java.awt.Color(254, 254, 254));
        txtCorreo.setForeground(new java.awt.Color(42, 36, 56));
        txtCorreo.setToolTipText("");
        txtCorreo.setCaretColor(new java.awt.Color(42, 36, 56));
        txtCorreo.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        txtCorreo.setLabelText("Correo Electronico");
        txtCorreo.setLineColor(new java.awt.Color(42, 36, 56));
        txtCorreo.setSelectionColor(new java.awt.Color(58, 50, 75));
        Logo.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 570, 310, 70));

        txtDirecion.setBackground(new java.awt.Color(254, 254, 254));
        txtDirecion.setForeground(new java.awt.Color(42, 36, 56));
        txtDirecion.setCaretColor(new java.awt.Color(42, 36, 56));
        txtDirecion.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        txtDirecion.setLabelText("Direccion");
        txtDirecion.setLineColor(new java.awt.Color(42, 36, 56));
        txtDirecion.setSelectionColor(new java.awt.Color(58, 50, 75));
        Logo.add(txtDirecion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 310, 70));

        CmbGenero.setBackground(new java.awt.Color(254, 254, 254));
        CmbGenero.setForeground(new java.awt.Color(42, 36, 56));
        CmbGenero.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        CmbGenero.setLabeText("Genero");
        CmbGenero.setLineColor(new java.awt.Color(42, 36, 56));
        CmbGenero.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CmbGeneroItemStateChanged(evt);
            }
        });
        Logo.add(CmbGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 310, 80));

        CmbTipoDocumento.setBackground(new java.awt.Color(254, 254, 254));
        CmbTipoDocumento.setForeground(new java.awt.Color(42, 36, 56));
        CmbTipoDocumento.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        CmbTipoDocumento.setLabeText("Tipo  Documento");
        CmbTipoDocumento.setLineColor(new java.awt.Color(42, 36, 56));
        CmbTipoDocumento.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CmbTipoDocumentoItemStateChanged(evt);
            }
        });
        CmbTipoDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CmbTipoDocumentoActionPerformed(evt);
            }
        });
        Logo.add(CmbTipoDocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 560, 310, 80));

        DtFechanac.setColorBackground(new java.awt.Color(42, 36, 56));
        DtFechanac.setColorButtonHover(new java.awt.Color(60, 63, 65));
        DtFechanac.setColorDiaActual(new java.awt.Color(42, 36, 56));
        DtFechanac.setFormatoFecha("yyyy-MM-dd");
        DtFechanac.setFuente(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Logo.add(DtFechanac, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 500, 310, 40));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setText("Fecha Nacimiento");
        Logo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 450, -1, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("Foto (Opcional)");
        Logo.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 80, -1, -1));

        LblFoto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        Logo.add(LblFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 110, 220, 230));

        BtnExaminar.setBackground(new java.awt.Color(42, 36, 56));
        BtnExaminar.setText("Examinar");
        BtnExaminar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        BtnExaminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnExaminarActionPerformed(evt);
            }
        });
        Logo.add(BtnExaminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 350, 220, 50));

        TxtUsuario.setBackground(new java.awt.Color(254, 254, 254));
        TxtUsuario.setForeground(new java.awt.Color(42, 36, 56));
        TxtUsuario.setToolTipText("");
        TxtUsuario.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        TxtUsuario.setLabelText("Usuario");
        TxtUsuario.setLineColor(new java.awt.Color(42, 36, 56));
        Logo.add(TxtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 660, 310, 80));

        PanelFondo.add(Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 850));

        btnMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos_Proyecto/Maximizar.png"))); // NOI18N
        btnMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMinimizarMouseClicked(evt);
            }
        });
        PanelFondo.add(btnMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1330, 21, -1, -1));

        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos_Proyecto/CerrarLogin.png"))); // NOI18N
        btnCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnCerrarMousePressed(evt);
            }
        });
        PanelFondo.add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1350, 20, -1, -1));

        Imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos_Proyecto/PersonalImg.png"))); // NOI18N
        PanelFondo.add(Imagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 170, 500, 530));

        getContentPane().add(PanelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1400, 850));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarMousePressed
        System.exit(0);
    }//GEN-LAST:event_btnCerrarMousePressed

    private void btnMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizarMouseClicked
        // TODO add your handling code here:
        this.setExtendedState(JFrame.ICONIFIED);
    }//GEN-LAST:event_btnMinimizarMouseClicked

    private void CmbTipoDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CmbTipoDocumentoActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_CmbTipoDocumentoActionPerformed

    private void CmbTipoDocumentoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CmbTipoDocumentoItemStateChanged
        // TODO add your handling code here:º
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            int pos = CmbTipoDocumento.getSelectedIndex();
            if (pos == 0) {
                tipod = 0;
            } else {
                int dim = myArrayList.size();
                for (int i = 0; i < dim; i++) {
                    if (i == pos - 1) {
                        tipod = (int) myArrayList.get(i);
                    }
                }
            }
        }
    }//GEN-LAST:event_CmbTipoDocumentoItemStateChanged

    private void CmbGeneroItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CmbGeneroItemStateChanged
        // TODO add your handling code here:
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            int pos = CmbGenero.getSelectedIndex();
            if (pos == 0) {
                genero = 0;
            } else {
                int dimgenero = ListGenero.size();
                for (int i = 0; i < dimgenero; i++) {
                    if (i == pos - 1) {
                        genero = (int) ListGenero.get(i);
                    }
                }
            }
        }
    }//GEN-LAST:event_CmbGeneroItemStateChanged

    private void txtDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDocumentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDocumentoActionPerformed

    private void btnContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinuarActionPerformed
        // TODO add your handling code here:
        IngresarRegistros();

    }//GEN-LAST:event_btnContinuarActionPerformed

    private void BtnExaminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnExaminarActionPerformed
        // TODO add your handling code here:
        ExaminarImagen();
    }//GEN-LAST:event_BtnExaminarActionPerformed

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
            java.util.logging.Logger.getLogger(FrmP_U_Personal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmP_U_Personal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmP_U_Personal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmP_U_Personal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                    new FrmP_U_Personal().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(FrmP_U_Personal.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                    Logger.getLogger(FrmP_U_Personal.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    Logger.getLogger(FrmP_U_Personal.class.getName()).log(Level.SEVERE, null, ex);
                } catch (UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(FrmP_U_Personal.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Controles_Personalizados.Botones.UWPButton BtnExaminar;
    private Controles_Personalizados.ComboBox.combobox CmbGenero;
    private Controles_Personalizados.ComboBox.combobox CmbTipoDocumento;
    private rojerusan.RSDateChooser DtFechanac;
    private javax.swing.JLabel Imagen;
    private javax.swing.JLabel LblFoto;
    private Controles_Personalizados.Paneles.PanelRound Logo;
    private Controles_Personalizados.Paneles.PanelRound PanelFondo;
    private Controles_Personalizados.textfields.TextField TxtUsuario;
    private javax.swing.JLabel btnCerrar;
    private Controles_Personalizados.Botones.ButtonGradient btnContinuar;
    private javax.swing.JLabel btnMinimizar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private Controles_Personalizados.textfields.TextField txtApellido;
    private Controles_Personalizados.textfields.TextField txtCorreo;
    private Controles_Personalizados.textfields.TextField txtDirecion;
    private Controles_Personalizados.textfields.TextField txtDocumento;
    private Controles_Personalizados.textfields.TextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
