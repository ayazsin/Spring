package listAndMap;

import java.util.HashMap;

public class Directory {
    private String name;
    private HashMap<String, String> hMap;

    public Directory(String name, HashMap<String, String> hMap) {
        this.name = name;
        this.hMap = hMap;
    }

    @Override
    public String toString() {
        return "Directory{" +
                "name='" + name + '\'' +
                ", hMap=" + hMap +
                '}';
    }
}
