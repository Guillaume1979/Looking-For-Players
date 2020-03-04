package co.simplon.lfpapi.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.Set;

@Entity
public class Session {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "session_id_seq")
    @SequenceGenerator(name = "session_id_seq", sequenceName = "session_id_seq", allocationSize = 1)
    private Long id;

    @NotNull
    @NotBlank
    @Column(nullable = false)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date dateOfGamingSession;



    //Relation bidirectionnelle
    @ManyToOne
    private Game game;

    //Relation bidirectionnelle
    @ManyToMany(mappedBy = "sessions")
    private Set<Player> players;

    @NotNull
    @Column
    private Integer rating;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDateOfGamingSession() {
        return dateOfGamingSession;
    }

    public void setDateOfGamingSession(Date dateOfGamingSession) {
        this.dateOfGamingSession = dateOfGamingSession;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }
}
