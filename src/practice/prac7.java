package practice;
interface  Car{
    int WHEEL=4;//public static final
    void engine(); //public abstract
}
class Alto implements Car{
    public void engine(){
        System.out.println("Petrol Engine");
    }
}
public class prac7 {
    public static void main(String[] args) {
        Car alto=new Alto();
        alto.engine();
        Alto alto1=new Alto();
        alto1.engine();
    }
}
