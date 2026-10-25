package mx.edu.utez.dentalflow.repository;

import mx.edu.utez.dentalflow.model.tooth.Tooth;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ToothRepository extends JpaRepository<Tooth, Integer> {
    Optional<Tooth> findByFdiNumber(Byte fdiNumber);
}
