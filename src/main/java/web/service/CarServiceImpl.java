package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarServiceImpl implements CarService {

    @Override
    public List<Car> carList(int count) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Hyundai","Casper", 2020));
        cars.add(new Car("KIA","Morning", 2018));
        cars.add(new Car("SsangYong", "Musso", 2000));
        cars.add(new Car("Daewoo", "Nexia", 1996));
        cars.add(new Car("Genesis", "Coupe", 2021));
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}

