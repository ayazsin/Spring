package listAndMap;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ListAndMap {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext(new String[]{"listAndMap.xml"});
        ManageList list1 = (ManageList) appContext.getBean("list1");
        Directory directory1 = (Directory) appContext.getBean("directory1");
        System.out.println(list1);
        System.out.println(directory1);

    }
}
