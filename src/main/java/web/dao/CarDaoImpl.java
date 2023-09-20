package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;
@Component
public class CarDaoImpl implements CarDao{
    private List<Car> list = new ArrayList<>(List.of(
            new Car("BMW", 11111111, "Black"),
            new Car("Audi", 22222222, "Black"),
            new Car("Lada", 33333333, "White"),
            new Car("Tesla", 44444444, "Blue"),
            new Car("Hyundai", 55555555, "Orange")));
    @Override
    public void addCar(Car car) {
        list.add(car);
    }

    @Override
    public List<Car> getCars(int count) {
        if (count >= list.size()){
            return list;
        } else if (count < 1) {
            return new ArrayList<>();
        } else {
            return list.subList(0,count);
        }
    }
}
