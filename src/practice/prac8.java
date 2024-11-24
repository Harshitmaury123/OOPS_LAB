package practice;

interface Cars {
    int WHEEL = 4;
    void engine();
    void speed();
}

abstract class BaseAlto implements Cars {
    public void engine() {
        System.out.println("Petrol engine");
    }
}

class Alto1 extends BaseAlto {
    @Override
    public void engine() {
        System.out.println("Diesel Engine");
    }

    public void speed() {
        System.out.println("1 to 100");
    }
}

public class prac8 {
    public static void main(String[] args) {
        Cars alto1 = new Alto1();
        alto1.engine();
        alto1.speed();

        BaseAlto alto2 = new Alto1();
        alto2.engine();
        alto2.speed();

        Alto1 alto3 = new Alto1();
        alto3.engine();
        alto3.speed();
    }
}
