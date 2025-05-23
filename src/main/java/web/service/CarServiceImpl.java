package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {

    private static List<Car> cars = new ArrayList<>();

    static {
        cars.add(new Car("BMW", "red", 1111));
        cars.add(new Car("Toyota", "black", 2222));
        cars.add(new Car("Nisan", "orange", 3333));
        cars.add(new Car("KIA", "blue", 4444));
        cars.add(new Car("Tesla", "gray", 5555));
    }

    @Override
    public List<Car> showCarsList(int count) {
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}
