import java.util.Random;
public  class DiceRoller{
    Random rd;
    int num;
    DiceRoller(){
        rd = new Random();
        roll();
    }
    void roll(){
        num = rd.nextInt(6)+1;
        System.out.println(num);
    };
}
