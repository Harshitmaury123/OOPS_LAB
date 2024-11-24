package practice;

abstract class C{
    abstract void info();
    void show(){
        System.out.println("A show");
    }
    C(){
        System.out.println("C");
    }
    {
        System.out.println("IIB");
    }
    static{
        System.out.println("SIB");
    }
}
class D extends C{
    void info(){
        System.out.println("Abstract method");
    }
    D(){
        super();
        System.out.println("D");
    }
}
public class prac6 {
    public static void main(String[] args) {
//        C c=new C(); abstract class object not possible
        C c=new D();  //reference is possible
        c.show();
        c.info();
        D d=new D();
        d.show();
        d.info();
    }
}
