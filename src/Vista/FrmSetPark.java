/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import com.sun.awt.AWTUtilities;
import java.awt.AWTEvent;
import java.awt.Image;
import java.awt.Shape;
import java.awt.Toolkit;
import java.awt.geom.RoundRectangle2D;
import java.sql.SQLException;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author ferna
 */
public class FrmSetPark extends javax.swing.JFrame {

    /**
     * Creates new form FrmSetPark
     */
    public FrmSetPark() {
        initComponents();        
        setLocationRelativeTo(null);
        Shape forma= new RoundRectangle2D.Double(0,0, this.getBounds() .width, this.getBounds() .height,40,40);
        AWTUtilities. setWindowShape(this, forma);
        setIconImage(Logo());
        
        String[] headeracces = {"IDAcceso", "Documento","IDCarnet","Fecha", "IDTipoAcceso",   "Hora","Tipo de acceso", "Notificación", "Agregar"};        
        String[] headercars = {"IDVehiculo", "Documento","IDPersonal", "Nombres",  "Apellidos",  "Placa", "Color", "Agregar"};
        
        modeltableaccess = new DefaultTableModel(null, headeracces);
        modeltablecars = new DefaultTableModel(null, headercars);
        
        TbAcesosWhite.setModel(modeltableaccess);                       
        TbVehiculosWhite.setModel(modeltablecars);
        
        getAccess();
        //Por alguna razón me omite una columna y pasa a la otra Dx y lo mismo con la tabla vehiculos        
        TbAcesosWhite.removeColumn(TbAcesosWhite.getColumnModel().getColumn(0));        
        TbAcesosWhite.removeColumn(TbAcesosWhite.getColumnModel().getColumn(1));
        TbAcesosWhite.removeColumn(TbAcesosWhite.getColumnModel().getColumn(2));
        
        TbVehiculosWhite.removeColumn(TbVehiculosWhite.getColumnModel().getColumn(0));               
        TbVehiculosWhite.removeColumn(TbVehiculosWhite.getColumnModel().getColumn(1));
    }
public Image Logo(){
    Image retvalue=Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Recursos_Proyecto/B&G Morado 2.png"));
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

        panelRound1 = new Controles_Personalizados.Paneles.PanelRound();
        btnCerrar = new javax.swing.JLabel();
        btnMinimizar = new javax.swing.JLabel();
        btnListo = new Controles_Personalizados.Botones.ButtonGradient();
        lblParkname = new javax.swing.JLabel();
        lblParkname1 = new javax.swing.JLabel();
        lblParkname2 = new javax.swing.JLabel();
        ScrollTabla = new Controles_Personalizados.ScrollBar.ScrollBarCustom();
        PanelTabla1 = new javax.swing.JScrollPane();
        TbVehiculosWhite = new Controles_Personalizados.Tables.Table();
        PanelTabla2 = new javax.swing.JScrollPane();
        TbAcesosWhite = new Controles_Personalizados.Tables.Table();
        ScrollTablaAcces = new Controles_Personalizados.ScrollBar.ScrollBarCustom();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1099, 578));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound1.setBackground(new java.awt.Color(58, 50, 75));
        panelRound1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos_Proyecto/CerrarLogin.png"))); // NOI18N
        btnCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnCerrarMousePressed(evt);
            }
        });
        panelRound1.add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 10, -1, -1));

        btnMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos_Proyecto/Maximizar.png"))); // NOI18N
        btnMinimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMinimizarMouseClicked(evt);
            }
        });
        panelRound1.add(btnMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 10, -1, -1));

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
        panelRound1.add(btnListo, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 500, 150, -1));

        lblParkname.setFont(new java.awt.Font("Roboto Medium", 0, 36)); // NOI18N
        lblParkname.setForeground(new java.awt.Color(253, 255, 254));
        lblParkname.setText("PARKNAME");
        panelRound1.add(lblParkname, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, 210, 40));

        lblParkname1.setFont(new java.awt.Font("Roboto Medium", 0, 36)); // NOI18N
        lblParkname1.setForeground(new java.awt.Color(253, 255, 254));
        lblParkname1.setText("VEHICULOS");
        panelRound1.add(lblParkname1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, -1, 40));

        lblParkname2.setFont(new java.awt.Font("Roboto Medium", 0, 36)); // NOI18N
        lblParkname2.setForeground(new java.awt.Color(253, 255, 254));
        lblParkname2.setText("ACCESOS");
        panelRound1.add(lblParkname2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, 40));

        ScrollTabla.setBackground(new java.awt.Color(58, 50, 75));
        ScrollTabla.setForeground(new java.awt.Color(58, 50, 75));
        panelRound1.add(ScrollTabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(1238, 177, 10, 40));

        PanelTabla1.setHorizontalScrollBar(null);
        PanelTabla1.setWheelScrollingEnabled(false);

        TbVehiculosWhite = new Controles_Personalizados.Tables.Table(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        TbVehiculosWhite.setBackground(new java.awt.Color(231, 234, 239));
        TbVehiculosWhite.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "CARNET", "PLACA", "ACCIONES"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TbVehiculosWhite.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        TbVehiculosWhite.setGridColor(new java.awt.Color(58, 50, 75));
        TbVehiculosWhite.setName(""); // NOI18N
        TbVehiculosWhite.setSelectionBackground(new java.awt.Color(58, 50, 75));
        TbVehiculosWhite.setShowVerticalLines(false);
        PanelTabla1.setViewportView(TbVehiculosWhite);

        panelRound1.add(PanelTabla1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 1030, 160));

        PanelTabla2.setVerifyInputWhenFocusTarget(false);
        PanelTabla2.setWheelScrollingEnabled(false);

        TbAcesosWhite = new Controles_Personalizados.Tables.Table(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        TbAcesosWhite.setBackground(new java.awt.Color(231, 234, 239));
        TbAcesosWhite.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "CARNET", "PLACA", "ACCIONES"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TbAcesosWhite.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        TbAcesosWhite.setGridColor(new java.awt.Color(58, 50, 75));
        TbAcesosWhite.setName(""); // NOI18N
        TbAcesosWhite.setSelectionBackground(new java.awt.Color(58, 50, 75));
        TbAcesosWhite.setShowVerticalLines(false);
        PanelTabla2.setViewportView(TbAcesosWhite);

        panelRound1.add(PanelTabla2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 1030, 160));

        ScrollTablaAcces.setBackground(new java.awt.Color(58, 50, 75));
        ScrollTablaAcces.setForeground(new java.awt.Color(58, 50, 75));
        panelRound1.add(ScrollTablaAcces, new org.netbeans.lib.awtextra.AbsoluteConstraints(1238, 177, 10, 40));

        getContentPane().add(panelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static String parkname;

    public static String getParkname() {
        return parkname;
    }

    public static void setParkname(String parkname) {
        FrmSetPark.parkname = parkname;
    }
    
    DefaultTableModel modeltableaccess;
    DefaultTableModel modeltablecars;
    
    private void btnCerrarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarMousePressed
        this.dispose();
    }//GEN-LAST:event_btnCerrarMousePressed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        lblParkname.setText((parkname));        
    }//GEN-LAST:event_formWindowActivated

    private void btnListoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListoActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnListoActionPerformed

    private void btnMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizarMouseClicked
        // TODO add your handling code here:
        this.setExtendedState(JFrame.ICONIFIED);
    }//GEN-LAST:event_btnMinimizarMouseClicked

    void getAccess(){
        if (modeltableaccess.getRowCount() > 0 || modeltablecars.getRowCount() > 0) {//si en el modelo de la tabla hay datos/filas o los datos son mayores a 0
            modeltableaccess.removeRow(0);//remover las filas a 0
            modeltablecars.removeRow(0);
        }else{
            try {
                ResultSet rsAcsess = Controlador.ControllerAccesos.getdata("vwAcessos");
                while (rsAcsess.next()) {                    
                    Object[] data = {rsAcsess.getInt("idAcceso"), rsAcsess.getString("numero_carnet"),rsAcsess.getInt("idCarnet"), rsAcsess.getDate("fecha"), rsAcsess.getInt("idTipoAcceso"), rsAcsess.getTime("hora"), rsAcsess.getString("tipo_acceso"), rsAcsess.getString("notificacion")};
                    modeltableaccess.addRow(data);
                }
                ResultSet rsCar = Controlador.ControllerAccesos.getdata("vwVehiculos");                
                while (rsCar.next()) {                    
                    Object[] data = {rsCar.getInt("idVehiculo"), rsCar.getString("nombre_p"), rsCar.getInt("idPersonal"), rsCar.getString("apellido_p"), rsCar.getString("numero_carnet"), rsCar.getString("placa"), rsCar.getString("color")};
                    modeltablecars.addRow(data);
                }
                
            } catch (SQLException e) {
                System.out.println("Error view: "+e.toString());
            }
        }
    }
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
            java.util.logging.Logger.getLogger(FrmSetPark.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmSetPark.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmSetPark.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmSetPark.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmSetPark().setVisible(true);                
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane PanelTabla1;
    private javax.swing.JScrollPane PanelTabla2;
    private Controles_Personalizados.ScrollBar.ScrollBarCustom ScrollTabla;
    private Controles_Personalizados.ScrollBar.ScrollBarCustom ScrollTablaAcces;
    private Controles_Personalizados.Tables.Table TbAcesosWhite;
    private Controles_Personalizados.Tables.Table TbVehiculosWhite;
    private javax.swing.JLabel btnCerrar;
    private Controles_Personalizados.Botones.ButtonGradient btnListo;
    private javax.swing.JLabel btnMinimizar;
    private javax.swing.JLabel lblParkname;
    private javax.swing.JLabel lblParkname1;
    private javax.swing.JLabel lblParkname2;
    private Controles_Personalizados.Paneles.PanelRound panelRound1;
    // End of variables declaration//GEN-END:variables
}
