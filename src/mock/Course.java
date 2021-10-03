package mock;

public class Course {
    private  String  courseid;
    private String coursename;
    private int credithours;



    public Course (String courseid,String coursename,int credithours){
        this.courseid=courseid;
        this.coursename=coursename;
        this.credithours=credithours;
    }

    public String getCourseid() {
        return courseid;
    }

    public void setCourseid(String courseid) {
        this.courseid = courseid;
    }

    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }

    public int getCredithours() {
        return credithours;
    }

    public void setCredithours(int credithours) {
        this.credithours = credithours;
    }
    @Override
    public String toString(){
        return "id"+" "+courseid+""+"course name"+" "+coursename+" "+"credit hour"+" "+credithours;
    }
}
