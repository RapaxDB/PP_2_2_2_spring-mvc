package web.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;
@Repository
public class CarDaoImpl implements CarDao{

    private List<Car> list;
    public CarDaoImpl(List<Car> list) {
        this.list = list;
        list.add(new Car("BMW", 11111111, "Black"));
        list.add(new Car("Hyundai", 55555555, "Orange"));
        list.add(new Car("Audi", 22222222, "Black"));
        list.add(new Car("Lada", 33333333, "White"));
        list.add(new Car("Tesla", 44444444, "Blue"));
    }

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
