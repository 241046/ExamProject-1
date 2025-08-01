package creature;

import weapon.Weapon;

public abstract class Character implements Creature {
    private String name;
    private int hp;
    private Weapon weapon;

    public Character(String name, int hp, Weapon weapon) {
        if (hp < 0) {
            throw new IllegalArgumentException("初期設定に誤りがあるため、キャラクターを作成できませんでした");
        }
        setName(name);
        setHp(hp);
        setWeapon(weapon);
    }

    public final boolean isAlive() {
        return this.hp > 0;
    }

    public void showStatus() {
        System.out.println(getName() + ":HP" + getHp());
    }

    public void die() {
        System.out.println(getName() + "は死んでしまった!");
    }

    public int getHp() {
        return this.hp;
    }

    public void setHp(int hp) {
        this.hp = Math.max(0, hp);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
}
