package com.falabella.entity.enums;

public enum DisplayRaw {
    Four(4), Ten(10), Twenty(20), TwentyFive(25), Thirty(30), Fifty(50);

    private int value;

    private DisplayRaw(final int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

    public static DisplayRaw valueOf(int i) {
        switch (i) {
        case 4:
            return Four;
        case 10:
            return Ten;
        case 20:
            return Twenty;
        case 25:
            return TwentyFive;
        case 30:
            return Thirty;
        case 50:
            return Fifty;
        default:
            return Four;
        }
    }
}
