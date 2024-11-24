package practice;

class Student {
    int age;
    double height;
    float weight;
    public Student(int age,double height,float weight){
        super();
        this.age=age;
        this.weight=weight;
        this.height=height;
    }
    @Override
    public String toString() {
        return "Age:"+age+"Height:"+height+"Weight:"+weight;
    }
    public boolean equals(Object obj){
        Student st2=(Student)obj;
        return this.age==st2.age && this.weight==st2.weight && this.height==st2.height;
    }
    public int hashCode(){
        String strAge=String.valueOf(age);
        String strHeight=String.valueOf(height);
        String strWeight=String.valueOf(weight);
        int hashAge=strAge.hashCode();
        int hashWeight=strWeight.hashCode();
        int hashHeight=strHeight.hashCode();
        int hash=0;
        hash=hash+hashAge+hashHeight+hashWeight;
        return hash;
    }
};

public class ObjectManager{
    public static void main(String[] args) {
        String s1=new String("abc");
        System.out.println(s1);
        String s2=new String("abc");
        System.out.println(s2);
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        Student st1=new Student(23,67.5,5.4f);
        System.out.println(st1);
        Student st2=new Student(23,67.5,5.4f);
        System.out.println(st2);
        System.out.println(st1==st2);
        System.out.println(st1.equals(st2));
        System.out.println(st1.hashCode());
        System.out.println(st2.hashCode());
    }
}
