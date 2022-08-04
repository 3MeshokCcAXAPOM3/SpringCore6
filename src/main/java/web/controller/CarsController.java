package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.models.Car;
import web.service.CarService;

import java.util.List;

@Controller
public class CarsController {
    @Autowired
    private CarService carService;

    @GetMapping(value = "/cars/")
    public String IVantSeeMyCarsToCount(@RequestParam(defaultValue = "5") int count, Model model) {
        List<Car> cars = carService.getMyCarCount(count);
        model.addAttribute("cars", cars);
        return "cars";
    }

}