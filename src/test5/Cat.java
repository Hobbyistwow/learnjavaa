package test5;

public class Cat implements Animal{

    @Override
    public void eat() {
        System.out.println("eat");
    }

    @Override
    public void travel() {
        System.out.println("travel");
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.travel();
        cat.eat();
    }

}
                                                  