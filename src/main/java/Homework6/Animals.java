package Homework6;

public class Animals {
    interface IAnimal {
        void makeSomeNoise();
    }
    public abstract class Animal implements IAnimal {
    private String name;
    public Animal(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void play() {
        System.out.println(name + " is playing");
    }
    @Override
        public abstract void makeSomeNoise();
    }

    public class Bird extends Animal {
        public Bird(String name) {
            super(name);
        }
        @Override
        public void makeSomeNoise() {
            System.out.println(getName() + " is chirping");
        }
        public void fly() {
            System.out.println(getName() + " is flying");
        }
        public void synk() {
            System.out.println("One bird is chirping softly");
        }
        public void synk(int numberOfBirds) {
            System.out.println(numberOfBirds + "bird are chirping loudly");
        }
    }

    public class Cat extends Animal {
        public Cat(String name) {
            super(name);
        }
        @Override
        public void makeSomeNoise() {
            System.out.println(getName() + " is meow mewo");
        }
        public void climb() {
           System.out.println(getName() + " is climbing");
        }
    }

    public class Dog extends Animal {
        public Dog(String name) {
            super(name);
        }
        public void makeSomeNoise() {
            System.out.println(getName() + " is barking");
        }
        public void bringStick() {
            System.out.println(getName() + " is bringing a stick");
        }
    }
}
