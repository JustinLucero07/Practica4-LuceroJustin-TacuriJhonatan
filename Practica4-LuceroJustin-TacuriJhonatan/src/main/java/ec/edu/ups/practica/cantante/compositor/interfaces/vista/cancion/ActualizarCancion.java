/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package ec.edu.ups.practica.cantante.compositor.interfaces.vista.cancion;

import ec.edu.ups.practica.cantante.compositor.interfaces.controlador.ControladorCompositor;
import ec.edu.ups.practica.cantante.compositor.interfaces.modelo.Cancion;
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
public class ActualizarCancion extends javax.swing.JInternalFrame {
    private ControladorCompositor controladorCompositor;
    private ResourceBundle mensajes;
    
    /**
     * Creates new form ActualizarCancion
     */
    public ActualizarCancion(ControladorCompositor controladorCompositor) {
        initComponents();
        this.controladorCompositor = controladorCompositor;
    }

    public void cambiarIdioma(Locale localizacion){
        mensajes = ResourceBundle.getBundle("mensajes.mensaje", localizacion);
        jblCodigoActualizarCancion.setText(mensajes.getString("ventana.codigo"));
        jblTituloActualizarCancion.setText(mensajes.getString("ventanaCancion.titulo"));
        jblLetraActualizarCancion.setText(mensajes.getString("ventanaCancion.letra"));
        jblDuracionCancionActualizarCancion.setText(mensajes.getString("ventanaCancion.duracioncancion"));
        jblIdActualizarCancion.setText(mensajes.getString("ventana.id"));
        jblNombreActualizarCancion.setText(mensajes.getString("ventana.nombre"));
        jblApellidoActualizarCancion.setText(mensajes.getString("ventana.apellido"));
        jblEdadActualizarCancion.setText(mensajes.getString("ventana.edad"));
        jblNacionalidadActualizarCancion.setText(mensajes.getString("ventana.nacionalidad"));
        jblSalarioActualizarCancion.setText(mensajes.getString("ventana.salario"));
        jblNumeroComposicionesActualizarCancion.setText(mensajes.getString("ventanaCompositor.numerocomposiciones"));
        btnActualizar.setText(mensajes.getString("boton.actualizar"));
        btnBuscarCancion.setText(mensajes.getString("boton.buscar"));
        btnAceptar.setText(mensajes.getString("boton.aceptar"));
        btnCancelar.setText(mensajes.getString("boton.cancelar"));
        Border borde = BorderFactory.createTitledBorder(mensajes.getString("panel.actualizarcancion"));
        jpanelA.setBorder(borde);
        Border bordea = BorderFactory.createTitledBorder(mensajes.getString("panel.buscarcompositor"));
        jpanelB.setBorder(bordea);
        Border bordeb = BorderFactory.createTitledBorder(mensajes.getString("panel.buscarcancion"));
        jpanelC.setBorder(bordeb);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnActualizar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jpanelA = new javax.swing.JPanel();
        jpanelB = new javax.swing.JPanel();
        jblIdActualizarCancion = new javax.swing.JLabel();
        jblNombreActualizarCancion = new javax.swing.JLabel();
        jblApellidoActualizarCancion = new javax.swing.JLabel();
        jblEdadActualizarCancion = new javax.swing.JLabel();
        jblNacionalidadActualizarCancion = new javax.swing.JLabel();
        jblSalarioActualizarCancion = new javax.swing.JLabel();
        jblNumeroComposicionesActualizarCancion = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();
        txtNacionalidad = new javax.swing.JTextField();
        txtSalario = new javax.swing.JTextField();
        txtNumeroComposiciones = new javax.swing.JTextField();
        btnAceptar = new javax.swing.JButton();
        jpanelC = new javax.swing.JPanel();
        jblCodigoActualizarCancion = new javax.swing.JLabel();
        jblTituloActualizarCancion = new javax.swing.JLabel();
        jblLetraActualizarCancion = new javax.swing.JLabel();
        jblDuracionCancionActualizarCancion = new javax.swing.JLabel();
        txtCodigoCancion = new javax.swing.JTextField();
        txtTitulo = new javax.swing.JTextField();
        txtLetra = new javax.swing.JTextField();
        txtDuracionCancion = new javax.swing.JTextField();
        btnBuscarCancion = new javax.swing.JButton();

        setBorder(null);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jpanelA.setBorder(javax.swing.BorderFactory.createTitledBorder("ACTUALIZAR CANCION"));

        jpanelB.setBorder(javax.swing.BorderFactory.createTitledBorder("BUSCAR COMPOSITOR"));

        jblIdActualizarCancion.setText("ID:");

        jblNombreActualizarCancion.setText("Nombre:");

        jblApellidoActualizarCancion.setText("Apellido:");

        jblEdadActualizarCancion.setText("Edad:");

        jblNacionalidadActualizarCancion.setText("Nacionalidad:");

        jblSalarioActualizarCancion.setText("Salario:");

        jblNumeroComposicionesActualizarCancion.setText("Numero de Composiciones:");

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

        javax.swing.GroupLayout jpanelBLayout = new javax.swing.GroupLayout(jpanelB);
        jpanelB.setLayout(jpanelBLayout);
        jpanelBLayout.setHorizontalGroup(
            jpanelBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelBLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jpanelBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jblIdActualizarCancion)
                    .addComponent(jblNombreActualizarCancion)
                    .addComponent(jblEdadActualizarCancion)
                    .addComponent(jblSalarioActualizarCancion))
                .addGap(107, 107, 107)
                .addGroup(jpanelBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(jpanelBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAceptar)
                    .addGroup(jpanelBLayout.createSequentialGroup()
                        .addComponent(jblNumeroComposicionesActualizarCancion)
                        .addGap(18, 18, 18)
                        .addComponent(txtNumeroComposiciones, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpanelBLayout.createSequentialGroup()
                        .addGroup(jpanelBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jblApellidoActualizarCancion)
                            .addComponent(jblNacionalidadActualizarCancion))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jpanelBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtApellido, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNacionalidad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        jpanelBLayout.setVerticalGroup(
            jpanelBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelBLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jpanelBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jblIdActualizarCancion)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAceptar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpanelBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jblNombreActualizarCancion)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jblApellidoActualizarCancion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpanelBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jblEdadActualizarCancion)
                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jblNacionalidadActualizarCancion)
                    .addComponent(txtNacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpanelBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jblSalarioActualizarCancion)
                    .addGroup(jpanelBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jblNumeroComposicionesActualizarCancion)
                        .addComponent(txtNumeroComposiciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpanelC.setBorder(javax.swing.BorderFactory.createTitledBorder("BUSCAR CANCION"));

        jblCodigoActualizarCancion.setText("Codigo:");

        jblTituloActualizarCancion.setText("Titulo:");

        jblLetraActualizarCancion.setText("Letra:");

        jblDuracionCancionActualizarCancion.setText("Duración de la Canción: ");

        txtCodigoCancion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoCancionActionPerformed(evt);
            }
        });

        txtTitulo.setEnabled(false);
        txtTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTituloActionPerformed(evt);
            }
        });

        txtLetra.setEnabled(false);
        txtLetra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLetraActionPerformed(evt);
            }
        });

        txtDuracionCancion.setEnabled(false);
        txtDuracionCancion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDuracionCancionActionPerformed(evt);
            }
        });

        btnBuscarCancion.setText("Buscar");
        btnBuscarCancion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarCancionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpanelCLayout = new javax.swing.GroupLayout(jpanelC);
        jpanelC.setLayout(jpanelCLayout);
        jpanelCLayout.setHorizontalGroup(
            jpanelCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelCLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jpanelCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpanelCLayout.createSequentialGroup()
                        .addGroup(jpanelCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jblTituloActualizarCancion)
                            .addComponent(jblCodigoActualizarCancion))
                        .addGap(105, 105, 105)
                        .addGroup(jpanelCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpanelCLayout.createSequentialGroup()
                                .addComponent(txtCodigoCancion, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnBuscarCancion)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jpanelCLayout.createSequentialGroup()
                                .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jblLetraActualizarCancion)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtLetra, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jpanelCLayout.createSequentialGroup()
                        .addComponent(jblDuracionCancionActualizarCancion)
                        .addGap(18, 18, 18)
                        .addComponent(txtDuracionCancion, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(399, Short.MAX_VALUE))))
        );
        jpanelCLayout.setVerticalGroup(
            jpanelCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelCLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpanelCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jblCodigoActualizarCancion)
                    .addComponent(txtCodigoCancion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarCancion))
                .addGap(19, 19, 19)
                .addGroup(jpanelCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jblTituloActualizarCancion)
                    .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jblLetraActualizarCancion)
                    .addComponent(txtLetra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpanelCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jblDuracionCancionActualizarCancion)
                    .addComponent(txtDuracionCancion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jpanelALayout = new javax.swing.GroupLayout(jpanelA);
        jpanelA.setLayout(jpanelALayout);
        jpanelALayout.setHorizontalGroup(
            jpanelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelALayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpanelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpanelB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jpanelALayout.createSequentialGroup()
                        .addComponent(jpanelC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jpanelALayout.setVerticalGroup(
            jpanelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelALayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jpanelB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(jpanelC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jpanelA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(276, 276, 276)
                        .addComponent(btnActualizar)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpanelA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnActualizar)
                    .addComponent(btnCancelar))
                .addGap(14, 14, 14))
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
        if (txtId.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "No esta llenado el campo del ID ");
        }else{
            Compositor compositorTempo = controladorCompositor.buscarCompositor(Integer.parseInt(txtId.getText()));
            if (compositorTempo !=null) {
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

    private void txtCodigoCancionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoCancionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoCancionActionPerformed

    private void txtTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTituloActionPerformed

    private void txtLetraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLetraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLetraActionPerformed

    private void txtDuracionCancionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDuracionCancionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDuracionCancionActionPerformed

    private void btnBuscarCancionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarCancionActionPerformed
        if(txtCodigoCancion.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "El campo del codigo no esta lleno");
        }else{
            Cancion cancion = controladorCompositor.buscarCancion(controladorCompositor.buscarCompositor(Integer.parseInt(txtId.getText())), Integer.parseInt(txtCodigoCancion.getText())); 
            if(cancion!=null){
                txtDuracionCancion.setText(String.valueOf(cancion.getTiempoEnMinutos()));  
                txtLetra.setText(cancion.getLetra());
                txtTitulo.setText(cancion.getTitulo());
                txtCodigoCancion.setEnabled(false); 
                txtDuracionCancion.setEnabled(true);
                txtLetra.setEnabled(true);
                txtTitulo.setEnabled(true);
            }else{
                this.limpiarCamposCancion();
                JOptionPane.showMessageDialog(this, "La cancion no exite");
            }  
        }
    }//GEN-LAST:event_btnBuscarCancionActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        int codigo = Integer.parseInt(txtCodigoCancion.getText());
        double tiempo = Double.parseDouble(txtDuracionCancion.getText());
        String titulo = txtTitulo.getText();
        String letra = txtLetra.getText();
        Cancion cancion = new Cancion(codigo, titulo, letra, tiempo);
        controladorCompositor.actualizarCancion(controladorCompositor.buscarCompositor(Integer.parseInt(txtId.getText())), cancion); 
        txtCodigoCancion.setEnabled(true);
        txtDuracionCancion.setEnabled(false);
        txtLetra.setEnabled(false);
        txtTitulo.setEnabled(false);
        JOptionPane.showMessageDialog(this, "Se actualizo correctamente la cancion");
        System.out.println(controladorCompositor.verCompositores());
        
        this.limpiarCampos();
        this.limpiarCamposCancion();
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.limpiarCampos();
        this.limpiarCamposCancion();
        this.setVisible(false); 
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void limpiarCampos(){
        txtId.setText("");
        txtNombre.setText("");
        txtApellido.setText("");
        txtEdad.setText("");
        txtNacionalidad.setText("");
        txtSalario.setText("");
        txtNumeroComposiciones.setText("");
    }
    
   
    
    private void limpiarCamposCancion(){
        txtCodigoCancion.setText("");
        txtDuracionCancion.setText("");
        txtLetra.setText("");
        txtTitulo.setText("");
    }
    
    private boolean validacionDeCampos(){
        if (txtCodigoCancion.getText().isEmpty()||txtDuracionCancion.getText().isEmpty()||txtLetra.getText().isEmpty()||txtTitulo.getText().isEmpty()||txtNacionalidad.getText().isEmpty()) {
            return false;
        }
        return true;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBuscarCancion;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JLabel jblApellidoActualizarCancion;
    private javax.swing.JLabel jblCodigoActualizarCancion;
    private javax.swing.JLabel jblDuracionCancionActualizarCancion;
    private javax.swing.JLabel jblEdadActualizarCancion;
    private javax.swing.JLabel jblIdActualizarCancion;
    private javax.swing.JLabel jblLetraActualizarCancion;
    private javax.swing.JLabel jblNacionalidadActualizarCancion;
    private javax.swing.JLabel jblNombreActualizarCancion;
    private javax.swing.JLabel jblNumeroComposicionesActualizarCancion;
    private javax.swing.JLabel jblSalarioActualizarCancion;
    private javax.swing.JLabel jblTituloActualizarCancion;
    private javax.swing.JPanel jpanelA;
    private javax.swing.JPanel jpanelB;
    private javax.swing.JPanel jpanelC;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCodigoCancion;
    private javax.swing.JTextField txtDuracionCancion;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtLetra;
    private javax.swing.JTextField txtNacionalidad;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNumeroComposiciones;
    private javax.swing.JTextField txtSalario;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables
}
