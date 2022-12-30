package service;

import configuration.JPAConfiguration;
import entity.MediaFiles;
import repository.MediaFilesRepository;

public class MediaFilesService {
    private MediaFilesRepository mediaFilesRepository;

    public MediaFilesService() {this.mediaFilesRepository = new MediaFilesRepository(JPAConfiguration.getEntityManager());
    }
    public MediaFiles createMediaFiles(MediaFiles mediaFiles){return mediaFilesRepository.createMediaFiles(mediaFiles);
    }
    public MediaFiles deleteMediaFiles(MediaFiles mediaFiles) {return mediaFilesRepository.deleteMediaFiles(mediaFiles);}
}
