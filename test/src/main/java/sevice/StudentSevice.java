package sevice;

import Model.Student;
import utils.CSVUtils;

import java.util.ArrayList;
import java.util.List;

public class StudentSevice implements IStudentSevice{
    List<Student> students = new ArrayList<>();
    public static String path = "D:\\CASE_MD2\\test\\src\\main\\java\\data\\student.csv";
    @Override
    public List<Student> getStudent() {
       List<Student> newStudents = new ArrayList<>();
       List<String> records = CSVUtils.read(path);
       for (String record : records){
           newStudents.add(new Student(record));
       }
       return students = newStudents;
    }

    @Override
    public void addStudent(Student newStudent) {
        List<Student> students = getStudent();
        students.add(newStudent);
        CSVUtils.write(path, students);
    }

    @Override
    public void updateStudent(Student newStudent) {
        List<Student> students = getStudent();
        for (Student student : students) {
           if ( student.getId() == newStudent.getId()){
               student.setName(newStudent.getName());
               student.setAge(newStudent.getAge());
               student.setGender(newStudent.getGender());
               student.setAddress(newStudent.getAddress());
               student.setDiemtrungbinh(newStudent.getDiemtrungbinh());

            }
        }
        CSVUtils.write(path, students);
    }

    @Override
    public void deleteStudent(int id) {
        List<Student> students = getStudent();
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == id) {
                students.remove(i);
                break;
            }
        }
        CSVUtils.write(path, students);
    }
    public boolean existStudent(int id){
        getStudent();
        for (Student student : students) {
            if (student.getId() == id ){
                return true;
            }
        }
        return false;
    }
}
