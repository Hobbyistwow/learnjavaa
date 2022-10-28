package test6;

public class People {
    private String name = "li";
    static String ID = "";
    public static class Student {

        String ID = "1060";

        public void StuInfo() {
            System.out.println("o.ID" + People.ID);
            System.out.println("name" + (new People().name));
            System.out.println("ID" + ID);

        }
    }
        public static void main(String[] args) {

            People people = new People();
            Student student = new Student();

            student.StuInfo();
        }


}

