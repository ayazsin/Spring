package composition;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Menu {

    private String name;
    private List<Plat> plats;
    private int total;
    private HashMap <String, Plat> platsMap;

    public Menu(String name, List<Plat> plats) {
        this.name = name;
        this.plats = plats;
    }

    public Menu(String name, HashMap<String, Plat> platsMap) {
        this.name = name;
        this.platsMap = platsMap;
    }

    public  int calculTotalMap() {
        for (Map.Entry<String, Plat> plat : platsMap.entrySet()) {
            total += plat.getValue().getPrice();
        }
        return total;
    }

    public void addPlat(Plat plat) {
        plats.add(plat);
    }

    public void deletePlat(Plat plat) {
        plats.remove(plat);
    }

    public int calculTotal(){
        for ( Plat plat : plats) {
            this.total += plat.getPrice();
        }
        return total;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "name='" + name + '\'' +
                ", total=" + total +
                (platsMap==null? "" : (", platsMap=" + platsMap)) +
                (plats==null ? "" : (", plats=" + plats)) +
                '}';
    }
}
