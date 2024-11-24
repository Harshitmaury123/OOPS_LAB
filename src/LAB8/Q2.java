//Q6) Write a function Model-of-Category for a Tata motor dealers, which accepts category of car customer
//is looking for and returns the car Model available in that category. the function should accept the
//following categories “SUV”, “SEDAN”, “ECONOMY”, and “MINI” which in turn returns “TATA SAFARI” ,
//        “TATA INDIGO” , “TATA INDICA” and “TATA NANO” respectively.


package LAB8;

import java.util.Scanner;

class Model{
//   String modelName;
   String comp;
//   Model(String modelName){
//       this.modelName=modelName;
//   }
   void input(){
       System.out.println("Enter the name of model");
       Scanner sc=new Scanner(System.in);
       comp=sc.nextLine();
   }
   void output(){
       if(comp.equals("SUV")){
           System.out.println("TATA SAFARI");
       }
       else if(comp.equals("SEDAN")){
           System.out.println("TATA INDIGO");
       }
       else if(comp.equals("ECONOMY")){
           System.out.println("TATA INDICA");
       }
       else if(comp.equals("MINI")){
           System.out.println("TATA NANO");
       }
       else{
           System.out.println("Model not available");
       }
   }
}

public class Q2 {
    public static void main(String[] args) {
        Model m1=new Model();
        m1.input();
        m1.output();
    }
}
