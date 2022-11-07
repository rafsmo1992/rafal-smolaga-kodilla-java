package com.kodilla.rps;

public class RpsRunner {

    public static void main(String[] args) {
        RpsSettings rpsSettings = new RpsSettings();

        boolean end = false;

        rpsSettings.printInitialInfo();


        while(!end) {
            RpsGame rps = new RpsGame();

            while (rps.getPlayerWin() < rpsSettings.getRoundsQuantity() &&
                    rps.getComputerWin() < rpsSettings.getRoundsQuantity()) {
                rps.playRound();
            }

            if (rps.getPlayerWin() > rps.getComputerWin()) {
                System.out.println("\nWinner: " + rpsSettings.getPlayerName());
            } else {
                System.out.println("\nWinner: COMPUTER");
            }


            char playAgain = 'a';

            while (playAgain != 'x' && playAgain != 'n') {
                System.out.println("\nPress x to end the game\n" +
                        "Press n to start new game");
                playAgain = RpsGame.scan.next().charAt(0);

            }

            switch (playAgain) {
                case 'n':
                    end = false;
                    break;
                case 'x':
                    end = true;
                    break;
            }

        }

    }
}