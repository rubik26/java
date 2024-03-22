package springcourse;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import springcourse.user.User;

public class SpringMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                SpringConfig.class
        );
        User user = context.getBean("user", User.class);
        user.userCar();
    }
}
