package mx.edu.utez.dentalflow.repository;

import mx.edu.utez.dentalflow.model.dentistschedule.DentistSchedule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DentistScheduleRepository extends JpaRepository<DentistSchedule, Integer> {
    List<DentistSchedule> findByDentistId(Integer dentistId);
}
