package mx.edu.utez.dentalflow.repository;

import mx.edu.utez.dentalflow.model.planstage.PlanStage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlanStageRepository extends JpaRepository<PlanStage, Long> {
    List<PlanStage> findByPlanIdOrderByStageOrder(Long planId);
}
