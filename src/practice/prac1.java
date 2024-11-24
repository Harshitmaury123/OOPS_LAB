package practice;

class A{
    A(){
        this(10);
        System.out.println("A constructor");
    }
    A(int i){
        super();
        System.out.println("A"+i);
    }
    {
        System.out.println("IIB-1");
    }
    {
        System.out.println("IIB-2");
    }
}
public class prac1 {
    public static void main(String[] args) {
        A a=new A();
    }
}
