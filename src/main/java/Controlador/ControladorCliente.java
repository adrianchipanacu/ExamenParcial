package Controlador;

import Modelo.Cliente;
import Vista.VistaCliente;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author adrian_pc
 */

public class ControladorCliente implements ActionListener {
    private VistaCliente vista;
    private ArrayList<Cliente> clientes;
    private DefaultTableModel modelo;

    public ControladorCliente(VistaCliente vista) {
        this.vista = vista;
        this.clientes = new ArrayList<>();
        this.modelo = (DefaultTableModel) vista.getTabla().getModel();

        vista.getBtnRegistrar().addActionListener(this);
        vista.getBtnEliminar().addActionListener(this);
        vista.getBtnLimpiar().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.getBtnRegistrar()) {
            registrarCliente();
        }

        if (e.getSource() == vista.getBtnEliminar()) {
            eliminarCliente();
        }

        if (e.getSource() == vista.getBtnLimpiar()) {
            vista.limpiarCampos();
        }
    }

    private void registrarCliente() {
        if (vista.getRUC().isEmpty() || vista.getRazonSocial().isEmpty()) {
            JOptionPane.showMessageDialog(vista, "Complete los campos obligatorios");
            return;
        }

        Cliente cliente = new Cliente(
                vista.getRUC(),
                vista.getRazonSocial(),
                vista.getEmail(),
                vista.getContacto(),
                vista.getTelefono(),
                vista.getClave()
        );

        clientes.add(cliente);

        modelo.addRow(new Object[]{
            cliente.getRUC(),
            cliente.getRazonSocial(),
            cliente.getEmail(),
            cliente.getContacto(),
            cliente.getTelefono()
        });

        vista.limpiarCampos();
        JOptionPane.showMessageDialog(vista, "Cliente registrado correctamente");
    }

    private void eliminarCliente() {
        int fila = vista.getTabla().getSelectedRow();

        if (fila == -1) {
            JOptionPane.showMessageDialog(vista, "Seleccione un cliente");
            return;
        }

        clientes.remove(fila);
        modelo.removeRow(fila);
    }
}
