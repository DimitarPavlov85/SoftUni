public class Pokemon {
private String name;
private String magic;
private int health;
 int resultHealth;
    public Pokemon(String name, String magic, int health) {
        this.name = name;
        this.magic = magic;
        this.health = health;
    }

    public int getResultHealth() {
        return resultHealth;
    }

    public void setResultHealth(int resultHealth) {
        this.resultHealth = resultHealth;
    }

    public String getName() {
        return name;
    }

    public String getMagic() {
        return magic;
    }

    public int getHealth() {
        return health;
    }

    public int setHealth() {
       return  this.health =health- 10;
    }
}
