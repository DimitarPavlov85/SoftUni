import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String line=sc.nextLine();
        Map<String,Set<String>>players=new LinkedHashMap<>();
       while(!line.equals("JOKER")) {
           
           String name = line.split(": ")[0];
           String[] inputCards = line.split(": ")[1].split(", ");

           createMap(players, name, inputCards);

           line = sc.nextLine();
       }
       for(Map.Entry<String,Set<String>> s:players.entrySet()){

           int points = getCardPoints(s.getValue());
           System.out.println(s.getKey() + ": " + points);
       }
    }

    private static void createMap(Map<String, Set<String>> players, String name, String[] inputCards) {
        Set<String> cards = new LinkedHashSet<>();

        if (!players.containsKey(name)) {
            for (int i = 0; i < inputCards.length; i++) {
                cards.add(inputCards[i]);
            }
            players.put(name, cards);
        } else {
            Set<String> current = players.get(name);
            Collections.addAll(current, inputCards);
            players.put(name, current);
        }
    }

    private static int getCardPoints(Set<String> cards) {
        int sum = 0;
        Map<Character, Integer> pointsValues = getPointsValues();
        for (String card : cards) {
            int points = 0;
            if(card.contains("10")) {
                char strength = card.charAt(2);
                points = 10 * pointsValues.get(strength);
            } else {
                char number = card.charAt(0);
                char strength = card.charAt(1);
                points = pointsValues.get(strength) * pointsValues.get(number);
            }
            sum += points;
        }
        return sum;
    }

    private static Map<Character, Integer> getPointsValues() {
        Map<Character, Integer> points = new HashMap<>();
        points.put('1', 1);
        points.put('2', 2);
        points.put('3', 3);
        points.put('4', 4);
        points.put('5', 5);
        points.put('6', 6);
        points.put('7', 7);
        points.put('8', 8);
        points.put('9', 9);
        points.put('J', 11);
        points.put('Q', 12);
        points.put('K', 13);
        points.put('A', 14);
        points.put('S', 4);
        points.put('H', 3);
        points.put('D', 2);
        points.put('C', 1);

        return points;
    }
}
