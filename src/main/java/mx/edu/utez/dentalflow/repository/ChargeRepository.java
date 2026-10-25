package mx.edu.utez.dentalflow.repository;

import mx.edu.utez.dentalflow.model.charge.Charge;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ChargeRepository extends JpaRepository<Charge, Long> {
    Optional<Charge> findByAppointmentId(Long appointmentId);
}
