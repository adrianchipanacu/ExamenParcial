package com.mycompany.examenparcial;

import Controlador.ControladorCliente;
import Vista.VistaCliente;

public class ExamenParcial {

    public static void main(String[] args) {
        VistaCliente vista = new VistaCliente();
        new ControladorCliente(vista);
        vista.setVisible(true);
    }
}
