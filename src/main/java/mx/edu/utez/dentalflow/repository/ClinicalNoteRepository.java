package mx.edu.utez.dentalflow.repository;

import mx.edu.utez.dentalflow.model.clinicalnote.ClinicalNote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClinicalNoteRepository extends JpaRepository<ClinicalNote, Long> {
    List<ClinicalNote> findByAppointmentId(Long appointmentId);
}
