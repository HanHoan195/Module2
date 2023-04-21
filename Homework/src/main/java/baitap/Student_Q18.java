package baitap;

public class Student_Q18 implements Comparable<Student_Q18>{
    private int id;
    private String name;

    public Student_Q18() {
    }

    public Student_Q18(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }


    @Override
    public int compareTo(Student_Q18 o) {
        if (this.id > o.getId()) {
            return 1;
        } else if (this.id == o.getId()) {
            return 0;
        }else {
            return -1;
        }
    }
}
