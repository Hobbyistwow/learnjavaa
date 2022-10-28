package test12;

public class Test {
    public static void main(String[] args) {
        Outer.Inner.show2();
        Outer.Inner oi = new Outer.Inner();
        oi.show1();
        Outer.Inner.show2();
    }
}
