package test12;

public class Outer {
    static class Inner {
        public void show1(){
            System.out.println("非靜態方法");
        }
        public static void show2() {
            System.out.println("靜態方法");
        }
    }

}
