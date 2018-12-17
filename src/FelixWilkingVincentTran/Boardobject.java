package FelixWilkingVincentTran;

import static java.lang.Character.toUpperCase;

public class Boardobject {
    private char symbol;
    public String name;

    public Boardobject(){
        this.name = generateName();
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

}