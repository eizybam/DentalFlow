package mx.edu.utez.dentalflow.repository;

import mx.edu.utez.dentalflow.model.office.Office;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OfficeRepository extends JpaRepository<Office, Integer> {
}
