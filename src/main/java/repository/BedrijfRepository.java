package repository;

import entity.Bedrijf;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

import java.util.List;

public class BedrijfRepository {

    private EntityManager entityManager;

    public  BedrijfRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public Bedrijf createBedrijf(Bedrijf bedrijf) {
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(bedrijf);
            entityManager.getTransaction().commit(); // als dit niet wordt gezet bij hibernate gaat hij de object niet opslaan
        } catch (Exception e) {
            e.printStackTrace();
            entityManager.getTransaction().rollback();
        }
        return bedrijf;
    }

    public List<Bedrijf> getBedrijven() {
        String query = "select g from Bedrijf g";
        TypedQuery<Bedrijf> typedQuery = entityManager.createQuery(query, Bedrijf.class);
        List<Bedrijf> bedrijven = typedQuery.getResultList();
        return bedrijven;
    }

    public Bedrijf updateBedrijf(Bedrijf bedrijf) {
        try {
            entityManager.getTransaction().begin();
            entityManager.find(Bedrijf.class, bedrijf.getId(1L));
            entityManager.merge(bedrijf);
            entityManager.getTransaction().commit();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return bedrijf;
    }

}


