package model;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Double.parseDouble;

public class StudentSerVice {
    List<Student> studentList = new ArrayList<>();
    private String path = "D:\\Module2\\Module2\\test\\src\\main\\java\\data\\student.csv";


    public List<Student> getAll() {
        List<Student> studentList = new ArrayList<>();
        List<String> read = CSVUtil.readFile(path);
        for (String student : read) {
            String[] strings = student.split(",");
            studentList.add(new Student(Long.parseLong(strings[0]), strings[1], Integer.parseInt(strings[2]), strings[3], strings[4], Double.parseDouble(strings[5])));
        }
        return studentList;
    }

    public Student findById(long id) {
        studentList = getAll();
        for (Student student : studentList) {
            if (id == student.getId()) {
                return student;
            }
        }
        return null;
    }

    public void addStudent(Student student) {
        studentList = getAll();
        studentList.add(student);
        CSVUtil.writeFile(path,studentList);
    }

    public void deleteStudent(long id) {
        studentList = getAll();
        Student student = findById(id);
        studentList.remove(student);
        CSVUtil.writeFile(path,studentList);
    }

    public void updateStudent(long id,Student newStudent) {
        studentList = getAll();
        Student student = findById(id);
        student.setName(newStudent.getName());
        student.setAge(newStudent.getAge());
        student.setGender(newStudent.getGender());
        student.setAddress(newStudent.getAddress());
        student.setAveragePoint(newStudent.getAveragePoint());
        studentList.add(student);
        CSVUtil.writeFile(path,studentList);
    }







}
