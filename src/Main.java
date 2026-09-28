import animal.Animal;
import animal.Gato;

public class Main {
    public static void main(String[] args) {
        Animal miumiu = new Gato("Miumiu", "black");

        miumiu.eat();
        miumiu.noise();

    }
}