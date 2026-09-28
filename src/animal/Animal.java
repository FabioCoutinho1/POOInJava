package animal;

public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

     public void eat() {
        System.out.println(name + " is Eating");
    }

    public abstract void noise();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
