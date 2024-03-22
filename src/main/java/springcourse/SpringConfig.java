package springcourse;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("springcourse")
@PropertySource("classpath:user.properties")
public class SpringConfig {

}
