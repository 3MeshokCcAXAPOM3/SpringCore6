package web.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component
public class Car {
private String model;
private int age;
private int distance;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getDistance() {
        return distance;
    }

    public Car() {
    }
//@Autowired
    public Car(String model, int age, int distance) {
        this.model = model;
        this.age = age;
        this.distance = distance;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", age=" + age +
                ", distance=" + distance +
                '}';
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }
}
