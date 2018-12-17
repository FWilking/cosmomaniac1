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



    /*public void move(int x1, int y1, int x2, int y2){
        Boardobject placeholder = this.arr[x1][y1];
        this.arr[x1][y1] = null;
        this.arr[x2][y2] = placeholder;
    }*/

    public static boolean moveplayer(playerclass player, Boardobject[][] board, String input, int length){

        int x = player.getxLoc();
        int y = player.getyLoc();
        String Hold = " ";


        if (input.equals("n")) {

        }

        if (input.equals("w")) {

        }

        if (input.equals("e")) {
            if (player.getyLoc() != length-1) {
                Hold = board[player.xLoc][player.yLoc+1].getName();
                player.setyLoc(y + 1);
                board[player.xLoc][player.yLoc] = player;
                System.out.println("Your location is now " + player.xLoc + " " + player.yLoc);
                System.out.println("You are in " + Hold);
            }
            if (player.getyLoc() == length-1) {
                System.out.println("Your move is invalid please try a different one!");
                return false;
            }
        }

        if (input.equals("s")) {

        }
        return true;

    }
}
