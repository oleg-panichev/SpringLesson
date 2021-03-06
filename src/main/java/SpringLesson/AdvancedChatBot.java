package SpringLesson;

import java.util.List;

/**
 * Created by Oleg on 15.03.14.
 */
public class AdvancedChatBot implements GreetingService {
    private List<String> messages;

    public AdvancedChatBot() {
    }

    @Override
    public void sendGreetings() {
        if(!messages.isEmpty())
            System.out.println(messages.remove(0));
    }

    public void setMessages(List<String> messages) {
        this.messages = messages;
    }
}
