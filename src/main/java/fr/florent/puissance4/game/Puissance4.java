package fr.florent.puissance4.game;

import fr.florent.puissance4.game.constant.EnumCell;
import fr.florent.puissance4.game.constant.EnumPlayer;
import fr.florent.puissance4.game.exception.Puissance4GameException;
import fr.florent.puissance4.game.pojo.ValidatorValue;

import java.util.stream.IntStream;

public class Puissance4 {

    public static final int COLUMN_NUMBER = 6;
    public static final int COLUMN_HEIGHT = 5;

    public static final int BOARD_SIZE = (COLUMN_NUMBER + 1) * (COLUMN_HEIGHT + 1);


    private EnumCell[] gameBoard;

    public Puissance4() {
        this(IntStream.range(0, BOARD_SIZE + 1)
                .mapToObj(i -> EnumCell.EMPTY)
                .toArray(EnumCell[]::new));
    }

    public Puissance4(EnumCell[] gameBoard) {
        this.gameBoard = gameBoard;
    }

    public int addChip(int col, EnumCell cell) {
        if (col < 0 || col > COLUMN_NUMBER) {
            throw new Puissance4GameException("col must be between 0 and " + COLUMN_NUMBER);
        }
        if (cell == null) {
            throw new Puissance4GameException("cell cannot be null");
        }

        for (int i = 0; i <= COLUMN_HEIGHT; i++) {
            int index = col * COLUMN_NUMBER + i;
            if (gameBoard[index] == EnumCell.EMPTY) {
                gameBoard[index] = cell;
                return index;
            }
        }

        throw new Puissance4GameException(String.format("column %d is full", col));
    }

    private static final ValidatorValue[] tabChecker = {
            new ValidatorValue(1, 4),
            new ValidatorValue(5),
            new ValidatorValue(6),
            new ValidatorValue(7)
    };

    /**
     * Check if someone has win and return EnumPlayer else return null;
     *
     * @return
     */
    public EnumPlayer checkVictory(int indexCell) {
        final EnumCell initialCell = gameBoard[indexCell];
        if (initialCell != EnumCell.EMPTY) {
            for (ValidatorValue value : tabChecker) {

                int count = 0;
                int currentIndex = value.getMin(indexCell);
                for (int i = 0;
                     i < value.nbCellToCheck && value.nbCellToCheck >= i + 4 - count;
                     i++) {
                    if (currentIndex >= 0 && currentIndex <= BOARD_SIZE) {
                        if (gameBoard[currentIndex] == initialCell) {
                            count++;
                        } else {
                            count = 0;
                        }
                        if (count == 4) {
                            return EnumPlayer.getByEnumCell(initialCell);
                        }
                    }
                    currentIndex += value.pas;
                }

            }

        }

        return null;
    }

    /**
     * Create copy of gameBoard
     *
     * @return
     */
    public EnumCell[] getGameBoard() {
        return gameBoard.clone();
    }

}
