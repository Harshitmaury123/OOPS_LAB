//1) Create an application that calculate your daily driving cost , so that you can estimate how much
//money could be saved by car pooling which also has other advantages such as reducing carbon
//emission and traffic congestion . The application should input the following information and display
//the user's cost per day of driving to work.
//         total miles driven per day
// b)cost per gallon of gasoline
// c)average fees per day
// d)tolls per day

package LAB7;

import java.util.Scanner;
//Let miles per gallon be 7 miles ;
class App{
    float distanceTravelled;
    float costPerGallon ;
    float averageFeesPerDay;
    float tolls;
    float result;
    float persons;
     Scanner sc=new Scanner(System.in);
    void getInput(){
        System.out.println("Enter no of miles travelled:");
         distanceTravelled=sc.nextFloat();
        System.out.println("Enter cost per gallon of gasoline:");
        costPerGallon=sc.nextFloat();
        System.out.println("Enter average Fees per Day");
        averageFeesPerDay=sc.nextFloat();
        System.out.println("Enter tolls per day");
        tolls=sc.nextFloat();
        System.out.println("Enter no of persons in car pooling");
        persons=sc.nextFloat();
    }
    float calculate()  {
        //total cost
        result=((distanceTravelled/7.0f)*costPerGallon)+tolls+averageFeesPerDay;
        //money saved in car pooling
        return (result-(result/persons));
    }
}

public class Q1 {
    public static void main(String[] args) {
        App a=new App();
        a.getInput();
        System.out.println(a.calculate());
    }
}
