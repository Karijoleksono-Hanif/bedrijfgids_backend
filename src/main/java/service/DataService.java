package service;

import entity.Bedrijf;
import entity.Entiteit;
import entity.Filialen;
import entity.MediaFiles;

import javax.swing.text.html.parser.Entity;
import java.util.List;

import static configuration.JPAConfiguration.entityManager;

public class DataService {

    public static void readData(){
        BedrijfService bedrijfService = new BedrijfService();
        List<Bedrijf> bedrijven =bedrijfService.readBedrijven();


        System.out.println(
                "+------------------+------------------------+"
        );

        bedrijven.forEach( bedrijf ->
                System.out.format( "| Bedrijf ID           : " + bedrijf.getId() +"\n" +
                                   "| Bedrijf Naam         : " + bedrijf.getBedrijf_naam() +"\n" +
                                   "| Bedrijf Email adress : " + bedrijf.getEmail_adress() + "\n\n" +
                                   "| Bedrijf Email adress : " + bedrijf.getIndustries() + "\n\n"
                ));
        System.out.println("+------------------+------------------------+");

    }

    public static void updateBedrijf(){
        BedrijfService  bedrijfService = new BedrijfService();
        Bedrijf bedrijf = new Bedrijf();
        bedrijf.setId(1L);
        bedrijf.setBedrijf_naam("HANIF");
        bedrijf.setEmail_adress("HANIF@hanif.com");
        bedrijfService.updateBedrijf(bedrijf);
    }

    public static void deleteBedrijf(){
        BedrijfService  bedrijfService = new BedrijfService();
        Bedrijf bedrijf = new Bedrijf();
        bedrijf.setId(1L);
        bedrijfService.deleteBedrijf(bedrijf);
    }
    public static void deleteMediaFiles(){
        MediaFilesService mediaFilesService = new MediaFilesService();
        MediaFiles m = new MediaFiles();
        m.setId(1L);
        mediaFilesService.deleteMediaFiles(m);
    }

    public static void deleteFilialan(){
        FilialenService filialenService = new FilialenService();
        Filialen f = new Filialen();
        f.setId(1L);
        filialenService.deleteFiliaal(f);
    }


}
