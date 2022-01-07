package heritage;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext(new String[]{"heritageContext.xml"});

        SportCar sportCar1 = (SportCar) appContext.getBean("sportCar1");
        SportCar sportCar2 = (SportCar) appContext.getBean("sportCar2");
        PrestigeCar prestigeCar = (PrestigeCar) appContext.getBean("prestigeCar");

        System.out.println(sportCar1);
        System.out.println(sportCar2);
        System.out.println(prestigeCar);


    }
}
