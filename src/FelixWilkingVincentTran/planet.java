package FelixWilkingVincentTran;

import java.util.ArrayList;
import java.util.List;

public class planet extends Boardobject {
    public static List<planet> planets = new ArrayList<>();

    public planet() {
        super();
        planet.planets.add(this);
    }
}