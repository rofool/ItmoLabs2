package main.pokemons;

import labs.Lab2.Attacks.PhysicalAttacks.FireFang;
import ru.ifmo.se.pokemon.Type;


public final class Steelix extends Onix {
    public Steelix(String name, int level) {
        super(name, level);
        super.setType(Type.STEEL);
        super.setType(Type.GROUND);
        super.setStats(75, 85, 200, 55, 65, 30);
        FireFang firefang = new FireFang(65,95);
        addMove(firefang);
    }
}
