package mx.edu.utez.dentalflow.repository;

import mx.edu.utez.dentalflow.model.templatestage.TemplateStage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TemplateStageRepository extends JpaRepository<TemplateStage, Integer> {
    List<TemplateStage> findByTemplateIdOrderByStageOrder(Integer templateId);
}
