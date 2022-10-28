package test3;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        Clock c = new Clock(59, 59, 11);
        while (true) {
                c.run();
                c.showTime();
                Thread.sleep(1);}
    }
}

