package test7;

public class Dog extends Animal implements Swim{
    @Override
    public void eat() {
        System.out.println("eat bones");
    }

    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void swim() {
        System.out.println("goupao");
    }
}
