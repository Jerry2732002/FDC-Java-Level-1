package src.week_one.day_two.enum_04;

public enum Planets {
    MERCURY(3.30e23, 2440.0),
    VENUS(4.87e24, 6052.0),
    EARTH(5.97e24, 6371.0),
    MARS(6.42e23, 3390.0),
    JUPITER(1.90e27, 69911.0),
    SATURN(5.68e26, 58232.0),
    URANUS(8.68e25, 25362.0),
    NEPTUNE(1.02e26, 24622.0);

    private final double mass;
    private final double radius;

    public double getMass() {
        return mass;
    }



    public double getRadius() {
        return radius;
    }



    Planets(double mass, double radius){
        this.mass = mass;
        this.radius = radius;
    }

    public double calcGravity(){
        return 6.67 * Math.pow(10, -11) * this.getMass() / (this.getRadius() * this.getRadius())/1000000;
    }

}
