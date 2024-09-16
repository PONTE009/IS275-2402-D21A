package upc.fp2.ventas.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import upc.fp2.ventas.entity.PersonaEntity;
import upc.fp2.ventas.service.PersonaService;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/persona")
public class PersonaController {

    @Autowired
    PersonaService personaService;

    @GetMapping("listar")
    public List<PersonaEntity> Listar(){
        return personaService.Listar();
    }

    @GetMapping("BuscarPorId/{id}")
    public Optional<PersonaEntity> BuscarPorId(@PathVariable("id") Long personaId){
        return personaService.BuscarPorId(personaId);
    }

    @GetMapping("insertar")
    public Optional<PersonaEntity> Insertar(){

        LocalDateTime fechasActual = LocalDateTime.now();

        PersonaEntity objPersona = new PersonaEntity();
        objPersona.setPrimerNombre("Williams");
        objPersona.setSegundoNombre("Sandro");
        objPersona.setApellidoPaterno("Ponte");
        objPersona.setApellidoMaterno("Ramirez");
        objPersona.setCorreo("pciswpon@upc.edu.pe");
        objPersona.setActivo(true);
        objPersona.setFechaRegistro(fechasActual);

        return personaService.Insertar(objPersona);
    }
    @GetMapping("Eliminar/{id}")
    public boolean Eliminar(@PathVariable("id") Long personaId){
        return personaService.Eliminar(personaId);
    }

}
