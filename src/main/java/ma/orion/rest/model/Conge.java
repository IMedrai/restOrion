package ma.orion.rest.model;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "conge")
public class Conge {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private Long id;

    @Column(name = "dateDebut")
    private String dateDebut;

    @Column(name = "dateFin")
    private String dateFin;

    @Column(name = "typeAbsence", unique = true, nullable = false)
    private String typeAbsence;

    @Column(name = "commentaire", unique = true, nullable = false)
    private String commentaire;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(String dateDebut) {
        this.dateDebut = dateDebut;
    }

    public String getDateFin() {
        return dateFin;
    }

    public void setDateFin(String dateFin) {
        this.dateFin = dateFin;
    }

    public String getTypeAbsence() {
        return typeAbsence;
    }

    public void setTypeAbsence(String typeAbsence) {
        this.typeAbsence = typeAbsence;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }
}
