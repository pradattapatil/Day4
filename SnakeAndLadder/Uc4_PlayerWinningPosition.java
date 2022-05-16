package Day4.SnakeAndLadder;

import java.util.Scanner;

public class Uc4_PlayerWinningPosition {
    public static void main(String[] args) {
        int playerPosition=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Player Name: ");
        String playerName = sc.next();
        int winningPostion = 100;

        while (winningPostion > playerPosition) {

            int dieRoll = (int)(Math.floor(Math.random() * 10 % 6 + 1)) ;
            System.out.println("The no on dice is:"+ dieRoll);

            int option =(int)(Math.floor(Math.random()* 10 % 3));

            if(option == 0) {
                //System.out.println("No Play");
                playerPosition += 0;
            } else if(option == 1) {
                //System.out.println("Ladder");
                playerPosition += dieRoll;
            }
            else{
                //System.out.println("Snake");
                playerPosition -= dieRoll;
                if(playerPosition < 0) {
                    playerPosition = 0;
                }

            }
            System.out.println("Player Position is:" + playerPosition);
        }
    }
}
