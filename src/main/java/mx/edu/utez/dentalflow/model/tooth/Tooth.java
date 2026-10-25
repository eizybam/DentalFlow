package mx.edu.utez.dentalflow.model.tooth;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "teeth")
public class Tooth {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, unique = true)
    private Byte fdiNumber;

    @Column(nullable = false, length = 60)
    private String name;

    @Column(nullable = false)
    private Byte quadrant;

    @Column(name = "is_deciduous")
    private boolean deciduous;
}
