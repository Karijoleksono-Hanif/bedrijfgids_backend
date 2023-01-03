package repository;

import entity.Bedrijf;
import entity.Filialen;
import jakarta.persistence.EntityManager;

public class FilialenRepository {

    private EntityManager entityManager;

    public  FilialenRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public Filialen createFilialen(Filialen filialen) {
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(filialen);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            entityManager.getTransaction().rollback();
        }
        return filialen;
    }

    public Filialen deleteFiliaal(Filialen filialen) {
        try {
            entityManager.getTransaction().begin();
            Filialen f = entityManager.find(Filialen.class, filialen.getId());
            if (filialen != null) entityManager.remove(f);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            entityManager.getTransaction().rollback();
        }
        return filialen;
    }
}



