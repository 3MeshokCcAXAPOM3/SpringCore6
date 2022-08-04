package web.service;

import org.springframework.stereotype.Service;
import web.models.Car;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class CarService {

    private List<Car> myCarList = new ArrayList<>();

    public CarService() {
        myCarList.add(new Car("Volvo", 1990, 490000));
        myCarList.add(new Car("Audi", 1999, 270000));
        myCarList.add(new Car("Tesla", 2020, 99000));
        myCarList.add(new Car("Ford", 1890, 9000));
        myCarList.add(new Car("Shkoda", 2000, 278000));
        myCarList.add(new Car("Lada", 1970, 780000));
    }
    public List<Car> getMyCarCount(int count) {
        if(count >= myCarList.size()) {
            return myCarList;
        }else {
            return myCarList.subList(0, count);
        }
    }


//    public List <Car> addCarInList(Car... cars) {
//        List list = new ArrayList();
//        Collections.addAll(list, cars);
//        return list;
//    }
}
