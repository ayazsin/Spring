package main;

import bean.Player;
import bean.Student;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ImcMain {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext(new String[]{"playerContext.xml"});
        Player player = (Player) appContext.getBean("playerbean");
        Player player2 = (Player) appContext.getBean("playerbean2");
        player.calculImc();
        player2.calculImc();
        System.out.println(player);
        System.out.println(player2);
        appContext.close();

    }
}
