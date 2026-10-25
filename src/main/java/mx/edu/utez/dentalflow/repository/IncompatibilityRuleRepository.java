package mx.edu.utez.dentalflow.repository;

import mx.edu.utez.dentalflow.model.incompatibilityrule.IncompatibilityRule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IncompatibilityRuleRepository extends JpaRepository<IncompatibilityRule, Integer> {
}
