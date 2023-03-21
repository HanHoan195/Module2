package comparable;

import java.util.Comparator;

public class CompareEmployeeByName implements Comparator {
    @Override
    public int compare(Object o1, Object o2){
        if ((o1 instanceof Employee) && (o2 instanceof Employee)){
            Employee emp1 = (Employee) o1;
            Employee emp2 = (Employee) o2;

            return emp1.getName().compareTo(emp2.getName());
        }
        throw new UnsupportedOperationException("Not support yet");
    }
}
