package upc.fp2.ventas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import upc.fp2.ventas.entity.PersonaEntity;
import upc.fp2.ventas.repository.PersonaRepository;

import java.util.List;
import java.util.Optional;

@Service
public class PersonaServiceImpl implements PersonaService{

    @Autowired
    PersonaRepository personaRepository;

    @Override
    public List<PersonaEntity> Listar() {
        List<PersonaEntity> listaPersonas = personaRepository.findAll();
        return listaPersonas;
    }

    @Override
    public Optional<PersonaEntity> BuscarPorId(Long id) {
        Optional<PersonaEntity> objPersona = personaRepository.findById(id);
        return objPersona;
    }

    @Override
    public Optional<PersonaEntity> Insertar(PersonaEntity personaEntity) {
        Optional<PersonaEntity> objPersona = Optional.of(personaRepository.save(personaEntity));
        return objPersona;
    }

    @Override
    public boolean Eliminar(Long persona_id) {
        personaRepository.deleteById(persona_id);
        return true;
    }
}
