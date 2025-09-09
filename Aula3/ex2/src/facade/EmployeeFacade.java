package facade;

import model.Employee;
import persistence.EmployeeRepository;
import persistence.InterfaceEmployeeRepository;
import java.util.List;

public class EmployeeFacade {
    private final InterfaceEmployeeRepository repository = new EmployeeRepository();

    public void addEmployee(Employee employee) {
        repository.save(employee);
    }

    public Employee getEmployee(int id) {
        return repository.findById(id);
    }

    public List<Employee> getAllEmployees() {
        return repository.findAll();
    }

    public void increaseSalary(int id, double percent) {
        Employee e = repository.findById(id);
        if(e != null) {
            e.increaseSalary(percent);
            System.out.println("Salary updated: " + e);
        }
    }
}
