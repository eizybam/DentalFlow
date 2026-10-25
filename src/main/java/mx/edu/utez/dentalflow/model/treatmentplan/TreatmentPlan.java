package mx.edu.utez.dentalflow.model.treatmentplan;

import com.fasterxml.jackson.annotation.JsonIgnore;
import mx.edu.utez.dentalflow.model.patient.Patient;
import mx.edu.utez.dentalflow.model.planstage.PlanStage;
import mx.edu.utez.dentalflow.model.plantemplate.PlanTemplate;
import mx.edu.utez.dentalflow.model.tooth.Tooth;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "treatment_plans")
public class TreatmentPlan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "template_id", nullable = false)
    private PlanTemplate template;

    @ManyToOne
    @JoinColumn(name = "patient_id", nullable = false)
    private Patient patient;

    @ManyToOne
    @JoinColumn(name = "tooth_id", nullable = false)
    private Tooth tooth;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private PlanStatus status;

    @Column(nullable = false)
    private LocalDateTime openedAt;

    private LocalDateTime completedAt;

    private LocalDateTime cancelledAt;

    private String cancelReason;

    @JsonIgnore
    @OneToMany(mappedBy = "plan")
    private List<PlanStage> stages;
}
