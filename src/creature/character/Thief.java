package creature.character;

import creature.Character;
import creature.Creature;
import weapon.Weapon;

public class Thief extends Character {
    private boolean guard = false;

    public Thief(String name,int hp, Weapon weapon) {
        super(name, hp, weapon);
    }

    public void attack(Creature target){
        System.out.println(getName() + "は" + getWeapon().getName() + getWeapon().attackMessage() + target.getName() + "に5のダメージを与えた!");
        target.setHp(target.getHp()-5);
    }
    public void guard(){
        this.guard = true;
    }
}