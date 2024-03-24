package springcourse.user.cars;

import org.springframework.stereotype.Component;

@Component
public class Bmv implements Car{
    @Override
    public String getCarName() {
        return "BMV";
    }
}
