package springcourse.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import springcourse.user.cars.Car;


@Component
public class User {

    private Car car;

    @Value("${user.name}")
    private String name;

    @Value("${user.age}")
    private int age;


    public User(@Autowired String name, @Autowired int age) {
        this.name = name;
        this.age = age;
    }
    @Autowired
    @Qualifier("bmv")
    public void setCar(Car car) {
        this.car = car;
    }

    public User() {

    }


    public void userCar() {
        System.out.println("user have a " + car.getCarName());
    }
}
