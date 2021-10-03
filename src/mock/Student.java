package mock;

public class Student {
    private String  name;
    private int id;
    private double gpa;
    private Course course;


    public Student(String name,int id,double gpa,Course course){
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
    public String toString(){
        return "Name"+" "+this.name+" "+" Id"+" "+this.id+" "+" GPA"+this.gpa+" "+ "course"+" "+this.getCourse().getCoursename();
    }
}
