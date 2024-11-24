package practice;
class Demo{
    static{
        System.out.println("Demo-SIB-1");
    }
    static{
        System.out.println("Demo-SIB-2");
    }
}
public class prac2 {
    static{
        System.out.println("SIB-1");
    }

    public static void main(String[] args) {
        System.out.println("Main");
        Demo d=new Demo();
    }
}
