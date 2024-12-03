package src.week_two.day_two;

public class ExceptionPropagation {
    public void exceptionPropagation() {
        class InnerClass {
            public void innerClassException() {
                throw new RuntimeException("Exception from inner class");
            }
        }
        InnerClass innerClass = new InnerClass();
        innerClass.innerClassException();
    }
}

