package mx.edu.utez.dentalflow.repository;

import mx.edu.utez.dentalflow.model.appointment.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
    List<Appointment> findByDentistId(Integer dentistId);
    List<Appointment> findByPatientId(Long patientId);
}
