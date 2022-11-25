package main.subjects;

import java.util.ArrayList;
import java.util.List;

import main.domains.EmployeeDAO;
import main.domains.Employee;
import main.observers.IObserver;

public class EmployeeManagementSystem implements ISubjects {

    private List<IObserver> observers;
    private List<Employee> employeeList;
    private EmployeeDAO employeeDAO;

    private Employee employee;
    private String msg;
    
    public EmployeeManagementSystem(){
        observers = new ArrayList<IObserver>();
        employeeDAO = new EmployeeDAO();
        employeeList = employeeDAO.generateEmployees();
    }
    @Override
    public void registerObserver(IObserver ob) {
        observers.add(ob);
    }

    @Override
    public void removeObserver(IObserver ob) {
        observers.remove(ob);
    }

    @Override
    public void notifyObserver() {
        for(IObserver department: observers){
            department.callMe(employee, msg);
        }
        
    }

    public void hireNewEmployee(Employee emp){
        employeeList.add(emp);
        employee = emp;
        msg = "New Employee Hired";
        notifyObserver();
    }

    public void modifyEmployeeName(Integer id, String newName){
        boolean notify=false;
        for(Employee emp: employeeList){
            if(id==emp.employeeId){
                emp.setName(newName);
                this.employee = emp;
                this.msg = "Employee name has been modified";
                notify = true;
            }
        }
        if(notify){
            notifyObserver();
        }
    }
    
}
