package FelixWilkingVincentTran;

import java.util.Scanner;

public class Boardclass {
    public Boardobject[][] arr;

    public Boardclass(Boardobject[][] board){

        this.arr = board;
    }

    public void printboard(){
        for(Boardobject[] y : this.arr){
            for(Boardobject x : y){
                if(x == null){
                    System.out.print("- ");
                }
                else{
                    System.out.print(x.getSymbol() + " ");
                }
            }
            System.out.println();
        }
    }

    public static boolean moveplayer(playerclass player, Boardobject[][] board, String input, int length){

        int playerPreviousXLocation = player.getxLoc();
        int playerPreviousYLocation = player.getyLoc();
        Boardobject playerCurrentLocation;
        boolean validMove = true;

        if (input.equals("n")) {
            //checking boundary condition
            if (player.getxLoc() == 0) {
                validMove = false;
            }
            player.setxLoc(playerPreviousXLocation - 1); //Decrease x coord by 1
        }
        else if (input.equals("w")) {
            //checking boundary condition
            if (player.getyLoc() == 0) {
                validMove = false;
            }
            player.setyLoc(playerPreviousYLocation - 1); //Decrease y coord by 1
        }
        else if (input.equals("e")) {
            //checking boundary condition
            if (player.getyLoc() == length-1) {
                validMove = false;
            }
            player.setyLoc(playerPreviousYLocation + 1); //Increase y coord by 1
        }
        else if (input.equals("s")) {
            //checking boundary condition
            if (player.getxLoc() == length - 1) {
                validMove = false;
            }
            player.setxLoc(playerPreviousXLocation + 1); //Increase x coord by 1
        }

        player.printPlayerCurrentLocation();
            //Ends program if invalid move is made
            if (validMove == false) {
                return false;
            }
            else { //valid move
                //print the name of the spot the player moves to
                playerCurrentLocation = board[player.getxLoc()][player.getyLoc()];
                if (playerCurrentLocation.getName().equals(" ")) {
                    System.out.println("You move further into the abyss of space");
                } else {
                    System.out.println("You have found the planet " + playerCurrentLocation.getName());
                    System.out.println("It is a " + playerCurrentLocation.getSize() + " planet");
                    System.out.println(playerCurrentLocation.getDescription());
                }
            }
        return true;
    }
}
