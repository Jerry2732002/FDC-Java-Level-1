package src.week_one.day_two.enum_02;

import java.util.HexFormat;

public enum PrimaryColor {
    RED,
    GREEN,
    BLUE;

    static PrimaryColor checkHexaCode(String hexacode) {

        switch (hexacode) {
            case "FF0000" : return RED;

            case "0000FF" : return BLUE;

            case "00FF00" : return GREEN;
        }
        return null;
    }
}
