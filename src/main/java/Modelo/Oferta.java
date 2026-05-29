package Modelo;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author adrian_pc
 */

public class Oferta {

    private String puesto;
    private String descripcion;
    private String area;
    private Date fechaInicio;
    private Date fechaTermino;
    private List<Requisito> requisitos;

    public Oferta(String puesto, String descripcion, String area, Date fechaInicio, Date fechaTermino) {
        this.puesto = puesto;
        this.descripcion = descripcion;
        this.area = area;
        this.fechaInicio = fechaInicio;
        this.fechaTermino = fechaTermino;
        this.requisitos = new ArrayList<>();
    }

    public String getPuesto() { return puesto; }
    public String getDescripcion() { return descripcion; }
    public String getArea() { return area; }
    public Date getFechaInicio() { return fechaInicio; }
    public Date getFechaTermino() { return fechaTermino; }

    public boolean agregarRequisito(int orden, String descripcion) {
        requisitos.add(new Requisito(orden, descripcion, true));
        return true;
    }

    public Requisito[] getRequisitos() {
        return requisitos.toArray(new Requisito[0]);
    }

    public boolean eliminarRequisito(int orden) {
        return requisitos.removeIf(r -> r.getOrden() == orden);
    }
}
