package academy.learnprogramming;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    private static final Logger log= LoggerFactory.getLogger(com.sun.tools.javac.Main.class);
    private static final String CONFIG_LOCATION="beans.xml";
    public static void main(String[] args) {
        // create context(container)
        ConfigurableApplicationContext context
                = new ClassPathXmlApplicationContext(CONFIG_LOCATION);
        NumberGenerator  numberGenerator = context.getBean("numberGenerator",NumberGenerator.class);

        //call method next()
        int number =numberGenerator.next();
        log.info("number {}", number);

        //close context
        context.close();
    }
}
