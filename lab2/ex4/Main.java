public class Main {
    public static void main(String[] args) {
        FirstClass first = new FirstClass();
        SecondClass second = new SecondClass();
        Addition addition = new Addition();
    
        first.firstMethod();
        second.secondMethod();
        
        int x = 10;
        int y = 60;
        int z = addition.add(x, y);
        System.out.println(x + " + " + y + " = " + z);
    }
}    