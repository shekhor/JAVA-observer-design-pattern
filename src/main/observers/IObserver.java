package main.observers;

import main.domains.Employee;

public interface IObserver {
    public void callMe(Employee emp, String msg);
}
