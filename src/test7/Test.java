package test7;

public class Test {
    public static void main(String[] args) {
        Frog f = new Frog("a",1);
        System.out.println(f.getName() +","+ f.getAge());
        f.eat();
        f.swim();
        Rabbit r = new Rabbit();
        r.setName("R");
        r.setAge(2);
        System.out.println(r.getName() + "," +r.getAge());
        r.eat();
    }
}
