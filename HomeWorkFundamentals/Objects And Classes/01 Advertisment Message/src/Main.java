import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] phrases = {"Excellent product.",
                "Such a great product.",
                "I always use that product.",
                "Best product of its category.",
                "Exceptional product.",
                "I can’t live without this product."};
        String[] events = {"Now I feel good.",
                "I have succeeded with this product.",
                "Makes miracles. I am happy of the results!",
                "I cannot believe but now I feel awesome.",
                "Try it yourself, I am very satisfied.",
                "I feel great!"};
        String[] authors = {
                "Diana", "Petya", "Stella",
                "Elena", "Katya", "Iva",
                "Annie", "Eva"};
        Random rnd = new Random();
        String[] cities = {"Burgas", "Sofia", "Plovdiv", "Varna", "Ruse"};
        int numberOfOccurences = sc.nextInt();
        for (int i = 0; i < numberOfOccurences; i++) {
            int rndPhrases = rnd.nextInt(phrases.length);
            int rndEvents = rnd.nextInt(events.length);
            int rndAuthors = rnd.nextInt(authors.length);
            int rndCities = rnd.nextInt(cities.length);
            System.out.print(phrases[rndPhrases]+" ");
            System.out.print(events[rndEvents]+" ");
            System.out.print(authors[rndAuthors]+" ");
            System.out.println(cities[rndCities]);
        }
    }
}
