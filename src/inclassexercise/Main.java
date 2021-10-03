package inclassexercise;

public class Main {
    public static void main(String[] args) {
        Employee emp1=new Employee("chris","jhon",2000,new Address ("3000 coronet lane","7575 melvin","ggg","5355"),new Address ("3000 coronet lane","7575 melvin","ggg","5355"));
        Employee emp2=new Employee( "awet","yohanes",3000,new Address("2000 university blvd","3465 uni","tennese","3456"),new Address("3456 htrey","ornaldo","florida","3774") );
        Address add1=new Address("university","jacksonville","florida","32207");
        Address add2= new Address("alrington","atlanta","Georgia","25266");
        System.out.println(emp1.getWork().getCity());
        System.out.println(emp1.getHome().getSate());
        System.out.println(emp2.getHome().getSate());
       // System.out.println();
        //System.out.println(add1);
    }
}
