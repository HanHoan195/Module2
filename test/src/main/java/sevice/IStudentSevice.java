package sevice;

import Model.Student;

import java.util.List;

public interface IStudentSevice {
    List<Student> getStudent();

    void addStudent(Student newStudent) ;
    void updateStudent(Student newStuden);
    void deleteStudent(int id);


}
