package main.clients;

import main.domains.Employee;
import main.observers.HRDepartment;
import main.observers.IObserver;
import main.observers.PayrollDepartment;
import main.subjects.EmployeeManagementSystem;

public class App {
    public static void main(String [] args){
        IObserver payroll = new PayrollDepartment();
        IObserver hrDept = new HRDepartment();

        EmployeeManagementSystem ems = new EmployeeManagementSystem();
        ems.registerObserver(payroll);
        ems.registerObserver(hrDept);

        Employee emp = new Employee(5, "bob", "", 4000, true);
        ems.hireNewEmployee(emp);
        
        ems.modifyEmployeeName(5, "shekhor");
    }
}
