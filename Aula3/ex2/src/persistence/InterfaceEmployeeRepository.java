package persistence;

import model.Employee;
import java.util.List;

public interface InterfaceEmployeeRepository {
    void save(Employee employee);
    Employee findById(int id);
    List<Employee> findAll();
}
