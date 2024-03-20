package User.cars;

import User.cars.Car;
import org.springframework.stereotype.Component;

@Component("Car2")
// scope was automatically set to singleton
public class Volvo implements Car {
    @Override
    public String getNameCar() {
        return "Volvo";
    }
}
