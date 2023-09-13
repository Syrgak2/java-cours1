public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        Employee[] employees = new Employee[7];
        employees[0] = new Employee("Карыбеков Сыргак Карыбекович", 4, 100_000);
        employees[1] = new Employee("Лавров Александр Сергеевич", 4, 120_000);
        employees[2] = new Employee("Султанов Аяр Жаныбекович", 4, 140_000);
        employees[3] = new Employee("john Dept", 5, 80_000);
        employees[4] = new Employee("Бексултанова Альбина Жоробековна", 3, 98_034);
        employees[5] = new Employee("Лаврова Любовь Михайловна", 4, 50_666);
        employees[6] = new Employee("Sarah Snook", 2, 123_450);

        for (Employee element : employees) {
            element.getId();
        }



        Employee.printEmployees(employees);
        System.out.println(Employee.returnSumSalary(employees));
        System.out.println("Сотрудник с минимальной зарплатой: " + Employee.findMinSalary(employees));
        System.out.println("max salary: " + Employee.findMaxSalary(employees));
        System.out.println("Среднее значение зарплат: " + Employee.findAverageValue(employees));
        Employee.printName(employees);

//        Повышенная сложность
        Employee.increaseSalary(employees, 15);
        System.out.println("After increase salary: ");
        Employee.printEmployees(employees);
        System.out.println("min in department" + Employee.findMinSalaryInDepartment(employees, 4));
        System.out.println("max in department" + Employee.findMaxSalaryInDepartment(employees, 4));

        Employee.increaseDepartmentSalary(employees, 5, 12);
        Employee.PrintDepartmentEmployee(employees, 5);
    }
}