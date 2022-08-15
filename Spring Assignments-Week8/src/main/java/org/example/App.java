package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //XML config
        ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
        Student student = (Student) context.getBean("Student");
        student.returnFullInfo();

        //java config
        ApplicationContext context2 = new AnnotationConfigApplicationContext(AppConfig.class);
        Student studentB = (Student) context2.getBean("Student");
        studentB.returnFullInfo();

        //Annotation config
        Phone celly = (Phone) context.getBean("phone");
        celly.toString();

    }
}
