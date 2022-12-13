package applicatie;

import service.DummyDataService;

import java.util.Scanner;


public class Applicatie {

    public static void App() throws InterruptedException {
        Scanner input = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n\n\n\n\n\nMENU");
            System.out.println("---------------------------");
            System.out.print("1       Data toevoegen in de app \n");
            System.out.print("2       Data update\n");
            System.out.print("3       Data verwijderen\n");
            System.out.print("4  [X]  AFSLUITEN\n");
            keuze();
            choice = input.nextInt();
        }
        while (choice > 4);
        switch (choice) {
            case 1:
                DummyDataService.createDummyData();
            case 2:
                System.out.println("updaten");
                break;
            case 3:
                System.out.println("verwijderen");
                break;
            case 4: // AFSLUITEN
                close();
                break;
        }
        // BAD MENU OPTION DIRECT
        if (choice > 4 || choice < 1) {
            do {
                choice = input.nextInt();
            }
            while (choice < 4);
        }
    }

    private static void close() throws InterruptedException {
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
        Thread.sleep(100);
        System.out.println("Applicatie afgesloten..................\n");
        System.exit(0);
    }

    private static void keuze() {
        System.out.println("\nVoer uw menu keuze in: ");
    }
}
