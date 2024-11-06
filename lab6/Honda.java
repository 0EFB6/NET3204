public class Honda extends Car {
    private Merz merz;

    public Honda(String model, int year, String color) {
        super("Honda", model, year, color);
        this.merz = new Merz(model, year, color);
    }

    public void spec() {
        System.out.println("Sedan only!");
    }

    public void map() {
        merz.map();
    }

    @Override
    public String toString() {
        return "Honda [brand=" + getBrand() + ", model=" + getModel() + ", year=" + getYear() + ", color=" + getColor() + "]";
    }
}