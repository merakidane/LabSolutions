package inclassexercise;

public class Employee {

    private String fname;
    private  String lname;
    private double salary;
    private  Address home;
    private Address work;
    public Employee(){

    }

    public String getFname() {
        return fname;
    }

    public Address getHome() {
        return home;
    }

    public void setHome(Address home) {
        this.home = home;
    }

    public Address getWork() {
        return work;
    }

    public void setWork(Address work) {
        this.work = work;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employee(String fname, String lname, double salary,Address home,Address work){
       this.fname=fname;
       this.lname=lname;
       this.salary=salary;
       this.home=home;
       this.work=work;

    }


}
