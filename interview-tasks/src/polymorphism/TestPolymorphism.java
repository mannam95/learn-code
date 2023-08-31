package polymorphism;

public class TestPolymorphism {

    public static void main(String[] args) {
        Animal animal1 = new Animal();
        System.out.println(animal1.shout()); // Don't Know!

        Animal animal2 = new Dog();
        
        System.out.println(animal2.shout());
    }
}