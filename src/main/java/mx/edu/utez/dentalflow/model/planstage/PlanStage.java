package mx.edu.utez.dentalflow.model.planstage;

import mx.edu.utez.dentalflow.model.templatestage.TemplateStage;
import mx.edu.utez.dentalflow.model.treatmentplan.TreatmentPlan;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "plan_stages")
public class PlanStage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "plan_id", nullable = false)
    private TreatmentPlan plan;

    @ManyToOne
    @JoinColumn(name = "template_stage_id", nullable = false)
    private TemplateStage templateStage;

    @Column(nullable = false)
    private Byte stageOrder;

    @Column(nullable = false, length = 100)
    private String name;

    @Column(nullable = false)
    private Short estimatedMinutes;

    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal price;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private StageStatus status;

    private LocalDateTime documentedAt;
}
