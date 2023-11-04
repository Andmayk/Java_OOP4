package data;

import java.time.LocalDate;
import java.util.Comparator;

public class Teacher extends User{

    private Long teacherId;

    public Teacher(String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
        super(firstName, secondName, patronymic, dateOfBirth);
    }

    public Long getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }

    public static class TeacherComparator implements Comparator {
        @Override
        public int compare(Object o1, Object o2) {
            return 0;
        }
    }
    @Override
    public String toString() {
        return "Teacher{" +
                "teacherId='" + teacherId +'\'' +
                ", firstName='" + super.getFirstName() + '\'' +
                ", secondName='" + super.getSecondName() + '\'' +
                ", patronymic='" + super.getPatronymic() + '\'' +
                ", dateOfBirth=" + super.getDateOfBirth() +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if (!(obj instanceof Teacher)){
            return false;
        }
        Teacher teacher = (Teacher) obj;

        return getFirstName().equals(teacher.getFirstName()) &&
                getSecondName().equals(teacher.getSecondName()) &&
                getPatronymic().equals(teacher.getPatronymic()) &&
                getDateOfBirth().equals(teacher.getDateOfBirth()) ;
    }
}
