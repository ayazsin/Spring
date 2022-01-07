package linkWIthMySql;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext(new String[]{"jdbcContext.xml"});
        CourseJDBCTemplate courseJDBCTemplate = (CourseJDBCTemplate) appContext.getBean("courseJDBCTemplate");
        List<Course> courses  = courseJDBCTemplate.get();


        for (Course c : courses)
            System.out.println(c);

        System.out.println("Insertion: " + courseJDBCTemplate.add((Course) appContext.getBean("beanToInsert")));
        System.out.println("Get id 3: " + courseJDBCTemplate.delete((Course) appContext.getBean("beanToDelete")));
        System.out.println("Update id 3: " + courseJDBCTemplate.update((Course) appContext.getBean("beanToUpdate")));

        appContext.close();
    }
}
