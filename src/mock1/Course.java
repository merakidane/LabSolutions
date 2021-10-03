package mock1;

public class Course {
    private  String id;
    private  String coursename;
    private  int credithours;
    public Course(String id,String coursename,int credithours){
        this.id=id;
        this.coursename=coursename;
        this.credithours=credithours;

    }

    public String getId(){
        return id;
    }
    public String getCoursename(){
        return  coursename;

    }
     public int getCredithours()   {
        return credithours;
     }
     public void setId(String id){
        this.id=id;
     }
     public void setCoursename( String coursename){
        this.coursename=coursename;
     }
     public void setCredithours(int credithours){
        this.credithours=credithours;
     }
}
