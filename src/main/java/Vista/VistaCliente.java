package Vista;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class VistaCliente extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger =
        java.util.logging.Logger.getLogger(VistaCliente.class.getName());

    public VistaCliente() {
        initComponents();
        setTitle("Gestión de Clientes");
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        lblRUC = new javax.swing.JLabel();
        txtRUC = new javax.swing.JTextField();
        lblRazonSocial = new javax.swing.JLabel();
        txtRazonSocial = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblContacto = new javax.swing.JLabel();
        txtContacto = new javax.swing.JTextField();
        lblTelefono = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        lblClave = new javax.swing.JLabel();
        txtClave = new javax.swing.JPasswordField();
        btnRegistrar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblClientes = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 16));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Registro de Clientes");

        lblRUC.setText("RUC:");
        lblRazonSocial.setText("Razón Social:");
        lblEmail.setText("Email:");
        lblContacto.setText("Contacto:");
        lblTelefono.setText("Teléfono:");
        lblClave.setText("Clave:");

        btnRegistrar.setText("Registrar");
        btnLimpiar.setText("Limpiar");
        btnEliminar.setText("Eliminar");

        tblClientes.setModel(new DefaultTableModel(
            new Object[][] {},
            new String[] {"RUC", "Razón Social", "Email", "Contacto", "Teléfono"}
        ) {
            public boolean isCellEditable(int row, int col) { return false; }
        });
        jScrollPane1.setViewportView(tblClientes);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblRUC)
                            .addComponent(lblRazonSocial)
                            .addComponent(lblEmail)
                            .addComponent(lblContacto)
                            .addComponent(lblTelefono)
                            .addComponent(lblClave))
                        .addGap(18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtRUC)
                            .addComponent(txtRazonSocial)
                            .addComponent(txtEmail)
                            .addComponent(txtContacto)
                            .addComponent(txtTelefono)
                            .addComponent(txtClave)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnRegistrar)
                        .addGap(10)
                        .addComponent(btnLimpiar)
                        .addGap(10)
                        .addComponent(btnEliminar))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo)
                .addGap(18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRUC).addComponent(txtRUC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRazonSocial).addComponent(txtRazonSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail).addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblContacto).addComponent(txtContacto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelefono).addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblClave).addComponent(txtClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrar).addComponent(btnLimpiar).addComponent(btnEliminar))
                .addGap(12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> new VistaCliente().setVisible(true));
    }

    // Getters para el Controlador
    public String getRUC() { return txtRUC.getText(); }
    public String getRazonSocial() { return txtRazonSocial.getText(); }
    public String getEmail() { return txtEmail.getText(); }
    public String getContacto() { return txtContacto.getText(); }
    public String getTelefono() { return txtTelefono.getText(); }
    public String getClave() { return new String(txtClave.getPassword()); }
    public JTable getTabla() { return tblClientes; }
    public JButton getBtnRegistrar() { return btnRegistrar; }
    public JButton getBtnLimpiar() { return btnLimpiar; }
    public JButton getBtnEliminar() { return btnEliminar; }

    public void limpiarCampos() {
        txtRUC.setText(""); txtRazonSocial.setText(""); txtEmail.setText("");
        txtContacto.setText(""); txtTelefono.setText(""); txtClave.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblRUC;
    private javax.swing.JTextField txtRUC;
    private javax.swing.JLabel lblRazonSocial;
    private javax.swing.JTextField txtRazonSocial;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JLabel lblContacto;
    private javax.swing.JTextField txtContacto;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JLabel lblClave;
    private javax.swing.JPasswordField txtClave;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblClientes;
    // End of variables declaration//GEN-END:variables
}
