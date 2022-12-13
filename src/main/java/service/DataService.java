package service;

import entity.Bedrijf;

import java.util.List;

public class DataService {

    public static void getData(){
        BedrijfService bedrijfService = new BedrijfService();
        List<Bedrijf> bedrijven =bedrijfService.getBedrijven();

        System.out.println(
                "+------------------+------------------------+"
        );

        bedrijven.forEach( bedrijf ->
                System.out.format( "| Bedrijf Naam         : " + bedrijf.getBedrijf_naam() +"\n"+ "| Bedrijf Email adress : "+ bedrijf.getEmail_adress() + "\n\n"
                ));
        System.out.println("+------------------+------------------------+");

    }

}
