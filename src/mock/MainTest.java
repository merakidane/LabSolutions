package mock;

public class MainTest {
    public static void main(String[] args) {
        Student s1=new Student("sami",234,3.8, new Course("2345","math",3));
        Course c1= new Course("123","oop",3);
        s1.toString();
        c1.toString();
        System.out.println(c1.getCoursename());
        System.out.println(c1.getCourseid());
        System.out.println(c1.getCredithours());
        System.out.println(s1.toString());
        System.out.println(c1.toString());
    }


}
