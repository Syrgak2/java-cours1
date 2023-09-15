public class Main {
    public static void main(String[] args) {

        EmployeeBook employeeBook = new EmployeeBook();
        employeeBook.printEmployees();
//        System.out.println(employeeBook.returnSumSalary());
//        System.out.println("Сотрудник с минимальной зарплатой: " + employeeBook.findMinSalary());
//        System.out.println("max salary: " + employeeBook.findMaxSalary());
//        System.out.println("Среднее значение зарплат: " + employeeBook.findAverageValue());
//        employeeBook.printName();


//        Повышенная сложность
//        employeeBook.increaseSalary(15);
//        System.out.println("After increase salary: ");
//        employeeBook.printEmployees();
//        System.out.println("min in department" + employeeBook.findMinSalaryInDepartment(4));
//        System.out.println("max in department" + employeeBook.findMaxSalaryInDepartment(4));
//        employeeBook.increaseDepartmentSalary(5, 12);
//        employeeBook.PrintDepartmentEmployee(5);
//        employeeBook.printEmployeeMoreSalary(120000);

//      Очень сложно
//        employeeBook.deleteEmployee("Бексултанова Альбина Жоробековна");
        employeeBook.pushNewEmployee("Александр Ененин", 4, 160_000);
//        System.out.println("After delete");
//        employeeBook.printEmployees();
        employeeBook.modernizeEmployee("Александр Ененин", 1, 125_000.0);
        employeeBook.printEmployees();
//        employeeBook.printEmployees();

        employeeBook.printEmployeeByDepartment();
    }
}