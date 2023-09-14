import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class Employee {
    private String employeeName;
    private int department;
    private double salary;
    private static int counter = 0;
    private int id = 0;



    public Employee(String name, int department, double salary) {
        this.employeeName = name;
        this.department = department;
        this.salary = salary;
        this.id = ++counter;
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


    public String toString() {
        return "name: " + this.employeeName + ", " + "department: " + this.department + ", "
                + "salary: " + this.salary + ", " + "id; " + this.id;
    }
}
