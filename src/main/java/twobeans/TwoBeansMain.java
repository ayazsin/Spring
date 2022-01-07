package twobeans;

import bean.Student;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TwoBeansMain {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext(new String[]{"twoBeansContext.xml"});
        
        Employee employee = (Employee) appContext.getBean("employee");
        System.out.println(employee);
        appContext.close();
    }
}
