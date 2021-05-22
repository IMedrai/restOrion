package ma.orion.rest.model;

import javax.persistence.*;


@Entity
@Table(name = "absences")
public class Absence {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "typesAbsences", unique = true, nullable = false)
    private String typesAbsences;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTypesAbsences() {
        return typesAbsences;
    }

    public void setTypesAbsences(String typesAbsences) {
        this.typesAbsences = typesAbsences;
    }
}

