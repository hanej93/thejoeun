package batchPro.batchPro;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ctx = new GenericXmlApplicationContext("classpath:myScheduler.xml");
    }
}
