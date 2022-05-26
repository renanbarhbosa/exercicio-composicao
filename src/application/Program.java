package application;


import entities.Address;
import entities.Department;
import entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Department's name: ");
        String departmentName = sc.nextLine();
        System.out.print("Payment day: ");
        int paymentDay = sc.nextInt();
        System.out.print("Email: ");
        sc.nextLine();
        String departmentEmail = sc.nextLine();
        System.out.print("Phone: ");
        String departmentPhone = sc.nextLine();
        Address address = new Address(departmentEmail, departmentPhone);
        Department dept = new Department(departmentName, paymentDay, new Address(departmentEmail, departmentPhone));
        System.out.print("How many employees working in this department? ");
        int numberOfEmployees = sc.nextInt();
        for (int i = 0; i < numberOfEmployees; i++) {
            sc.nextLine();
            System.out.print("Employee's name: ");
            String employeeName = sc.nextLine();
            System.out.print("Employee's salary: ");
            double employeeSalary = sc.nextDouble();
            dept.addEmployee(new Employee(employeeName, employeeSalary));
        }

        showReport(dept);

        sc.close();
    }

    private static void showReport(Department dept) {
        System.out.println("Payroll:");
        System.out.printf("Department " + dept.getName() + " = R$ " + String.format("%.2f", dept.payRoll()));
        System.out.printf("\nPayment sent at day: " + dept.getPayDay());
        System.out.println("\nEmployees:");
        for (Employee employee : dept.getEmployeeList()) {
            System.out.println(employee.getName());
        }
        System.out.println("For any questions, please contact us on email: " + dept.getAddress().getEmail());
    }

}
