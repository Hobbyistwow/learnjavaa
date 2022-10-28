package test13;

public class Test {
    public static void main(String[] args) {
        new Swim() {
            @Override
            public void swim() {
                System.out.println("重寫匿名類");
                return null;
            }
        };

        method(new Animal() {
                   @Override
                   public void eat() {
                         System.out.println("夠吃骨頭");
                   }
               }
        );



    }
    public static void method(Animal a){
        a.eat();
    }
}
