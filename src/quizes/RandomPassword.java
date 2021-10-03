package quizes;
import java.util.Random;
public class RandomPassword {
    public static void main(String[] args) {
        char up='\u0000';
         char low='\u0000';


            Random random = new Random();
            up = (char) (random.nextInt(26) + 'A');
            low=((char)(random.nextInt(26)+'a'));
           int x= random.nextInt(9);

            System.out.println(up);
        System.out.println(low);
        System.out.println(x);


/*

hw i solved
 public static void passwordg(){
Random random=new Random();
       char up = (char) (random.nextInt(26) + 'A');
       char  low=((char)(random.nextInt(26)+'a'));
      int num=random.nextInt(9)+1);
     char eschar=(char)(random.nextInt(6)+'!');
   System.out.println("the random genertaed password is"+charup+charlow+num+chareschar);
}


        for (int x=97;x<=122;x++){
         Random r=new Random();
            low =(char)(r.nextInt(26)+x);
        }
        System.out.println(low);
**/

      /*  for (int i=0;i<10;i++){
            int l=i;
        }
        for (int i=38;i<=38;i++){
            char l=(char) (i);
        }
**/




    }
}
