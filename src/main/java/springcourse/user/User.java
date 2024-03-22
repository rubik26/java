package springcourse.user;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import springcourse.user.cars.Car;


public class User {

    private Car car;

    @Value("${user.name}")
    private String name;

    @Value("${user.age}")
    private int age;

    public User(String name, int age, Car car) {
        this.name = name;
        this.age = age;
        this.car = car;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void userCar(){
        System.out.println("user have a" + car.getCarName());
    }
}
