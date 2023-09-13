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

    public static double returnSumSalary(Object[] o) {
        double sumSalary = 0;
        Employee[] employees = (Employee[]) o;
        for (Employee element : employees) {
            sumSalary += element.salary;
        }
        return sumSalary;
    }

//    находить человека с минимальным Salary
    public static Object findMinSalary(Object[] o) {
        Employee[] employees = (Employee[]) o;
        Arrays.sort(employees, Comparator.comparing(Employee :: getSalary));
        return employees[0];
    }


//    находить человека с максимальным Salary
    public static Object findMaxSalary(Object[] o) {
        Employee[] employees = (Employee[]) o;
        Arrays.sort(employees, Comparator.comparing(Employee :: getSalary));
        return employees[employees.length - 1];
    }

    public static double findAverageValue(Object[] o) {
        Employee[] employees = (Employee[]) o;
        return returnSumSalary(employees) / employees.length - 1;
    }

    public static void printName(Object[] o) {
        Employee[] employees = (Employee[]) o;
        for (Employee element : employees) {
            System.out.println(element.getEmployeeName());
        }
    }

//    Повышает зарплату на заданный процент
    public static void increaseSalary(Object[] o, int percent) {
        Employee[] employees = (Employee[]) o;
        for (Employee element : employees) {
            element.salary += element.salary * ((double) percent / 100);
        }
    }

//    Сортирует массив на основе отдела
    public static Object sortObjectInDepartment(Object[] o) {
        Employee[] employees = (Employee[]) o;
        Arrays.sort(employees, Comparator.comparing(Employee :: getDepartment));
        return employees;
    }

//    находить человека с минимальным Salary внутри отдела
    public static Object findMinSalaryInDepartment(Object[] o, int department) {
        Employee[] employees = (Employee[]) sortObjectInDepartment(o);

        Employee minSalaryEmployee = null;
        int nextIndex = 1;

        for (Employee element : employees) {
            if (element.department == department && element.salary < employees[nextIndex].salary) {
                minSalaryEmployee = element;
                nextIndex ++;
            }
        }
        return minSalaryEmployee;
    }

//    находить человека с максимальным Salary внутри отдела
    public static Object findMaxSalaryInDepartment(Object[] o, int department) {
        Employee[] employees = (Employee[]) sortObjectInDepartment(o);

        Employee maxSalaryEmployee = null;
        int nextIndex = 1;
        for (Employee element : employees) {
            if (element.department == department && element.salary > employees[nextIndex].salary) {
               maxSalaryEmployee = element;
               nextIndex ++;
            }
        }
        return maxSalaryEmployee;
    }

//    Суммa затрат на зарплату по отделу
    public static double calculateSumSalaryDepartment(Object[] o, int department) {
        Employee[] employees = (Employee[]) sortObjectInDepartment(o);

        double sum = 0;
        for (Employee element : employees) {
            if (element.department == department) {
                sum += element.salary;
            }
        }
        return sum;
    }

    //    средняя зарплата по отделу
    public static double calculateAverageValueDepartment(Object[] o, int department) {
        Employee[] employees = (Employee[]) sortObjectInDepartment(o);
        int count = 0;

        for (int i = 0; i < employees.length; i++) {
            if (employees[i].department == department) {
                count++;
            }
//          Останавливает цикл если не треубется его дальнейшая работа
            if (employees[i].department == department && i + 1 < employees.length - 1 &&
                    employees[i + 1].department != department ) {
                break;
            }
            
        }
        
        return calculateSumSalaryDepartment(o, department) / count;
    }

//    Проиндексировать зарплату всех сотрудников отдела
    public static void increaseDepartmentSalary(Object[] o, int department, int percent) {
        Employee[] employees = (Employee[]) sortObjectInDepartment(o);
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].department == department) {
                employees[i].salary += employees[i].salary * ((double) percent / 100);
            }
//            Останавливает цикл если не треубется его дальнейшая работа
            if (employees[i].department == department && i + 1 < employees.length - 1 &&
                    employees[i + 1].department != department ) {
                break;
            }
        }
    }

//    печатает всех сотрудников отдела
    public static void PrintDepartmentEmployee(Object[] o, int department) {
        Employee[] employees = (Employee[]) sortObjectInDepartment(o);
        for (int i = 0; i < employees.length; i++) {
            System.out.println(1);
            if (employees[i].department == department) {
                System.out.println("Name: " + employees[i].getEmployeeName() + ", salary: " + employees[i].getSalary()
                        + ", id: " + employees[i].getId());
            }

//            Останавливает цикл если не треубется его дальнейшая работа
            if (employees[i].department == department && i + 1 < employees.length - 1 &&
                    employees[i + 1].department != department ) {
                break;
            }
        }

    }

//    вывести в консоль всех сотрудников с зарплатой меньше числа
    public static void printEmployeeLessSalary(Object[] o, int number) {
        Employee[] employees = (Employee[]) o;
        for (Employee element : employees) {
            if (element.salary < number) {
                System.out.println("Name; " + element.getEmployeeName() + ", salary: " + element.getSalary()
                        + ", id: " + element.getId());
            }
        }
    }

//    вывести в консоль всех сотрудников с зарплатой больше числа
    public static void printEmployeeMoreSalary(Object[] o, int number) {
        Employee[] employees = (Employee[]) o;
        for (Employee element : employees) {
            if (element.salary > number) {
                System.out.println("Name; " + element.getEmployeeName() + ", salary: " + element.getSalary()
                        + ", id: " + element.getId());
            }
        }
    }





}
