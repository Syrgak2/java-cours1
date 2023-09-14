import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;

public class EmployeeBook {
    private Employee[] employees = new Employee[10];
    {
        employees[0] = new Employee("Карыбеков Сыргак Карыбекович", 4, 100_000);
        employees[1] = new Employee("Лавров Александр Сергеевич", 4, 120_000);
        employees[2] = new Employee("Султанов Аяр Жаныбекович", 4, 140_000);
        employees[3] = new Employee("john Dept", 5, 80_000);
        employees[4] = new Employee("Бексултанова Альбина Жоробековна", 3, 98_034);
        employees[5] = new Employee("Лаврова Любовь Михайловна", 4, 50_666);
        employees[6] = new Employee("Sarah Snook", 2, 123_450);
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public void printEmployees() {
        for (Employee element  : employees) {
            System.out.println(element);

        }
    }


    public double returnSumSalary() {
        double sumSalary = 0;
        for (Employee element : employees) {
            if (element != null) {
                sumSalary += element.getSalary();
            }
        }
        return sumSalary;
    }

    public double findAverageValue() {
        return returnSumSalary() / employees.length - 1;
    }

    //    находить человека с минимальным Salary
    public  Object findMinSalary() {
//        Arrays.sort(employees, Comparator.comparing(Employee :: getSalary));
        Object minSalaryEmployee = null;
        int nextIndex = 1;
        for (Employee element : employees) {
            if (element != null && element.getSalary() < employees[nextIndex].getSalary()) {
                minSalaryEmployee = element;
                nextIndex ++;
            }
        }
        return minSalaryEmployee;
    }


    //    находить человека с максимальным Salary
    public Object findMaxSalary() {
//        Arrays.sort(employees, Comparator.comparing(Employee :: getSalary));
        Object maxSalaryEmployee = null;
        int nextIndex = 1;
        for (Employee element : employees) {
            if (element != null && element.getSalary() > employees[nextIndex].getSalary()) {
                maxSalaryEmployee = element;
                nextIndex ++;
            }
        }
        return maxSalaryEmployee;
    }

    public void printName() {
        for (Employee element : employees) {
            if (element != null) {
                System.out.println(element.getEmployeeName());
            }
        }
    }

    public void increaseSalary(int percent) {
        for (Employee element : employees) {
            if (element != null) {
                element.setSalary(element.getSalary() + element.getSalary() * ((double) percent / 100));
            }
        }
    }

//    Сортирует массив на основе отдела
    public void sortObjectInDepartment() {
        Arrays.sort(employees, Comparator.comparing(Employee :: getDepartment));
    }

    //    находить человека с минимальным Salary внутри отдела
    public Object findMinSalaryInDepartment(int department) {

        Employee minSalaryEmployee = null;
        int nextIndex = 1;

        for (Employee element : employees) {
            if (element != null && element.getDepartment() == department &&
                    element.getSalary() < employees[nextIndex].getSalary()) {
                minSalaryEmployee = element;
                nextIndex ++;
            }
        }
        return minSalaryEmployee;
    }

    //    находить человека с максимальным Salary внутри отдела
    public Object findMaxSalaryInDepartment(int department) {

        Employee maxSalaryEmployee = null;
        int nextIndex = 1;
        for (Employee element : employees) {
            if (element != null && element.getDepartment() == department && element.getSalary() > employees[nextIndex].getSalary()) {
                maxSalaryEmployee = element;
                nextIndex ++;
            }
        }
        return maxSalaryEmployee;
    }

    //    Суммa затрат на зарплату по отделу
    public double calculateSumSalaryDepartment(int department) {
        double sum = 0;

        for (Employee element : employees) {
            if (element != null && element.getDepartment() == department) {
                sum += element.getSalary();
            }
        }
        return sum;
    }

    //    средняя зарплата по отделу
    public double calculateAverageValueDepartment(int department) {
        int count = 0;

        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getDepartment() == department) {
                count++;
            }
//          Останавливает цикл если не треубется его дальнейшая работа
            if (employees[i] != null && employees[i].getDepartment() == department && i + 1 < employees.length - 1 &&
                    employees[i + 1].getDepartment() != department ) {
                break;
            }

        }

