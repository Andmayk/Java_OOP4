package controller;

import data.Teacher;
import service.TeacherService;
import view.TeacherView;

import java.awt.*;
import java.time.LocalDate;
import java.util.List;

//— Создать класс УчительКонтроллер и реализовать возможность создания,
// редактирования конкретного учителя и отображения списка учителей, имеющихся в системе.
public class TeacherController implements UserController {

    private final TeacherService teacherService = new TeacherService();
    private final TeacherView teacherView = new TeacherView();

    @Override
    public void create(String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
        teacherService.create( firstName, secondName, patronymic, dateOfBirth);
    }

    public List<Teacher> getAllTeacher(){
        return teacherService.getAll();
    }

    public boolean findTeacher(Teacher teacher){
        if (teacherService.findTeacher(teacher)){
        return true;
        }
        else{
        teacherView.showTeacherNotFound(teacher);
        return false;
        }
    }

    public void showAllTeacher(){
        teacherView.sendOnConsole(teacherService.getAll());
    }

}
