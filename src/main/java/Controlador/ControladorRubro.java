package Controlador;

import Modelo.Rubro;
import Vista.VistaRubro;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ControladorRubro implements ActionListener {
    private VistaRubro vista;
    private ArrayList<Rubro> rubros;
    private DefaultTableModel modelo;

    public ControladorRubro(VistaRubro vista) {
        this.vista = vista;
        this.rubros = new ArrayList<>();
        this.modelo = (DefaultTableModel) vista.getTabla().getModel();

        vista.getBtnRegistrar().addActionListener(this);
        vista.getBtnHabilitar().addActionListener(this);
        vista.getBtnDeshabilitar().addActionListener(this);
        vista.getBtnLimpiar().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.getBtnRegistrar()) {
            registrarRubro();
        }

        if (e.getSource() == vista.getBtnHabilitar()) {
            cambiarEstado(true);
        }

        if (e.getSource() == vista.getBtnDeshabilitar()) {
            cambiarEstado(false);
        }

        if (e.getSource() == vista.getBtnLimpiar()) {
            vista.limpiarCampos();
        }
    }

    private void registrarRubro() {
        if (vista.getNombre().isEmpty()) {
            JOptionPane.showMessageDialog(vista, "Ingrese un nombre");
            return;
        }

        Rubro rubro = new Rubro(vista.getNombre(), vista.getEstado());
        rubros.add(rubro);

        modelo.addRow(new Object[]{
            rubro.getNombre(),
            rubro.getEstado() ? "Activo" : "Inactivo"
        });

        vista.limpiarCampos();
    }

    private void cambiarEstado(boolean estado) {
        int fila = vista.getTabla().getSelectedRow();

        if (fila == -1) {
            JOptionPane.showMessageDialog(vista, "Seleccione un rubro");
            return;
        }

        Rubro rubro = rubros.get(fila);

        if (estado) {
            rubro.habilitar();
        } else {
            rubro.deshabilitar();
        }

        modelo.setValueAt(rubro.getEstado() ? "Activo" : "Inactivo", fila, 1);
    }
}
