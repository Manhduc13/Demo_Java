public class Pizza {
    String bread;
    String sauce;
    String cheese;
    Pizza(String b, String s, String c){
        bread = b;
        sauce = s;
        cheese = c;
    }
    void show(){
        System.out.println(bread);
        System.out.println(sauce);
        System.out.println(cheese);
    }

}
