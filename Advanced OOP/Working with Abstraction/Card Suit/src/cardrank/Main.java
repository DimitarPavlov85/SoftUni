package cardrank;

public class Main {
    enum Cards {

        ACE(0),
        TWO(1),
        THREE(2),
        FOUR(3),
        FIVE(4),
        SIX(5),
        SEVEN(6),
        EIGHT(7),
        NINE(8),
        TEN(9),
        JACK(10),
        QUEEN(11),
        KING(12);

        int index;
        Cards(int index){
            this.index=index;
        }
    }
    public static void main(String[] args) {
        System.out.println("Card Ranks:");
        System.out.println("Ordinal value: " +Cards.ACE.index+"; Name value: " +Cards.ACE);
        System.out.println("Ordinal value: " +Cards.TWO.index+"; Name value: " +Cards.TWO);
        System.out.println("Ordinal value: " +Cards.THREE.index+"; Name value: " +Cards.THREE);
        System.out.println("Ordinal value: " +Cards.FOUR.index+"; Name value: " +Cards.FOUR);
        System.out.println("Ordinal value: " +Cards.FIVE.index+"; Name value: " +Cards.FIVE);
        System.out.println("Ordinal value: " +Cards.SIX.index+"; Name value: " +Cards.SIX);
        System.out.println("Ordinal value: " +Cards.SEVEN.index+"; Name value: " +Cards.SEVEN);
        System.out.println("Ordinal value: " +Cards.EIGHT.index+"; Name value: " +Cards.EIGHT);
        System.out.println("Ordinal value: " +Cards.NINE.index+"; Name value: " +Cards.NINE);
        System.out.println("Ordinal value: " +Cards.TEN.index+"; Name value: " +Cards.TEN);
        System.out.println("Ordinal value: " +Cards.JACK.index+"; Name value: " +Cards.JACK);
        System.out.println("Ordinal value: " +Cards.QUEEN.index+"; Name value: " +Cards.QUEEN);
        System.out.println("Ordinal value: " +Cards.KING.index+"; Name value: " +Cards.KING);
    }
}
