package composition;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext(new String[]{"compositionContext.xml"});
        Menu menu1 = (Menu) appContext.getBean("menu1");
        menu1.calculTotal();
        System.out.println(menu1);

        Menu menu2 = (Menu) appContext.getBean("menu2");
        menu2.calculTotalMap();
        System.out.println(menu2);
        appContext.close();
    }
}
