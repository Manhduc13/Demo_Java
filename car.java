public class car{
    private String name;
    private int year;
    car(){
        this.name = "";
        this.year=0;
    }
    car(String name,int year){
        this.name= name;
        this.year=year;
    }
    car(car car1){
        this.name = car1.name;
        this.year = car1.year;
    }
    public void setName(String n){
        this.name=n;
    }
    public String getName(){
        return name;
    }
    public void setYear(int y){
        this.year=y;
    }
    public int getYear(){
        return year;
    }
    
}
