package view;

import data.Teacher;

import java.util.List;

// — Создать класс УчительСервис и реализовать аналогично проделанному на семинаре;
public class TeacherView implements UserView<Teacher>{

        @Override
        public void sendOnConsole(List<Teacher> teacherList) {
            if (teacherList.size() == 0) {
                System.out.println("no teachers in list");
            }
            else {
                for (Teacher teacher : teacherList) {
                    System.out.println(teacher);
                }
            }
        }
        public void showTeacherNotFound(Teacher teacher) {
                    System.out.println(teacher + " not found");
        }


}
