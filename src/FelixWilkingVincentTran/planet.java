package FelixWilkingVincentTran;

import java.util.ArrayList;
import java.util.List;

public class planet extends Boardobject {
    public static List<planet> planets = new ArrayList<>();
    private int size;
    private String description;

    public planet(int size, String description) {
        super();
        this.size = size;
        this.description = description;
        planet.planets.add(this);
    }

    public String getDescription()
    {
        return description;
    }

}