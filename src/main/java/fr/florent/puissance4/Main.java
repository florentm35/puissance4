package fr.florent.puissance4;

import fr.florent.puissance4.game.Puissance4;
import fr.florent.puissance4.game.constant.EnumCell;
import fr.florent.puissance4.game.constant.EnumPlayer;
import fr.florent.puissance4.game.exception.Puissance4GameException;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Puissance4 puissance4 = new Puissance4();
        EnumPlayer result = null;

        Scanner in = new Scanner(System.in);

        EnumPlayer currentPlayer = EnumPlayer.PLAYER1;
        int indexPlay = -1;

        int count = 0;
        do {
            printBoard(puissance4.getGameBoard());

            indexPlay = play(puissance4, in, currentPlayer);

            currentPlayer = currentPlayer == EnumPlayer.PLAYER1 ? EnumPlayer.PLAYER2 : EnumPlayer.PLAYER1;
            count++;
        } while ((result = puissance4.checkVictory(indexPlay)) == null || count > Puissance4.BOARD_SIZE);

        printBoard(puissance4.getGameBoard());

        System.out.println("result = " + result);

    }

    private static int play(Puissance4 puissance4, Scanner in, EnumPlayer currentPlayer) {
        do {
            try {
                System.out.println(currentPlayer + " choose column :");
                int col = in.nextInt();

                return puissance4.addChip(col, currentPlayer.playerChip);
            } catch (Puissance4GameException ex) {
                System.out.println(ex.getMessage());
            }
        } while (true);
    }

    private static void printBoard(EnumCell[] gameBoard) {

        StringBuilder board = new StringBuilder();
        for (int j = Puissance4.COLUMN_HEIGHT; j >= 0; j--) {
            for (int i = 0; i <= Puissance4.COLUMN_NUMBER; i++) {
                int index = i * (Puissance4.COLUMN_HEIGHT + 1) + j;
                EnumCell cell = gameBoard[index];
                board.append("|");
                //board.append("(").append(index).append(")");
                board.append(cell.icone);
            }
            board.append("\n");
        }
        System.out.print(board.toString());
    }
}
