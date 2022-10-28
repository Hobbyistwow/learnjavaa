package test4;

class Animal {
    //父类方法
    public void bark() {
        System.out.println("animal bark!");
    }
}

class Dog extends Animal {

    //子类重写父类的bark方法
    public void bark() {
        System.out.println("whahahah");
    }
    //子类自己的方法
    public void dogType() {
        System.out.println("what is the type of dog");
    }
}


public class Test {

    public static void main(String[] args) {
        Animal a = new Animal();
        Animal b = new Dog();
        Dog d = new Dog();

        a.bark();
        b.bark();
        //b.dogType();
        //b.dogType()编译不通过
        d.bark();
        d.dogType();
    }

}