package service;
import model.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeDAO {

    // 1. Метод добавления объекта
    Employee create(Employee employee);
    //2. Метод получения конкретного объекта Employee по id
    Optional<Employee> readById(int id);
    //3. Метод получения списка всех объектов Employee из базы
    List<Employee> readAll();
    //4. Метод изменения конкретного объекта Employee в базе по id
    void update(Employee employee);
    //5. Метод удаления конкретного объекта Employee из базы по id
    void delete(Employee employee);
}
