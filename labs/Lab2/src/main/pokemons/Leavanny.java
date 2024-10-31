package Lab2.pokemons;

import Lab2.Attacks.SpecialAttacks.EnergyBall;
import ru.ifmo.se.pokemon.Type;

public final class Leavanny extends Swadloon {
    public Leavanny(String name, int level) {
        super(name, level);
        super.setType(Type.BUG);
        super.setType(Type.GRASS);
        super.setStats(75, 103, 80, 70, 80, 92);
        EnergyBall energyball = new EnergyBall(90,100);
        addMove(energyball);
    }
}
