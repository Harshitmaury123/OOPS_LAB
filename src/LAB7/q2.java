//Q2.) Create a class called invoice that hardware store might use to represent an invoice for an item sold at
//the store. An invoice should include four pieces of information as instance variable
// a part number(type string)
// a part description(type string)
// a quantity of the item being purchased(type int)
// a price per item(double)
//Your class should have a constructor that initialization the four instance variable . Provide a set and a get
//method for each instance variable . In extra provide method named getInvoiceAmount that calculate
//the invoice amount(i.e. multiplies the quantity per item ), then return the amount as a double value.If the
//quantity is not positive it should be set to 0. If the price per item is not positive it should be set to 0.0.
//Write test application named invoice test that demonstration class invoice capabilities.


package LAB7;

import java.util.Scanner;

class Invoice{
    private String partNo;
    private String description;
    private int quantityItem;
    private double pricePerItem;
    Invoice(){
        partNo="";
        description="";
        quantityItem=0;
        pricePerItem=0.0;
    }

    public void setPricePerItem(double pricePerItem) {
        if(pricePerItem<0){
            this.pricePerItem=0;
        }
        else {
            this.pricePerItem = pricePerItem;
        }
    }

    public void setQuantityItem(int quantityItem) {
        if(quantityItem<0){
            this.quantityItem=0;
        }
        else {
            this.quantityItem = quantityItem;
        }
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPartNo(String partNo) {
        this.partNo = partNo;
    }

    public String getPartNo() {
        return partNo;
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    public int getQuantityItem() {
        return quantityItem;
    }

    public String getDescription() {
        return description;
    }
    public double getInvoiceAmount(){
        return quantityItem*pricePerItem;
    }

}
public class q2 {
    public static void main(String[] args) {
        Invoice in=new Invoice();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the part number:");
        String partNo=sc.nextLine();
        System.out.println("Enter the description:");
        String description=sc.nextLine();
        System.out.println("Enter the quantity of item:");
        int quantityItem=sc.nextInt();
        System.out.println("Enter the price per item:");
        double pricePerItem=sc.nextDouble();
        in.setDescription(description);
        in.setPricePerItem(pricePerItem);
        in.setPartNo(partNo);
        in.setQuantityItem(quantityItem);
        System.out.println("Part No. is:"+in.getPartNo());
        System.out.println("invoice amount is:"+in.getInvoiceAmount());
    }
}
