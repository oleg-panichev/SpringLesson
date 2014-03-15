package SpringLesson;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // context - all beans that are controlled by spring
        ApplicationContext context=new FileSystemXmlApplicationContext("src\\main\\java\\spring-config.xml");
        Application app=context.getBean(Application.class);
        app.start();
    }
}
