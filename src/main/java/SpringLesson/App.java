package SpringLesson;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
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
        AbstractApplicationContext context=new FileSystemXmlApplicationContext("src\\main\\java\\spring-config.xml");
//        ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
        AppConfig app=context.getBean(AppConfig.class);
        app.start();
        context.registerShutdownHook();
    }
}
