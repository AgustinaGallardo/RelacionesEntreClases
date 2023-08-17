import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        DeckService service = new DeckService();

        service.welcomeGame();
        service.shuffle();
        Scanner sc = new Scanner(System.in);
        boolean exit = false;
        int menuOption;
        String option;


        while (!exit) {
            System.out.println("1.Give a cards");
            System.out.println("2.See cards out");
            System.out.println("3.See all deck ");
            System.out.println("4. Exit.");

            System.out.println("Enter the option you want to do.");
            menuOption = sc.nextInt();
            sc.nextLine();

            switch (menuOption) {
                case 1:
                    service.giveCards();
                    break;
                case 2:
                    service.cardsHeap();
                    break;
                case 3:
                    service.showDeck();
                    break;
                case 4:
                    System.out.println("Exiting the menu...");
                    exit = true;
                    break;

                default:
                    System.out.println("Error. You must choose a valid option.");
                    System.out.println("");

            }
        }
    }
}


