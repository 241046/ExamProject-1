package creature.character;

import creature.Character;
import creature.Creature;
import weapon.Weapon;

public class Wizard extends Character {
    private int mp;
    public Wizard(String name, int hp, int mp,Weapon weapon) {
        super(name, hp, weapon);
        this.mp = mp;
    }
    public int getMp(){
        return mp;
    }
    public void setMp(int mp){
        this.mp = Math.max(0,mp);
    }
    public void magic(Creature target) {
        Weapon weapon = getWeapon();
        if(mp < weapon.getCost()){
            System.out.println("MPが足りない!");
            return;
        }
        System.out.println(getName() + "は" +getWeapon().getName() + getWeapon().attackMessage() + target.getName() + "に3のダメージを与えた!");
        target.setHp(target.getHp()-weapon.getDamage());
        setMp(mp - weapon.getCost());
    }
    @Override
    public void attack(Creature target){
        System.out.println(getName() + "は石を投げた!" + target.getName() + "に3のダメージを与えた!");
        target.setHp(target.getHp() - 3);
    }
    @Override
    public void showStatus(){
        super.showStatus();
        System.out.println("MP" + mp);
    }
}
