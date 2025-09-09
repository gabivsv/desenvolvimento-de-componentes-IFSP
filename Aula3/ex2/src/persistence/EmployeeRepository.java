package persistence;

import model.Employee;
import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository implements InterfaceEmployeeRepository {

    private List<Employee> employees = new ArrayList<>();

    @Override
    public void save(Employee employee) {
        employees.add(employee);
        System.out.println("Employee saved: " + employee);
    }

    @Override
    public Employee findById(int id) {
        for(Employee e : employees) {
            if(e.getId() == id) return e;
        }
        return null;
    }

    @Override
    public List<Employee> findAll() {
        return new ArrayList<>(employees);
    }
}
