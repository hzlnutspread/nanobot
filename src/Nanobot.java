import java.util.Scanner;

public class Nanobot {

    Scanner scanner = new Scanner(System.in);

    private String name;
    private String cardDestination;
    private int speed;
    private boolean printed = true;

    Nanobot(String name, String rarity, String destination, int speed, boolean printed) {
        this.setName(name);
        this.setCardDestination(cardDestination);
        this.setSpeed(speed);
        this.setPrinted(printed);
    }


    public String getName() {
        return name;
    }

    public String getCardDestination() {
        return cardDestination;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isPrinted() {
        return printed;
    }


    private void setName(String name) {
        this.name = name;
    }

    public void setCardDestination(String cardDestination) {
        this.cardDestination = cardDestination;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setPrinted(boolean printed) {
        this.printed = printed;
    }


    public void newName(Scanner scanner) {
        System.out.println("Please name your Nano Bot: ");
        String newName = scanner.nextLine();
        System.out.println("You have named your Nano Bot: " + newName);
        setName(newName);
    }

    public String revealCard(Scanner scanner) {
        System.out.println("Would you like to reveal your card? (Y/N): ");
        return scanner.nextLine();
    }

    public void createCard() {
        System.out.println("Nanobot creates a card. I wonder what rarity it has...");
    }

    public void speak() {
        System.out.println("beep boop");
    }

}