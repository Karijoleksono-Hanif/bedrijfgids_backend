package entity;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
public class Bedrijf {

    //__Entity mapping - Columns in SQL - Builder Design patern
    @Id
    @GeneratedValue
    private Long id;
    private String bedrijf_naam;
    private String email_adress;

    @OneToOne
    private MediaFiles mediaFiles;

    @ManyToOne
    private Entiteit entiteit;

    @ManyToMany(mappedBy = "bedrijfs")
    protected Set<Industrie> industries = new HashSet<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBedrijf_naam() {
        return bedrijf_naam;
    }

    public void setBedrijf_naam(String bedrijf_naam) {
        this.bedrijf_naam = bedrijf_naam;
    }

    public String getEmail_adress() {
        return email_adress;
    }

    public void setEmail_adress(String email_adress) {
        this.email_adress = email_adress;
    }

    public MediaFiles getMediaFiles() {
        return mediaFiles;
    }

    public void setMediaFiles(MediaFiles mediaFiles) {
        this.mediaFiles = mediaFiles;
    }

    public Entiteit getEntiteit() {
        return entiteit;
    }

    public void setEntiteit(Entiteit entiteit) {
        this.entiteit = entiteit;
    }

    public Set<Industrie> getIndustries() {
        return industries;
    }

    public void setIndustries(Set<Industrie> industries) {
        this.industries = industries;
    }
}
