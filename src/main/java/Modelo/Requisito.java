package Modelo;
/**
 *
 * @author adrian_pc
 */
public class Requisito {

    private int orden;
    private String descripcion;
    private boolean estado;

    public Requisito(int orden, String descripcion, boolean estado) {
        this.orden = orden;
        this.descripcion = descripcion;
        this.estado = estado;
    }

    public int getOrden() { return orden; }
    public String getDescripcion() { return descripcion; }
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
