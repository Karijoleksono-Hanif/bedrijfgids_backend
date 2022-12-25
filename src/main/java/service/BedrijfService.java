package service;


import configuration.JPAConfiguration;
import entity.Bedrijf;
import repository.BedrijfRepository;

import java.util.List;



public class BedrijfService {

    private final BedrijfRepository repository;

    public BedrijfService() {
        this.repository = new BedrijfRepository(JPAConfiguration.getEntityManager());
    }

    public List<Bedrijf> getBedrijven() {
        return repository.getBedrijven();
    }

    public Bedrijf createBedrijf(Bedrijf bedrijf) {
        return repository.createBedrijf(bedrijf);
    }

    public Bedrijf updateBedrijf(Bedrijf bedrijf) {
        return repository.updateBedrijf(bedrijf);
    }
    public Bedrijf deleteBedrijf(Bedrijf bedrijf) {return repository.deleteBedrijf(bedrijf);}
}
