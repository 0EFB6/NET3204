public class Merz extends Car {
    private Bmw bmw;

    public Merz(String model, int year, String color) {
        super("Mercedes", model, year, color);
        this.bmw = new Bmw(model, year, color);
    }

    public void map() {
        System.out.println("I have a map feature!");
    }

    public void honk() {
        bmw.honk();
    }

    @Override
    public String toString() {
        return "Merz [brand=" + getBrand() + ", model=" + getModel() + ", year=" + getYear() + ", color=" + getColor() + "]";
    }
}
