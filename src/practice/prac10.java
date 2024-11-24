package practice;

public class prac10 {
    public static void main(String[] args) {
        System.out.println(test(200));
    }
    public static int test(int i) {
        int j = 0;
        try {
            j = i;
            return j;
        } catch(ArithmeticException ex){
//            System.out.println("Arithmetic exception");
//            return j;
        }
//        finally{
//            return 1;
//        }
        return 0;
    }
}
