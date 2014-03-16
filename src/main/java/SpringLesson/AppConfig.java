package SpringLesson;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Oleg on 16.03.14.
 */

@Configuration
public class AppConfig {
    @Autowired
    @Qualifier("helloKitty")
    private GreetingService greetingService;

    @Value("#{greetingProperties.count}")
//    @Value("2")
    private int greetingCount;

    @Bean
    GreetingService advancedChatBot(){
        AdvancedChatBot advancedChatBot=new AdvancedChatBot();
        advancedChatBot.setMessages(new ArrayList<String>() {{
                add("Message1");
                add("Message2");
                add("Message3");
                add("Message4");
        }});
        return advancedChatBot;
    }

    public void start() {
        for (int i=0;i<greetingCount;i++) {
            greetingService.sendGreetings();
        }
    }
}
