package FelixWilkingVincentTran;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int boardlength = 10; //Initialize variable for board dimensions
        int difficulty = 50; //Set the variable for changing the density of planets in the array
        double randomX = 0; //Random number generator for X coordinate
        double randomY = 0; //Random number generator for Y coordinate
        int x = 0; //X coordinate
        int y = 0; //Y coordinate

        Boardobject[][] boardarray = new Boardobject[boardlength][boardlength]; //Sets the board x and y length

        //Fills the board with planets at random spots
        for(int i = 0; i < difficulty; i++) {
            randomX = Math.random() * boardlength;
            randomY = Math.random() * boardlength;
            boardarray[(int) (randomX)][(int) (randomY)] = new planet(3);
        }

        //Loops through every spot in the array and if it has no planet, fills the spot with ab empty space
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
        System.out.println(player1.xLoc +" "+ player1.yLoc);

        Boardclass board = new Boardclass(boardarray);
        board.printboard();

        System.out.println("You have entered the map at "+player1.xLoc +" "+ player1.yLoc + " " + boardarray[0][0].getName());
        System.out.println("Please pick a direction to move n,e,w,s");


        //Scans for user input and will move player accordingly North/West/East/South
        while (true) {
            Scanner sc = new Scanner(System.in);
            String input = sc.nextLine();
            Boardclass.moveplayer(player1, boardarray, input, boardlength);
            board.printboard();
        }
    }
}

