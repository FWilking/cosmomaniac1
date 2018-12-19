package FelixWilkingVincentTran;

import java.util.ArrayList;
import java.util.List;

public class planet extends Boardobject {
    public static List<planet> planets = new ArrayList<>();
    private int size;

    public planet(int size) {
        super();
        this.size = size;
        planet.planets.add(this);
    }

    public planet getPlanet()
    {
        return planets.get(0);
    }
}