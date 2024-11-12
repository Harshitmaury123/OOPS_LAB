// Experiment 5: Assume that a publishing company markets prints books and digital books (electronic 
// form – CD’). Create a class named Publication with data members named title, price, and author’s name. 
// From Publication class, derive two classes named Book and Ebook. The Book class adds a page count data 
// member named pcount while Ebook adds data member playing time name ptime. Each of these classes 
// must have member function getDatd() to read class specific data from keyboard and displayData() to 
// output the class specific data to the computer screen. Write a program to test these classes.

#include<iostream>
using namespace std;

class Publication{
    public:
     string title;
    double price;
    string author;
};

class Book :public Publication{
    public:
   int pcount;
   void getDatD(){
    cout<<"Enter title of the book: ";
    cin>>title;
    cout<<"Enter price of the book: ";
    cin>>price;
    cout<<"Enter author of the book: ";
    cin>>author;
    cout<<"Enter page count of the book: ";
    cin>>pcount;
   }
   void display(){
    cout<<"Title of the book: "<<title<<endl;
    cout<<"Price of the book: "<<price<<endl;
    cout<<"Author of the book: "<<author<<endl;
    cout<<"Page count of the book:"<<pcount<<endl;
   }
};

class Ebook :public Publication{
    public:
    double ptime;
     void getDatD(){
        cout<<"Enter title of the ebook: ";
        cin>>title;
        cout<<"Enter price of the ebook: ";
        cin>>price;
        cout<<"Enter ebook author:"<<endl;
        cin>>author;
        cout<<"Enter playing time of the ebook: ";
        cin>>ptime;
     }
     void display(){
        cout<<"Title of the ebook: "<<title<<endl;
        cout<<"Price of the ebook: "<<price<<endl;
        cout<<"Author of the ebook:"<<author<<endl;
        cout<<"Playing time of the ebook: "<<ptime<<endl;
     }
};

int main(){
    Book b;
    b.getDatD();
    b.display();
    Ebook e;
    e.getDatD();
    e.display();
}