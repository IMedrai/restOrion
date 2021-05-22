package ma.orion.rest.model;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "imputation")
public class Imputation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;



    @Column(name = "mission")
    private String mission;


    @Column(name = "date")
    private String date;

    @Column(name = "heuresSupplementaires")
    private String heuresSupplementaires;


    @Column(name = "heuresStatutaires")
    private String heuresStatutaires;

    @Column(name = "type")
    private String type;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMission() {
        return mission;
    }

    public void setMission(String mission) {
        this.mission = mission;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getHeuresSupplementaires() {
        return heuresSupplementaires;
    }

    public void setHeuresSupplementaires(String heuresSupplementaires) {
        this.heuresSupplementaires = heuresSupplementaires;
    }

    public String getHeuresStatutaires() {
        return heuresStatutaires;
    }

    public void setHeuresStatutaires(String heuresStatutaires) {
        this.heuresStatutaires = heuresStatutaires;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}