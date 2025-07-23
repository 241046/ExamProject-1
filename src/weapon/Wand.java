package weapon;

public class Wand extends Weapon{
    private int cost;
    public Wand(String name,int damege, int cost){
        super("杖",15);
        this.cost = 5;
    }
    public String attackMessage(){
        return "から魔法を放った!";
    }
}
