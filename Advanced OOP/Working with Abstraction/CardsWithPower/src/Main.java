import java.util.Scanner;

public class Main {


      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cards = sc.nextLine();
        String suit = sc.nextLine();
        Card card=new Card(CardSuits.valueOf(suit),CardRanks.valueOf(cards));
          System.out.printf("Card name: %s of %s; Card power: %d%n", cards, suit, card.getPowerOfCard());

    }

}
