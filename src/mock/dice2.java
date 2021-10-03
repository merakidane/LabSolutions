package mock;

import java.util.Random;

public class dice2 {

    public static void main(String[] args) {
        randomDice(3);
    }
    public static void  randomDice(int x){
        Random random=new Random();
        for(int i=0;i<x;i++){
            int dice=random.nextInt(6)+1;
            System.out.print(dice);
        }
}

}
