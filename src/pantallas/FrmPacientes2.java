/*
 * Titulo: Panatalla 2 Módulo paciente.
 * Este programa se realizó para la organización "La sagrada familia A.C".
 * Esta panatalla consiste en el registro,modificacion , busqueda y eliminacion de pacientes en especifico de los responsables.
 * Fecha: 28/01/2017
 */
package pantallas;

import clases.ComboItem;
import clases.DAOPacientes;
import clases.DAOResponsables;
import clases.Estado;
import clases.Municipio;
import clases.Pacientes;
import clases.Responsables;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * @author Pablo Alberto Rodirguez Lopez.
 * @author Jose Luis Tinajero Carvajal.
 */
public class FrmPacientes2 extends javax.swing.JFrame {

    Estado es = new Estado();
    Municipio mun = new Municipio();
    Font fntTitulo = new Font("Tahoma", Font.BOLD, 24);
    Font fntComponente = new Font("Tahoma", Font.BOLD, 14);
    Dimension dmsBoton = new Dimension(250, 40);

    /**
     * Creates new form Pacientes2
     *
     */
    public FrmPacientes2() {
        initComponents();
        cargarEstado();
//        cargarRelacion();
        cargaCmbFiltradoPacientes();
        cargaCmbFiltradoResponsables();
        cargaCmbFiltradoResponsablesEliminados();
        skin();
    }

    private void skin() {
        lblResponsable.setText(lblResponsable.getText().toUpperCase());
        lblApMat.setText(lblApMat.getText().toUpperCase());
        lblApPat.setText(lblApPat.getText().toUpperCase());
        lblFiltroPacientes.setText(lblFiltroPacientes.getText().toUpperCase());
        lblFiltroResponsables.setText(lblFiltroResponsables.getText().toUpperCase());
        lblCalle.setText(lblCalle.getText().toUpperCase());
        lblColonia.setText(lblColonia.getText().toUpperCase());
        lblDireccion.setText(lblDireccion.getText().toUpperCase());
        lblNoExt.setText(lblNoExt.getText().toUpperCase());
        lblNoInt.setText(lblNoInt.getText().toUpperCase());
        lblCP.setText(lblCP.getText().toUpperCase());
        lblEstadoResponsable.setText(lblEstadoResponsable.getText().toUpperCase());
        lblRelacion.setText(lblRelacion.getText().toUpperCase());
        lblDatos.setText(lblDatos.getText().toUpperCase());
        lblRe.setText(lblRe.getText().toUpperCase());
        lblPa.setText(lblPa.getText().toUpperCase());
        lblMunicipioResponsable.setText(lblMunicipioResponsable.getText().toUpperCase());
        chkCasaSagradoCorazon.setText(chkCasaSagradoCorazon.getText().toUpperCase());
        lblTel.setText(lblTel.getText().toUpperCase());
        lblTel2.setText(lblTel2.getText().toUpperCase());
        lblTel3.setText(lblTel3.getText().toUpperCase());
        lblTitulo.setText(lblTitulo.getText().toUpperCase());
        btnBuscar.setText(btnBuscar.getText().toUpperCase());
        btnEliminar.setText(btnEliminar.getText().toUpperCase());
        btnModificar.setText(btnModificar.getText().toUpperCase());
        btnListar.setText(btnListar.getText().toUpperCase());
        btnListarPacientesDelResponsable.setText(btnListarPacientesDelResponsable.getText().toUpperCase());
        btnListarResponsablesDelPaciente.setText(btnListarResponsablesDelPaciente.getText().toUpperCase());
        btnVincular.setText(btnVincular.getText().toUpperCase());
        btnActivarResponsable.setText(btnActivarResponsable.getText().toUpperCase());
    }

    private void LimpiarCampos() {
        txtResponsable.setText("");
        txtApPatResponsable.setText("");
        txtApMatResponsable.setText("");
        txtCP.setText("");
        txtCalle.setText("");
        txtColonia.setText("");
        txtNoExt.setText("");
        txtNoInt.setText("");
        txtTel.setText("");
        txtTel2.setText("");
        txtTel3.setText("");
        txtRelacion.setText("");
        txtMunicipioResponsable.setText("");
    }

