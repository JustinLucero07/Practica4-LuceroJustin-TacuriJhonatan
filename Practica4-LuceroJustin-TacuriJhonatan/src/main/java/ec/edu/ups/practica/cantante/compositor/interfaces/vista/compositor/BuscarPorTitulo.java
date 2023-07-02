/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package ec.edu.ups.practica.cantante.compositor.interfaces.vista.compositor;

import ec.edu.ups.practica.cantante.compositor.interfaces.controlador.ControladorCompositor;
import ec.edu.ups.practica.cantante.compositor.interfaces.modelo.Compositor;
import java.util.Locale;
import java.util.ResourceBundle;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.border.Border;

/**
 *
 * @author Usuario
 */
public class BuscarPorTitulo extends javax.swing.JInternalFrame {
    private ControladorCompositor controladorCompositor;
    private ResourceBundle mensajes;
    /**
     * Creates new form BuscarPorTitulo
     */
    public BuscarPorTitulo(ControladorCompositor controladorCompositor) {
        initComponents();
        this.controladorCompositor = controladorCompositor;
    }

    public void cambiarIdioma(Locale localizacion){
        mensajes = ResourceBundle.getBundle("mensajes.mensaje", localizacion);
        jblIdBuscarPorTitulo.setText(mensajes.getString("ventana.id"));
        jblNombreBuscarPorTitulo.setText(mensajes.getString("ventana.nombre"));
        jblApellidoBuscarPorTitulo.setText(mensajes.getString("ventana.apellido"));
        jblEdadBuscarPorTitulo.setText(mensajes.getString("ventana.edad"));
        jblSalarioBuscarPorTitulo.setText(mensajes.getString("ventana.salario"));
        jblNacionalidadBuscarPorTitulo.setText(mensajes.getString("ventana.nacionalidad"));
        jblNumeroComposicionesBuscarPorTitulo.setText(mensajes.getString("ventanaCompositor.numerocomposiciones"));
        btnAceptar.setText(mensajes.getString("boton.buscar"));
        btnCancelar.setText(mensajes.getString("boton.cancelar"));
        Border borde = BorderFactory.createTitledBorder(mensajes.getString("panel.buscarportitulo"));
        jpanelA.setBorder(borde);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpanelA = new javax.swing.JPanel();
        jblIdBuscarPorTitulo = new javax.swing.JLabel();
        jblNombreBuscarPorTitulo = new javax.swing.JLabel();
        jblApellidoBuscarPorTitulo = new javax.swing.JLabel();
        jblEdadBuscarPorTitulo = new javax.swing.JLabel();
        jblNacionalidadBuscarPorTitulo = new javax.swing.JLabel();
        jblSalarioBuscarPorTitulo = new javax.swing.JLabel();
        jblNumeroComposicionesBuscarPorTitulo = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();
        txtNacionalidad = new javax.swing.JTextField();
        txtSalario = new javax.swing.JTextField();
        txtNumeroComposiciones = new javax.swing.JTextField();
        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jblTItuloCancionBuscarPorTitulo = new javax.swing.JLabel();
        txtTituloCancion = new javax.swing.JTextField();

        jpanelA.setBorder(javax.swing.BorderFactory.createTitledBorder("BUSCAR POR TÍTULO DE CANCIÓN"));

        jblIdBuscarPorTitulo.setText("ID:");

        jblNombreBuscarPorTitulo.setText("Nombre:");

        jblApellidoBuscarPorTitulo.setText("Apellido:");

        jblEdadBuscarPorTitulo.setText("Edad:");

        jblNacionalidadBuscarPorTitulo.setText("Nacionalidad:");

        jblSalarioBuscarPorTitulo.setText("Salario:");

        jblNumeroComposicionesBuscarPorTitulo.setText("Numero de Composiciones:");

        txtId.setEnabled(false);
        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });

        txtNombre.setEditable(false);
        txtNombre.setEnabled(false);
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        txtApellido.setEditable(false);
        txtApellido.setEnabled(false);
        txtApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoActionPerformed(evt);
            }
        });

        txtEdad.setEditable(false);
        txtEdad.setEnabled(false);
        txtEdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEdadActionPerformed(evt);
            }
        });

        txtNacionalidad.setEditable(false);
        txtNacionalidad.setEnabled(false);
        txtNacionalidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNacionalidadActionPerformed(evt);
            }
        });

        txtSalario.setEditable(false);
        txtSalario.setEnabled(false);
        txtSalario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSalarioActionPerformed(evt);
            }
        });

        txtNumeroComposiciones.setEditable(false);
        txtNumeroComposiciones.setEnabled(false);
        txtNumeroComposiciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroComposicionesActionPerformed(evt);
            }
        });

        btnAceptar.setText("Buscar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jblTItuloCancionBuscarPorTitulo.setText("Ingrese el nombre de la cancion para encontrar a su comporsitor:");

        javax.swing.GroupLayout jpanelALayout = new javax.swing.GroupLayout(jpanelA);
        jpanelA.setLayout(jpanelALayout);
        jpanelALayout.setHorizontalGroup(
            jpanelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelALayout.createSequentialGroup()
                .addGroup(jpanelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpanelALayout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(jpanelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jblNombreBuscarPorTitulo)
                            .addComponent(jblEdadBuscarPorTitulo)
                            .addComponent(jblIdBuscarPorTitulo)
                            .addGroup(jpanelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpanelALayout.createSequentialGroup()
                                    .addGap(102, 102, 102)
                                    .addComponent(btnAceptar)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnCancelar))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpanelALayout.createSequentialGroup()
                                    .addGroup(jpanelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jblNumeroComposicionesBuscarPorTitulo)
                                        .addComponent(jblSalarioBuscarPorTitulo)
                                        .addComponent(jblNacionalidadBuscarPorTitulo)
                                        .addComponent(jblApellidoBuscarPorTitulo))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jpanelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtNumeroComposiciones, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtNacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jpanelALayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jblTItuloCancionBuscarPorTitulo)
                        .addGap(18, 18, 18)
                        .addComponent(txtTituloCancion, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jpanelALayout.setVerticalGroup(
            jpanelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelALayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jpanelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jblTItuloCancionBuscarPorTitulo)
                    .addComponent(txtTituloCancion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpanelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jblIdBuscarPorTitulo)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpanelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jblNombreBuscarPorTitulo)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpanelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jblApellidoBuscarPorTitulo)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpanelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jblEdadBuscarPorTitulo)
                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpanelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jblNacionalidadBuscarPorTitulo)
                    .addComponent(txtNacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpanelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jblSalarioBuscarPorTitulo)
                    .addComponent(txtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpanelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jblNumeroComposicionesBuscarPorTitulo)
                    .addComponent(txtNumeroComposiciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jpanelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptar)
                    .addComponent(btnCancelar))
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpanelA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpanelA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoActionPerformed

    private void txtEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEdadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEdadActionPerformed

    private void txtNacionalidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNacionalidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNacionalidadActionPerformed

    private void txtSalarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSalarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSalarioActionPerformed

    private void txtNumeroComposicionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroComposicionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroComposicionesActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        if (txtTituloCancion.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "No esta llenado el campo del ID ");
        }else{
            Compositor compositorTempo = controladorCompositor.buscarPorTituloCancion(txtTituloCancion.getText()); 
            if (compositorTempo !=null) {
                txtId.setText(String.valueOf(compositorTempo.getCodigo())); 
                txtNombre.setText(compositorTempo.getNombre());
                txtApellido.setText(compositorTempo.getApellido());
                txtEdad.setText( String.valueOf(compositorTempo.getEdad()));
                txtNacionalidad.setText(compositorTempo.getNacionalidad());
                txtNacionalidad.setText(compositorTempo.getNacionalidad());
                txtSalario.setText(String.valueOf(compositorTempo.calcularSalario()));
                txtNumeroComposiciones.setText(String.valueOf(compositorTempo.getNumeroDeComposiciones()));

            }else{
                this.limpiarCampos();
                JOptionPane.showMessageDialog(this, "El ID no existe ");

            }
        }
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        txtId.setText("");
        this.limpiarCampos();
        this.setVisible(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void limpiarCampos(){
        txtTituloCancion.setText(""); 
        txtId.setText("");
        txtNombre.setText("");
        txtApellido.setText("");
        txtEdad.setText("");
        txtNacionalidad.setText("");
        txtSalario.setText("");
        txtNumeroComposiciones.setText("");
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JLabel jblApellidoBuscarPorTitulo;
    private javax.swing.JLabel jblEdadBuscarPorTitulo;
    private javax.swing.JLabel jblIdBuscarPorTitulo;
    private javax.swing.JLabel jblNacionalidadBuscarPorTitulo;
    private javax.swing.JLabel jblNombreBuscarPorTitulo;
    private javax.swing.JLabel jblNumeroComposicionesBuscarPorTitulo;
    private javax.swing.JLabel jblSalarioBuscarPorTitulo;
    private javax.swing.JLabel jblTItuloCancionBuscarPorTitulo;
    private javax.swing.JPanel jpanelA;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNacionalidad;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNumeroComposiciones;
    private javax.swing.JTextField txtSalario;
    private javax.swing.JTextField txtTituloCancion;
    // End of variables declaration//GEN-END:variables
}
