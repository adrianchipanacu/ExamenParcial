/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
import java.util.List;


/**
 *
 * @author adrian_pc
 */
public class Pelicula {

    private String titulo;
    private int duracion;
    private String clasificacionEdad;
    private String[] generos;

    public Pelicula(String titulo, int duracion, String clasificacionEdad, String[] generos) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.clasificacionEdad = clasificacionEdad;
        this.generos = generos;
    }

    // Getters
    public String getTitulo() { return titulo; }
    public int getDuracion() { return duracion; }
    public String getClasificacionEdad() { return clasificacionEdad; }
    public String[] getGeneros() { return generos; }

    public List<Pelicula> buscarPorGenero(String genero) { return null; }
    public List<Pelicula> buscarPorClasif(String clasif) { return null; }
    public List<Actor> getActores() { return null; }
}
