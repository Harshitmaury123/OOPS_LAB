package practice;

class Sample {
    void test(int b) {
        System.out.println("Int" + b);
    }

    void test(float b) {
        System.out.println("Float" + b);
    }

    void test(Byte b) {
        System.out.println("Auto Boxing" + b);
    }

    void test(byte... b) {
        System.out.println("Variable argument" + b[0]);
    }
}
public class prac9 {
    public static void main(String[] args) {
        Sample s1=new Sample();
        byte b1=98;
        s1.test(b1);
    }
}

