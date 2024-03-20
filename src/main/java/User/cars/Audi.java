package User.cars;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("Car1")
@Scope("prototype")
public class  Audi implements Car {
    @Override
    public String getNameCar() {
        return "Audi";
    }
}
