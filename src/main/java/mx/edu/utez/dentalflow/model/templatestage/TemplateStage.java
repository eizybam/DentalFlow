package mx.edu.utez.dentalflow.model.templatestage;

import mx.edu.utez.dentalflow.model.plantemplate.PlanTemplate;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "template_stages")
public class TemplateStage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "template_id", nullable = false)
    private PlanTemplate template;

    @Column(nullable = false)
    private Byte stageOrder;

    @Column(nullable = false, length = 100)
    private String name;

    @Column(nullable = false)
    private Short estimatedMinutes;

    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal price;
}
