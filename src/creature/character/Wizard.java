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
    public void attack(Creature target) {
        System.out.println(getName() + "は" +getWeapon().getName() + getWeapon().attackMessage() + target.getName() + "に3のダメージを与えた!");
        target.setHp(target.getHp()-3);
        this.mp -= 1;
    }
}
