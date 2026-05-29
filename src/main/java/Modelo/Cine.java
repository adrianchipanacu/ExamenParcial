/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author adrian_pc
 */
public class Cine {

    private String nombre;
    private String direccion;

    public Cine(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }

    //gwtters
    public String getNombre() { return nombre; }
    public String getDireccion() { return direccion; }

    public List<Funcion> getProgramacion() { return null; }
    public List<Sala> getSalas() { return null; }
    public Pelicula buscarPelicula(String titulo) { return null; }
    
}
