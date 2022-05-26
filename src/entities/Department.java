package entities;


import java.util.ArrayList;
import java.util.List;

public class Department {

    private String name;
    private int payDay;

    private List<Employee> employeeList = new ArrayList<>();
    private Address address;

    public Department() {
    }

    public Department(String name, int payDay, Address address) {
        this.name = name;
        this.payDay = payDay;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPayDay() {
        return payDay;
    }

    public void setPayDay(int payDay) {
        this.payDay = payDay;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void addEmployee(Employee employee) {
        employeeList.add(employee);
    }

    public double payRoll() {
        double sum = 0.0;
        for (Employee employee : getEmployeeList()) {
            sum += employee.getSalary();
        }
        return sum;
    }
}
