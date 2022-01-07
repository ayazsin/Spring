package listAndMap;

import java.util.List;

public class ManageList {
    private String name;
    private List<String> answers;

    public ManageList(String name, List<String> answers) {
        this.name = name;
        this.answers = answers;
    }

    @Override
    public String toString() {
        return "ManageList{" +
                "name='" + name + '\'' +
                ", answers=" + answers +
                '}';
    }
}
