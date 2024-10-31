package Lab2.pokemons;

import Lab2.Attacks.StatusAttacks.GrassWhistle;
import ru.ifmo.se.pokemon.Type;

public class Swadloon extends Sewaddle {
    public Swadloon(String name, int level) {
        super(name, level);
        super.setType(Type.BUG);
        super.setType(Type.GRASS);
        super.setStats(55, 63, 90, 50, 80, 42);
        GrassWhistle grasswhistle = new GrassWhistle(0,55);
        addMove(grasswhistle);
    }
}
