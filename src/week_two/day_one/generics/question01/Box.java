package src.week_two.day_one.generics.question01;

public class Box <T>{
    private T obj;
    public Box(
            T value) {
        this.obj = value;
    }
    public T getObject() {
        return obj;
    }

    public void setObject(T obj) {
        this.obj = obj;
    }

    public void displayType() {
        System.out.println("Type of object : " + this.obj.getClass());
    }

}
