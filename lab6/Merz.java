public class Merz extends Car {
    public Merz(String model, int year, String color) {
        super("Mercedes", model, year, color);
    }

    public void map() {
        System.out.println("I have a map feature!");
    }

    @Override
    public String toString() {
        return "Merz [brand=" + getBrand() + ", model=" + getModel() + ", year=" + getYear() + ", color=" + getColor() + "]";
    }
}