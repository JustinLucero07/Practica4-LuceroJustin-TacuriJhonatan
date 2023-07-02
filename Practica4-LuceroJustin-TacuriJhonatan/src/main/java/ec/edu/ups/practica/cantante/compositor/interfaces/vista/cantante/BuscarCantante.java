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
public class BuscarCantante extends javax.swing.JInternalFrame {
    private ControladorCantante controladorCantante;
    private ResourceBundle mensajes;
    /**
     * Creates new form EliminarCantante
     */
    public BuscarCantante(ControladorCantante controladorCantante) {
        initComponents();
        this.controladorCantante=controladorCantante;
    }

    public void cambiarIdioma(Locale localizacion){
        mensajes = ResourceBundle.getBundle("mensajes.mensaje", localizacion);
        jblIdBuscarCantante.setText(mensajes.getString("ventana.id"));
        jblNombreBuscarCantante.setText(mensajes.getString("ventana.nombre"));
        jblApellidoBuscarCantante.setText(mensajes.getString("ventana.apellido"));
        jblEdadBuscarCantante.setText(mensajes.getString("ventana.edad"));
        jblSalarioBuscarCantante.setText(mensajes.getString("ventana.salario"));
        jblNacionalidadBuscarCantante.setText(mensajes.getString("ventana.nacionalidad"));
        jblGeneroMusical.setText(mensajes.getString("ventanaCantante.generomusical"));
        jblNumeroConciertosBuscarCantante.setText(mensajes.getString("ventanaCantante.numeroconciertos"));
        jblNumeroGirasBuscarCantante.setText(mensajes.getString("ventanaCantante.numerogiras"));
        jblNumeroSencillosBuscarCantante.setText(mensajes.getString("ventanaCantante.numerosencillos"));
        jblNombreArtisticoBuscarCantante.setText(mensajes.getString("ventanaCantante.nombreartistico"));
        btnCancelar.setText(mensajes.getString("boton.cancelar"));
        bntAceptar.setText(mensajes.getString("boton.aceptar"));
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
        jblIdBuscarCantante = new javax.swing.JLabel();
        jblNombreBuscarCantante = new javax.swing.JLabel();
        jblApellidoBuscarCantante = new javax.swing.JLabel();
        jblEdadBuscarCantante = new javax.swing.JLabel();
        jblNacionalidadBuscarCantante = new javax.swing.JLabel();
        jblSalarioBuscarCantante = new javax.swing.JLabel();
        jblNombreArtisticoBuscarCantante = new javax.swing.JLabel();
        jblGeneroMusical = new javax.swing.JLabel();
        jblNumeroSencillosBuscarCantante = new javax.swing.JLabel();
        jblNumeroConciertosBuscarCantante = new javax.swing.JLabel();
        jblNumeroGirasBuscarCantante = new javax.swing.JLabel();
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
        bntAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Buscar Cantante"));

        jblIdBuscarCantante.setText("ID:");

        jblNombreBuscarCantante.setText("Nombre:");

        jblApellidoBuscarCantante.setText("Apellido:");

        jblEdadBuscarCantante.setText("Edad:");

        jblNacionalidadBuscarCantante.setText("Nacionalidad:");

        jblSalarioBuscarCantante.setText("Salario:");

        jblNombreArtisticoBuscarCantante.setText("Nombre Artistico:");

        jblGeneroMusical.setText("Genero Musical:");

        jblNumeroSencillosBuscarCantante.setText("Numero de Sencillos:");

        jblNumeroConciertosBuscarCantante.setText("Numero de Conciertos:");

        jblNumeroGirasBuscarCantante.setText("Numero de Giras:");

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

        bntAceptar.setText("Aceptar");
        bntAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntAceptarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jblIdBuscarCantante)
                    .addComponent(jblNombreBuscarCantante, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jblApellidoBuscarCantante, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jblEdadBuscarCantante, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jblNacionalidadBuscarCantante, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jblSalarioBuscarCantante, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jblNombreArtisticoBuscarCantante, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jblGeneroMusical, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jblNumeroSencillosBuscarCantante, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jblNumeroConciertosBuscarCantante, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jblNumeroGirasBuscarCantante, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(bntAceptar)
                .addGap(18, 18, 18)
                .addComponent(btnCancelar)
                .addGap(123, 123, 123))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jblIdBuscarCantante)
                                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jblNombreBuscarCantante)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jblApellidoBuscarCantante)
                                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jblEdadBuscarCantante)
                                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jblNacionalidadBuscarCantante))
                            .addComponent(txtNacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jblSalarioBuscarCantante)
                            .addComponent(txtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jblNombreArtisticoBuscarCantante)
                            .addComponent(txtNombreArtistico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jblGeneroMusical)
                            .addComponent(txtGeneroMusical, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jblNumeroSencillosBuscarCantante)
                            .addComponent(txtNumeroSencillos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jblNumeroConciertosBuscarCantante))
                    .addComponent(txtNumeroConciertos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jblNumeroGirasBuscarCantante)
                    .addComponent(txtNumeroGiras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bntAceptar)
                    .addComponent(btnCancelar))
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bntAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntAceptarActionPerformed
        // TODO add your handling code here:
        if (txtID.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "No esta llenado el campo del ID ");
        }else{
            Cantante cantanteTempo = controladorCantante.buscarCantante(Integer.parseInt(txtID.getText()));
            if (cantanteTempo !=null) {
                txtNombre.setText(cantanteTempo.getNombre());
                txtApellido.setText(cantanteTempo.getApellido());
                txtEdad.setText( String.valueOf(cantanteTempo.getEdad()));
                txtNacionalidad.setText(cantanteTempo.getNacionalidad());
                txtNacionalidad.setText(cantanteTempo.getNacionalidad());
                txtSalario.setText(String.valueOf(cantanteTempo.calcularSalario()));
                txtNombreArtistico.setText(cantanteTempo.getNombreArtistico());
                txtGeneroMusical.setText(cantanteTempo.getGeneroMusical());
                txtNumeroSencillos.setText(String.valueOf(cantanteTempo.getNumeroDeSencillos()));
                txtNumeroConciertos.setText(String.valueOf(cantanteTempo.getNumeroDeConciertos()));
                txtNumeroGiras.setText(String.valueOf(cantanteTempo.getNumeroDeGiras()));
                
            }else{
                this.limpiarCampos();
                JOptionPane.showMessageDialog(this, "El ID no existe ");

            }
        }
    }//GEN-LAST:event_bntAceptarActionPerformed
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
     
    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        txtID.setText("");
        this.limpiarCampos();
        this.setVisible(false);

    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEdadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEdadActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jblApellidoBuscarCantante;
    private javax.swing.JLabel jblEdadBuscarCantante;
    private javax.swing.JLabel jblGeneroMusical;
    private javax.swing.JLabel jblIdBuscarCantante;
    private javax.swing.JLabel jblNacionalidadBuscarCantante;
    private javax.swing.JLabel jblNombreArtisticoBuscarCantante;
    private javax.swing.JLabel jblNombreBuscarCantante;
    private javax.swing.JLabel jblNumeroConciertosBuscarCantante;
    private javax.swing.JLabel jblNumeroGirasBuscarCantante;
    private javax.swing.JLabel jblNumeroSencillosBuscarCantante;
    private javax.swing.JLabel jblSalarioBuscarCantante;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtGeneroMusical;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNacionalidad;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombreArtistico;
    private javax.swing.JTextField txtNumeroConciertos;
    private javax.swing.JTextField txtNumeroGiras;
    private javax.swing.JTextField txtNumeroSencillos;
    private javax.swing.JTextField txtSalario;
    // End of variables declaration//GEN-END:variables
}