    private void cargarEstado() {
        cmbEstadoResponsable.removeAllItems();
        for (String[] Listar : es.Listar()) {
            cmbEstadoResponsable.addItem(Listar[2]);
        }
        cmbEstadoResponsable.setSelectedIndex(1);
    }
//
//    private void cargarRelacion() {
//        cmbRelacion.removeAllItems();
//        cmbRelacion.addItem("ESPOSO");
//        cmbRelacion.addItem("FAMILIAR");
//        cmbRelacion.addItem("AMISTAD");
//        cmbRelacion.addItem("CONOCIDO");
//        cmbRelacion.addItem("CASA DE DESCANSO");
//    }
//
//    private void cargarMunicipio() {
//        try {
//            String estado = cmbEstadoResponsable.getSelectedItem().toString();
//            cmbMunicipioResponsable.removeAllItems();
//            for (int i = 0; i < mun.Listar(estado).length; i++) {
//                cmbMunicipioResponsable.addItem(mun.Listar(estado)[i][3]);
//            }
//        } catch (Exception ex) {
//            System.out.println(ex.getMessage());
//        }
//    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        pnlResponsable1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblResponsables = new javax.swing.JTable();
        pnlResponsable2 = new javax.swing.JPanel();
        txtTel = new javax.swing.JTextField();
        txtApPatResponsable = new javax.swing.JTextField();
        txtApMatResponsable = new javax.swing.JTextField();
        txtResponsable = new javax.swing.JTextField();
        lblResponsable = new javax.swing.JLabel();
        lblApPat = new javax.swing.JLabel();
        lblApMat = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        lblTitulo = new javax.swing.JLabel();
        lblTel = new javax.swing.JLabel();
        sep4 = new javax.swing.JSeparator();
        lblDireccion = new javax.swing.JLabel();
        lblNoExt = new javax.swing.JLabel();
        lblRelacion = new javax.swing.JLabel();
        chkCasaSagradoCorazon = new javax.swing.JCheckBox();
        lblCalle = new javax.swing.JLabel();
        lblNoInt = new javax.swing.JLabel();
        lblColonia = new javax.swing.JLabel();
        lblCP = new javax.swing.JLabel();
        txtCalle = new javax.swing.JTextField();
        txtNoExt = new javax.swing.JTextField();
        txtNoInt = new javax.swing.JTextField();
        txtColonia = new javax.swing.JTextField();
        txtCP = new javax.swing.JTextField();
        lblDatos = new javax.swing.JLabel();
        lblMunicipioResponsable = new javax.swing.JLabel();
        lblEstadoResponsable = new javax.swing.JLabel();
        cmbEstadoResponsable = new javax.swing.JComboBox();
        btnAgregar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        lblFiltroPacientes = new javax.swing.JLabel();
        txtFiltroPacientes = new javax.swing.JTextField();
        cmbFiltradoPacientes = new javax.swing.JComboBox();
        lblFiltroResponsables = new javax.swing.JLabel();
        cmbFiltradoResponsables = new javax.swing.JComboBox();
        txtFiltroResponsables = new javax.swing.JTextField();
        btnModificar = new javax.swing.JButton();
        btnListar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        lblTel2 = new javax.swing.JLabel();
        lblTel3 = new javax.swing.JLabel();
        txtTel2 = new javax.swing.JTextField();
        txtTel3 = new javax.swing.JTextField();
        btnListarPacientesDelResponsable = new javax.swing.JButton();
        btnListarResponsablesDelPaciente = new javax.swing.JButton();
        btnVincular = new javax.swing.JButton();
        txtRelacion = new javax.swing.JTextField();
        txtMunicipioResponsable = new javax.swing.JTextField();
        cmbResponsablesEliminados = new javax.swing.JComboBox();
        btnActivarResponsable = new javax.swing.JButton();
        lblRe = new javax.swing.JLabel();
        lblPa = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblPacientes = new javax.swing.JTable();
        mbrPrincipal = new javax.swing.JMenuBar();
        mn1 = new javax.swing.JMenu();
        mitHistorial1 = new javax.swing.JMenuItem();
        mitResponsables = new javax.swing.JMenuItem();
        mitPacientes = new javax.swing.JMenuItem();
        sep5 = new javax.swing.JPopupMenu.Separator();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setBackground(new java.awt.Color(198, 253, 188));

        pnlResponsable1.setBackground(new java.awt.Color(198, 253, 188));

