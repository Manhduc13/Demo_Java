public class Hero extends human {
    String power;
    Hero(String name,int age, String power){
        super(name,age);
        this.power = power;
    }
    public String toString(){
        return super.toString() + this.power;
    }
}
