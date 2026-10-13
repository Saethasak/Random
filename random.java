
import java.util.Random;
import java.util.ArrayList;

public class random
{
    public Random r;
    
    
    public random(){
        r = new Random();
    }

    public void printArandom(){
        System.out.println(r.nextInt(100));

    }

    public void ranRandom(int randomnizer){
        int i = 0;

        while(i < randomnizer){
            System.out.println(r.nextInt(100));
            i++;

        }
    }

    public int throwDice(){
        int throwDice = r.nextInt(6)+1;
        return throwDice;
    }
    public int minMax(int min, int max){
    int number = max - min -1;
    return min+r.nextInt(number);
    }
}