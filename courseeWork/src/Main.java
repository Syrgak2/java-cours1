public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        Employee[] employees = new Employee[7];
        employees[0] = new Employee("Карыбеков Сыргак Карыбекович", 1, 100_000);
        employees[1] = new Employee("Лавров Александр Сергеевич", 2, 120_000);
        employees[2] = new Employee("Султанов Аяр Жаныбекович", 4, 60_000);
        employees[3] = new Employee("john Dept", 5, 80_000);
        employees[4] = new Employee("Бексултанова Альбина Жоробековна", 3, 98_034);
        employees[5] = new Employee("Лаврова Любовь Михайловна", 4, 150_666);
        employees[6] = new Employee("Sarah Snook", 2, 123_450);

        for (Employee element : employees) {
            element.getId();
        }

        Employee.printEmployees(employees);
        System.out.println(Employee.sumSalary(employees));
        System.out.println("Сотрудник с минимальной зарплатой: " + Employee.minSalary(employees));
        System.out.println("max salary: " + Employee.maxSalary(employees));
        System.out.println("Среднее значение зарплат: " + Employee.returnAverageValue(employees));
        Employee.printName(employees);
    }
}