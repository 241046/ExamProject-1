package weapon;

public abstract class Weapon {
    private String name;
    private int damage;
    private int cost = 0;

    public Weapon (String name, int damage) {
        setName(name);
        setDamage(damage);
    }
    public String attackMessage(){
        return getName() + "";
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getDamage(){
        return this.damage;
    }
    public void setDamage(int damage){
        this.damage = damage;
    }
}
