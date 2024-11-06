public class Bmw extends Car {
    public Bmw(String model, int year, String color) {
        super("BMW", model, year, color);
    }

    public void honk() {
        System.out.println("Bmw is honking!!!");
    }

    @Override
    public String toString() {
        return "Bmw [brand=" + getBrand() + ", model=" + getModel() + ", year=" + getYear() + ", color=" + getColor() + "]";
    }
}
