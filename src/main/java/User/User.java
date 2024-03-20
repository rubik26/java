package User;

import User.cars.Car;
import User.cars.Volvo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class User {

    @Value("${user.name}")
    private String name;

    @Value("${user.age}")
    private int age;
    private Car car1;
    private Car car2;

    @Autowired
    @Qualifier("Car3")
    private Car car3;

    @Autowired
    public User(@Qualifier("Car1") Car car) {
        this.car1 = car;
    }

    @Autowired
    @Qualifier("Car2")
    public void setCar(Car car1) {
        this.car2 = car1;
    }

    public void setName(String name) {
        this.name = name;
    }

   public void setAge(int age) {
       this.age = age;
   }

    public String getName() {
        return name;
    }

     public int getAge() {
        return age;
     }

    public void userCar() {
        System.out.println("I am have an " + car1.getNameCar() + ", " + car2.getNameCar() + " and " + car3.getNameCar());
    }
}
