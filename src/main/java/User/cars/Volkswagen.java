package User.cars;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("Car3")
@Scope("singleton") // it is not necessary to write scope as singleton, because scope is automatically set as singleton
public class Volkswagen implements Car{
    @Override
    public String getNameCar() {
        return "Volkswagen";
    }
}
