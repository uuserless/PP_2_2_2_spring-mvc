package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
@Service
public class CarServiceImpl implements CarService {

    private List<Car> cars;

    public CarServiceImpl() {
        cars = Arrays.asList(
                new Car(1, "Nissan", 23423),
                new Car(2, "Lada", 34242),
                new Car(3, "Chevrolet", 435345),
                new Car(4, "Daewoo", 43533),
                new Car(5, "Reno", 34534));
    }

    @Override
    public List<Car> getCars(int count) {
        if (count >= 5) {
            return cars;
        } else {
            return cars.stream()
                    .limit(count)
                    .collect(Collectors.toList());
        }
    }
}
