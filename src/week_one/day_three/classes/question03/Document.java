package src.week_one.day_three.classes.question03;

public class Document implements Readable,Writable{

    @Override
    public void read() {
        System.out.println("Reading.....");
    }

    @Override
    public void write() {
        System.out.println("Writing.....");
    }
}
