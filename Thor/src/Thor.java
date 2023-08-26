import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 * ---
 * Hint: You can use the debug stream to print initialTX and initialTY, if Thor seems not follow your orders.
 **/
class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int lightX = in.nextInt(); // the X position of the light of power
        int lightY = in.nextInt(); // the Y position of the light of power
        int initialTx = in.nextInt(); // Thor's starting X position
        int initialTy = in.nextInt(); // Thor's starting Y position
        String move = new String("");
        int counter = 0;
        int x = initialTx;
        int y = initialTy;
        // game loop
        while (true) {
            int distx = lightX - initialTx;
            int disty = lightY - initialTy;
            if (distx == 0 && disty == 0) {
                System.out.println("Victory!");
                break;
            }
            if (x == lightX && y == lightY) {
                System.out.println("Victory!");
                break;
            }
            // int remainingTurns = in.nextInt(); // The remaining amount of turns Thor can move. Do not remove this line.
            
            // Write an action using System.out.println()
            if (disty == 0) {
                if (distx > 0) {
                    initialTx += 1;
                    move = "E";
                } else {
                    initialTx -= 1;
                    move = "W";
                }
            } 
            if (distx == 0) {
                if (disty > 0) {
                    initialTy += 1;
                    move = "S";
                } else {
                    initialTy -= 1;
                    move = "N";
                }
            }
            if (distx != 0 && disty != 0) {
                if (distx > 0 && disty > 0) {
                    initialTx += 1;
                    initialTy += 1;
                    move = "SE";
                } else if (distx < 0 && disty < 0) {
                    initialTx -= 1;
                    initialTy -= 1;
                    move = "NW";
                } else if (distx > 0 && disty < 0) {
                    initialTx += 1;
                    initialTy -= 1;
                    move = "NW";
                } else if (distx < 0 && disty > 0) {
                    initialTx -= 1;
                    initialTy += 1;
                    move = "SW";
                }
            }
            // From random zuka:
            // if (y > lightY) { move += "N"; y--; }
            // else if (y < lightY) { move += "S"; y++; }
            
            // if (x > lightX) { move += "W"; x--; }
            // else if (x < lightX) { move += "E"; x++; }

            // A single line providing the move to be made: N NE E SE S SW W or NW
            System.out.println(move);
            // System.out.println("Thor's position:"+initialTx+" ,"+initialTy);
            // System.out.println("Distx: "+distx+" Disty: "+disty);
            System.out.println("Number of plays: "+counter);
            counter++;
        }
        in.close();
    }
}