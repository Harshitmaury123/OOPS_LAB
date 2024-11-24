package practice;
class ASample1{
   static void show(){
        System.out.println("A show");
    }
}
class BSample1 extends ASample1{
   static void show(){
        System.out.println("B show");
    }
}
public class prac4 {
    public static void main(String[] args) {
        ASample1 a=new ASample1();
        BSample1 b=new BSample1();
        ASample1 a1=new BSample1();
        a.show();
        b.show();
        a1.show();
    }
}
