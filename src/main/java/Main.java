import applicatie.Applicatie;
import service.DataService;
import service.DummyDataService;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws InterruptedException, IOException {
        //DummyDataService.createDummyData();
        Applicatie.Menu();
        //DataService.deleteBedrijf();
    }
}