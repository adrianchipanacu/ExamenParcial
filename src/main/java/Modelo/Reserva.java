/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
import java.util.Date;

/**
 *
 * @author adrian_pc
 */
public class Reserva {
    
    private Date fechaReserva;
    private int cantidadEntradas;
    private String[] asientos;
    private String metodoPago;

    public Reserva(Date fechaReserva, int cantidadEntradas, String[] asientos, String metodoPago) {
        this.fechaReserva = fechaReserva;
        this.cantidadEntradas = cantidadEntradas;
        this.asientos = asientos;
        this.metodoPago = metodoPago;
    }

    //Getters
    public Date getFechaReserva() { return fechaReserva; }
    public int getCantidadEntradas() { return cantidadEntradas; }
    public String[] getAsientos() { return asientos; }
    public String getMetodoPago() { return metodoPago; }

    public boolean registrar(Funcion funcion, String[] asientos, String metodoPago) { return false; }
    public boolean cancelar() { return false; }
    public boolean verificarAsiento(String asiento) { return false; }
}
