//import java.util.Scanner;
//import java.util.ArrayList;
//import java.util.Random;
//import javax.swing.JOptionPane;
public class Main{
    public static void main(String[] args){ 
        // Hero hero1  = new Hero("Batman",42,"Rich");
        // System.out.println(hero1);
        car c = new car("Manh",2022);
        car c2 = new car();
        c2=c;
        System.out.println(c.getName());
        System.out.println(c.getYear());
        System.out.println(c2.getName());
        System.out.println(c2.getYear());
    }
}