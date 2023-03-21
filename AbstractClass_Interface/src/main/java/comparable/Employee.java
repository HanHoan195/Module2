package comparable;

public class Employee implements Comparable{
    private String name;
    private int age;
    private float salary;
    public Employee(){

    }
    public Employee(String name, int age, float salary){
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
    @Override
    public String toString(){
        return String.format("Employee: {Name: %s ,Age: %s , Salary: %s",name, age,salary);
    }

    @Override
    public int compareTo(Object o) {//thực hiện so sánh đối tượng hiện tại vs đối tượng truyền vào

         // trả về dương là lớn hơn, âm là nhỏ hơn , 0 là bằng nhau
        if(o instanceof Employee){
            Employee emp = (Employee) o;

            //sắp xeesp theo tuổi
            return this.age - emp.age;

            //sắp xếp theo tên
//            return this.name.compareTo(emp.name);

            //sắp xếp theo lương
//            if(this.salary> emp.salary){
//                return 1;
//            } else if (this.salary < emp.salary) {
//                return -1;
//            } else {
//                return 0;
//            }

        }
        throw new UnsupportedOperationException("Not support yet!");
    }
}
