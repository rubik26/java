import User.User;
import User.cars.Audi;
import User.cars.Volkswagen;
import User.cars.Volvo;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMain {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContex.xml"
        );
        User user = context.getBean("user", User.class);
        System.out.println(user.getName());
        System.out.println(user.getAge());
        user.userCar();

        System.out.println();

        //test scope
        System.out.println("test prototype scope:");

        Audi audi1 = context.getBean("Car1", Audi.class);
        Audi audi2 = context.getBean("Car1", Audi.class);
        System.out.println(audi1 == audi2);
        System.out.println();

        System.out.println("test singleton scope:");

        Volkswagen volkswagen1 = context.getBean("Car3", Volkswagen.class);
        Volkswagen volkswagen2 = context.getBean("Car3", Volkswagen.class);
        System.out.println(volkswagen1 == volkswagen2);

        Volvo volvo1 = context.getBean("Car2", Volvo.class);
        Volvo volvo2 = context.getBean("Car2", Volvo.class);
        System.out.println(volvo1 == volvo2);
        context.close();
    }
}
