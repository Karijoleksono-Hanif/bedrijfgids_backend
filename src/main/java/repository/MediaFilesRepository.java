package repository;

import entity.MediaFiles;
import jakarta.persistence.EntityManager;

public class MediaFilesRepository {
    private EntityManager entityManager;

    public  MediaFilesRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public MediaFiles createMediaFiles(MediaFiles mediaFiles) {
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(mediaFiles);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            entityManager.getTransaction().rollback();
        }
        return mediaFiles;
    }
}
