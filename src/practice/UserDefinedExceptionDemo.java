package practice;

import java.util.Scanner;

public class UserDefinedExceptionDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the student age:");
        int age=sc.nextInt();
        if(age>0){
            System.out.println("Student age:"+age);
        }
        else{
            try{
                throw new AgeNegativeException("Age negative not possible");
            }catch(AgeNegativeException ex){
                ex.printStackTrace();
            }
        }
    }
}
