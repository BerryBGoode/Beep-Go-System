/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.ControllerP_U_Personal;
import Controles_Personalizados.Calendario.SelectedDate;
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
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;
import javax.imageio.ImageIO;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author danlo
 */
public class FrmP_U_Personal extends javax.swing.JFrame {
    DefaultComboBoxModel<String>modelocombo=new DefaultComboBoxModel<>();
    DefaultComboBoxModel<String>modelcombogenero=new DefaultComboBoxModel<>();
   private int tipop=0;
   private int genero=0;
   private List myArrayList;
   private List ListGenero;
    ControllerP_U_Personal controllerp=new ControllerP_U_Personal();
    byte [] fotop;
    ImageIcon fotoicon;
    /**
     * Creates new form PrimerUsoPersonal
     */
    public FrmP_U_Personal() {
        initComponents();
        this.setLocationRelativeTo(null); 
         Shape forma= new RoundRectangle2D.Double(0,0, this.getBounds() .width, this.getBounds() .height,40,40);
         AWTUtilities. setWindowShape(this, forma);
         setIconImage(Logo());
         cargarlista();
    }
public Image Logo(){
    Image retvalue=Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Recursos_Proyecto/B&G Morado 2.png"));
    return retvalue;
}
void ExaminarImagen(){
    JFileChooser jcargarfoto=new JFileChooser();
    FileNameExtensionFilter extension=new FileNameExtensionFilter("JPG", "PNG", "JPG");
    jcargarfoto.setFileFilter(extension);
    int ver=jcargarfoto.showOpenDialog(this);
    if (ver== JFileChooser.APPROVE_OPTION) {
        String url=jcargarfoto.getSelectedFile().getAbsolutePath();
        try {
            File ruta=new File(url);
            fotop=new byte[(int) ruta.length()];
            InputStream input= new FileInputStream(ruta);
            input.read(fotop);
            controllerp.setLogo(fotop);
        } catch (Exception e) {
            controllerp.setLogo(fotop);
        }
        try {
            byte[]imagen=controllerp.getLogo();
            BufferedImage image=null;
            InputStream input=new ByteArrayInputStream(imagen);
            image=ImageIO.read(input);
            fotoicon=new ImageIcon(image.getScaledInstance(220, 250, 0));
            LblFoto.setIcon(fotoicon);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }
            
}
void InsercionPPersonal(){
   
    if (CmbTipoPersonal.getSelectedItem()==""||CmbGenero.getSelectedItem()=="") {
        JOptionPane.showMessageDialog(null, "Escoja una opcion");
    }
    else if(txtNombre.getText().trim().isEmpty()||txtApellido.getText().trim().isEmpty()||txtCorreo.getText().trim().isEmpty()||txtDirecion.getText().trim().isEmpty()||txtDocumento.getText().trim().isEmpty()){
        JOptionPane.showMessageDialog(null, "No se permiten campos vacios");
    }
    else{
        SimpleDateFormat format=new SimpleDateFormat();

        controllerp.nombre=txtNombre.getText();
        controllerp.apellido=txtApellido.getText();
        controllerp.correo=txtCorreo.getText();
        controllerp.direccion=txtDirecion.getText();
        controllerp.dui=txtDocumento.getText();
        controllerp.idtipopersonal=tipop;
        controllerp.idgenero=genero;
        controllerp.foto=fotop;
        //controllerp.fechanac= format.parse(d);
        //controllerp.fechanac=DtFechanac
        if (controllerp.IngresarPPersonalController()==true) {
            JOptionPane.showMessageDialog(null, "Se ha agregado un nuevo registro","Proceso completado",JOptionPane.INFORMATION_MESSAGE);
        }
    }
       
   
}
void cargarlista(){
    CargarTipoPersonal();
    CargarGeneroPersonal();
}
final void CargarGeneroPersonal(){
    ListGenero=new ArrayList();
    try {
        ResultSet rs=controllerp.cargarGeneroController();
        if (rs.next()) {
            modelcombogenero.addElement("");
            do{
            ListGenero.add(rs.getInt("idGenero"));
            modelcombogenero.addElement(rs.getString("genero"));
            CmbGenero.setModel(modelcombogenero);
            }while(rs.next());
        }
        else{
            System.out.println("No existen campos");
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "No se logro cargar la informacion","Error al cargar",JOptionPane.ERROR_MESSAGE);
    }
}
final void CargarTipoPersonal(){
    myArrayList=new ArrayList();
    try {
         ResultSet rs=controllerp.cargarTipoPersonalController();
         if (rs.next()) {
             modelocombo.addElement("");
            do{
            myArrayList.add(rs.getInt("idTipoPersonal"));
            modelocombo.addElement(rs.getString("tipo_personal"));
            CmbTipoPersonal.setModel(modelocombo);
            }while(rs.next());
        }else{
             System.out.println("No existen campos");
         }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "No se lograron cargar los datos","Error al cargar",JOptionPane.ERROR_MESSAGE);
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
        btnExaminar = new Controles_Personalizados.Botones.ButtonGradient();
        lblLogo = new javax.swing.JLabel();
        txtDocumento = new Controles_Personalizados.textfields.TextField();
        txtNombre = new Controles_Personalizados.textfields.TextField();
        txtApellido = new Controles_Personalizados.textfields.TextField();
        txtCorreo = new Controles_Personalizados.textfields.TextField();
        txtDirecion = new Controles_Personalizados.textfields.TextField();
        CmbGenero = new Controles_Personalizados.ComboBox.combobox();
        CmbTipoPersonal = new Controles_Personalizados.ComboBox.combobox();
        jLabel1 = new javax.swing.JLabel();
        LblFoto = new javax.swing.JLabel();
        btnMinimizar = new javax.swing.JLabel();
        btnCerrar = new javax.swing.JLabel();
        Imagen = new javax.swing.JLabel();

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

        Logo.setBackground(new java.awt.Color(254, 254, 254));
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
        Logo.add(btnContinuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 710, 150, -1));

        btnExaminar.setText("Examinar");
        btnExaminar.setToolTipText("");
        btnExaminar.setColor1(new java.awt.Color(42, 36, 56));
        btnExaminar.setColor2(new java.awt.Color(42, 36, 56));
        btnExaminar.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        btnExaminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExaminarActionPerformed(evt);
            }
        });
        Logo.add(btnExaminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 480, 150, -1));

        lblLogo.setFont(new java.awt.Font("Roboto Thin", 0, 18)); // NOI18N
        lblLogo.setForeground(new java.awt.Color(91, 91, 95));
        lblLogo.setText("Foto (Opcional)");
        Logo.add(lblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 180, -1, -1));

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
        Logo.add(txtDocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 420, 310, 70));

        txtNombre.setBackground(new java.awt.Color(254, 254, 254));
        txtNombre.setForeground(new java.awt.Color(42, 36, 56));
        txtNombre.setCaretColor(new java.awt.Color(42, 36, 56));
        txtNombre.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        txtNombre.setLabelText("Nombres");
        txtNombre.setLineColor(new java.awt.Color(42, 36, 56));
        txtNombre.setSelectionColor(new java.awt.Color(58, 50, 75));
        Logo.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 310, 70));

        txtApellido.setBackground(new java.awt.Color(254, 254, 254));
        txtApellido.setForeground(new java.awt.Color(42, 36, 56));
        txtApellido.setCaretColor(new java.awt.Color(42, 36, 56));
        txtApellido.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        txtApellido.setLabelText("Apellidos");
        txtApellido.setLineColor(new java.awt.Color(42, 36, 56));
        txtApellido.setSelectionColor(new java.awt.Color(58, 50, 75));
        Logo.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 310, 70));

        txtCorreo.setBackground(new java.awt.Color(254, 254, 254));
        txtCorreo.setForeground(new java.awt.Color(42, 36, 56));
        txtCorreo.setToolTipText("");
        txtCorreo.setCaretColor(new java.awt.Color(42, 36, 56));
        txtCorreo.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        txtCorreo.setLabelText("Correo Electronico");
        txtCorreo.setLineColor(new java.awt.Color(42, 36, 56));
        txtCorreo.setSelectionColor(new java.awt.Color(58, 50, 75));
        Logo.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, 310, 70));

        txtDirecion.setBackground(new java.awt.Color(254, 254, 254));
        txtDirecion.setForeground(new java.awt.Color(42, 36, 56));
        txtDirecion.setCaretColor(new java.awt.Color(42, 36, 56));
        txtDirecion.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        txtDirecion.setLabelText("Direccion");
        txtDirecion.setLineColor(new java.awt.Color(42, 36, 56));
        txtDirecion.setSelectionColor(new java.awt.Color(58, 50, 75));
        Logo.add(txtDirecion, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, 310, 70));

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
        Logo.add(CmbGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 610, 310, 80));

        CmbTipoPersonal.setBackground(new java.awt.Color(254, 254, 254));
        CmbTipoPersonal.setForeground(new java.awt.Color(42, 36, 56));
        CmbTipoPersonal.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        CmbTipoPersonal.setLabeText("Tipo - Personal");
        CmbTipoPersonal.setLineColor(new java.awt.Color(42, 36, 56));
        CmbTipoPersonal.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CmbTipoPersonalItemStateChanged(evt);
            }
        });
        CmbTipoPersonal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CmbTipoPersonalActionPerformed(evt);
            }
        });
        Logo.add(CmbTipoPersonal, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 510, 310, 80));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setText("Fecha nacimiento");
        Logo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 60, -1, -1));

        LblFoto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        Logo.add(LblFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 220, 220, 250));

        PanelFondo.add(Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, -1));

        btnMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos_Proyecto/Maximizar.png"))); // NOI18N
        btnMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMinimizarMouseClicked(evt);
            }
        });
        PanelFondo.add(btnMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 21, -1, -1));

        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos_Proyecto/CerrarLogin.png"))); // NOI18N
        btnCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnCerrarMousePressed(evt);
            }
        });
        PanelFondo.add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1330, 20, -1, -1));

        Imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos_Proyecto/PersonalImg.png"))); // NOI18N
        PanelFondo.add(Imagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 130, -1, -1));

        getContentPane().add(PanelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarMousePressed
        System.exit(0);
    }//GEN-LAST:event_btnCerrarMousePressed

    private void btnMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizarMouseClicked
        // TODO add your handling code here:
        this.setExtendedState(JFrame.ICONIFIED);
    }//GEN-LAST:event_btnMinimizarMouseClicked

    private void CmbTipoPersonalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CmbTipoPersonalActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_CmbTipoPersonalActionPerformed

    private void CmbTipoPersonalItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CmbTipoPersonalItemStateChanged
        // TODO add your handling code here:º
        if (evt.getStateChange()==ItemEvent.SELECTED) {
            int pos=CmbTipoPersonal.getSelectedIndex();
            if (pos==0) {
                tipop=0;
            }else{
                int dim=myArrayList.size();
                for (int i = 0; i < dim; i++) {
                    if (i==pos-1) {
                        tipop=(int) myArrayList.get(i);
                    }
                }
            }
        }
    }//GEN-LAST:event_CmbTipoPersonalItemStateChanged

    private void CmbGeneroItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CmbGeneroItemStateChanged
        // TODO add your handling code here:
        if (evt.getStateChange()==ItemEvent.SELECTED) {
            int pos=CmbGenero.getSelectedIndex();
            if (pos==0) {
                genero=0;
            }else{
                int dimgenero=ListGenero.size();
                for (int i = 0; i < dimgenero; i++) {
                    if (i==pos-1) {
                        genero=(int)ListGenero.get(i);
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
        InsercionPPersonal();
        /*FrmP_U_Usuario pu = new FrmP_U_Usuario();
        pu.setVisible(true);
        this.dispose();*/
    }//GEN-LAST:event_btnContinuarActionPerformed

    private void btnExaminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExaminarActionPerformed
        // TODO add your handling code here:
        ExaminarImagen();
    }//GEN-LAST:event_btnExaminarActionPerformed

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
                new FrmP_U_Personal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Controles_Personalizados.ComboBox.combobox CmbGenero;
    private Controles_Personalizados.ComboBox.combobox CmbTipoPersonal;
    private javax.swing.JLabel Imagen;
    private javax.swing.JLabel LblFoto;
    private Controles_Personalizados.Paneles.PanelRound Logo;
    private Controles_Personalizados.Paneles.PanelRound PanelFondo;
    private javax.swing.JLabel btnCerrar;
    private Controles_Personalizados.Botones.ButtonGradient btnContinuar;
    private Controles_Personalizados.Botones.ButtonGradient btnExaminar;
    private javax.swing.JLabel btnMinimizar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblLogo;
    private Controles_Personalizados.textfields.TextField txtApellido;
    private Controles_Personalizados.textfields.TextField txtCorreo;
    private Controles_Personalizados.textfields.TextField txtDirecion;
    private Controles_Personalizados.textfields.TextField txtDocumento;
    private Controles_Personalizados.textfields.TextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
