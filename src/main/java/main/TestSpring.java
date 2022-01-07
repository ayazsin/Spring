package main;

import bean.Student;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml"});
        // of course, an ApplicationContext is just a BeanFactory
        Student student = (Student) appContext.getBean("studentbean");
        student.displayInfo();
        appContext.close();
    }
    }

