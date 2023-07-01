/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package ec.edu.ups.practica.cantante.compositor.interfaces.vista.cantante;

import ec.edu.ups.practica.cantante.compositor.interfaces.controlador.ControladorCantante;
import ec.edu.ups.practica.cantante.compositor.interfaces.modelo.Cantante;
import java.util.Locale;
import java.util.ResourceBundle;
import javax.swing.JOptionPane;

/**
 *
 * @author venot
 */
public class BuscarPorNombreDeDisco extends javax.swing.JInternalFrame {
    private ControladorCantante controladorCantante;
    private Cantante cantanteTempo;
    private ResourceBundle mensajes;
    /**
     * Creates new form BuscarPorNombreDeDisco
     */
    public BuscarPorNombreDeDisco(ControladorCantante controladorCantante) {
        initComponents();
        this.controladorCantante= controladorCantante;
    }

    public void cambiarIdioma(Locale localizacion){
        mensajes = ResourceBundle.getBundle("mensajes.mensaje", localizacion);
        jblIdBuscarporDisco.setText(mensajes.getString("ventana.id"));
        jblNombreBuscarporDisco.setText(mensajes.getString("ventana.nombre"));
        jblApellidoBuscarporDisco.setText(mensajes.getString("ventana.apellido"));
        jblEdadBuscarporDisco.setText(mensajes.getString("ventana.edad"));
        jblSalarioBuscarporDisco.setText(mensajes.getString("ventana.salario"));
        jblNacionalidadBuscarporDisco.setText(mensajes.getString("ventana.nacionalidad"));
        jblGeneroMusicalBuscarporDisco.setText(mensajes.getString("ventanaCantante.generomusical"));
        jblNumeroConciertosBuscarporDisco.setText(mensajes.getString("ventanaCantante.numeroconciertos"));
        jblNumeroGirasBuscarporDisco.setText(mensajes.getString("ventanaCantante.numerogiras"));
        jblNumeroSencillosBuscarporDisco.setText(mensajes.getString("ventanaCantante.numerosencillos"));
        jblNombreArtisticoBuscarporDisco.setText(mensajes.getString("ventanaCantante.nombreartistico"));
        
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNombreDisco = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jblIdBuscarporDisco = new javax.swing.JLabel();
        jblNombreBuscarporDisco = new javax.swing.JLabel();
        jblApellidoBuscarporDisco = new javax.swing.JLabel();
        jblEdadBuscarporDisco = new javax.swing.JLabel();
        jblNacionalidadBuscarporDisco = new javax.swing.JLabel();
        jblSalarioBuscarporDisco = new javax.swing.JLabel();
        jblNombreArtisticoBuscarporDisco = new javax.swing.JLabel();
        jblGeneroMusicalBuscarporDisco = new javax.swing.JLabel();
        jblNumeroSencillosBuscarporDisco = new javax.swing.JLabel();
        jblNumeroConciertosBuscarporDisco = new javax.swing.JLabel();
        jblNumeroGirasBuscarporDisco = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();
        txtNacionalidad = new javax.swing.JTextField();
        txtSalario = new javax.swing.JTextField();
        txtNombreArtistico = new javax.swing.JTextField();
        txtGeneroMusical = new javax.swing.JTextField();
        txtNumeroSencillos = new javax.swing.JTextField();
        txtNumeroConciertos = new javax.swing.JTextField();
        txtNumeroGiras = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Buscar Por Disco"));

        jLabel1.setText("Ingrese el nombre del disco para encontrar al cantante :");

        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jblIdBuscarporDisco.setText("ID:");

        jblNombreBuscarporDisco.setText("Nombre:");

        jblApellidoBuscarporDisco.setText("Apellido:");

        jblEdadBuscarporDisco.setText("Edad:");

        jblNacionalidadBuscarporDisco.setText("Nacionalidad:");

        jblSalarioBuscarporDisco.setText("Salario:");

        jblNombreArtisticoBuscarporDisco.setText("Nombre Artistico:");

        jblGeneroMusicalBuscarporDisco.setText("Genero Musical:");

        jblNumeroSencillosBuscarporDisco.setText("Numero de Sencillos:");

        jblNumeroConciertosBuscarporDisco.setText("Numero de Conciertos:");

        jblNumeroGirasBuscarporDisco.setText("Numero de Giras:");

        txtID.setEnabled(false);

        txtNombre.setEditable(false);
        txtNombre.setEnabled(false);

        txtApellido.setEditable(false);
        txtApellido.setEnabled(false);

        txtEdad.setEditable(false);
        txtEdad.setEnabled(false);
        txtEdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEdadActionPerformed(evt);
            }
        });

        txtNacionalidad.setEditable(false);
        txtNacionalidad.setEnabled(false);

        txtSalario.setEditable(false);
        txtSalario.setEnabled(false);

        txtNombreArtistico.setEditable(false);
        txtNombreArtistico.setEnabled(false);

        txtGeneroMusical.setEditable(false);
        txtGeneroMusical.setEnabled(false);

        txtNumeroSencillos.setEditable(false);
        txtNumeroSencillos.setEnabled(false);

        txtNumeroConciertos.setEditable(false);
        txtNumeroConciertos.setEnabled(false);

        txtNumeroGiras.setEditable(false);
        txtNumeroGiras.setEnabled(false);

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jLabel13.setText("Datos del cantante");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnCancelar)
                .addGap(123, 123, 123))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jblIdBuscarporDisco)
                        .addComponent(jblNombreBuscarporDisco, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jblApellidoBuscarporDisco, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jblEdadBuscarporDisco, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jblNacionalidadBuscarporDisco, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jblSalarioBuscarporDisco, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jblNombreArtisticoBuscarporDisco, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jblGeneroMusicalBuscarporDisco, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jblNumeroSencillosBuscarporDisco, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jblNumeroConciertosBuscarporDisco, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jblNumeroGirasBuscarporDisco, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(119, 119, 119)))
                .addGap(66, 66, 66)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNumeroGiras, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumeroConciertos, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumeroSencillos, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGeneroMusical, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombreArtistico, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(146, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jblIdBuscarporDisco)
                                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jblNombreBuscarporDisco)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jblApellidoBuscarporDisco)
                                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jblEdadBuscarporDisco)
                                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jblNacionalidadBuscarporDisco))
                            .addComponent(txtNacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jblSalarioBuscarporDisco)
                            .addComponent(txtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jblNombreArtisticoBuscarporDisco)
                            .addComponent(txtNombreArtistico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jblGeneroMusicalBuscarporDisco)
                            .addComponent(txtGeneroMusical, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jblNumeroSencillosBuscarporDisco)
                            .addComponent(txtNumeroSencillos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jblNumeroConciertosBuscarporDisco))
                    .addComponent(txtNumeroConciertos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNumeroGiras, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jblNumeroGirasBuscarporDisco))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(btnCancelar)
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(39, 39, 39)
                .addComponent(txtNombreDisco, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(22, 22, 22))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNombreDisco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(29, 29, 29)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(9, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEdadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEdadActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        txtID.setText("");
        this.limpiarCampos();
        this.setVisible(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if (txtNombreDisco.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "El campo esta vacion");
        }else{
            cantanteTempo = controladorCantante.buscarporDisco(txtNombreDisco.getText());
            if (cantanteTempo!=null) {
                
            }else{
                JOptionPane.showConfirmDialog(this, "El nombre de la cancion no existe en ningun cantante ");
                this.limpiarCampos();
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void limpiarCampos(){
        
        txtNombre.setText("");
        txtApellido.setText("");
        txtEdad.setText("");
        txtNacionalidad.setText("");
        txtSalario.setText("");
        txtNombreArtistico.setText("");
        txtNumeroConciertos.setText("");
        txtNumeroSencillos.setText("");
        txtNumeroGiras.setText("");
        txtGeneroMusical.setText(""); 
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel jblApellidoBuscarporDisco;
    private javax.swing.JLabel jblEdadBuscarporDisco;
    private javax.swing.JLabel jblGeneroMusicalBuscarporDisco;
    private javax.swing.JLabel jblIdBuscarporDisco;
    private javax.swing.JLabel jblNacionalidadBuscarporDisco;
    private javax.swing.JLabel jblNombreArtisticoBuscarporDisco;
    private javax.swing.JLabel jblNombreBuscarporDisco;
    private javax.swing.JLabel jblNumeroConciertosBuscarporDisco;
    private javax.swing.JLabel jblNumeroGirasBuscarporDisco;
    private javax.swing.JLabel jblNumeroSencillosBuscarporDisco;
    private javax.swing.JLabel jblSalarioBuscarporDisco;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtGeneroMusical;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNacionalidad;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombreArtistico;
    private javax.swing.JTextField txtNombreDisco;
    private javax.swing.JTextField txtNumeroConciertos;
    private javax.swing.JTextField txtNumeroGiras;
    private javax.swing.JTextField txtNumeroSencillos;
    private javax.swing.JTextField txtSalario;
    // End of variables declaration//GEN-END:variables
}
