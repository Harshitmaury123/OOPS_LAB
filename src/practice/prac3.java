package practice;
class ASample{
    void show(){
        System.out.println("A show");
    }
}
class BSample extends ASample{
    void show(){
        System.out.println("B show");
    }
}
public class prac3 {
    public static void main(String[] args) {
        ASample a=new ASample();
        BSample b=new BSample();
        ASample a1=new BSample();
        a.show();
        b.show();
        a1.show();
    }
}
