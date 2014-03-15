package SpringLesson;

/**
 * Created by Oleg on 15.03.14.
 */
public class HelloWorldService implements GreetingService {
    @Override
    public void sendGreetings() {
        System.out.println("Hello, world!");
    }
}
