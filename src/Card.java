import java.util.Random;

public class Card {

    Random rarity = new Random();
    int randomNum = rarity.nextInt(4);

    Card() {

    }

    public int getRarity() {
        return randomNum;
    }

    public void setRarity(int randomNum) {
        this.randomNum = randomNum;
    }

}