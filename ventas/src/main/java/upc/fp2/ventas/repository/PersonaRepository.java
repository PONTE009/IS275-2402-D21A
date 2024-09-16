package upc.fp2.ventas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import upc.fp2.ventas.entity.PersonaEntity;

@Repository
public interface PersonaRepository extends JpaRepository<PersonaEntity,Long> {

}
