package GameOOP.Heroes;

import GameOOP.Coordinates;
import GameOOP.Human;

import java.util.ArrayList;

public abstract class Battler extends Human {
    public Battler(String type, String name, String team, Integer attack, Integer protection, Integer hp,
                   Integer minDamage, Integer maxDamage, Integer speed, Coordinates position) {
        super(type, name, team, attack, protection, hp, minDamage, maxDamage, speed, position);
    }
    //    public Battler(String type, String name, String team, Integer attack, Integer protection, Integer hp, Integer minDamage, Integer maxDamage, Integer speed, Integer x, Integer y) {
//        super(type, name, team, attack, protection, hp, minDamage, maxDamage, speed, x, y);
//    }

    public Battler(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return super.toString() + '}';
    }

    @Override
    public void step(ArrayList<Human> team1, ArrayList<Human> team2) {

    }

//    public void attacks() {
//        System.out.printf("%s %s аттакует", type, getName());
//        System.out.println();
//    }

}