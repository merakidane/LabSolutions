package lab3;

import java.util.Random;

public class GradesGenerating {
    public static void main(String[] args) {
        generate();
        }
        public static  void generate(){
        for (int i = 0; i < 10; i++) {
            Random random = new Random();
            char randomgrade = (char) (random.nextInt(4) + 'a');
            System.out.println(randomgrade);
        }
    }
}