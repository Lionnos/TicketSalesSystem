package View.Buses;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.DefaultTableModel;

import Controller.VehicleController;
import Model.Entity.Vehicle;

public class JInternalBuses extends javax.swing.JInternalFrame {

    
    public JInternalBuses() {
        initComponents();
        initController();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_Fondo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel_Barra = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton_New = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jButton_Update = new javax.swing.JButton();

        setMinimumSize(new java.awt.Dimension(1320, 738));
        setPreferredSize(new java.awt.Dimension(1320, 738));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel_Fondo.setMinimumSize(new java.awt.Dimension(1320, 738));
        jPanel_Fondo.setPreferredSize(new java.awt.Dimension(1320, 738));
        jPanel_Fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel1.setText("CONTROL DE BUSES");
        jPanel_Fondo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 0, 450, 50));

        jPanel_Barra.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jPanel_Barra.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton1.setText("Eliminar Bus");
        jPanel_Barra.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, 110, 30));

        jButton_New.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton_New.setText("Nuevo Bus");
        jButton_New.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_NewMouseClicked(evt);
            }
        });
        jPanel_Barra.add(jButton_New, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, 30));

        jButton3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton3.setText("Editar datos");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel_Barra.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, 110, 30));

        jButton4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton4.setText("Anular Bus");
        jPanel_Barra.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 110, 30));

        jPanel_Fondo.add(jPanel_Barra, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 440, 30));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Listado de Buses", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N
        jPanel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nº ", "Placa", "Modelo", "Numero de Asientos", "Descripción", "Estado"
            }
        ));
        jScrollPane1.setViewportView(jTable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 660, 350));

        jButton_Update.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton_Update.setText("Actualizar");
        jButton_Update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_UpdateMouseClicked(evt);
            }
        });
        jPanel1.add(jButton_Update, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 410, -1, -1));

        jPanel_Fondo.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 160, 700, 480));

        getContentPane().add(jPanel_Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1310, 710));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton_NewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_NewMouseClicked
        // TODO add your handling code here:
        panelNewBus();
    }//GEN-LAST:event_jButton_NewMouseClicked

    private void jButton_UpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_UpdateMouseClicked
        // TODO add your handling code here:
        getall();
    }//GEN-LAST:event_jButton_UpdateMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton_New;
    private javax.swing.JButton jButton_Update;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel_Barra;
    private javax.swing.JPanel jPanel_Fondo;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable jTable;
    // End of variables declaration//GEN-END:variables


    //  ===========
    //  ADICIONALES
    //  ===========
    VehicleController vehicleController;
    List<String> idVehicles;
    private JPanelNewBus jPanelNewBus;


    private void initController(){
        vehicleController = new VehicleController();
        idVehicles = new ArrayList<>();
        jPanelNewBus = new JPanelNewBus();
        jPanel_Fondo.add(jPanelNewBus, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150));
        jPanelNewBus.setVisible(false);
        getall();
    }
    
    private void panelNewBus(){
        jPanelNewBus.setVisible(true);
    }


    private void getall(){
        DefaultTableModel model = (DefaultTableModel)jTable.getModel();

        // Limpia el contenido de la jTable
        model.setRowCount(0);

        List<Vehicle> vehicles = vehicleController.getAll();
        int cout = 1;
        String state;
        for (Vehicle vehicle : vehicles) {

            if(vehicle.isState() == true){
                state = "Activo";
            }
            else {
                state = "Inactivo";
            }

            idVehicles.add(vehicle.getIdVehicle());
            Object[] row = {
                cout,
                vehicle.getPlate(),
                vehicle.getModel(),
                vehicle.getSeatNumbers(),
                vehicle.getDescription(),
                state//vehicle.isState()
            };
            model.addRow(row);
            cout++;
        }
    }
}
