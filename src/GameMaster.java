import creature.Character;
import creature.Monster;
import creature.character.Hero;
import creature.character.SuperHero;
import creature.character.Thief;
import creature.character.Wizard;
import creature.monster.Goblin;
import creature.monster.Matango;
import creature.monster.Slime;
import weapon.Dagger;
import weapon.Sword;
import weapon.Wand;

import java.util.ArrayList;

public class GameMaster {
    public static void main(String[] args) {
        ArrayList<creature.Character> party = new ArrayList<>();
        Sword sword = new Sword("剣", 10);
        Wand wand = new Wand("杖",15, 5);
        Dagger dagger = new Dagger("短剣",6);
        Hero hero = new Hero("勇者", 100, sword);
        SuperHero sh = new SuperHero(hero);
        Wizard wizard = new Wizard("魔法使い", 60, 20,wand);
        Thief thief = new Thief("盗賊", 70,dagger);
        party.add(hero);
        party.add(wizard);
        party.add(thief);

        ArrayList<Monster> monsters = new ArrayList<>();
        Matango m = new Matango('A', 45);
        Goblin g = new Goblin('A', 50);
        Slime s = new Slime('A', 40);
        monsters.add(m);
        monsters.add(g);
        monsters.add(s);

        System.out.println("---味方パーティ---");
        for (creature.Character h : party) {
            h.showStatus();
        }
        System.out.println("---敵グループ---");
        for (Monster b : monsters) {
            b.showStatus();
        }

        System.out.println("\n味方の総攻撃!");
        for (Monster h : monsters) {
            hero.attack(h);
        }
        for (Monster h : monsters) {
            wizard.attack(h);
        }
        for (Monster h : monsters) {
            thief.attack(h);

        }

        System.out.println("\n敵の総攻撃");
        for (creature.Character b : party) {
            m.attack(b);
        }
        for (creature.Character b : party) {
            g.attack(b);
        }
        for (creature.Character b : party) {
            s.attack(b);
        }

        System.out.println("\nダメージを受けた" + hero.getName() + "が突然光りだした!");

        for (Monster h : monsters) {
            sh.attack(h);
        }

        System.out.println("\n---味方パーティ最終ステータス---");
        for(Character h : party){
            h.showStatus();
            if(h.isAlive()){
                System.out.println("生存状況:生存");
            } else {
                System.out.println("生存状況:瀕死");
            }
        }
        System.out.println("\n---敵グループ最終ステータス---");
        for(Monster c : monsters) {
            c.showStatus();
            if (c.isAlive()) {
                System.out.println("生存状況:生存");
            } else {
                System.out.println("生存状況:討伐済み");
            }
        }
    }
}