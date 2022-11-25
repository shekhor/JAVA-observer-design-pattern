package main.domains;

public class Employee {
    public Integer employeeId;
    private String name;
    private String dept;
    private Integer salary;
    private boolean working;

    public Employee(Integer id, String name, String dept, Integer sal, boolean working){
        this.employeeId = id;
        this.name = name;
        this.dept = dept;
        this.salary = sal;
        this.working = working;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public String getName(){
        return name;
    }

    public void setWorking(boolean working) {
        this.working = working;
    }

    public String getDept() {
        return dept;
    }

    public Integer getSalary() {
        return salary;
    }

    public boolean isWorking() {
        return working;
    }

    public Integer getEmployeeId(){
        return employeeId;
    }
}
