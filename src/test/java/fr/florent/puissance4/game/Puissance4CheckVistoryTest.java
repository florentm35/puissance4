package fr.florent.puissance4.game;

import fr.florent.puissance4.game.constant.EnumCell;
import fr.florent.puissance4.game.constant.EnumPlayer;
import org.junit.Assert;
import org.junit.Test;

public class Puissance4CheckVistoryTest {

    private void printBoard(EnumCell[] gameBoard) {

        StringBuilder board = new StringBuilder();
        for (int j = Puissance4.COLUMN_HEIGHT; j >= 0; j--) {
            for (int i = 0; i <= Puissance4.COLUMN_NUMBER; i++) {
                int index = i * (Puissance4.COLUMN_HEIGHT + 1) + j;
                EnumCell cell = gameBoard[index];
                board.append("|");
                board.append("(").append(index).append(")");
                board.append(cell.icone);
            }
            board.append("\n");
        }
        System.out.print(board.toString());
    }


    @Test
    public void testVictoryRight1() {

        System.out.println("testVictoryRight1");

        EnumCell[] board = {
                EnumCell.CROSS, EnumCell.EMPTY, EnumCell.EMPTY, EnumCell.EMPTY, EnumCell.EMPTY, EnumCell.EMPTY,
                EnumCell.CROSS, EnumCell.EMPTY, EnumCell.EMPTY, EnumCell.EMPTY, EnumCell.EMPTY, EnumCell.EMPTY,
                EnumCell.CROSS, EnumCell.EMPTY, EnumCell.EMPTY, EnumCell.EMPTY, EnumCell.EMPTY, EnumCell.EMPTY,
                EnumCell.CROSS, EnumCell.EMPTY, EnumCell.EMPTY, EnumCell.EMPTY, EnumCell.EMPTY, EnumCell.EMPTY,
                EnumCell.EMPTY, EnumCell.EMPTY, EnumCell.EMPTY, EnumCell.EMPTY, EnumCell.EMPTY, EnumCell.EMPTY,
                EnumCell.EMPTY, EnumCell.EMPTY, EnumCell.EMPTY, EnumCell.EMPTY, EnumCell.EMPTY, EnumCell.EMPTY,
                EnumCell.EMPTY, EnumCell.EMPTY, EnumCell.EMPTY, EnumCell.EMPTY, EnumCell.EMPTY, EnumCell.EMPTY,
                EnumCell.EMPTY, EnumCell.EMPTY, EnumCell.EMPTY, EnumCell.EMPTY, EnumCell.EMPTY, EnumCell.EMPTY,
        };


        Puissance4 puissance4 = new Puissance4(board);
        printBoard(board);

        Assert.assertEquals(EnumPlayer.getByEnumCell(EnumCell.CROSS), puissance4.checkVictory(0));
    }

