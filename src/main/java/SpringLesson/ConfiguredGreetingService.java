package SpringLesson;

/**
 * Created by Oleg on 15.03.14.
 */
public class ConfiguredGreetingService implements GreetingService {
    private String message;
    @Override
    public void sendGreetings() {
        System.out.println(message);
    }
    public void setMessage(String message) {
        this.message=message;
    }
}
