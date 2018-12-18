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

        int x = player.getxLoc();
        int y = player.getyLoc();
        Boardobject Hold = board[player.xLoc][player.yLoc];


        if (input.equals("n")) {
            if (player.getxLoc() != 0) {
                Hold = board[player.xLoc-1][player.yLoc]; //Holds what is in the spot to the north of the player
                player.setxLoc(x - 1); //Decrease x coord by 1
                board[player.xLoc][player.yLoc] = player; //Sets the spot to the north as the player now
                System.out.println("Your location is now " + player.xLoc + " " + player.yLoc);//Prints out player's current location
                if (Hold.getName().equals(" "))
                {
                    System.out.println("You move further into the abyss of space");
                }
                else {
                    System.out.println("You have found the planet " + Hold.getName());
                }
                board[player.xLoc][player.yLoc] = Hold; //Sets the current spot back to the planet or empty space
            }
            if (player.getxLoc() == 0) {
                System.out.println("Your move is invalid please try a different one!");
                return false;
            }
        }

        if (input.equals("w")) {
            if (player.getyLoc() != 0) {
                Hold = board[player.xLoc][player.yLoc-1]; //Holds what is in the spot to the left of the player
                player.setyLoc(y -1 ); //Decrease y coord by 1
                board[player.xLoc][player.yLoc] = player; //Sets the spot to the left as the player now
                System.out.println("Your location is now " + player.xLoc + " " + player.yLoc);//Prints out player's current location
                if (Hold.getName().equals(" "))
                {
                    System.out.println("You move further into the abyss of space");
                }
                else {
                    System.out.println("You have found the planet " + Hold.getName());
                }
                board[player.xLoc][player.yLoc] = Hold; //Sets the current spot back to the planet or empty space
            }
            if (player.getyLoc() == 0) {
                System.out.println("Your move is invalid please try a different one!");
                return false;
            }
        }

        if (input.equals("e")) {
            if (player.getyLoc() != length-1) {
                Hold = board[player.xLoc][player.yLoc+1]; //Holds what is in the spot to the right of the player
                System.out.println(Hold.getName());
                player.setyLoc(y + 1); //Increase y coord by 1
                board[player.xLoc][player.yLoc] = player; //Sets the spot to the right as the player now
                System.out.println("Your location is now " + player.xLoc + " " + player.yLoc);//Prints out player's current location
                if (Hold.getName().equals(" "))
                {
                    System.out.println("You move further into the abyss of space");
                }
                else {
                    System.out.println("You have found the planet " + Hold.getName());
                }
                board[player.xLoc][player.yLoc] = Hold; //Sets the current spot back to the planet or empty space
            }
            if (player.getyLoc() == length-1) {
                System.out.println("Your move is invalid please try a different one!");
                return false;
            }
        }

        if (input.equals("s")) {
            if (player.getxLoc() != length-1) {
                Hold = board[player.xLoc+1][player.yLoc]; //Holds what is in the spot to the south of the player
                player.setxLoc(x + 1); //Increase x coord by 1
                board[player.xLoc][player.yLoc] = player; //Sets the spot to the south as the player now
                System.out.println("Your location is now " + player.xLoc + " " + player.yLoc); //Prints out player's current location
                if (Hold.getName().equals(" "))
                {
                    System.out.println("You move further into the abyss of space");
                }
                else {
                    System.out.println("You have found the planet " + Hold.getName());
                }
                board[player.xLoc][player.yLoc] = Hold; //Sets the current spot back to the planet or empty space
            }
            if (player.getxLoc() == length-1) {
                System.out.println("Your move is invalid please try a different one!");
                return false;
            }
        }
        return true;

    }
}
