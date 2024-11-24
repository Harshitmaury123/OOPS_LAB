package practice;
class Harshit{
    Harshit(){
        super();
        System.out.println("A constructor");
    }
    Harshit(int a){
        this();
        System.out.println("Harshit constructor"+a);
    }
}
class Sanjhi extends Harshit{
    Sanjhi() {
        super(10);
        System.out.println("sanjhi consrtuctor");
    }
    Sanjhi(int i){
        super(20);
        System.out.println("Sanjhi constructor"+i);
    }
}
public class prac12 {
    public static void main(String[] args) {
        Sanjhi s=new Sanjhi(10);
    }
}
