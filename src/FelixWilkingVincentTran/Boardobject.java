package FelixWilkingVincentTran;

import static java.lang.Character.toUpperCase;

public class Boardobject {
    private char symbol;
    public String name;
    private String[] descriptions = {"Dry and hot and makes you sweaty just looking at it.",
            "Lush and humid filled with endless forests, swamps, and marshes.",
            "Windy and temperate, it reminds you of a place you left so long ago..",
    "Icy and cold yet you are drawn to the blue beauty.",
    "Dark and stormy, you can hardly see the surface.",
    "An orange world filled to the brim with sand and a never ending desert.",
    "A purple planet with streaking zig-zags of lightning"};
    private String description;
    private String[] sizes = {"tiny", "huge", "small", "massive", "average sized"};
    private String size;

    public Boardobject(){
        this.name = generateName();
        this.description = descriptions[(int) (Math.random() * descriptions.length)];
        this.size = sizes[(int) (Math.random() * sizes.length)];

    }

    public String getSize() {

        return size;
    }

    public String generateName(){
        String letters = "bcdfghjklmnpqrstvwxyztaointn";
        String vowels = "aeiouea-";
        String name = "";
        for(int i = 0; i < ((int) (Math.random() * 4 + 3)); i++){
            name += letters.charAt((int) (Math.random() * letters.length()));
            name += vowels.charAt((int) (Math.random() * vowels.length()));
        }
        return name;
    }

    public String getName() {
        if (this.name == " ")
        {
            return "empty space";
        }
        else {
            return this.name;
        }
    }

    public char getSymbol() {
        return this.getName().charAt(0);
    }

    public String getDescription()
    {
        return description;
    }

}