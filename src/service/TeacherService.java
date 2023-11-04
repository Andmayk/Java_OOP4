package service;

import data.Teacher;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

// — Создать класс УчительСервис и реализовать аналогично проделанному на семинаре;
public class TeacherService implements UserService<Teacher> {
    private final List<Teacher> teachers;

    public TeacherService() {
        this.teachers = new ArrayList<>();
    }

    @Override
    public List<Teacher> getAll() {
        return teachers;
    }
    @Override
    public void create(String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
        Teacher teacher = new Teacher(firstName, secondName, patronymic, dateOfBirth);
        teachers.add(teacher);
    }

    public boolean findTeacher(Teacher teacherToFind){
            for (Teacher teacher: teachers){
                if (teacher.equals(teacherToFind)){
                return true;
                }
            }
        return false;
    }

}
