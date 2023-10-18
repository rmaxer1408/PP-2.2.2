package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;
import web.model.Color;
import web.model.Transmission;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDAOImpl implements CarDAO {
    private final List<Car> cars;

    public CarDAOImpl() {
        this.cars = new ArrayList<>();
        cars.add(new Car("Tesla",Transmission.AUTO, Color.WHITE));
        cars.add(new Car("Dodge", Transmission.MANUAL, Color.BLACK));
        cars.add(new Car("Jaguar", Transmission.AUTO, Color.RED));
        cars.add(new Car("Lada", Transmission.MANUAL, Color.GREEN));
        cars.add(new Car("Volkswagen", Transmission.MANUAL, Color.BLUE));
    }

    @Override
    public List<Car> getCars(int count) {
        return cars.stream()
                .limit(count)
                .collect(Collectors.toList());
    }
}
