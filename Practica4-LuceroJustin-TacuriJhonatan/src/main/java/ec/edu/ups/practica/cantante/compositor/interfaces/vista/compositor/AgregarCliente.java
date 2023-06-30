/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package ec.edu.ups.practica.cantante.compositor.interfaces.vista.compositor;

import ec.edu.ups.practica.cantante.compositor.interfaces.controlador.ControladorCantante;
import ec.edu.ups.practica.cantante.compositor.interfaces.controlador.ControladorCompositor;
import ec.edu.ups.practica.cantante.compositor.interfaces.modelo.Cantante;
import ec.edu.ups.practica.cantante.compositor.interfaces.modelo.Compositor;
import java.util.Locale;
import java.util.ResourceBundle;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class AgregarCliente extends javax.swing.JInternalFrame {
    private ControladorCompositor controladorCompositor;
    private ControladorCantante controladorCantante;
    private ResourceBundle mensajes;
    
    /**
     * Creates new form AgregarCliente
     */
    public AgregarCliente(ControladorCompositor controladorCompositor, ControladorCantante controladorCantante) {
        initComponents();
        this.controladorCompositor = controladorCompositor;
        this.controladorCantante = controladorCantante;
    }

    
     public void cambiarIdioma(Locale localizacion){
        mensajes = ResourceBundle.getBundle("mensajes.mensaje", localizacion);
        jblIdCoAgregarCliente.setText(mensajes.getString("ventana.id"));
        jblNombreCoAgregarCliente.setText(mensajes.getString("ventana.nombre"));
        jblApellidoCoAgregarCliente.setText(mensajes.getString("ventana.apellido"));
        jblEdadCoAgregarCliente.setText(mensajes.getString("ventana.edad"));
        jblSalarioCoAgregarCliente.setText(mensajes.getString("ventana.salario"));
        jblNacionalidadCoAgregarCliente.setText(mensajes.getString("ventana.nacionalidad"));
        jblNumeroComposicionesAgregarCliente.setText(mensajes.getString("ventanaCompositor.numerocomposiciones"));
        jblIdCaAgregarCliente.setText(mensajes.getString("ventana.id"));
        jblNombreCaAgregarCliente.setText(mensajes.getString("ventana.nombre"));
        jblApellidoCaAgregarCliente.setText(mensajes.getString("ventana.apellido"));
        jblEdadCaAgregarCliente.setText(mensajes.getString("ventana.edad"));
        jblSalarioCaAgregarCliente.setText(mensajes.getString("ventana.salario"));
        jblNacionalidadCaAgregarCliente.setText(mensajes.getString("ventana.nacionalidad"));
        jblGeneroMusicalAgregarCliente.setText(mensajes.getString("ventanaCantante.generomusical"));
        jblNumeroConciertosAgregarCliente.setText(mensajes.getString("ventanaCantante.numeroconciertos"));
        jblNumeroGirasAgregarCliente.setText(mensajes.getString("ventanaCantante.numerogiras"));
        jblNumeroSencillosAgregarCliente.setText(mensajes.getString("ventanaCantante.numerosencillos"));
        jblNombreArtisticoAgregarCliente.setText(mensajes.getString("ventanaCantante.nombreartistico"));
        
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
        jblIdCoAgregarCliente = new javax.swing.JLabel();
        jblNombreCoAgregarCliente = new javax.swing.JLabel();
        jblApellidoCoAgregarCliente = new javax.swing.JLabel();
        jblEdadCoAgregarCliente = new javax.swing.JLabel();
        jblNacionalidadCoAgregarCliente = new javax.swing.JLabel();
        jblSalarioCoAgregarCliente = new javax.swing.JLabel();
        jblNumeroComposicionesAgregarCliente = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();
        txtNacionalidad = new javax.swing.JTextField();
        txtSalario = new javax.swing.JTextField();
        txtNumeroComposiciones = new javax.swing.JTextField();
        btnAceptar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jblIdCaAgregarCliente = new javax.swing.JLabel();
        jblNombreCaAgregarCliente = new javax.swing.JLabel();
        jblApellidoCaAgregarCliente = new javax.swing.JLabel();
        jblEdadCaAgregarCliente = new javax.swing.JLabel();
        jblNacionalidadCaAgregarCliente = new javax.swing.JLabel();
        jblSalarioCaAgregarCliente = new javax.swing.JLabel();
        jblNombreArtisticoAgregarCliente = new javax.swing.JLabel();
        jblGeneroMusicalAgregarCliente = new javax.swing.JLabel();
        jblNumeroSencillosAgregarCliente = new javax.swing.JLabel();
        jblNumeroConciertosAgregarCliente = new javax.swing.JLabel();
        jblNumeroGirasAgregarCliente = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtNombre1 = new javax.swing.JTextField();
        txtApellido1 = new javax.swing.JTextField();
        txtEdad1 = new javax.swing.JTextField();
        txtNacionalidad1 = new javax.swing.JTextField();
        txtSalario1 = new javax.swing.JTextField();
        txtNombreArtistico = new javax.swing.JTextField();
        txtGeneroMusical = new javax.swing.JTextField();
        txtNumeroSencillos = new javax.swing.JTextField();
        txtNumeroConciertos = new javax.swing.JTextField();
        txtNumeroGiras = new javax.swing.JTextField();
        bntAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnAgregarCliente = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createTitledBorder("AGREGAR CLIENTE"));
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("BUSCAR COMPOSITOR"));

        jblIdCoAgregarCliente.setText("ID:");

        jblNombreCoAgregarCliente.setText("Nombre:");

        jblApellidoCoAgregarCliente.setText("Apellido:");

        jblEdadCoAgregarCliente.setText("Edad:");

        jblNacionalidadCoAgregarCliente.setText("Nacionalidad:");

        jblSalarioCoAgregarCliente.setText("Salario:");

        jblNumeroComposicionesAgregarCliente.setText("Numero de Composiciones:");

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jblIdCoAgregarCliente)
                            .addComponent(jblApellidoCoAgregarCliente)
                            .addComponent(jblNacionalidadCoAgregarCliente))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNacionalidad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtApellido, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtId, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jblNumeroComposicionesAgregarCliente)
                        .addGap(18, 18, 18)
                        .addComponent(txtNumeroComposiciones, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAceptar)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jblNombreCoAgregarCliente)
                            .addComponent(jblEdadCoAgregarCliente)
                            .addComponent(jblSalarioCoAgregarCliente))
                        .addGap(56, 56, 56)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jblIdCoAgregarCliente)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jblNombreCoAgregarCliente)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jblApellidoCoAgregarCliente)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jblEdadCoAgregarCliente)
                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jblNacionalidadCoAgregarCliente)
                    .addComponent(txtNacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jblSalarioCoAgregarCliente)
                    .addComponent(txtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jblNumeroComposicionesAgregarCliente)
                    .addComponent(txtNumeroComposiciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAceptar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Buscar Cantante"));

        jblIdCaAgregarCliente.setText("ID:");

        jblNombreCaAgregarCliente.setText("Nombre:");

        jblApellidoCaAgregarCliente.setText("Apellido:");

        jblEdadCaAgregarCliente.setText("Edad:");

        jblNacionalidadCaAgregarCliente.setText("Nacionalidad:");

        jblSalarioCaAgregarCliente.setText("Salario:");

        jblNombreArtisticoAgregarCliente.setText("Nombre Artistico:");

        jblGeneroMusicalAgregarCliente.setText("Genero Musical:");

        jblNumeroSencillosAgregarCliente.setText("Numero de Sencillos:");

        jblNumeroConciertosAgregarCliente.setText("Numero de Conciertos:");

        jblNumeroGirasAgregarCliente.setText("Numero de Giras:");

        txtNombre1.setEditable(false);
        txtNombre1.setEnabled(false);

        txtApellido1.setEditable(false);
        txtApellido1.setEnabled(false);

        txtEdad1.setEditable(false);
        txtEdad1.setEnabled(false);
        txtEdad1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEdad1ActionPerformed(evt);
            }
        });

        txtNacionalidad1.setEditable(false);
        txtNacionalidad1.setEnabled(false);

        txtSalario1.setEditable(false);
        txtSalario1.setEnabled(false);

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

        bntAceptar.setText("Buscar");
        bntAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntAceptarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jblIdCaAgregarCliente)
                            .addComponent(jblApellidoCaAgregarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jblNacionalidadCaAgregarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jblNombreArtisticoAgregarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jblNumeroSencillosAgregarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtApellido1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNacionalidad1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombreArtistico, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNumeroSencillos, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jblNumeroGirasAgregarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtNumeroGiras, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bntAceptar)
                    .addComponent(jblNumeroConciertosAgregarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jblGeneroMusicalAgregarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jblNombreCaAgregarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jblSalarioCaAgregarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jblEdadCaAgregarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEdad1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSalario1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGeneroMusical, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumeroConciertos, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(154, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jblIdCaAgregarCliente)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jblNombreCaAgregarCliente)
                    .addComponent(txtNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jblApellidoCaAgregarCliente)
                    .addComponent(txtApellido1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jblEdadCaAgregarCliente)
                    .addComponent(txtEdad1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jblNacionalidadCaAgregarCliente)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtNacionalidad1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jblSalarioCaAgregarCliente)
                        .addComponent(txtSalario1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jblNombreArtisticoAgregarCliente)
                        .addComponent(txtNombreArtistico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jblGeneroMusicalAgregarCliente)
                    .addComponent(txtGeneroMusical, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jblNumeroSencillosAgregarCliente)
                    .addComponent(txtNumeroSencillos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jblNumeroConciertosAgregarCliente)
                        .addComponent(txtNumeroConciertos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jblNumeroGirasAgregarCliente)
                            .addComponent(txtNumeroGiras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(bntAceptar)))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnAgregarCliente.setText("Aceptar");
        btnAgregarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAgregarCliente)
                .addGap(37, 37, 37)
                .addComponent(btnCancelar)
                .addGap(340, 340, 340))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnAgregarCliente))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                txtSalario.setText(String.valueOf(compositorTempo.calcularSalario()));
                txtNumeroComposiciones.setText(String.valueOf(compositorTempo.getNumeroDeComposiciones()));

            }else{
                this.limpiarCampos();
                JOptionPane.showMessageDialog(this, "El ID no existe ");

            }
        }
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void txtEdad1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEdad1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEdad1ActionPerformed

    private void bntAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntAceptarActionPerformed
        // TODO add your handling code here:
        if (txtID.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "No esta llenado el campo del ID ");
        }else{
            Cantante cantanteTempo = controladorCantante.buscarCantante(Integer.parseInt(txtID.getText()));
            if (cantanteTempo !=null) {
                txtNombre1.setText(cantanteTempo.getNombre());
                txtApellido1.setText(cantanteTempo.getApellido());
                txtEdad1.setText( String.valueOf(cantanteTempo.getEdad()));
                txtNacionalidad1.setText(cantanteTempo.getNacionalidad());
                txtSalario1.setText(String.valueOf(cantanteTempo.calcularSalario()));
                txtNombreArtistico.setText(cantanteTempo.getNombreArtistico());
                txtGeneroMusical.setText(cantanteTempo.getGeneroMusical());
                txtNumeroSencillos.setText(String.valueOf(cantanteTempo.getNumeroDeSencillos()));
                txtNumeroConciertos.setText(String.valueOf(cantanteTempo.getNumeroDeConciertos()));
                txtNumeroGiras.setText(String.valueOf(cantanteTempo.getNumeroDeGiras()));

            }else{
                this.limpiarCamposCantante();
                JOptionPane.showMessageDialog(this, "El ID no existe ");

            }
        }
    }//GEN-LAST:event_bntAceptarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        txtID.setText("");
        this.limpiarCampos();
        this.setVisible(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnAgregarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarClienteActionPerformed
        if(txtID.getText().isEmpty() || txtId.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Los campos de los ID no estan llenos");
        }else{
            controladorCompositor.agregarClienteCan(controladorCompositor.buscarCompositor(Integer.parseInt(txtId.getText())), controladorCantante.buscarCantante(Integer.parseInt(txtID.getText()))); 
            JOptionPane.showMessageDialog(this, "Se agrego exitosamente el cantante como cliente de compositor");
            System.out.println(controladorCompositor.verCompositores());
            this.limpiarCampos();
            this.limpiarCamposCantante();
        }
    }//GEN-LAST:event_btnAgregarClienteActionPerformed

    
    private void limpiarCampos(){
        txtId.setText("");
        txtNombre.setText("");
        txtApellido.setText("");
        txtEdad.setText("");
        txtNacionalidad.setText("");
        txtSalario.setText("");
        txtNumeroComposiciones.setText("");
    }
    
    private void limpiarCamposCantante(){
        
        txtNombre1.setText("");
        txtApellido1.setText("");
        txtEdad1.setText("");
        txtNacionalidad1.setText("");
        txtSalario1.setText("");
        txtNombreArtistico.setText("");
        txtNumeroConciertos.setText("");
        txtNumeroSencillos.setText("");
        txtNumeroGiras.setText("");
        txtGeneroMusical.setText(""); 
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntAceptar;
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnAgregarCliente;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel jblApellidoCaAgregarCliente;
    private javax.swing.JLabel jblApellidoCoAgregarCliente;
    private javax.swing.JLabel jblEdadCaAgregarCliente;
    private javax.swing.JLabel jblEdadCoAgregarCliente;
    private javax.swing.JLabel jblGeneroMusicalAgregarCliente;
    private javax.swing.JLabel jblIdCaAgregarCliente;
    private javax.swing.JLabel jblIdCoAgregarCliente;
    private javax.swing.JLabel jblNacionalidadCaAgregarCliente;
    private javax.swing.JLabel jblNacionalidadCoAgregarCliente;
    private javax.swing.JLabel jblNombreArtisticoAgregarCliente;
    private javax.swing.JLabel jblNombreCaAgregarCliente;
    private javax.swing.JLabel jblNombreCoAgregarCliente;
    private javax.swing.JLabel jblNumeroComposicionesAgregarCliente;
    private javax.swing.JLabel jblNumeroConciertosAgregarCliente;
    private javax.swing.JLabel jblNumeroGirasAgregarCliente;
    private javax.swing.JLabel jblNumeroSencillosAgregarCliente;
    private javax.swing.JLabel jblSalarioCaAgregarCliente;
    private javax.swing.JLabel jblSalarioCoAgregarCliente;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtApellido1;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtEdad1;
    private javax.swing.JTextField txtGeneroMusical;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNacionalidad;
    private javax.swing.JTextField txtNacionalidad1;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombre1;
    private javax.swing.JTextField txtNombreArtistico;
    private javax.swing.JTextField txtNumeroComposiciones;
    private javax.swing.JTextField txtNumeroConciertos;
    private javax.swing.JTextField txtNumeroGiras;
    private javax.swing.JTextField txtNumeroSencillos;
    private javax.swing.JTextField txtSalario;
    private javax.swing.JTextField txtSalario1;
    // End of variables declaration//GEN-END:variables
}
