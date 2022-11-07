package com.kodilla.rps;

import java.util.InputMismatchException;


public class RpsSettings {

    private int roundsQuantity = 0;
    private String playerName;

    public void printInitialInfo() {
        System.out.println("ROCK-PAPER-SCISSORS-LIZARD-SPOCK Game");
        System.out.println("What is your name?: ");
        playerName = RpsGame.scan.nextLine();

        boolean correctNumber = false;
        while (!correctNumber){
            try {
                System.out.println("How many rounds to win?: ");
                roundsQuantity = RpsGame.scan.nextInt();
                correctNumber = true;
            } catch (InputMismatchException e){
                System.out.println("Enter the valid number of rounds!");
                correctNumber = false;
                String word = RpsGame.scan.nextLine();
            }
        }


        System.out.println("\n\nInstructions:\n" +
                "Press 1 to play 'Rock'\n" +
                "Press 2 to play 'Paper'\n" +
                "Press 3 to play 'Scissors'\n" +
                "Press 4 to play 'Lizard'\n" +
                "Press 5 to play 'Spock'\n" +
                "Press x to end the game\n" +
                "Press n to restart the game\n"
        );
    }

    public int getRoundsQuantity(){
        return roundsQuantity;
    }

    public String getPlayerName() {
        return playerName;
    }
}