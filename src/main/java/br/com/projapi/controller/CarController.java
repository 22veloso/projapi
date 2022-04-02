package br.com.projapi.controller;

import br.com.projapi.constant.Constant;
import br.com.projapi.model.Car;
import br.com.projapi.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CarController {
    @Autowired

    private CarService carService;
    @PostMapping (Constant.URL_CAR)
    public void insert (@RequestBody Car car){
        carService.insert(car);
    }
@GetMapping (Constant.URL_CAR)
    public List<Car> findAll(){
        return carService.findAll();
    }
}
