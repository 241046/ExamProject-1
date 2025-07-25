package creature.character;

import creature.Character;
import creature.Creature;
import weapon.Weapon;

public class Hero extends Character {

    public Hero(String name,int hp,Weapon weapon){
        super(name, hp,weapon);
    }
    public void attack(Creature target){
        System.out.println(getName() + "は" + target.getName() + "を" + getWeapon().getName() + getWeapon().attackMessage());
        target.setHp(target.getHp() - getWeapon().getDamage());
        }

    }

