package animal;

public class Gato extends Animal {

    private final String color;

    public Gato(String name, String color) {
        super(name);
        this.color = color;

    }

    //sobescrita de método
    @Override
    public void eat() {
        System.out.println(color + " " + getName() + "is Eating");
    }

    @Override
    public void noise() {
        System.out.println(color + " " + getName() + "is Noising");
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {}
}
