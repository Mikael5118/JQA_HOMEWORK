package Homework6;

public class AnimalDemo {
    public static void main(String[] args) {
        Animals.Bird bird = new Animals().new Bird("Eagle");
        Animals.Cat cat = new Animals().new Cat("Lisko");
        Animals.Dog dog = new Animals().new Dog("Archi");

        bird.play();
        cat.play();
        dog.play();

        bird.makeSomeNoise();
        cat.makeSomeNoise();
        dog.makeSomeNoise();

        bird.fly();
        bird.synk();
        bird.synk(2);

        cat.climb();
        dog.bringStick();
    }
}
