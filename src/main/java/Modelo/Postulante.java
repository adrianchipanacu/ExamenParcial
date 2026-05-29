package Modelo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
/**
 *
 * @author adrian_pc
 */
public class Postulante {

    private String email;
    private String nombres;
    private String apellidos;
    private String direccion;
    private Date nacimiento;
    private String clave;
    private GradoEstudio gradoEstudio;
    private List<Postulacion> postulaciones;

    public Postulante(String email, String nombres, String apellidos, String direccion, Date nacimiento, String clave) {
        this.email = email;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.nacimiento = nacimiento;
        this.clave = clave;
        this.postulaciones = new ArrayList<>();
    }

    public String getEmail() { return email; }
    public String getNombres() { return nombres; }
    public String getApellidos() { return apellidos; }
    public String getDireccion() { return direccion; }
    public Date getNacimiento() { return nacimiento; }

    public boolean asignarGradoEstudio(GradoEstudio grado) {
        this.gradoEstudio = grado;
        return true;
    }

    public boolean postular(Oferta oferta) {
        postulaciones.add(new Postulacion(new Date(), false, null));
        return true;
    }

    public boolean anularPostulacion(Postulacion postulacion) {
        postulacion.anular();
        return true;
    }

    public Postulacion[] getPostulaciones() {
        return postulaciones.toArray(new Postulacion[0]);
    }
}
