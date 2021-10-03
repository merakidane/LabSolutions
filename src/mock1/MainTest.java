package mock1;

public class MainTest {
    public static void main(String[] args) {
        Student  s1=new Student("chris",324,3.5,new Course("234s","calculus",4));
        Course c1=new Course("er45","java",3);
        s1.toString();
        System.out.println(s1.toString());
        System.out.println(c1.getCoursename());
        System.out.println(c1.getId());
        System.out.println(c1.getCredithours());

    }
}