        tblResponsables.setFont(fntComponente);
        tblResponsables.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblResponsables);

        pnlResponsable2.setBackground(new java.awt.Color(198, 253, 188));

        txtTel.setFont(fntComponente);

        txtApPatResponsable.setFont(fntComponente);
        txtApPatResponsable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApPatResponsableActionPerformed(evt);
            }
        });
        txtApPatResponsable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtApPatResponsableKeyReleased(evt);
            }
        });

        txtApMatResponsable.setFont(fntComponente);
        txtApMatResponsable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApMatResponsableActionPerformed(evt);
            }
        });
        txtApMatResponsable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtApMatResponsableKeyReleased(evt);
            }
        });

        txtResponsable.setFont(fntComponente);
        txtResponsable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtResponsableKeyReleased(evt);
            }
        });

        lblResponsable.setFont(fntComponente);
        lblResponsable.setText("Nombre(s):");

        lblApPat.setFont(fntComponente);
        lblApPat.setText("Apellido Paterno:");

        lblApMat.setFont(fntComponente);
        lblApMat.setText("Apellido Materno:");

        lblTitulo.setFont(fntTitulo);
        lblTitulo.setText("Datos del Responsable");

        lblTel.setFont(fntComponente   );
        lblTel.setText("Télefono:");

        lblDireccion.setFont(fntComponente);
        lblDireccion.setText("Dirección del responsable:");

        lblNoExt.setFont(fntComponente);
        lblNoExt.setText("No. Exterior:");

        lblRelacion.setFont(fntComponente);
        lblRelacion.setText("Relacion con el paciente:");

        chkCasaSagradoCorazon.setFont(fntComponente);
        chkCasaSagradoCorazon.setText("Casa de descanso \"La Sagrada Familia\" ");

        lblCalle.setFont(fntComponente);
        lblCalle.setText("Calle:");

        lblNoInt.setFont(fntComponente);
        lblNoInt.setText("No.Interior:");

        lblColonia.setFont(fntComponente);
        lblColonia.setText("Colonia:");

        lblCP.setFont(fntComponente);
        lblCP.setText("Código Postal:");

        txtCalle.setFont(fntComponente);
        txtCalle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCalleActionPerformed(evt);
            }
        });
        txtCalle.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCalleKeyReleased(evt);
            }
        });

        txtNoExt.setFont(fntComponente);

        txtNoInt.setFont(fntComponente);

        txtColonia.setFont(fntComponente);
        txtColonia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtColoniaKeyReleased(evt);
            }
        });

        txtCP.setFont(fntComponente);

        lblDatos.setFont(fntComponente);
        lblDatos.setText("Datos del Responsable:");

        lblMunicipioResponsable.setFont(fntComponente);
        lblMunicipioResponsable.setText("Municipio:");

        lblEstadoResponsable.setFont(fntComponente);
        lblEstadoResponsable.setText("Estado:");

        cmbEstadoResponsable.setFont(fntComponente);
        cmbEstadoResponsable.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbEstadoResponsable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbEstadoResponsableActionPerformed(evt);
            }
        });

        btnAgregar.setFont(fntComponente);
        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/perfil.png"))); // NOI18N
        btnAgregar.setText("Agregar ");
        btnAgregar.setMaximumSize(dmsBoton);
        btnAgregar.setPreferredSize(dmsBoton);
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnEliminar.setFont(fntComponente);
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/perfil-3.png"))); // NOI18N
        btnEliminar.setText("Eliminar ");
        btnEliminar.setMaximumSize(dmsBoton);
        btnEliminar.setPreferredSize(dmsBoton);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnBuscar.setFont(fntComponente);
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/perfil-2.png"))); // NOI18N
        btnBuscar.setText("Buscar ");
        btnBuscar.setMaximumSize(dmsBoton);
        btnBuscar.setPreferredSize(dmsBoton);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        lblFiltroPacientes.setFont(fntComponente);
        lblFiltroPacientes.setText("Filtro Pacientes: ");

        txtFiltroPacientes.setFont(fntComponente);
        txtFiltroPacientes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtFiltroPacientesKeyReleased(evt);
            }
        });

        cmbFiltradoPacientes.setFont(fntComponente);
        cmbFiltradoPacientes.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbFiltradoPacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbFiltradoPacientesActionPerformed(evt);
            }
        });

        lblFiltroResponsables.setFont(fntComponente);
        lblFiltroResponsables.setText("Filtro Responsables: ");

        cmbFiltradoResponsables.setFont(fntComponente);
        cmbFiltradoResponsables.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        txtFiltroResponsables.setFont(fntComponente);
        txtFiltroResponsables.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtFiltroResponsablesKeyReleased(evt);
            }
        });

        btnModificar.setFont(fntComponente);
        btnModificar.setText("Modificar");
        btnModificar.setMaximumSize(dmsBoton);
        btnModificar.setPreferredSize(dmsBoton);
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnListar.setFont(fntComponente);
        btnListar.setText("Listar  Responsables");
        btnListar.setMaximumSize(dmsBoton);
        btnListar.setMinimumSize(dmsBoton);
        btnListar.setPreferredSize(dmsBoton);
        btnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarActionPerformed(evt);
            }
        });

        lblTel2.setFont(fntComponente   );
        lblTel2.setText("Télefono 2:");

        lblTel3.setFont(fntComponente   );
        lblTel3.setText("Télefono 3:");

        txtTel2.setFont(fntComponente);

        txtTel3.setFont(fntComponente);

        btnListarPacientesDelResponsable.setFont(fntComponente);
        btnListarPacientesDelResponsable.setText("Listar Pacientes del Responsable");
        btnListarPacientesDelResponsable.setMaximumSize(dmsBoton);
        btnListarPacientesDelResponsable.setMinimumSize(dmsBoton);
        btnListarPacientesDelResponsable.setPreferredSize(dmsBoton);
        btnListarPacientesDelResponsable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarPacientesDelResponsableActionPerformed(evt);
            }
        });

        btnListarResponsablesDelPaciente.setFont(fntComponente);
        btnListarResponsablesDelPaciente.setText("Listar Responsables del Paciente");
        btnListarResponsablesDelPaciente.setMaximumSize(dmsBoton);
        btnListarResponsablesDelPaciente.setMinimumSize(dmsBoton);
        btnListarResponsablesDelPaciente.setPreferredSize(dmsBoton);
        btnListarResponsablesDelPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarResponsablesDelPacienteActionPerformed(evt);
            }
        });

        btnVincular.setFont(fntComponente);
        btnVincular.setText("Vincular");
        btnVincular.setMaximumSize(dmsBoton);
        btnVincular.setPreferredSize(dmsBoton);
        btnVincular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVincularActionPerformed(evt);
            }
        });

        txtRelacion.setFont(fntComponente);
        txtRelacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtRelacionKeyReleased(evt);
            }
        });

        txtMunicipioResponsable.setFont(fntComponente);
        txtMunicipioResponsable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtMunicipioKeyRelased(evt);
            }
        });

        cmbResponsablesEliminados.setFont(fntComponente);
        cmbResponsablesEliminados.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnActivarResponsable.setFont(fntComponente);
        btnActivarResponsable.setText("Activar");
        btnActivarResponsable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActivarResponsableActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlResponsable2Layout = new javax.swing.GroupLayout(pnlResponsable2);
        pnlResponsable2.setLayout(pnlResponsable2Layout);
        pnlResponsable2Layout.setHorizontalGroup(
            pnlResponsable2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator3)
            .addGroup(pnlResponsable2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(pnlResponsable2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlResponsable2Layout.createSequentialGroup()
                        .addComponent(lblFiltroPacientes)
                        .addGap(18, 18, 18)
                        .addGroup(pnlResponsable2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlResponsable2Layout.createSequentialGroup()
                                .addComponent(txtFiltroPacientes, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(234, 234, 234))
                            .addComponent(cmbFiltradoPacientes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlResponsable2Layout.createSequentialGroup()
                        .addComponent(lblFiltroResponsables)
                        .addGap(18, 18, 18)
                        .addGroup(pnlResponsable2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlResponsable2Layout.createSequentialGroup()
                                .addComponent(txtFiltroResponsables, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(234, 234, 234))
                            .addComponent(cmbFiltradoResponsables, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(pnlResponsable2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlResponsable2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnVincular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlResponsable2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cmbResponsablesEliminados, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnActivarResponsable)
                        .addGap(29, 29, 29))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlResponsable2Layout.createSequentialGroup()
                .addGroup(pnlResponsable2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlResponsable2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblCalle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlResponsable2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sep4)
                            .addGroup(pnlResponsable2Layout.createSequentialGroup()
                                .addComponent(txtCalle, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblNoExt)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNoExt, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblNoInt)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNoInt, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblColonia)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtColonia, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 12, Short.MAX_VALUE))))
                    .addComponent(jSeparator1)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlResponsable2Layout.createSequentialGroup()
                        .addGap(299, 299, 299)
                        .addComponent(lblTitulo)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(79, 79, 79))
            .addGroup(pnlResponsable2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlResponsable2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlResponsable2Layout.createSequentialGroup()
                        .addComponent(jSeparator2)
                        .addContainerGap())
                    .addGroup(pnlResponsable2Layout.createSequentialGroup()
                        .addGroup(pnlResponsable2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pnlResponsable2Layout.createSequentialGroup()
                                .addComponent(lblCP)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCP, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(lblEstadoResponsable)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbEstadoResponsable, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblMunicipioResponsable)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtMunicipioResponsable))
                            .addGroup(pnlResponsable2Layout.createSequentialGroup()
                                .addGroup(pnlResponsable2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlResponsable2Layout.createSequentialGroup()
                                        .addComponent(lblDatos)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(chkCasaSagradoCorazon))
                                    .addComponent(lblDireccion)
                                    .addGroup(pnlResponsable2Layout.createSequentialGroup()
                                        .addComponent(lblRelacion)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtRelacion, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(pnlResponsable2Layout.createSequentialGroup()
                                        .addGroup(pnlResponsable2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(pnlResponsable2Layout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(40, 40, 40)
                                        .addGroup(pnlResponsable2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(pnlResponsable2Layout.createSequentialGroup()
                                                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(btnListar, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(pnlResponsable2Layout.createSequentialGroup()
                                        .addGroup(pnlResponsable2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlResponsable2Layout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addComponent(lblTel)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtTel))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlResponsable2Layout.createSequentialGroup()
                                                .addComponent(lblResponsable)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtResponsable, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(pnlResponsable2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(pnlResponsable2Layout.createSequentialGroup()
                                                .addComponent(lblApPat)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtApPatResponsable, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(pnlResponsable2Layout.createSequentialGroup()
                                                .addComponent(lblTel2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtTel2)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(pnlResponsable2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(pnlResponsable2Layout.createSequentialGroup()
                                                .addComponent(lblTel3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtTel3))
                                            .addGroup(pnlResponsable2Layout.createSequentialGroup()
                                                .addComponent(lblApMat)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtApMatResponsable, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(pnlResponsable2Layout.createSequentialGroup()
                                        .addComponent(btnListarPacientesDelResponsable, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(32, 32, 32)
                                        .addComponent(btnListarResponsablesDelPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(41, 41, 41)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        pnlResponsable2Layout.setVerticalGroup(
            pnlResponsable2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlResponsable2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo)
                .addGroup(pnlResponsable2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlResponsable2Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(pnlResponsable2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblFiltroResponsables)
                            .addComponent(txtFiltroResponsables, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbFiltradoResponsables, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbResponsablesEliminados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnActivarResponsable))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlResponsable2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFiltroPacientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbFiltradoPacientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFiltroPacientes)
                            .addComponent(btnVincular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlResponsable2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDatos)
                            .addComponent(chkCasaSagradoCorazon))
                        .addGap(6, 6, 6)
                        .addGroup(pnlResponsable2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblResponsable)
                            .addComponent(txtResponsable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblApPat)
                            .addComponent(txtApPatResponsable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblApMat)
                            .addComponent(txtApMatResponsable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlResponsable2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTel)
                            .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTel2)
                            .addComponent(lblTel3)
                            .addComponent(txtTel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblDireccion)
                        .addGap(12, 12, 12)
                        .addGroup(pnlResponsable2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCalle)
                            .addComponent(txtCalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNoExt)
                            .addComponent(txtNoExt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNoInt)
                            .addComponent(txtNoInt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblColonia)
                            .addComponent(txtColonia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sep4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(pnlResponsable2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCP)
                            .addGroup(pnlResponsable2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtCP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblEstadoResponsable)
                                .addComponent(cmbEstadoResponsable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblMunicipioResponsable)
                                .addComponent(txtMunicipioResponsable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlResponsable2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblRelacion)
                            .addComponent(txtRelacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addGroup(pnlResponsable2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(103, 103, 103))
                    .addGroup(pnlResponsable2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnlResponsable2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnListar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)))
                .addGroup(pnlResponsable2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnListarPacientesDelResponsable, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnListarResponsablesDelPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        lblRe.setFont(fntComponente);
        lblRe.setText("Responsables:");

        lblPa.setFont(fntComponente);
        lblPa.setText("Pacientes:");

        tblPacientes.setFont(fntComponente);
        tblPacientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(tblPacientes);

        javax.swing.GroupLayout pnlResponsable1Layout = new javax.swing.GroupLayout(pnlResponsable1);
        pnlResponsable1.setLayout(pnlResponsable1Layout);
        pnlResponsable1Layout.setHorizontalGroup(
            pnlResponsable1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlResponsable1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlResponsable2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlResponsable1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlResponsable1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlResponsable1Layout.createSequentialGroup()
                        .addComponent(lblPa)
                        .addGap(203, 203, 203))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlResponsable1Layout.createSequentialGroup()
                        .addComponent(lblRe)
                        .addGap(199, 199, 199))
                    .addGroup(pnlResponsable1Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        pnlResponsable1Layout.setVerticalGroup(
            pnlResponsable1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlResponsable1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlResponsable2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(pnlResponsable1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lblRe)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblPa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90))
        );

        mn1.setText("Menú Responsables");

        mitHistorial1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.SHIFT_MASK));
        mitHistorial1.setText("Historial de salidas y entradas");
        mitHistorial1.setActionCommand("Historial Medico");
        mitHistorial1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitHistorial1ActionPerformed(evt);
            }
        });
        mn1.add(mitHistorial1);

        mitResponsables.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        mitResponsables.setText("Responsables de Pacientes");
        mitResponsables.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitResponsablesActionPerformed(evt);
            }
        });
        mn1.add(mitResponsables);

        mitPacientes.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        mitPacientes.setText("Pacientes");
        mitPacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitPacientesActionPerformed(evt);
            }
        });
        mn1.add(mitPacientes);
        mn1.add(sep5);

        mbrPrincipal.add(mn1);

        setJMenuBar(mbrPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlResponsable1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 2, Short.MAX_VALUE)
                .addComponent(pnlResponsable1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        ComboItem ci = (ComboItem) cmbFiltradoResponsables.getSelectedItem();
        DAOResponsables dr = new DAOResponsables();
        dr.setIdResponsable(ci.getId());
        ComboItem ci1 = (ComboItem) cmbFiltradoPacientes.getSelectedItem();
        dr.setIdPaciente(ci1.getId());
        if (dr.eliminar() && dr.eliminarDetalle()) {
            JOptionPane.showMessageDialog(rootPane, "Registro eliminado");
            LimpiarCampos();
            btnListar.doClick();
        } else {
            JOptionPane.showMessageDialog(rootPane, "No se elimino");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void txtApMatResponsableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApMatResponsableActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApMatResponsableActionPerformed

    private void txtCalleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCalleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCalleActionPerformed

    private void mitResponsablesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitResponsablesActionPerformed
        dispose();
        FrmPacientes2 frm2 = new FrmPacientes2();
        frm2.setVisible(true);
    }//GEN-LAST:event_mitResponsablesActionPerformed

    private void mitHistorial1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitHistorial1ActionPerformed
        dispose();
        FrmHistorial_Ingresos_Egresos frmhie = new FrmHistorial_Ingresos_Egresos();
        frmhie.setVisible(true);
    }//GEN-LAST:event_mitHistorial1ActionPerformed

    private void mitPacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitPacientesActionPerformed
        dispose();
        FrmPacientes frm = new FrmPacientes();
        frm.setVisible(true);
    }//GEN-LAST:event_mitPacientesActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
        if (!txtResponsable.getText().isEmpty()) {
            if (!txtApPatResponsable.getText().isEmpty()) {
                if (!txtApMatResponsable.getText().isEmpty()) {
                    if (!txtTel.getText().isEmpty()) {
                        if (!txtCalle.getText().isEmpty()) {
                            if (!txtNoExt.getText().isEmpty()) {
                                if (!txtColonia.getText().isEmpty()) {
                                    if (!txtMunicipioResponsable.getText().isEmpty()) {
                                        if (!txtRelacion.getText().isEmpty()) {
                                            Responsables res = new Responsables();
                                            DAOResponsables dRes = new DAOResponsables();
                                            ComboItem ci = (ComboItem) cmbFiltradoPacientes.getSelectedItem();
                                            res.setIdPaciente(ci.getId());
                                            if (chkCasaSagradoCorazon.isSelected()) {
                                                res.setNombreResponsable(chkCasaSagradoCorazon.getText());
                                                res.setApMatResponsable("-");
                                                res.setApPatResponsable("-");
                                                res.setTel1("-");
                                                res.setTel2("-");
                                                res.setTel3("-");
                                                res.setRelacion("-");
                                                res.setNoExt("-");
                                                res.setNoInt("-");
                                                res.setColonia("-");
                                                res.setEstadoResponsable("-");
                                                res.setMunicipioResponsable("-");
                                                res.setCalle("-");
                                                res.setcP("-");
                                            } else {
                                                res.setNombreResponsable(txtResponsable.getText());
                                                res.setApPatResponsable(txtApPatResponsable.getText());
                                                res.setApMatResponsable(txtApMatResponsable.getText());
                                            }
                                            res.setTel1(txtTel.getText());
                                            res.setTel2(txtTel2.getText());
                                            res.setTel3(txtTel3.getText());
                                            res.setRelacion(txtRelacion.getText());
                                            res.setNoExt(txtNoExt.getText());
                                            res.setNoInt(txtNoInt.getText());
                                            res.setColonia(txtColonia.getText());
                                            res.setEstadoResponsable(cmbEstadoResponsable.getSelectedItem().toString());
                                            res.setMunicipioResponsable(txtMunicipioResponsable.getText());
                                            res.setCalle(txtCalle.getText());
                                            res.setcP(txtCP.getText());
                                            dRes.setResponsable(res);
                                            if (dRes.agregar()) {
                                                JOptionPane.showMessageDialog(rootPane, "Registro guardado");
                                                LimpiarCampos();
                                                btnListar.doClick();
                                                cargaCmbFiltradoResponsables();
                                            } else {
                                                JOptionPane.showMessageDialog(rootPane, "No se guardado");
                                            }
                                        } else {
                                            JOptionPane.showMessageDialog(this, "ERROR: Faltó que tipo de relacion tiene con el paciente.");
                                        }
                                    } else {
                                        JOptionPane.showMessageDialog(this, "ERROR: Faltó el Municipio.");
                                    }
                                } else {
                                    JOptionPane.showMessageDialog(this, "ERROR: Faltó la colonia.");
                                }
                            } else {
                                JOptionPane.showMessageDialog(this, "ERROR: Faltó el No. de Exterior.");
                            }
                        } else {
                            JOptionPane.showMessageDialog(this, "ERROR: Faltó la calle.");
                        }
                    } else {
                        JOptionPane.showMessageDialog(this, "ERROR: Faltó el teléfono de responsable.");
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "ERROR: Faltó el apellido materno.");
                }
            } else {
                JOptionPane.showMessageDialog(this, "ERROR: Faltó el appellido paterno.");
            }
        } else {
            JOptionPane.showMessageDialog(this, "ERROR: Faltó el nombre de responsable.");
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        DAOResponsables dRes = new DAOResponsables();

        ComboItem ci = (ComboItem) cmbFiltradoResponsables.getSelectedItem();
        dRes.setIdResponsable(ci.getId());
        if (dRes.buscar()) {
            txtResponsable.setText(dRes.getNombreResponsable());
            txtApPatResponsable.setText(dRes.getApPatResponsable());
            txtApMatResponsable.setText(dRes.getApMatResponsable());
            txtTel.setText(dRes.getTel1());
            txtTel2.setText(dRes.getTel2());
            txtTel3.setText(dRes.getTel3());
            cmbEstadoResponsable.setSelectedItem(dRes.getEstadoResponsable());
            txtMunicipioResponsable.setText(dRes.getMunicipioResponsable());
            txtNoExt.setText(dRes.getNoExt());
            txtNoInt.setText(dRes.getNoInt());
            txtColonia.setText(dRes.getColonia());
            txtCalle.setText(dRes.getCalle());
            txtCP.setText(dRes.getcP());
            txtRelacion.setText(dRes.getRelacion());
            btnListarPacientesDelResponsable.doClick();
        } else {
            JOptionPane.showMessageDialog(null, "No existe el responsable");
        }

    }//GEN-LAST:event_btnBuscarActionPerformed

    private void cmbEstadoResponsableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbEstadoResponsableActionPerformed
        // TODO add your handling code here:
