package applicatie;

import service.DataService;
import service.DummyDataService;

import java.util.Scanner;


public class Applicatie {
    public static void close() throws InterruptedException {
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
        Thread.sleep(100);
        System.out.println("Applicatie afgesloten..................\n");
        System.exit(0);
    }

    public static void keuze() {
        System.out.println("\nVoer uw menu keuze in: ");
    }

    public static void Menu() throws InterruptedException {
        Scanner input = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n\n\n\n\n\nMENU bedrijven gids");
            System.out.println("------------------------------------");
            System.out.print("1       Dummy Data toevoegen in de app \n");
            System.out.print("2       Data read operation\n");
            System.out.print("3       Data update operation\n");
            System.out.print("4       Data delete operation\n");
            System.out.print("5       Design Patterns Chain of responsibility\n");
            System.out.print("6       Design Patterns Composite\n");
            System.out.print("7       Design Patterns Factory\n");
            System.out.print("8  [X]  AFSLUITEN\n");
            keuze();
            choice = input.nextInt();
        }
        while (choice > 8);
        switch (choice) {

            case 1:
                subMenu();
            case 2:
                subMenu2();
            case 3:
                System.out.println("Data update operation succesful !!!");
            case 4:
                System.out.println("Data delete operation succesful !!!");
            case 5:
                System.out.println("Design Patterns Chain of responsibilit succesful !!!");
                break;
            case 6:
                System.out.println("Design Patterns Composite succesful !!!");
                break;
            case 7:
                System.out.println("Design Patterns Factory succesful !!!");
                break;
            case 8: // AFSLUITEN
                close();
                break;
        }
        // BAD MENU OPTION DIRECT
        if (choice > 8 || choice < 1) {
            do {
                choice = input.nextInt();
            }
            while (choice < 8);
        }
        input.close();
    }


    public static void subMenu() throws InterruptedException {
        DummyDataService.createDummyData();
        System.out.println("Dummy Data created succesful !!!");
        int choice1;
        Scanner input = null;
        do {
            System.out.print("1  [<]  TERUG NAAR MENU\n");
            System.out.print("2  [X]  AFSLUITEN\n");
            keuze();
            choice1 = input.nextInt();
        }
        while (choice1 > 2);
        switch (choice1) {
            case 1:
                Menu();
            case 2:
                close();
                if (choice1 > 2 || choice1 < 1) {
                    do {
                        choice1 = input.nextInt();
                    }
                    while (choice1 < 2);
                }
        }
    }

    public static void subMenu2() throws InterruptedException {
        System.out.println("Data Read operation succesful !!!");
        DataService.readData();
        int choice2;
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("1  [<]  TERUG NAAR MENU\n");
            System.out.print("2  [X]  AFSLUITEN\n");
            keuze();
            choice2 = input.nextInt();
        }
        while (choice2 > 2);
        switch (choice2) {
            case 1:
                Menu();
            case 2:
                close();

                if (choice2 > 2 || choice2 < 1) {
                    do {
                        choice2 = input.nextInt();
                    }
                    while (choice2 < 2);
                }
        }
    }
}