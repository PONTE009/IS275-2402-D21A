package upc.fp2.ventas.service;

import jakarta.transaction.Transactional;
import upc.fp2.ventas.entity.PersonaEntity;

import java.util.List;
import java.util.Optional;

public class PersonaServiceImpl2 implements PersonaService{
    @Override
    public List<PersonaEntity> Listar() {
        return List.of();
    }

    @Override
    public Optional<PersonaEntity> BuscarPorId(Long id) {
        return Optional.empty();
    }

    @Transactional
    @Override
    public Optional<PersonaEntity> Insertar(PersonaEntity personaEntity) {
        return Optional.empty();
    }

    @Override
    public boolean Eliminar(Long persona_id) {
        return false;
    }
}
