//Q5.)(Gas mileage ) Drivers are concerned with the mileage th it automobiles get. One driver has kept track
//of several trips by recording the miles driven and gallons used for each tankful.Develop a java application
//that will input the miles driven and gallons used(both as in) for each trip.The program should calculate
//and display the miles per gallon obtained for each trip and print the combined miles per gallon obtained
//for all trips up to this point. All averaging calculate should produce floating point results. Use class scanner
//and sentinel-controlled repetition to obtain the data from the user.

package LAB8;

import java.util.Arrays;
import java.util.Scanner;

 class Trip {
   int n;  //number of trips
    int miles=0;
    int gallons=0;
//
//    public Trip(int n,int miles,int gallons) {
//        this.n = n;
//        this.miles=miles;
//        this.gallons=gallons;
//    }

    void inputTrips(){
        System.out.println("Enter the no of trips");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
    }
    void inputDetails(){
        System.out.println("Enter the no of miles");
        Scanner sc=new Scanner(System.in);
        miles=sc.nextInt();
        System.out.println("Enter the no olf gallons");
        gallons=sc.nextInt();
    }
    void outputDetails() {

        double milesPerGallon = (double) miles / gallons;
        System.out.println("Miles per gallon is:" + milesPerGallon);
    }
}
public class Q1 {
    public static void main(String[] args) {
        System.out.println("Enter the no of trips");
        Scanner sc=new Scanner(System.in);
       int n= sc.nextInt();
       Trip[] t=new Trip[n];
       int totalMiles=0;
       int totalGallons=0;
        for(int i=0;i<n;i++){
            System.out.println("enter details for trip: "+i+1);
            t[i]=new Trip();
          t[i].inputDetails();
          t[i].outputDetails();
           totalMiles+=t[i].miles;
           totalGallons+=t[i].gallons;
        }
        double combinedMilesPerGallon = (double) totalMiles / totalGallons;
        System.out.println("Combined miles per gallons is: "+combinedMilesPerGallon);
    }
}
