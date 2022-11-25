package main.observers;

import main.domains.Employee;

public class PayrollDepartment implements IObserver{

    @Override
    public void callMe(Employee emp, String msg) {
        System.out.println("PayRoll Department Notified.....");
        System.out.println(msg+" "+emp.getName());
    }

}
