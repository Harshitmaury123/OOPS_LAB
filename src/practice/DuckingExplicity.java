package practice;

public class DuckingExplicity {
    public static void main(String[] args) {
        System.out.println("Main start");
        test();
        System.out.println("Main end");
    }
    static void test(){
        System.out.println("test start");
        try{
            test1();
        }
        catch(ClassNotFoundException ex){
            ex.printStackTrace();
        }
        System.out.println("test end");
    }
    static void test1() throws ClassNotFoundException{
        System.out.println("test1 start");
                test2();
        System.out.println("test1 end");
    }
    static void test2() throws ClassNotFoundException{
        System.out.println("test2 start");
        Class.forName("");
        System.out.println("test2 end");
    }
}
