package SpringLesson;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by Oleg on 15.03.14.
 */
@Component("configuredGs")
public class ConfiguredGreetingService implements GreetingService {
    @Value("#{greetingProperties.message}")
    private String message;
    @Override
    public void sendGreetings() {
        System.out.println(message);
    }
    public void setMessage(String message) {
        this.message=message;
    }

    @PostConstruct
    public void postConstructor() {
        System.out.println("postConstructor");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("preDestroy");
    }
}
