package Lab2.pokemons;

import Lab2.Attacks.PhysicalAttacks.AquaJet;
import Lab2.Attacks.StatusAttacks.Rest;
import Lab2.Attacks.StatusAttacks.Supersonic;
import Lab2.Attacks.StatusAttacks.SweetKiss;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;


public final class Luvdics extends Pokemon {

    public Luvdics(String name, int level) {
        super(name, level);
        super.setType(Type.WATER);
        super.setStats(43, 30, 55, 40, 65, 97);
        Rest rest = new Rest(0,100);
        AquaJet aquajet = new AquaJet(40,100);
        SweetKiss sweetkiss = new SweetKiss(0,75);
        Supersonic supersonic = new Supersonic(0,55);
        super.setMove(supersonic, aquajet, sweetkiss, rest);
    }
}
