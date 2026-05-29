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
public class Funcion {
    
    private Date fecha;
    private String horaInicio;
    private double precioEntrada;

    public Funcion(Date fecha, String horaInicio, double precioEntrada) {
        this.fecha = fecha;
        this.horaInicio = horaInicio;
        this.precioEntrada = precioEntrada;
    }

    // Getters
    public Date getFecha() { return fecha; }
    public String getHoraInicio() { return horaInicio; }
    public double getPrecioEntrada() { return precioEntrada; }


    public boolean verificarSuperpos(String hora) { return false; }
    public boolean getDisponibilidad() { return false; }
    public int getAsientosLibres() { return 0; }
}
