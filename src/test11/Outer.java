package test11;

public class Outer {
    private int a = 10;

    class Inner {
        private int a = 20;

        public void show() {
            int a = 30;
            System.out.println("中");
            System.out.println(this.a);
            System.out.println(Outer.this.a);
        }


    }
}
