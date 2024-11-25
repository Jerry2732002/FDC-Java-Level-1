package src.week_one.day_two.enum_01;

public enum Directions {
    NORTH,
    SOUTH,
    EAST,
    WEST;

    static Directions getOpposite(Directions direction) {
        switch (direction) {
            case NORTH:
                return SOUTH;

            case SOUTH:
                return NORTH;

            case EAST:
                return WEST;

            case WEST:
                return EAST;

            default:
                return NORTH;
        }
    }
}
