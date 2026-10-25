package mx.edu.utez.dentalflow.repository;

import mx.edu.utez.dentalflow.model.treatment.Treatment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TreatmentRepository extends JpaRepository<Treatment, Integer> {
}
