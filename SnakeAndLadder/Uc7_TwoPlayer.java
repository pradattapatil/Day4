package Day4.SnakeAndLadder;

import java.util.Scanner;

public class Uc7_TwoPlayer {
    public static void main(String[] args) {
        //1st player
        int count1 = 0;
        int playerPosition1 = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st Player Name: ");
        String playerName1 = sc.next();
        System.out.println("Enter 2nd Player Name: ");
        String playerName2 = sc.next();
        int winningPosition1 = 100;
        int remainingPosition1 = winningPosition1 - playerPosition1;

        while (winningPosition1 > playerPosition1) {

            int dieRoll1 = (int)(Math.floor(Math.random() * 10 % 6 + 1)) ;
            System.out.println("The no. on dice is: "+ dieRoll1);


            int option1 =(int)(Math.floor(Math.random() * 10 % 3));
            if (remainingPosition1 >= dieRoll1) {

                if(option1 == 0) {
                    //System.out.println("No Play");
                    playerPosition1 += 0;
                } else if(option1 == 1) {
                    //System.out.println("Ladder");
                    playerPosition1 += dieRoll1;
                }
                else{
                    //System.out.println("Snake");
                    playerPosition1 -= dieRoll1;
                    if(playerPosition1 < 0) {
                        playerPosition1 = 0;
                    }
                    count1++;
                }
                System.out.println("Player Position is: " + playerPosition1);

            }
        }
     //   System.out.println("The "+ count1 +" times Die is Rolled");

        //2nd player

        int count2 = 0;
        int playerPosition2 = 0;
        int winningPosition2 = 100;
        int remainingPosition2 = winningPosition2 - playerPosition2;

        while (winningPosition2 > playerPosition2) {

            int dieRoll2 = (int) (Math.floor(Math.random() * 10 % 6 + 1));
            System.out.println("The no. on dice is: " + dieRoll2);


            int option2 = (int) (Math.floor(Math.random() * 10 % 3));
            if (remainingPosition2 >= dieRoll2) {

                if (option2 == 0) {
                    //System.out.println("No Play");
                    playerPosition2 += 0;
                } else if (option2 == 1) {
                    //System.out.println("Ladder");
                    playerPosition2 += dieRoll2;
                } else {
                    //System.out.println("Snake");
                    playerPosition2 -= dieRoll2;
                    if (playerPosition2 < 0) {
                        playerPosition2 = 0;
                    }
                    count2++;
                }
                System.out.println("Player Position is: " + playerPosition2);

            }
      //      System.out.println("The " + count2 + " times Die is Rolled");
        }
        if (count1 < count2) {
            System.out.println(playerName1 + " is winning");
        } else if (count1 > count2) {
            System.out.println(playerName2 + " is winning");
        }
    }
}