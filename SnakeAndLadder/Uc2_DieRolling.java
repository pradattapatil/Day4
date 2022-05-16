package Day4.SnakeAndLadder;

import java.util.Scanner;

public class Uc2_DieRolling {
    public static void main(String[] args) {
        int playerPosition = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Player Name: ");
        String playerName = sc.next();
        int dieRoll = (int)(Math.random()*6) + 1;
        System.out.println("The no. on dice is: "+ dieRoll);
    }
}
