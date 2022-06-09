import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner rarityScanner = new Scanner(System.in);

        // creating instance of Nanobot class
        Nanobot nanobot = new Nanobot("Nano Bot", "Omega rare", "After party scene wallets", 9001, true);
        System.out.println(nanobot.getName());

        // setting a new name for your Nanobot
        nanobot.newName();

        Nanobot nanotbot2 = new Nanobot("Nano straight", "Omega rare", "After party scene wallets", 9001, true);

        // creating instance of a Card class
        Card card = new Card();

        // creating a hashmap of card rarity
        HashMap<Integer, String> cardRarity = new HashMap<Integer, String>();
        cardRarity.put(0, "Common");
        cardRarity.put(1, "Rare");
        cardRarity.put(2, "Mythic");
        cardRarity.put(3, "Ultra");

        // call setRarity function to give the card a random number and print the random number
        card.setRarity(card.randomNum);
        System.out.println(card.getRarity());

        // ask user if they want to reveal the rarity of their card
        System.out.println("Would you like to reveal your card? (Y/N): ");
        String showRarity = rarityScanner.nextLine();

        if (showRarity == "Y" | showRarity == "y") {
            // exception handling
            try {
                // Tell the user what rarity of card they got based on the random number
                if (card.getRarity() == 0) {
                    System.out.println("Your Nano Bot, " + nanobot.getName() + ", has printed a " + cardRarity.get(0) + " card!");
                } else if (card.getRarity() == 1) {
                    System.out.println("Your Nano Bot, " + nanobot.getName() + ", has printed a " + cardRarity.get(1) + " card!");
                } else if (card.getRarity() == 2) {
                    System.out.println("Your Nano Bot, " + nanobot.getName() + ", has printed a " + cardRarity.get(2) + " card!");
                } else {
                    System.out.println("Your Nano Bot, " + nanobot.getName() + ", has printed a " + cardRarity.get(3) + " card!");
                }
            } catch (Exception e) {
                System.out.println("Something went wrong");
            }
        }
        else if (showRarity == "N" | showRarity == "n") {
            System.out.println("Suit yourself...");
        }
        else {
            System.out.println("That's not a valid input, dum dum >:(");
        }

    }
}
