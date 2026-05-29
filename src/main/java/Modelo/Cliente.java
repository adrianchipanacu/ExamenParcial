package Modelo;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author adrian_pc
 */
public class Cliente {

    private String RUC;
    private String razonSocial;
    private String email;
    private String contacto;
    private String telefono;
    private String clave;
    private List<Oferta> ofertas;

    public Cliente(String RUC, String razonSocial, String email, String contacto, String telefono, String clave) {
        this.RUC = RUC;
        this.razonSocial = razonSocial;
        this.email = email;
        this.contacto = contacto;
        this.telefono = telefono;
        this.clave = clave;
        this.ofertas = new ArrayList<>();
    }

    public String getRUC() { return RUC; }
    public String getRazonSocial() { return razonSocial; }
    public String getEmail() { return email; }
    public String getContacto() { return contacto; }
    public String getTelefono() { return telefono; }

    public boolean agregarOferta(Oferta oferta) {
        return ofertas.add(oferta);
    }

    public boolean eliminarOferta(Oferta oferta) {
        return ofertas.remove(oferta);
    }

    public Oferta[] getOfertas() {
        return ofertas.toArray(new Oferta[0]);
    }
}
