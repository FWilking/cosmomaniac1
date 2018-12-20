package FelixWilkingVincentTran;

import java.util.Scanner;

public class
Main {

    public static void main(String[] args) {
        int boardlength = 10; //Initialize variable for board dimensions
        int difficulty = 50; //Set the variable for changing the density of planets in the array
        int randomX = 0; //Random number generator for X coordinate
        int randomY = 0; //Random number generator for Y coordinate
        int x = 0; //X coordinate
        int y = 0; //Y coordinate
        boolean continueOrStop = true;

        Boardobject[][] boardarray = new Boardobject[boardlength][boardlength]; //Sets the board x and y length

        //Fills the board with planets at random spots
        for(int i = 0; i < difficulty; i++) {
            randomX = (int) (Math.random() * boardlength);
            randomY = (int) (Math.random() * boardlength);
            boardarray[(randomX)][(randomY)] = new planet();
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

        //Inital printout of player's location and instruction to the player
        player1.printPlayerCurrentLocation();
        System.out.println("Please pick a direction to move (N,S,E,W) or (q) to quit");


        //Scans for user input and will move player accordingly North/West/East/South
        while (continueOrStop) {
            Scanner sc = new Scanner(System.in);
            String input = sc.nextLine();
            continueOrStop = Boardclass.moveplayer(player1, boardarray, input, boardlength);
            if (continueOrStop == false)
            {
                System.out.println("You have traversed into the outer rim of space, aliens gobble you up");
            }
        }
    }
}

