import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] Phrases = {"Excellent product.",
                "Such a great product.",
                "I always use that product.",
                "Best product of its category.",
                "Exceptional product.",
                "I can’t live without this product."};
        String[] Events = {"Now I feel good.",
                "I have succeeded with this product.",
                "Makes miracles. I am happy of the results!",
                "I cannot believe but now I feel awesome.",
                "Try it yourself, I am very satisfied.",
                "I feel great!"};
        String[] Authors = {
                "Diana", "Petya", "Stella",
                "Elena", "Katya", "Iva",
                "Annie", "Eva"};
        Random rnd = new Random();
        String[] Cities = {"Burgas", "Sofia", "Plovdiv", "Varna", "Ruse"};
        int NumberOfOccurences = sc.nextInt();
        for (int i = 0; i < NumberOfOccurences; i++) {
            int rndPhrases = rnd.nextInt(Phrases.length);
            int rndEvents = rnd.nextInt(Events.length);
            int rndAuthors = rnd.nextInt(Authors.length);
            int rndCities = rnd.nextInt(Cities.length);
            System.out.print(Phrases[rndPhrases]+" ");
            System.out.print(Events[rndEvents]+" ");
            System.out.print(Authors[rndAuthors]+" ");
            System.out.println(Cities[rndCities]);
        }
    }
}
