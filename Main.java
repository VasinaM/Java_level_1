package Animal;

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog();
            dog.run_limit(500);
            dog.swim_limit(10);
            dog.jump_limit(0.5f);

        Cat cat = new Cat();
            cat.run_limit(150);
            cat.swim_limit(0);
            cat.jump_limit(1.7f);
    }
}
