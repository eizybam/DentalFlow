package mx.edu.utez.dentalflow.repository;

import mx.edu.utez.dentalflow.model.appliedtreatment.AppliedTreatment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AppliedTreatmentRepository extends JpaRepository<AppliedTreatment, Long> {
    List<AppliedTreatment> findByAppointmentId(Long appointmentId);
}
