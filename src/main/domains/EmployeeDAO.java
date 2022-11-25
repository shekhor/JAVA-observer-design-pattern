package main.domains;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO {
    Employee emp1 = new Employee(1,"mike", null, 5000, false);
    Employee emp2 = new Employee(2, "Steve", null, 2000, false);
    Employee emp3 = new Employee(3, "Pat", null, 8000, false);
    Employee emp4 = new Employee(4, "Joe", null, 10000, false);
    List<Employee> employeeList;

    public List<Employee> generateEmployees(){
        employeeList = new ArrayList<Employee>();
        employeeList.add(emp1);
        employeeList.add(emp2);
        employeeList.add(emp3);
        employeeList.add(emp4);
        return employeeList;

    }

    public void addEmployee(Employee emp){
        employeeList.add(emp);
    }
}
