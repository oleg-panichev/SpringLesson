package SpringLesson;

/**
 * Created by Oleg on 15.03.14.
 */
public class HelloKittyService implements GreetingService {
    @Override
    public void sendGreetings() {
        System.out.println("Hello, Kitty!");
    }
}
