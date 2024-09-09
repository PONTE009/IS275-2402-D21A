package upc.fp2.ventas.entity;

import java.time.LocalDateTime;

public class Cliente extends Persona{
    private Long clienteId;
    private String direccion;

    public Long getClienteId() {
        return clienteId;
    }

    public void setClienteId(Long clienteId) {
        this.clienteId = clienteId;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

}
