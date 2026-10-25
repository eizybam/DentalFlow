package mx.edu.utez.dentalflow.repository;

import mx.edu.utez.dentalflow.model.treatmentplan.TreatmentPlan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TreatmentPlanRepository extends JpaRepository<TreatmentPlan, Long> {
    List<TreatmentPlan> findByPatientId(Long patientId);
    List<TreatmentPlan> findByPatientIdAndToothId(Long patientId, Integer toothId);
}
