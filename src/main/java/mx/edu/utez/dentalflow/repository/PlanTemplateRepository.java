package mx.edu.utez.dentalflow.repository;

import mx.edu.utez.dentalflow.model.plantemplate.PlanTemplate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlanTemplateRepository extends JpaRepository<PlanTemplate, Integer> {
}
