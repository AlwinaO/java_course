package chapter4;

import java.util.Random;

public class RollDieGame {

    public static void main(String args[]){

//      Initialize what I know
        int spacesOnBoard = 20;
        int numberOfRolls = 5;

//      number of spaces user has taken
        int totalOfSpaces = 0;

        Random random = new Random();

//     Loop over number of rolls
        for(int i=0; i<numberOfRolls; i++){
//            Roll the die

            int die = random.nextInt(6) + 1;
//            int dieRolls = numberOfRolls - 1;

            totalOfSpaces = totalOfSpaces + die;

            int spacesLeftOnBoard = spacesOnBoard - totalOfSpaces;

            if (totalOfSpaces == spacesOnBoard) {
                System.out.println("Roll #" + (i+1) + ": You've rolled a " + die + ". You are on space " + totalOfSpaces + " and you have won the game!");
                break;
            } else if (totalOfSpaces > spacesOnBoard) {
                System.out.println("You have " + totalOfSpaces + " spaces and lost the game. Please try again.");
                break;
            } else {
                if (i == numberOfRolls) {
                    System.out.println("Roll #" + (i + 1) + ": You've rolled a " + die + ". You are on space " + totalOfSpaces + " and you haven't made it to all the spaces on the board.");
                } else {
                    System.out.println("Roll #" + (i + 1) + ": You've rolled a " + die + ". You are on space " + totalOfSpaces + " and you have " + spacesLeftOnBoard + " left on the board.");
                }
            }

            System.out.println();
        }
    }
}

/*
if ( totalOfSpaces < spacesOnBoard && dieRolls < numberOfRolls){

            } else if ( totalOfSpaces < spacesOnBoard || dieRolls == numberOfRolls) {

            } else if (totalOfSpaces == spacesOnBoard && dieRolls <= numberOfRolls) {

            } else {

            }
 */