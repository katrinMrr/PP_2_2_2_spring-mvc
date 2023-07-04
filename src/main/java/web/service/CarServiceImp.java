package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImp implements CarService {

    @Override
    public List<Car> getListCar(int size) {
        List<Car> carList = new ArrayList<>();
        carList.add(new Car("a", "blue", 125));
        carList.add(new Car("b", "yellow", 56984));
        carList.add(new Car("c", "black", 56));
        carList.add(new Car("d", "white", 7000));
        carList.add(new Car("f", "green", 1));
        return carList.stream().limit(size).collect(Collectors.toList());
    }
}
