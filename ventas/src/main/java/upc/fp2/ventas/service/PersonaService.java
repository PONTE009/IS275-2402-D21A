package upc.fp2.ventas.service;

import upc.fp2.ventas.entity.PersonaEntity;

import java.util.List;
import java.util.Optional;

public interface PersonaService {

    public List<PersonaEntity> Listar();
    public Optional<PersonaEntity> BuscarPorId(Long id);
    public Optional<PersonaEntity> Insertar(PersonaEntity personaEntity);
    public boolean Eliminar(Long persona_id);

}
