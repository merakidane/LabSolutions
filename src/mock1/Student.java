package mock1;

public class Student {
    private String name;
    private int id;
    private double gpa;
    private Course course;

    public Student(String name,int Id,double gpa,Course course){
        this.name=name;
        this.id=id;
        this.gpa=gpa;
        this.course=course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    @Override
    public  String toString(){
        return "name"+" "+this.name+"id"+" "+this.id+" "+"gpa"+" "+gpa+" "+"course name"+" "+course.getCoursename()+" "+"course id"+" "+course.getId()+" "+"credit hour"+" "+course.getCredithours();
    }

}
