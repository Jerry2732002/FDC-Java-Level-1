package src.week_one.day_three;

import src.week_one.day_three.classes.question01.Student;
import src.week_one.day_three.classes.question01.Teacher;
import src.week_one.day_three.classes.question02.Airplane;
import src.week_one.day_three.classes.question02.Bird;
import src.week_one.day_three.classes.question03.Document;

public class DayThreeExecutions {
    public static void question01Execute(){
        Student student1 = new Student("Jerry",22,"+91 9207828545",30,85.4);
        Student student2 = new Student("Thasleena",22,38,89.4);

        student1.printDetails();
        student2.printDetails();

        Teacher teacher = new Teacher("Nidal",28,"M.Tech");
        teacher.printDetails();
    }

    public static void question02Execute() {
        Airplane airplane = new Airplane();
        airplane.canFly();
        Bird bird = new Bird();
        bird.canFly();
    }

    public static void question03Execute(){
        Document document = new Document();
        document.read();
        document.write();
    }
}
