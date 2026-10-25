package mx.edu.utez.dentalflow.model.appliedtreatment;

import mx.edu.utez.dentalflow.model.appointment.Appointment;
import mx.edu.utez.dentalflow.model.tooth.Tooth;
import mx.edu.utez.dentalflow.model.treatment.Treatment;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "applied_treatments")
public class AppliedTreatment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "appointment_id", nullable = false)
    private Appointment appointment;

    @ManyToOne
    @JoinColumn(name = "treatment_id", nullable = false)
    private Treatment treatment;

    @ManyToOne
    @JoinColumn(name = "tooth_id")
    private Tooth tooth;

    @Column(columnDefinition = "TEXT")
    private String notes;

    @Column(nullable = false)
    private LocalDateTime appliedAt;
}
