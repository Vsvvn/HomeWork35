package service;

import model.City;

import java.util.List;
import java.util.Optional;

public interface CityDAO {
    //Метод добавления
    City create(City city);
    //    Метод получения объекта по id
    Optional<City> readById(int id);
    //    Получение всех объектов из базы
    List<City> readAll();
    //Метод обновления данных в базе
    void update(City city);
    void delete(City city);
}
