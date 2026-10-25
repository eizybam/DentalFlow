package mx.edu.utez.dentalflow.repository;

import mx.edu.utez.dentalflow.model.patientalert.PatientAlert;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PatientAlertRepository extends JpaRepository<PatientAlert, Long> {
    List<PatientAlert> findByPatientId(Long patientId);
}
