import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String playAgain;

        do {
            String playerA = "";
            String playerB = "";

            while (true) {
                System.out.print("Player A, enter your move (R, P, S): ");
                playerA = scanner.nextLine().trim();
                if (playerA.equalsIgnoreCase("R") || playerA.equalsIgnoreCase("P") || playerA.equalsIgnoreCase("S")) {
                    break;
                }
                System.out.println("Invalid move. Please enter R, P, or S.");
            }

            while (true) {
                System.out.print("Player B, enter your move (R, P, S): ");
                playerB = scanner.nextLine().trim();
                if (playerB.equalsIgnoreCase("R") || playerB.equalsIgnoreCase("P") || playerB.equalsIgnoreCase("S")) {
                    break;
                }
                System.out.println("Invalid move. Please enter R, P, or S.");
            }

            playerA = playerA.toUpperCase();
            playerB = playerB.toUpperCase();

            if (playerA.equals(playerB)) {
                System.out.println(getMoveName(playerA) + " vs " + getMoveName(playerB) + " - It's a Tie!\n");
            } else if (playerA.equals("R")) {
                if (playerB.equals("S")) {
                    System.out.println("Rock breaks Scissors (Player A wins!)\n");
                } else {
                    System.out.println("Paper covers Rock (Player B wins!)\n");
                }
            } else if (playerA.equals("P")) {
                if (playerB.equals("R")) {
                    System.out.println("Paper covers Rock (Player A wins!)\n");
                } else {
                    System.out.println("Scissors cuts Paper (Player B wins!)\n");
                }
            } else if (playerA.equals("S")) {
                if (playerB.equals("P")) {
                    System.out.println("Scissors cuts Paper (Player A wins!)\n");
                } else {
                    System.out.println("Rock breaks Scissors (Player B wins!)\n");
                }
            }

            System.out.print("Do you want to play again? [Y/N]: ");
            playAgain = scanner.nextLine().trim();
            System.out.println();

        } while (playAgain.equalsIgnoreCase("Y"));

        System.out.println("Thanks for playing!");
        scanner.close();
    }

    private static String getMoveName(String move) {
        switch (move) {
            case "R": return "Rock";
            case "P": return "Paper";
            case "S": return "Scissors";
            default: return "";
        }
    }
}