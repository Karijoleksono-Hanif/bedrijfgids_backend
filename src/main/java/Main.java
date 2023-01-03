import applicatie.Applicatie;
import entity.Bedrijf;
import entity.MediaFiles;
import service.DataService;
import service.DummyDataService;
import service.MediaFilesService;

import javax.xml.crypto.Data;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws InterruptedException, IOException {
//        DummyDataService.createDummyData();
//        Applicatie.Menu();
//        DataService.deleteBedrijf();
//        DataService.deleteMediaFiles();
        DataService.deleteFilialan();

    }
}