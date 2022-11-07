import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;



public class RpsGame {

    private int playerMove, computerMove;
    Random random = new Random();
    static Scanner scan = new Scanner(System.in);

    private int playerWin = 0;
    private int computerWin = 0;
    private int draw = 0;

    public void playRound(){
        boolean correctNumber = false;
        while (!correctNumber){
            try {
                System.out.println("\nMake your move: ");
                playerMove = scan.nextInt();
                correctNumber = true;
            } catch (InputMismatchException e){
                System.out.println("Incorrect move!");
                System.out.println("1-Rock,2-Paper,3-Scissors,4-Lizard,5-Spock");
                correctNumber = false;
                String word = scan.nextLine();
            }
        }

        computerMove = random.nextInt(1, 6);

        if(playerMove == computerMove){
            System.out.println("It's a tie\n");
            draw++;
        } else if(playerMove == 1){
            System.out.println("Your move: Rock");
            if(computerMove == 2){
                System.out.println("Computer move is:Paper \nComputer wins round!");
                computerWin++;
            }
            else if(computerMove == 3){
                System.out.println("Computer move is:Scissors\nPlayer wins round!");
                playerWin++;
            }
            else if(computerMove == 4){
            System.out.println("Computer move is:Lizard\nPlayer wins round");
            playerWin++;
            }
            else if(computerMove == 5){
                System.out.println("Computer move is:Spock\nComputer wins round!");
                computerWin++;
            }
        } else if(playerMove == 2) {
            System.out.println("Your move: Paper");
            if (computerMove == 1) {
                System.out.println("Computer move is:Rock\nPlayer wins round!");
                playerWin++;
            } else if(computerMove == 3) {
                System.out.println("Computer move is:Scissors\nComputer wins round!");
                computerWin++;
            } else if(computerMove == 4) {
                System.out.println("Computer move is:Lizard\nComputer wins round!");
                computerWin++;
            }
            else if(computerMove == 5) {
                System.out.println("Computer move is:Spock\nPlayer wins round!");
                playerWin++;
            }
        } else if(playerMove == 3) {
            System.out.println("Your move: Scissors");
            if (computerMove == 1) {
                System.out.println("Computer move is:Rock\nComputer wins round!");
                computerWin++;
            }
            else if(computerMove == 2) {
                System.out.println("Computer move is:Paper\nPlayer wins round!");
                playerWin++;
            }
            else if(computerMove == 4) {
                System.out.println("Computer move is:Lizard\nPlayer wins round");
                playerWin++;
            }
            else if(computerMove == 5) {
                System.out.println("Computer move is:Spock\nComputer wins round!");
                computerWin++;
            }
        }
        else if(playerMove == 4) {
            System.out.println("Your move: Lizard");
            if (computerMove == 1) {
                System.out.println("Computer move is:Rock\nComputer wins round!");
                computerWin++;
            }
            else if(computerMove == 2) {
                System.out.println("Computer move is:Paper\nPlayer wins round!");
                playerWin++;
            }
            else if(computerMove == 3) {
                System.out.println("Computer move is:Scissors\nComputer wins round!");
                computerWin++;
            }
            else if(computerMove == 5) {
                System.out.println("Computer move is:Spock\nPlayer wins round!");
                playerWin++;
            }
        }
        else if(playerMove == 5) {
            System.out.println("Your move: Spock");
            if (computerMove == 1) {
                System.out.println("Computer move is:Rock\nPlayer wins round!");
                playerWin++;
            }
            else if(computerMove == 2) {
                System.out.println("Computer move is:Paper\nComputer wins round!");
                computerWin++;
            }
            else if(computerMove == 3) {
                System.out.println("Computer move is:Scissors\nPlayer wins round");
                playerWin++;
            }
            else if(computerMove == 4) {
                System.out.println("Computer move is:Lizard\nComputer wins round!");
                computerWin++;
            }
        }



        System.out.println("Results: Player wins: " + playerWin +
                " Computer wins: " + computerWin + " Draws: " + draw);
    }



    public int getPlayerWin() {
        return playerWin;
    }

    public int getComputerWin() {
        return computerWin;
    }
}