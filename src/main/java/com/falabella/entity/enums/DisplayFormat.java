package com.falabella.entity.enums;

public enum DisplayFormat {
    FiveXFour("5x4"), FourXFour("4x4"), ThreeXFour("3x4"), TwoXFour("2x4");
    
    private String value;

    private DisplayFormat(final String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
    
    public static DisplayFormat valueOfString(String s) {
        switch (s) {
        case "5x4":
            return FiveXFour;
        case "4x4":
            return FourXFour;
        case "3x4":
            return ThreeXFour;
        case "2x4":
            return TwoXFour;
        default:
            return null;
        }
    }
}
