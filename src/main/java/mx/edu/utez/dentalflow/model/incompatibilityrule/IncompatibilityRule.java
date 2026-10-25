package mx.edu.utez.dentalflow.model.incompatibilityrule;

import mx.edu.utez.dentalflow.model.plantemplate.PlanTemplate;
import mx.edu.utez.dentalflow.model.treatment.Treatment;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "incompatibility_rules")
public class IncompatibilityRule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Enumerated(EnumType.STRING)
    @Column(name = "item_a_type", nullable = false)
    private ItemType itemAType;

    @ManyToOne
    @JoinColumn(name = "template_a_id")
    private PlanTemplate templateA;

    @ManyToOne
    @JoinColumn(name = "treatment_a_id")
    private Treatment treatmentA;

    @Enumerated(EnumType.STRING)
    @Column(name = "item_b_type", nullable = false)
    private ItemType itemBType;

    @ManyToOne
    @JoinColumn(name = "template_b_id")
    private PlanTemplate templateB;

    @ManyToOne
    @JoinColumn(name = "treatment_b_id")
    private Treatment treatmentB;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private RuleCondition ruleCondition;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private RuleScope scope;

    private String description;

    @CreationTimestamp
    @Column(nullable = false, updatable = false)
    private LocalDateTime createdAt;
}
