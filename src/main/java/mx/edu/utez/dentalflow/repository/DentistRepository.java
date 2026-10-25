package mx.edu.utez.dentalflow.repository;

import mx.edu.utez.dentalflow.model.dentist.Dentist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DentistRepository extends JpaRepository<Dentist, Integer> {
    List<Dentist> findByActiveTrue();
}
