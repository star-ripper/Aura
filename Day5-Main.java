import java.util.Objects;
import java.util.List;
import java.util.ArrayList;

class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    void sound() {
        System.out.println("Some generic animal sound");
    }

    @Override
    public String toString() {
        return "Animal: " + name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Animal)) return false;
        Animal other = (Animal) obj;
        return Objects.equals(this.name, other.name);
    }
}

class Dog extends Animal {
    Dog(String name) {
        super(name);
    }

    @Override
    void sound() {
        System.out.println("Bark!");
    }

    void fetch() {
        System.out.println(name + " is fetching a ball.");
    }

    @Override
    public String toString() {
        return "Dog: " + name;
    }
}

public class Day5-Main {
    public static void main(String[] args) {
        Animal a1 = new Dog("Rex");
        a1.sound();

        Dog d1 = (Dog) a1;
        d1.fetch();

        Animal a2 = new Dog("Rex");
        System.out.println("a1 equals a2? " + a1.equals(a2));

        System.out.println(a1);
        System.out.println(a2);

        List<Animal> animals = new ArrayList<>();
        animals.add(a1);
        animals.add(new Dog("Buddy"));

        System.out.println("Animals in list:");
        for (Animal animal : animals) {
            animal.sound();
            System.out.println(animal);
        }

        Animal genericAnimal = new Animal("SomeAnimal");
        Animal dogAsAnimal = new Dog("Charlie");

        genericAnimal.sound();
        dogAsAnimal.sound();
    }
}
