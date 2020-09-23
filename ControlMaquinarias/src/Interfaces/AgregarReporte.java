/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author sebas
 */
public class AgregarReporte extends javax.swing.JFrame {
    private Sistema sistema;
    /**
     * Creates new form AgregarReporte
     */
    public AgregarReporte(Sistema sistema) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.sistema = sistema;
        buttonGroup1.add(seleccionCamion);
        buttonGroup1.add(seleccionMaquina);
        seleccionCamion.setEnabled(false);
        seleccionMaquina.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        ingresoHorometroInicial = new javax.swing.JTextField();
        codigoEquipo = new javax.swing.JTextField();
        botonBuscar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ingresoHorometroFinal = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ingresoHorasDisponibles = new javax.swing.JTextField();
        ingresoHorasTrabajadas = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        ingresoHorasSB = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        ingresoPetroleo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        ingresoHorasPanne = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        ingresoFecha = new javax.swing.JTextField();
        botonAgregar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        ingresoViajes = new javax.swing.JTextField();
        seleccionMaquina = new javax.swing.JRadioButton();
        seleccionCamion = new javax.swing.JRadioButton();
        botonCalcular = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Ingresar reporte");

        ingresoHorometroInicial.setEditable(false);

        codigoEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigoEquipoActionPerformed(evt);
            }
        });

        botonBuscar.setText("buscar");
        botonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarActionPerformed(evt);
            }
        });
        botonBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                botonBuscarKeyPressed(evt);
            }
        });

        jLabel1.setText("Codigo del equipo");

        jLabel2.setText("Horometro inicial");

        jLabel3.setText("Horometro final");

        jLabel4.setText("Horas maquina");

        ingresoHorasDisponibles.setEditable(false);

        jLabel5.setText("Horas trabajadas");

        jLabel6.setText("Horas Stand by");

        jLabel7.setText("Cantidad de petroleo");

        jLabel8.setText("Horas panne");

        jLabel9.setText("Ingrese la fecha (dd/mm/aaa)");

        botonAgregar.setText("agregar reporte");
        botonAgregar.setEnabled(false);
        botonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarActionPerformed(evt);
            }
        });

        jLabel10.setText("Numero de viajes");

        ingresoViajes.setEditable(false);

        seleccionMaquina.setText("Reporte para una Maquina");
        seleccionMaquina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seleccionMaquinaActionPerformed(evt);
            }
        });

        seleccionCamion.setText("Reporte para un camion");
        seleccionCamion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seleccionCamionActionPerformed(evt);
            }
        });

        botonCalcular.setText("Calcular Horas Disponibles");
        botonCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCalcularActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(codigoEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(88, 88, 88)
                .addComponent(botonBuscar)
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(seleccionCamion)
                    .addComponent(seleccionMaquina))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(ingresoFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(182, 182, 182))
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel2)
                    .addComponent(ingresoHorometroInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel3)
                    .addComponent(ingresoHorometroFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel4)
                    .addComponent(ingresoHorasDisponibles, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(ingresoHorasTrabajadas, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(ingresoHorasSB, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(ingresoPetroleo, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(ingresoHorasPanne, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(ingresoViajes, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(45, 45, 45))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addComponent(botonCalcular))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(567, 567, 567)
                        .addComponent(botonAgregar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel9)
                    .addComponent(seleccionMaquina))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(codigoEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(botonBuscar)
                        .addComponent(seleccionCamion))
                    .addComponent(ingresoFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ingresoHorometroInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ingresoHorometroFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ingresoHorasDisponibles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ingresoHorasTrabajadas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ingresoHorasSB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ingresoPetroleo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ingresoHorasPanne, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ingresoViajes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(botonCalcular)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(botonAgregar)
                .addGap(33, 33, 33))
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void codigoEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigoEquipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codigoEquipoActionPerformed

    private void botonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarActionPerformed
        // TODO add your handling code here:
        try{
            ingresoHorometroInicial.setText(Double.toString(sistema.obtenerHorometro(codigoEquipo.getText())));
            if (sistema.obtenerTipoEquipo(codigoEquipo.getText()) == 0){
                seleccionCamion.setEnabled(true);
                seleccionMaquina.setEnabled(false);
                seleccionCamion.setSelected(true);
                seleccionMaquina.setSelected(false);
                ingresoViajes.setEditable(true);
            }
            else{
                seleccionCamion.setEnabled(false);
                seleccionMaquina.setEnabled(true);
                seleccionCamion.setSelected(false);
                seleccionMaquina.setSelected(true);
                ingresoViajes.setEditable(false);
                ingresoViajes.setText("");
            }
            botonAgregar.setEnabled(true);
        }catch(NullPointerException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        
    }//GEN-LAST:event_botonBuscarActionPerformed

    public void escribirArchivoReportes() throws IOException{
        FileWriter arch = new FileWriter("reportes.txt");
        arch.write(sistema.obtenerReporteMaquinas());
        arch.write(sistema.obtenerReportesCamiones());
        arch.close();
    }
    
    private boolean controlHorasReporte(){
        int suma = Integer.parseInt(ingresoHorasSB.getText()) + Integer.parseInt(ingresoHorasDisponibles.getText());
        return suma <= 12;
    }
    
    private void restablecerCampos(){
        ingresoFecha.setText("");
        ingresoHorasDisponibles.setText("");
        ingresoHorasPanne.setText("");
        ingresoHorasSB.setText("");
        ingresoHorasTrabajadas.setText("");
        ingresoHorometroFinal.setText("");
        ingresoHorometroInicial.setText("");
        ingresoPetroleo.setText("");
        codigoEquipo.setText("");
        botonAgregar.setEnabled(false);
    }
    
    private void botonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarActionPerformed
        // TODO add your handling code here:
        System.out.println("linea 313");
        if(!ingresoFecha.getText().equals("") && !ingresoHorasDisponibles.getText().equals("") && !ingresoHorasPanne.getText().equals("") && !ingresoHorasSB.getText().equals("") && !ingresoHorasTrabajadas.getText().equals("") && !ingresoHorometroFinal.getText().equals("") && !ingresoHorometroInicial.getText().equals("") && !ingresoPetroleo.getText().equals("")){
            System.out.println("linea 315");
            if(seleccionMaquina.isSelected()){
                try{
                    
                    if(sistema.ingresarReporteMaquina(Double.parseDouble(ingresoHorasTrabajadas.getText()), Double.parseDouble(ingresoHorasSB.getText()), Integer.parseInt(ingresoPetroleo.getText()), Double.parseDouble(ingresoHorometroFinal.getText()), Double.parseDouble(ingresoHorometroInicial.getText()), codigoEquipo.getText(), Double.parseDouble(ingresoHorasPanne.getText()), ingresoFecha.getText())){
                        JOptionPane.showMessageDialog(null, "Reporte ingresado exitosamente");
                        restablecerCampos();
                        escribirArchivoReportes();
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Existe un error entre el Horometro inicial con el Horometro final, la resta entre ellos es mayor a 13 horas");
                    }
                }catch(NumberFormatException ex){
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                } catch (IOException ex) {
                    Logger.getLogger(AgregarReporte.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
            else{
                if(!ingresoViajes.getText().equals("")){
                    try{
                        if(controlHorasReporte()){
                            sistema.ingresarReporteCamion(Double.parseDouble(ingresoHorasTrabajadas.getText()), Double.parseDouble(ingresoHorasSB.getText()), Integer.parseInt(ingresoPetroleo.getText()), Double.parseDouble(ingresoHorometroFinal.getText()), Double.parseDouble(ingresoHorometroInicial.getText()), codigoEquipo.getText(), Double.parseDouble(ingresoHorasPanne.getText()), ingresoFecha.getText(),Integer.parseInt(ingresoViajes.getText()));
                            JOptionPane.showMessageDialog(null, "Reporte ingresado exitosamente");
                            restablecerCampos();
                            escribirArchivoReportes();
                            System.out.println("se guardo en el sistema");
                        }
                        else{
                            JOptionPane.showMessageDialog(null, "Existe un error en las horas ingresadas");
                        }
                    }catch(NumberFormatException ex){
                        JOptionPane.showMessageDialog(null, ex.getMessage());
                    } catch (IOException ex) {
                        Logger.getLogger(AgregarReporte.class.getName()).log(Level.SEVERE, null, ex);
                        System.out.println("Error que no se");
                    }
                }
                
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Complete toda la informacion requerida");
        }
    }//GEN-LAST:event_botonAgregarActionPerformed

    private void botonCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCalcularActionPerformed
        // TODO add your handling code here:
        try{
            if(!ingresoHorometroInicial.getText().equals("")){
                double resta = Double.parseDouble(ingresoHorometroFinal.getText()) - Double.parseDouble(ingresoHorometroInicial.getText());
                if (resta < 13){
                    
                    ingresoHorasDisponibles.setText(Double.toString(resta));
                }
                else{
                    JOptionPane.showMessageDialog(null, "El Horometro final presenta un error, ya que,\nla diferencia de horas es mayor a 12");
                }

            }
        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(null, "Ingrese el Horometro final");
        }
    }//GEN-LAST:event_botonCalcularActionPerformed

    private void seleccionCamionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seleccionCamionActionPerformed
        // TODO add your handling code here:
        ingresoViajes.setEditable(true);
    }//GEN-LAST:event_seleccionCamionActionPerformed

    private void seleccionMaquinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seleccionMaquinaActionPerformed
        // TODO add your handling code here:
        ingresoViajes.setEditable(false);
        ingresoViajes.setText("");
    }//GEN-LAST:event_seleccionMaquinaActionPerformed

    private void botonBuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_botonBuscarKeyPressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_botonBuscarKeyPressed

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
            java.util.logging.Logger.getLogger(AgregarReporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarReporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarReporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarReporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAgregar;
    private javax.swing.JButton botonBuscar;
    private javax.swing.JButton botonCalcular;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField codigoEquipo;
    private javax.swing.JTextField ingresoFecha;
    private javax.swing.JTextField ingresoHorasDisponibles;
    private javax.swing.JTextField ingresoHorasPanne;
    private javax.swing.JTextField ingresoHorasSB;
    private javax.swing.JTextField ingresoHorasTrabajadas;
    private javax.swing.JTextField ingresoHorometroFinal;
    private javax.swing.JTextField ingresoHorometroInicial;
    private javax.swing.JTextField ingresoPetroleo;
    private javax.swing.JTextField ingresoViajes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton seleccionCamion;
    private javax.swing.JRadioButton seleccionMaquina;
    // End of variables declaration//GEN-END:variables
}