        return calculateSumSalaryDepartment(department) / count;
    }

    //    Проиндексировать зарплату всех сотрудников отдела
    public void increaseDepartmentSalary(int department, int percent) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getDepartment() == department) {
                employees[i].setSalary(employees[i].getSalary() + employees[i].getSalary() * ((double) percent / 100));
            }
    //    Останавливает цикл если не треубется его дальнейшая работа
            if (employees[i] != null && employees[i].getDepartment() == department && i + 1 < employees.length - 1 &&
                    employees[i + 1].getDepartment() != department ) {
                break;
            }
        }
    }

    //    печатает всех сотрудников отдела
    public void PrintDepartmentEmployee(int department) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getDepartment() == department) {
                System.out.println("Name: " + employees[i].getEmployeeName() + ", salary: " + employees[i].getSalary()
                        + ", id: " + employees[i].getId());
            }

//            Останавливает цикл если не треубется его дальнейшая работа
            if (employees[i] != null && employees[i].getDepartment() == department && i + 1 < employees.length - 1 &&
                    employees[i + 1].getDepartment() != department ) {
                break;
            }
        }

    }

    //    вывести в консоль всех сотрудников с зарплатой меньше числа
    public void printEmployeeLessSalary(int number) {
        for (Employee element : employees) {
            if (element != null && element.getSalary() < number) {
                System.out.println("Name; " + element.getEmployeeName() + ", salary: " + element.getSalary()
                        + ", id: " + element.getId());
            }
        }
    }

    //    вывести в консоль всех сотрудников с зарплатой больше числа
    public void printEmployeeMoreSalary(int number) {
        for (Employee element : employees) {
            if (element != null && element.getSalary() > number) {
                System.out.println("Name; " + element.getEmployeeName() + ", salary: " + element.getSalary()
                        + ", id: " + element.getId());
            }
        }
    }

    //   Методы очень сложно

//    Добавить нового сотрудника
    public void pushNewEmployee(String name, int department, double salary) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = new Employee(name, department, salary);
                break;
            }
        }

    }

//    Удалить сотрудника по ID
    public void deleteEmployee(String name) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && Objects.equals(employees[i].getEmployeeName(), name)) {
                employees[i] = null;
            }
        }
    }

//  Изменить сотрудника отдел
    private void modernizeDepartment(String name, int department) {
        for (Employee element : employees) {
            if (element != null &&Objects.equals(element.getEmployeeName(), name)) {
                element.setDepartment(department);
            }
        }
    }

//    Изменить сотрудника зарплата
    private void modernizeSalary(String name, double salary) {
        for (Employee element : employees) {
            if (element != null && Objects.equals(element.getEmployeeName(), name)) {
                element.setSalary(salary);
            }
        }
    }


//    Изменить сотрудника
//    Можно изменить отдел и зарплату по отдельности или вместе
    public void modernizeEmployee(String name, int department, double salary) {
        for (Employee element : employees) {
            if (element != null && Objects.equals(element.getEmployeeName(), name) && salary == 0) {
                modernizeDepartment(name, department);
            } else if (element != null && Objects.equals(element.getEmployeeName(), name) && department == 0) {
                modernizeSalary(name, salary);
            } else if (element != null && Objects.equals(element.getEmployeeName(), name)) {
                modernizeDepartment(name, department);
                modernizeSalary(name, salary);
            }
        }
    }

    public void printEmployeeByDepartment() {
        int department = 1;
        switch (department) {
            case (1):
                System.out.println("Department: " + department);
                for (Employee element : employees) {
                    if (element != null && element.getDepartment() == department) {
                        System.out.println("Name: " + element.getEmployeeName());
                    }
                };
                department += 1;
            case (2):
                System.out.println("Department: " + department);
                for (Employee element : employees) {
                    if (element != null && element.getDepartment() == department) {
                        System.out.println("Name: " + element.getEmployeeName());
                    }
                };
                department += 1;
            case (3):
                System.out.println("Department: " + department);
                for (Employee element : employees) {
                    if (element != null && element.getDepartment() == department) {
                        System.out.println("Name: " + element.getEmployeeName());
                    }
                };
                department += 1;
            case (4):
                System.out.println("Department: " + department);
                for (Employee element : employees) {
                    if (element != null && element.getDepartment() == department) {
                        System.out.println("Name: " + element.getEmployeeName());
                    }
                };
                department += 1;
            case (5):
                System.out.println("Department: " + department);
                for (Employee element : employees) {
                    if (element != null && element.getDepartment() == department) {
                        System.out.println("Name: " + element.getEmployeeName());
                    }
                };
                department += 1;
        }
    }


}
