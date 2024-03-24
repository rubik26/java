package springcourse.user.cars;

import org.springframework.stereotype.Component;

@Component
public class Mersedes implements Car{
    @Override
    public String getCarName() {
        return "Mersedes";
    }
}
