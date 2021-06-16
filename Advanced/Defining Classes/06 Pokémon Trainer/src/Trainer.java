import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class Trainer {
    private String name;
    private int numberOfBadges;
    private List<Pokemon> collections;

    public Trainer(String _name, Pokemon _current) {
        this.name = _name;
        numberOfBadges = 0;
        this.collections = new ArrayList<>();
        collections.add(_current);


    }
     public String getName(){
        return this.name;
      }

    public int getNumberOfBadges() {
        return numberOfBadges;
    }
    public Pokemon getPokemon(int number){
        return collections.get(number);
    }

    public List<Pokemon> getCollections() {
        return collections;
    }

    public void setNumberOfBadges(int numberOfBadges) {
        this.numberOfBadges += numberOfBadges;
    }
}
