package Modelo;
import java.util.Date;
/**
 *
 * @author adrian_pc
 */
public class Postulacion {

    private Date fecha;
    private boolean anulado;
    private Date fechaAnulacion;

    public Postulacion(Date fecha, boolean anulado, Date fechaAnulacion) {
        this.fecha = fecha;
        this.anulado = anulado;
        this.fechaAnulacion = fechaAnulacion;
    }

    public Date getFecha() { return fecha; }
    public boolean isAnulado() { return anulado; }
    public Date getFechaAnulacion() { return fechaAnulacion; }

    public void anular() {
        this.anulado = true;
        this.fechaAnulacion = new Date();
    }
}
