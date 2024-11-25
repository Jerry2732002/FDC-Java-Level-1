package src.week_one.day_two.enum_02;

public enum SecondaryColor {
    CYAN,
    MAGENTA,
    YELLOW;

    static SecondaryColor checkHexaCode(String hexacode) {

        switch (hexacode) {
            case "FF00FF" : return MAGENTA;

            case "FFFF00" : return YELLOW;

            case "00FFFF" : return CYAN;
        }
        return null;
    }
}
