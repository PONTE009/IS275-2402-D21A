package upc.fp2.ventas.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Table(name = "tbl_persona")
@Entity(name = "PersonaEntity")
public class PersonaEntity {

    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "sec_persona_id"
    )
    @SequenceGenerator(
            sequenceName = "sec_persona_id",
            initialValue = 1,
            allocationSize = 1,
            name = "sec_persona_id"
    )
    @Column(name = "persona_id")
    private Long personaId;

    @Column(name = "primero_nombre")
    private String primerNombre;

    @Column(name = "segundo_nombre")
    private String segundoNombre;

    @Column(name = "apellido_paterno")
    private String apellidoPaterno;

    @Column(name = "apellido_materno")
    private String apellidoMaterno;

    @Column(name = "correo")
    private String correo;

    @Column(name = "activo")
    private Boolean activo;

    @Column(name = "fecha_registro")
    private LocalDateTime fechaRegistro;


    public PersonaEntity(){};

    public PersonaEntity(Long personaId, String primerNombre, String segundoNombre, String apellidoPaterno, String apellidoMaterno, String correo, Boolean activo, LocalDateTime fechaRegistro) {
        this.personaId = personaId;
        this.primerNombre = primerNombre;
        this.segundoNombre = segundoNombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.correo = correo;
        this.activo = activo;
        this.fechaRegistro = fechaRegistro;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public LocalDateTime getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(LocalDateTime fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public Long getPersonaId() {
        return personaId;
    }

    public void setPersonaId(Long personaId) {
        this.personaId = personaId;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getSegundoNombre() {
        return segundoNombre;
    }

    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

}
