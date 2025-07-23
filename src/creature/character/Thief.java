package creature.character;

import creature.Character;
import creature.Creature;

public class Thief extends Character {
    public Thief(String name,int hp, Weapon weapon) {
        super(name, hp, weapon);
    }

    public void attack(Creature target){
        System.out.println(getName() + "は素早く攻撃した!" + target.getName() + "に5のダメージを与えた!");
        target.setHp(target.getHp()-5);
    }
}