    @Test
    public void testVictoryRight2() {
        System.out.println("testVictoryRight2");
        EnumCell[] board = {
                EnumCell.CROSS, EnumCell.EMPTY, EnumCell.EMPTY, EnumCell.EMPTY, EnumCell.EMPTY, EnumCell.EMPTY,
                EnumCell.CROSS, EnumCell.EMPTY, EnumCell.EMPTY, EnumCell.EMPTY, EnumCell.EMPTY, EnumCell.EMPTY,
                EnumCell.CROSS, EnumCell.EMPTY, EnumCell.EMPTY, EnumCell.EMPTY, EnumCell.EMPTY, EnumCell.EMPTY,
                EnumCell.CROSS, EnumCell.EMPTY, EnumCell.EMPTY, EnumCell.EMPTY, EnumCell.EMPTY, EnumCell.EMPTY,
                EnumCell.EMPTY, EnumCell.EMPTY, EnumCell.EMPTY, EnumCell.EMPTY, EnumCell.EMPTY, EnumCell.EMPTY,
                EnumCell.EMPTY, EnumCell.EMPTY, EnumCell.EMPTY, EnumCell.EMPTY, EnumCell.EMPTY, EnumCell.EMPTY,
                EnumCell.EMPTY, EnumCell.EMPTY, EnumCell.EMPTY, EnumCell.EMPTY, EnumCell.EMPTY, EnumCell.EMPTY,
                EnumCell.EMPTY, EnumCell.EMPTY, EnumCell.EMPTY, EnumCell.EMPTY, EnumCell.EMPTY, EnumCell.EMPTY,
        };


        Puissance4 puissance4 = new Puissance4(board);
        printBoard(board);

        Assert.assertEquals(EnumPlayer.getByEnumCell(EnumCell.CROSS), puissance4.checkVictory(6));
    }
    @Test
    public void testVictoryRight3() {
        System.out.println("testVictoryRight3");
        EnumCell[] board = {
                EnumCell.CROSS, EnumCell.EMPTY, EnumCell.EMPTY, EnumCell.EMPTY, EnumCell.EMPTY, EnumCell.EMPTY,
                EnumCell.EMPTY, EnumCell.CROSS, EnumCell.EMPTY, EnumCell.EMPTY, EnumCell.EMPTY, EnumCell.EMPTY,
                EnumCell.EMPTY, EnumCell.EMPTY, EnumCell.CROSS, EnumCell.EMPTY, EnumCell.EMPTY, EnumCell.EMPTY,
                EnumCell.EMPTY, EnumCell.EMPTY, EnumCell.EMPTY, EnumCell.CROSS, EnumCell.EMPTY, EnumCell.EMPTY,
                EnumCell.EMPTY, EnumCell.EMPTY, EnumCell.EMPTY, EnumCell.EMPTY, EnumCell.EMPTY, EnumCell.EMPTY,
                EnumCell.EMPTY, EnumCell.EMPTY, EnumCell.EMPTY, EnumCell.EMPTY, EnumCell.EMPTY, EnumCell.EMPTY,
                EnumCell.EMPTY, EnumCell.EMPTY, EnumCell.EMPTY, EnumCell.EMPTY, EnumCell.EMPTY, EnumCell.EMPTY,
                EnumCell.EMPTY, EnumCell.EMPTY, EnumCell.EMPTY, EnumCell.EMPTY, EnumCell.EMPTY, EnumCell.EMPTY,
        };


        Puissance4 puissance4 = new Puissance4(board);
        printBoard(board);

        Assert.assertEquals(EnumPlayer.getByEnumCell(EnumCell.CROSS), puissance4.checkVictory(21));
    }
    @Test
    public void testNothing() {
        System.out.println("testNothing");
        EnumCell[] board = {
                EnumCell.CROSS, EnumCell.EMPTY, EnumCell.EMPTY, EnumCell.EMPTY, EnumCell.EMPTY, EnumCell.EMPTY,
                EnumCell.CROSS, EnumCell.EMPTY, EnumCell.EMPTY, EnumCell.EMPTY, EnumCell.EMPTY, EnumCell.EMPTY,
                EnumCell.CIRCLE, EnumCell.EMPTY, EnumCell.EMPTY, EnumCell.EMPTY, EnumCell.EMPTY, EnumCell.EMPTY,
                EnumCell.CROSS, EnumCell.EMPTY, EnumCell.EMPTY, EnumCell.EMPTY, EnumCell.EMPTY, EnumCell.EMPTY,
                EnumCell.CROSS, EnumCell.EMPTY, EnumCell.EMPTY, EnumCell.EMPTY, EnumCell.EMPTY, EnumCell.EMPTY,
                EnumCell.EMPTY, EnumCell.EMPTY, EnumCell.EMPTY, EnumCell.EMPTY, EnumCell.EMPTY, EnumCell.EMPTY,
                EnumCell.EMPTY, EnumCell.EMPTY, EnumCell.EMPTY, EnumCell.EMPTY, EnumCell.EMPTY, EnumCell.EMPTY,
                EnumCell.EMPTY, EnumCell.EMPTY, EnumCell.EMPTY, EnumCell.EMPTY, EnumCell.EMPTY, EnumCell.EMPTY,
        };


        Puissance4 puissance4 = new Puissance4(board);
        printBoard(board);

        Assert.assertEquals(null, puissance4.checkVictory(6));
    }



}
