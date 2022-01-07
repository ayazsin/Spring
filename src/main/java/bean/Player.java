package bean;

public class Player {

    private String name;
    private int weight;
    private int height;
    private double imc;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getImc() {
        return this.imc ;
    }

    public void calculImc() {
        this.imc = (double) weight / (height * height) * 10000;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", height=" + height +
                ", imc=" + imc +
                '}';
    }

    public void setImc(String imc) {
    }
}
