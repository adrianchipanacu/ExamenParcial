/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
import java.util.Date;
import java.util.List;

/**
 *
 * @author adrian_pc
 */
public class Sala {
    
    private String codigo;
    private int capacidad;
    private String tipoProyeccion;

    public Sala(String codigo, int capacidad, String tipoProyeccion) {
        this.codigo = codigo;
        this.capacidad = capacidad;
        this.tipoProyeccion = tipoProyeccion;
    }

    // Getters
    public String getCodigo() { return codigo; }
    public int getCapacidad() { return capacidad; }
    public String getTipoProyeccion() { return tipoProyeccion; }

    public boolean verificarDisponib(Date fecha) { return false; }
    public List<Funcion> getFunciones() { return null; }
    public int getAsientos() { return 0; }
    
}
