package fr.florent.puissance4.game.constant;

import java.util.Arrays;

public enum EnumPlayer {
    PLAYER1(EnumCell.CROSS), PLAYER2(EnumCell.CIRCLE);

    public final EnumCell playerChip;

    EnumPlayer(EnumCell playerChip) {
        this.playerChip = playerChip;
    }

    public static EnumPlayer getByEnumCell(EnumCell cell) {
        for (EnumPlayer item : EnumPlayer.values()) {
            if (item.playerChip == cell) {
                return item;
            }
        }
        return null;
    }
}