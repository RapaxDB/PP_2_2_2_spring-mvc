package web.service;

import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.dao.CarDaoImpl;
import web.model.Car;
import java.util.List;
@Service
public class CarServiceImpl implements CarService{
    private CarDao carDao;
    public CarServiceImpl(CarDao carDao) {
        this.carDao = carDao;
    }

    @Override
    public void addCar(Car car) {
        carDao.addCar(car);
    }

    @Override
    public List<Car> getCars(int count) {
        return carDao.getCars(count);
    }
}
