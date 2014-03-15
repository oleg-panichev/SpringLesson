package SpringLesson;

/**
 * Created by Oleg on 15.03.14.
 */
public class Application {
    private GreetingService greetingService;
    private int greetingCount;

    public void start() {
        for (int i=0;i<greetingCount;i++) {
            greetingService.sendGreetings();
        }
    }

    public GreetingService getGreetingService() {
        return greetingService;
    }

    public int getGreetingCount() {
        return greetingCount;
    }

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public void setGreetingCount(int greetingCount) {
        this.greetingCount = greetingCount;
    }
}
