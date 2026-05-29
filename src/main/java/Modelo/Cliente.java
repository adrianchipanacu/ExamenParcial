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
public class Cliente {
    
    private String nombres;
    private String dni;
    private String correo;
    private Date fechaNacimiento;

    public Cliente(String nombres, String dni, String correo, Date fechaNacimiento) {
        this.nombres = nombres;
        this.dni = dni;
        this.correo = correo;
        this.fechaNacimiento = fechaNacimiento;
    }

    // Getters
    public String getNombres() { return nombres; }
    public String getDni() { return dni; }
    public String getCorreo() { return correo; }
    public Date getFechaNacimiento() { return fechaNacimiento; }

    public boolean registrar() { return false; }
    public boolean login(String correo, String pass) { return false; }
    
}
