package Modelo;
/**
 *
 * @author adrian_pc
 */
public class Rubro {

    private String nombre;
    private boolean estado;

    public Rubro(String nombre, boolean estado) {
        this.nombre = nombre;
        this.estado = estado;
    }

    public String getNombre() { return nombre; }
    public boolean getEstado() { return estado; }

    public boolean habilitar() {
        this.estado = true;
        return true;
    }

    public boolean deshabilitar() {
        this.estado = false;
        return true;
    }
}
