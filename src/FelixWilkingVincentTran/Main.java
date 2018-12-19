package FelixWilkingVincentTran;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int boardlength = 10; //Initialize variable for board dimensions
        int difficulty = 50; //Set the variable for changing the density of planets in the array
        double randomX = 0; //Random number generator for X coordinate
        double randomY = 0; //Random number generator for Y coordinate
        double randomCount = 0;
        int x = 0; //X coordinate
        int y = 0; //Y coordinate

        Boardobject[][] boardarray = new Boardobject[boardlength][boardlength]; //Sets the board x and y length

        //Fills the board with planets at random spots
        for(int i = 0; i < difficulty; i++) {
            randomX = Math.random() * boardlength;
            randomY = Math.random() * boardlength;
            randomCount = (int) (Math.random() * 4)+1;
            if (randomCount == 1) {
                boardarray[(int) (randomX)][(int) (randomY)] = new planet(3, "Icy and cold yet has soothing blue charm to it");
            }
            if (randomCount == 2) {
                boardarray[(int) (randomX)][(int) (randomY)] = new planet(3, "Dry and hot and makes you sweaty just looking at it");
            }
            if (randomCount == 3) {
                boardarray[(int) (randomX)][(int) (randomY)] = new planet(3, "Lush and humid filled with endless forests, swamps, and marshes");
            }
            if (randomCount == 4) {
                boardarray[(int) (randomX)][(int) (randomY)] = new planet(3, "Windy and temperate, it reminds you of a place you left so long ago..");
            }
        }

        //Loops through every spot in the array and if it has no planet, fills the spot with an empty space
        for (int j = 0; j < boardlength; j++)
        {
            if (boardarray[x][j] == null) {
                boardarray[x][j] = new Space(" ", x, j);
            }

            if (j+1 == boardlength)
            {
                x += 1;
                j = -1;
            }

            if (x == boardlength)
            {
                j = boardlength;
            }
        }

        //Creates the player and inserts them into the map
        playerclass player1 = new playerclass("Jaune", 0, 0);
        boardarray[player1.xLoc][player1.yLoc] = player1;

        Boardclass board = new Boardclass(boardarray);
        board.printboard();

        player1.printPlayerCurrentLocation();
        System.out.println("Please pick a direction to move (N,S,E,W) or (q) to quit");


        //Scans for user input and will move player accordingly North/West/East/South
        while (true) {
            Scanner sc = new Scanner(System.in);
            String input = sc.nextLine();
            Boardclass.moveplayer(player1, boardarray, input, boardlength);
            //System.out.println("this is board array " + boardar);
            board.printboard();
        }
    }
}

