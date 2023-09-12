import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class Employee {
    private String employeeName;
    private int department;
    private double salary;
    private static int nextId = 1;
    private int id = 0;



    public Employee(String name, int department, double salary) {
        this.employeeName = name;
        this.department = department;
        this.salary = salary;
        this.id = this.setId();
    }

    public String getEmployeeName() {
        return this.employeeName;
    }

    public int getDepartment() {
        return this.department;
    }

    public double getSalary() {
        return this.salary;
    }

    public int getId() {
        return id;
    }

    public void setEmployeeName(String newName) {
        this.employeeName = newName;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(double newSalary) {
        this.salary = newSalary;
    }


    public int setId() {
        id = nextId;
        nextId++;
        return id;
    }


    public String toString() {
        return "name: " + this.employeeName + ", " + "department: " + this.department + ", "
                + "salary: " + this.salary + ", " + "id; " + this.id;
    }

    public static void printEmployees(Object o) {
        Employee[] employees = (Employee[]) o;
        for (Employee element : employees) {
            System.out.println(element.toString());
        }
    }

    public static double sumSalary(Object[] o) {
        double sumSalary = 0;
        Employee[] employees = (Employee[]) o;
        for (Employee element : employees) {
            sumSalary += element.salary;
        }
        return sumSalary;
    }

    public static Object minSalary(Object[] o) {
        Employee[] employees = (Employee[]) o;
        Arrays.sort(employees, Comparator.comparing(Employee :: getSalary));
        return employees[0];
    }

    public static Object maxSalary(Object[] o) {
        Employee[] employees = (Employee[]) o;
        Arrays.sort(employees, Comparator.comparing(Employee :: getSalary));
        return employees[employees.length - 1];
    }

    public static double returnAverageValue(Object[] o) {
        Employee[] employees = (Employee[]) o;
        return sumSalary(employees) / employees.length - 1;
    }

    public static void printName(Object[] o) {
        Employee[] employees = (Employee[]) o;
        for (Employee element : employees) {
            System.out.println(element.getEmployeeName());
        }
    }



}
