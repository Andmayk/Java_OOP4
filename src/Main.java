import controller.TeacherController;
import data.Teacher;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        TeacherController teacherController = new TeacherController();
        teacherController.showAllTeacher();

    }
}