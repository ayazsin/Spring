package heritage;

public class PrestigeCar extends SportCar{

    private int year;

    public PrestigeCar() {
    }

    public PrestigeCar(String color, String brand, int year) {
        super(color, brand);
        this.year = year;
    }



    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "PrestigeCar{" +
                "color=" + super.getColor() +
                ", brand=" + super.getBrand() +
                ", year=" + year +
                '}';
    }
}
