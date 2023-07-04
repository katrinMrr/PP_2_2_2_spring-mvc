package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import web.model.Car;
import web.service.CarService;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class CarController {
    @Autowired
    private CarService carService;

    @GetMapping(value = "/cars")
    public String printCar(ModelMap model, HttpServletRequest request) {
        int size = Integer.parseInt(request.getParameter("count") == null ? "5"
                : request.getParameter("count"));
        List<Car> cars;
        cars = carService.getListCar(size);
        model.addAttribute("cars", cars);
        return "cars";
    }
}


