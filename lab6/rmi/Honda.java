public class Honda extends Car {
    public Honda(String model, int year, String color) {
        super("Honda", model, year, color);
    }

    public void spec() {
        System.out.println("Sedan only!");
    }

    @Override
    public String toString() {
        return "Honda [brand=" + getBrand() + ", model=" + getModel() + ", year=" + getYear() + ", color=" + getColor() + "]";
    }
}