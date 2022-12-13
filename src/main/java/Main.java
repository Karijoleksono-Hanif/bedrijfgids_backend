import service.DataService;
import service.DummyDataService;

public class Main {
    /*
        public static void main2(String[] args) {

 BedrijfService bedrijfService = new BedrijfService();
        Bedrijf bedrijf1 = new Bedrijf();

        bedrijf1.setBedrijf_naam("HSDSupdate");
        bedrijfService.updateBedrijf(bedrijf1);
        //gebruikerService.updateGebruiker(createGebruiker);
        //gebruikerService.deleteGebruiker(createGebruiker);

        }
    }
     */


    //createGebruiker.setVoornaam("fic");
    //gebruikerService.updateGebruiker(createGebruiker);
    //gebruikerService.deleteGebruiker(createGebruiker);

    public static void main(String[] args) throws InterruptedException {

        DummyDataService.createDummyData();
        //Applicatie.App();
        //DataService.getData();
        //DataService.deleteBedrijf();
    }
}