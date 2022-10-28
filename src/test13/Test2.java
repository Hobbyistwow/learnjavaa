package test13;

public class Test2 {
    public static void main(String[] args) {

        /*
        *       new
        *
        *
        *
        * */
        new Swim() {

            @Override
            public void swim() {
                System.out.println("重新改");

            }


        }.swim();



    }
}
