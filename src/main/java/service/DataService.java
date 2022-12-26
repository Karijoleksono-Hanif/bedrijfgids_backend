package service;

import entity.Bedrijf;

import java.util.List;

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
                                   "| Bedrijf Email adress : "+ bedrijf.getEmail_adress() + "\n\n"
                ));
        System.out.println("+------------------+------------------------+");

    }

    public static void deleteBedrijf(){
        BedrijfService  bedrijfService = new BedrijfService();
        Bedrijf bedrijf = new Bedrijf();
        bedrijf.setId(1L);
        bedrijfService.deleteBedrijf(bedrijf);
    }

}
