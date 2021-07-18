package fr.florent.puissance4.game.constant;

public enum EnumCell {
    EMPTY(" ", 0), CROSS("x", 1), CIRCLE("o", 2);

    public final String icone;

    public final int value;

    EnumCell(String icone, int value) {
        this.icone = icone;
        this.value = value;
    }
}
