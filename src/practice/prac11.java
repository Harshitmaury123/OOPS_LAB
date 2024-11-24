package practice;

  class E{
    E(){
        System.out.println("C");
    }
    {
        System.out.println("IIB-E");
    }
    static{
        System.out.println("SIB-E");
    }
}
class F extends E{
    F(){
        super();
        System.out.println("D");
    }
    {
        System.out.println("IIB-F");
    }
    static{
        System.out.println("SIB-F");
    }
}
public class prac11 {
    public static void main(String[] args) {
//      E e=new E();
//      E e1=new F();
      F f=new F();
    }
}

