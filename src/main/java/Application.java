import model.City;
import model.Employee;
import service.CityDAO;
import service.CityDAOImpl;
import service.EmployeeDAO;
import service.EmployeeDAOImpl;

import java.util.List;

public class Application {

    public static void main(String[] args) {

        // Создаем объект класса ДАО
        EmployeeDAO employeeDAO = new EmployeeDAOImpl();
//        CityDAO cityDAO = new CityDAOImpl();

//        Employee galina = new Employee(52, "Галина", "Петрова", "жен", 38, 2L);

//
////            1. Метод добавления объекта +
//        employeeDAO.create(galina);
//
//
////            2. Метод получения конкретного объекта Employee по id +
//        System.out.println(employeeDAO.readById(1));
//
////            3. Метод получения списка всех объектов Employee из базы (для демонстрации, рабочий находится ниже) +
//        employeeDAO.readAll();
//
////            4. Метод изменения конкретного объекта Employee в базе по id +
//        Employee marina = new Employee(7,"Марина", "Петрова", "жен", 34, 5L);
//        employeeDAO.update(marina);
//
//
//            5. Метод удаления конкретного объекта Employee из базы по id +
//        employeeDAO.delete(galina);


//             Создаем список наполняя его объектами, которые получаем
//             путем вызова метода для получения всех элементов таблицы +
        List<Employee> list = employeeDAO.readAll();
////
        for (Employee employeeList : list) {
            System.out.println(employeeList);
        }
//
//        List<City> list = cityDAO.readAll();
//
//        for (City cityList : list) {
//            System.out.println(cityList);
//        }
    }
}
