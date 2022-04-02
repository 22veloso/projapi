package br.com.projapi.service;

import br.com.projapi.model.Car;
import br.com.projapi.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {

    @Autowired
    private CarRepository carRepository;

    public void insert (Car car){
        carRepository.save(car);
    }

    public List <Car> findAll (){
        return carRepository.findAll();
    }

}
