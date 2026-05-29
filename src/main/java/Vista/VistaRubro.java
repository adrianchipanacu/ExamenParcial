    package Vista;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class VistaRubro extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger =
        java.util.logging.Logger.getLogger(VistaRubro.class.getName());

    public VistaRubro() {
        initComponents();
        setTitle("Gestión de Rubros");
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblEstado = new javax.swing.JLabel();
        chkEstado = new javax.swing.JCheckBox();
        btnRegistrar = new javax.swing.JButton();
        btnHabilitar = new javax.swing.JButton();
        btnDeshabilitar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRubros = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 16));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Gestión de Rubros");

        lblNombre.setText("Nombre:");
        lblEstado.setText("Activo:");
        chkEstado.setSelected(true);

        btnRegistrar.setText("Registrar");
        btnHabilitar.setText("Habilitar");
        btnDeshabilitar.setText("Deshabilitar");
        btnLimpiar.setText("Limpiar");

        tblRubros.setModel(new DefaultTableModel(
            new Object[][] {},
            new String[] {"Nombre", "Estado"}
        ) {
            public boolean isCellEditable(int r, int c) { return false; }
        });
        jScrollPane1.setViewportView(tblRubros);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNombre).addComponent(lblEstado))
                        .addGap(18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombre).addComponent(chkEstado)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnRegistrar).addGap(8)
                        .addComponent(btnHabilitar).addGap(8)
                        .addComponent(btnDeshabilitar).addGap(8)
                        .addComponent(btnLimpiar))
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
                    .addComponent(lblNombre).addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEstado).addComponent(chkEstado))
                .addGap(12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrar).addComponent(btnHabilitar)
                    .addComponent(btnDeshabilitar).addComponent(btnLimpiar))
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
                    javax.swing.UIManager.setLookAndFeel(info.getClassName()); break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> new VistaRubro().setVisible(true));
    }

    // Getters
    public String getNombre() { return txtNombre.getText(); }
    public boolean getEstado() { return chkEstado.isSelected(); }
    public JTable getTabla() { return tblRubros; }
    public JButton getBtnRegistrar() { return btnRegistrar; }
    public JButton getBtnHabilitar() { return btnHabilitar; }
    public JButton getBtnDeshabilitar() { return btnDeshabilitar; }
    public JButton getBtnLimpiar() { return btnLimpiar; }
    public void limpiarCampos() { txtNombre.setText(""); chkEstado.setSelected(true); }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JCheckBox chkEstado;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnHabilitar;
    private javax.swing.JButton btnDeshabilitar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblRubros;
    // End of variables declaration//GEN-END:variables
}
