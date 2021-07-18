package fr.florent.puissance4.game.pojo;

public class ValidatorValue {

    private int min;
    public int pas;
    public int nbCellToCheck;

    public ValidatorValue(int pas) {
        this(pas, 7);
    }

    public ValidatorValue(int pas, int nbCellToCheck) {
        this.min = -3 * pas;
        this.pas = pas;
        this.nbCellToCheck = nbCellToCheck;
    }


    public int getMin(int begin) {
        return min + begin;
    }


}
