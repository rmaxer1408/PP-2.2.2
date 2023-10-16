package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.model.Color;
import web.model.Transmission;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/cars")
public class CarsController {
    @GetMapping()
    public String getCars(ModelMap model, @RequestParam(value = "count", required = false) String req) {
        List<Car> cars = new ArrayList<>();
        List<Car> cars_tmp = new ArrayList<>();
        cars.add(new Car("Tesla", Transmission.AUTO, Color.WHITE));
        cars.add(new Car("Dodge", Transmission.MANUAL, Color.BLACK));
        cars.add(new Car("Jaguar", Transmission.AUTO, Color.RED));
        cars.add(new Car("Lada", Transmission.MANUAL, Color.GREEN));
        cars.add(new Car("Volkswagen", Transmission.MANUAL, Color.BLUE));
        if (req == null || Integer.parseInt(req) >= 5 || Integer.parseInt(req) <= 0) {
            model.addAttribute("cars", cars);
        } else {
            for (int i = 0; i < Integer.parseInt(req); i++) {
                cars_tmp.add(cars.get(i));
            }
            model.addAttribute("cars", cars_tmp);
        }
        return "cars/cars";
    }
}
