import facade.EmployeeFacade;
import model.Employee;

public class Main {
    public static void main(String[] args) {
        EmployeeFacade facade = new EmployeeFacade();

        Employee emp1 = new Employee(1, "Alice", 3000);
        Employee emp2 = new Employee(2, "Roberto", 4000);

        facade.addEmployee(emp1);
        facade.addEmployee(emp2);

        System.out.println("Todos os funcionários:");
        for(Employee e : facade.getAllEmployees()) {
            System.out.println(e);
        }

        System.out.println("\nAumentando salário de Alice em 10%:");
        facade.increaseSalary(1, 10);

        System.out.println("\nFuncionário com ID 1:");
        System.out.println(facade.getEmployee(1));
    }
}