//        cargarMunicipio();
    }//GEN-LAST:event_cmbEstadoResponsableActionPerformed

    private void txtFiltroPacientesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFiltroPacientesKeyReleased
        // TODO add your handling code here:
        txtFiltroPacientes.setText(txtFiltroPacientes.getText().toUpperCase());
        cargaCmbFiltradoPacientes();
    }//GEN-LAST:event_txtFiltroPacientesKeyReleased

    private void txtFiltroResponsablesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFiltroResponsablesKeyReleased
        // TODO add your handling code here:
        txtFiltroResponsables.setText(txtFiltroResponsables.getText().toUpperCase());
        cargaCmbFiltradoResponsables();
        cargaCmbFiltradoResponsablesEliminados();
    }//GEN-LAST:event_txtFiltroResponsablesKeyReleased

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // TODO add your handling code here:
        if (!txtResponsable.getText().isEmpty()) {
            if (!txtApPatResponsable.getText().isEmpty()) {
                if (!txtApMatResponsable.getText().isEmpty()) {
                    if (!txtTel.getText().isEmpty()) {
                        if (!txtCalle.getText().isEmpty()) {
                            if (!txtNoExt.getText().isEmpty()) {
                                if (!txtColonia.getText().isEmpty()) {
                                    if (!txtMunicipioResponsable.getText().isEmpty()) {
                                        if (!txtRelacion.getText().isEmpty()) {

                                            Responsables res = new Responsables();
                                            ComboItem ci = (ComboItem) cmbFiltradoResponsables.getSelectedItem();
                                            DAOResponsables dRes = new DAOResponsables();
                                            res.setIdResponsable(ci.getId());
                                            ci = (ComboItem) cmbFiltradoPacientes.getSelectedItem();
                                            res.setIdPaciente(ci.getId());
                                            res.setIdPaciente(ci.getId());
                                            if (chkCasaSagradoCorazon.isSelected()) {
                                                res.setNombreResponsable(chkCasaSagradoCorazon.getText());
                                                res.setApMatResponsable("-");
                                                res.setApPatResponsable("-");
                                                res.setTel1("-");
                                                res.setTel2("-");
                                                res.setTel3("-");
                                                res.setRelacion("-");
                                                res.setNoExt("-");
                                                res.setNoInt("-");
                                                res.setColonia("-");
                                                res.setEstadoResponsable("-");
                                                res.setMunicipioResponsable("-");
                                                res.setCalle("-");
                                                res.setcP("-");
                                            } else {
                                                res.setNombreResponsable(txtResponsable.getText());
                                                res.setApPatResponsable(txtApPatResponsable.getText());
                                                res.setApMatResponsable(txtApMatResponsable.getText());
                                            }
                                            res.setTel1(txtTel.getText());
                                            res.setTel2(txtTel2.getText());
                                            res.setTel3(txtTel3.getText());
                                            res.setRelacion(txtRelacion.getText());
                                            res.setNoExt(txtNoExt.getText());
                                            res.setNoInt(txtNoInt.getText());
                                            res.setColonia(txtColonia.getText());
                                            res.setEstadoResponsable(cmbEstadoResponsable.getSelectedItem().toString());
                                            res.setMunicipioResponsable(txtMunicipioResponsable.getText());
                                            res.setCalle(txtCalle.getText());
                                            res.setcP(txtCP.getText());
                                            dRes.setResponsable(res);
                                            if (dRes.modificar()) {
                                                JOptionPane.showMessageDialog(rootPane, "Registro modificado");
                                                LimpiarCampos();
                                                btnListar.doClick();
                                                cargaCmbFiltradoResponsables();
                                            } else {
                                                JOptionPane.showMessageDialog(rootPane, "No se modifico");
                                            }
                                        } else {
                                            JOptionPane.showMessageDialog(this, "ERROR: Faltó que tipo de relacion tiene con el paciente.");
                                        }
                                    } else {
                                        JOptionPane.showMessageDialog(this, "ERROR: Faltó el municipio.");
                                    }
                                } else {
                                    JOptionPane.showMessageDialog(this, "ERROR: Faltó la colonia.");
                                }
                            } else {
                                JOptionPane.showMessageDialog(this, "ERROR: Faltó el No. de Exterior.");
                            }
                        } else {
                            JOptionPane.showMessageDialog(this, "ERROR: Faltó la calle.");
                        }
                    } else {
                        JOptionPane.showMessageDialog(this, "ERROR: Faltó el teléfono de responsable.");
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "ERROR: Faltó el apellido materno.");
                }
            } else {
                JOptionPane.showMessageDialog(this, "ERROR: Faltó el appellido paterno.");
            }
        } else {
            JOptionPane.showMessageDialog(this, "ERROR: Faltó el nombre de responsable.");
        }

    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed
        // TODO add your handling code here:
        DAOResponsables dr = new DAOResponsables();
        tblResponsables.setModel(dr.listar());
    }//GEN-LAST:event_btnListarActionPerformed

    private void txtApPatResponsableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApPatResponsableActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApPatResponsableActionPerformed

    private void txtResponsableKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtResponsableKeyReleased
        // TODO add your handling code here:
        txtResponsable.setText(txtResponsable.getText().toUpperCase());
    }//GEN-LAST:event_txtResponsableKeyReleased

    private void txtApPatResponsableKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApPatResponsableKeyReleased
        // TODO add your handling code here:
        txtApPatResponsable.setText(txtApPatResponsable.getText().toUpperCase());
    }//GEN-LAST:event_txtApPatResponsableKeyReleased

    private void txtApMatResponsableKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApMatResponsableKeyReleased
        // TODO add your handling code here:
        txtApMatResponsable.setText(txtApMatResponsable.getText().toUpperCase());
    }//GEN-LAST:event_txtApMatResponsableKeyReleased

    private void txtCalleKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCalleKeyReleased
        // TODO add your handling code here:
        txtCalle.setText(txtCalle.getText().toUpperCase());
    }//GEN-LAST:event_txtCalleKeyReleased

    private void txtColoniaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtColoniaKeyReleased
        // TODO add your handling code here:
        txtColonia.setText(txtColonia.getText().toUpperCase());
    }//GEN-LAST:event_txtColoniaKeyReleased

    private void cmbFiltradoPacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbFiltradoPacientesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbFiltradoPacientesActionPerformed

    private void btnListarPacientesDelResponsableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarPacientesDelResponsableActionPerformed
        DAOResponsables dRes = new DAOResponsables();
        ComboItem ci = (ComboItem) cmbFiltradoResponsables.getSelectedItem();
        dRes.setIdResponsable(ci.getId());
        tblPacientes.setModel(dRes.listarResponsable());
    }//GEN-LAST:event_btnListarPacientesDelResponsableActionPerformed

    private void btnListarResponsablesDelPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarResponsablesDelPacienteActionPerformed
        DAOResponsables dRes = new DAOResponsables();
        ComboItem ci = (ComboItem) cmbFiltradoPacientes.getSelectedItem();
        dRes.setIdPaciente(ci.getId());
        tblResponsables.setModel(dRes.listarPaciente());

    }//GEN-LAST:event_btnListarResponsablesDelPacienteActionPerformed

    private void btnVincularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVincularActionPerformed
        int si = JOptionPane.showConfirmDialog(this, "¿Desea vincular el responsable con el paciente?");
        if (JOptionPane.YES_OPTION == si) {
            DAOResponsables dRes = new DAOResponsables();
            ComboItem ci = (ComboItem) cmbFiltradoPacientes.getSelectedItem();
            dRes.setIdPaciente(ci.getId());
            ComboItem ci1 = (ComboItem) cmbFiltradoResponsables.getSelectedItem();
            dRes.setIdResponsable(ci1.getId());
            if (dRes.agregarDetalle()) {
                JOptionPane.showMessageDialog(rootPane, "Registro vinculado");
                LimpiarCampos();
            } else {
                JOptionPane.showMessageDialog(rootPane, "No se vinculo");
            }
        }
    }//GEN-LAST:event_btnVincularActionPerformed

    private void txtMunicipioKeyRelased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMunicipioKeyRelased
        txtMunicipioResponsable.setText(txtMunicipioResponsable.getText().toUpperCase());
    }//GEN-LAST:event_txtMunicipioKeyRelased

    private void txtRelacionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRelacionKeyReleased
        // TODO add your handling code here:
         txtRelacion.setText(txtRelacion.getText().toUpperCase());
    }//GEN-LAST:event_txtRelacionKeyReleased

    private void btnActivarResponsableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActivarResponsableActionPerformed
        int si = JOptionPane.showConfirmDialog(this, "¿Desea volver a activar a el responsable?");
        try {
                if(JOptionPane.YES_OPTION == si){
            ComboItem ci = (ComboItem) cmbResponsablesEliminados.getSelectedItem();
            Responsables resp = new Responsables();
            DAOResponsables dRes = new DAOResponsables();
            resp.setIdResponsable(ci.getId());
            dRes.setResponsable(resp);
            if(dRes.activarResponsablesEliminados()){
                JOptionPane.showMessageDialog(rootPane, "Responsable activado");
                cargaCmbFiltradoResponsables();
                btnListar.doClick();
            }else{
                JOptionPane.showMessageDialog(rootPane, "No se pudo activar el responsable");
               }
                }
            } catch (ClassCastException e) {
                System.out.println("Error: " + e);
        }
    }//GEN-LAST:event_btnActivarResponsableActionPerformed

    public void cargaCmbFiltradoResponsables() {
        DAOResponsables dr = new DAOResponsables();
        cmbFiltradoResponsables.removeAllItems();
        ArrayList<ComboItem> responsables = dr.filtrarResponsables(txtFiltroResponsables.getText());
        for (int i = 0; i < responsables.size(); i++) {
            cmbFiltradoResponsables.addItem((ComboItem) responsables.get(i));
        }
    }
    
    public void cargaCmbFiltradoResponsablesEliminados() {
        DAOResponsables dr = new DAOResponsables();
        cmbResponsablesEliminados.removeAllItems();
        ArrayList<ComboItem> responsables = dr.filtrarResponsablesEliminados(txtFiltroResponsables.getText());
        for (int i = 0; i < responsables.size(); i++) {
            cmbResponsablesEliminados.addItem((ComboItem)(responsables.get(i))); //String.valueOf((ComboItem) responsables.get(i))  ComboItem) responsables.get(i)
        }
    }

    public void cargaCmbFiltradoPacientes() {
        DAOPacientes dp = new DAOPacientes();
        cmbFiltradoPacientes.removeAllItems();
        ArrayList<ComboItem> pacientes = dp.filtrarPacientes(txtFiltroPacientes.getText());
        for (int i = 0; i < pacientes.size(); i++) {
            cmbFiltradoPacientes.addItem((ComboItem) pacientes.get(i));
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
            java.util.logging.Logger.getLogger(FrmPacientes2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPacientes2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPacientes2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPacientes2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPacientes2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActivarResponsable;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnListar;
    private javax.swing.JButton btnListarPacientesDelResponsable;
    private javax.swing.JButton btnListarResponsablesDelPaciente;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnVincular;
    private javax.swing.JCheckBox chkCasaSagradoCorazon;
    private javax.swing.JComboBox cmbEstadoResponsable;
    private javax.swing.JComboBox cmbFiltradoPacientes;
    private javax.swing.JComboBox cmbFiltradoResponsables;
    private javax.swing.JComboBox cmbResponsablesEliminados;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lblApMat;
    private javax.swing.JLabel lblApPat;
    private javax.swing.JLabel lblCP;
    private javax.swing.JLabel lblCalle;
    private javax.swing.JLabel lblColonia;
    private javax.swing.JLabel lblDatos;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblEstadoResponsable;
    private javax.swing.JLabel lblFiltroPacientes;
    private javax.swing.JLabel lblFiltroResponsables;
    private javax.swing.JLabel lblMunicipioResponsable;
    private javax.swing.JLabel lblNoExt;
    private javax.swing.JLabel lblNoInt;
    private javax.swing.JLabel lblPa;
    private javax.swing.JLabel lblRe;
    private javax.swing.JLabel lblRelacion;
    private javax.swing.JLabel lblResponsable;
    private javax.swing.JLabel lblTel;
    private javax.swing.JLabel lblTel2;
    private javax.swing.JLabel lblTel3;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JMenuBar mbrPrincipal;
    private javax.swing.JMenuItem mitHistorial1;
    private javax.swing.JMenuItem mitPacientes;
    private javax.swing.JMenuItem mitResponsables;
    private javax.swing.JMenu mn1;
    private javax.swing.JPanel pnlResponsable1;
    private javax.swing.JPanel pnlResponsable2;
    private javax.swing.JSeparator sep4;
    private javax.swing.JPopupMenu.Separator sep5;
    private javax.swing.JTable tblPacientes;
    private javax.swing.JTable tblResponsables;
    private javax.swing.JTextField txtApMatResponsable;
    private javax.swing.JTextField txtApPatResponsable;
    private javax.swing.JTextField txtCP;
    private javax.swing.JTextField txtCalle;
    private javax.swing.JTextField txtColonia;
    private javax.swing.JTextField txtFiltroPacientes;
    private javax.swing.JTextField txtFiltroResponsables;
    private javax.swing.JTextField txtMunicipioResponsable;
    private javax.swing.JTextField txtNoExt;
    private javax.swing.JTextField txtNoInt;
    private javax.swing.JTextField txtRelacion;
    private javax.swing.JTextField txtResponsable;
    private javax.swing.JTextField txtTel;
    private javax.swing.JTextField txtTel2;
    private javax.swing.JTextField txtTel3;
    // End of variables declaration//GEN-END:variables
}
