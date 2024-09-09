package upc.fp2.ventas.entity;

import java.time.LocalDateTime;

public class Vendedor extends Persona{
    private Long vendedorId;
    private String usuario;
    private String clave;

    public Vendedor(){};

    public Vendedor(Long vendedorId, String clave, String usuario, Long personaId, String primerNombre, String segundoNombre,
                    String apellidoPaterno, String apellidoMaterno, String correo, Boolean activo, LocalDateTime fechaRegistro) {

        super(personaId, primerNombre, segundoNombre, apellidoPaterno, apellidoMaterno, correo, activo, fechaRegistro);

        this.vendedorId = vendedorId;
        this.clave = clave;
        this.usuario = usuario;
    }

    public Long getVendedorId() {
        return vendedorId;
    }

    public void setVendedorId(Long vendedorId) {
        this.vendedorId = vendedorId;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
}
