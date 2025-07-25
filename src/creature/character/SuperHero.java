package creature.character;

import creature.Creature;

public class SuperHero extends Hero {
    public SuperHero(Hero hero){
        super(hero.getName(), hero.getHp(), hero.getWeapon());
        System.out.println(hero.getName() + "はスーパーヒーロー" + "に進化した!");
        hero.setHp(hero.getHp()-30);
    }
    public void attack(Creature target){
        System.out.println(getName() + "は" + getWeapon().getName() + getWeapon().attackMessage() + "で攻撃!" + target.getName() + "に25のダメージを与えた");
        target.setHp((int) (target.getHp() - (getWeapon().getDamage() * 2.5)));
    }
}
