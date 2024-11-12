#include <iostream>
#include <string>
using namespace std;

struct Publication {
    string title;
    double price;
    string author;

    struct Book {
        int count;

        void getData(Publication& p) {
            cout << "Enter book title: ";
            cin.ignore();
            getline(cin, p.title);
            cout << "Enter book price: ";
            cin >> p.price;
            cout << "Enter book author: ";
            cin.ignore();
            getline(cin, p.author);
            cout << "Enter book count: ";
            cin >> count;
        }

        void displayData(const Publication& p) {
            cout << "Book Title: " << p.title << endl;
            cout << "Book Price: " << p.price << endl;
            cout << "Book Author: " << p.author << endl;
            cout << "Book Count: " << count << endl;
        }
    } book;

    struct Ebook {
        double playingTime;

        void getData(Publication& p) {
            cout << "Enter ebook title: ";
            cin.ignore();
            getline(cin, p.title);
            cout << "Enter ebook price: ";
            cin >> p.price;
            cout << "Enter ebook author: ";
            cin.ignore();
            getline(cin, p.author);
            cout << "Enter ebook playing time: ";
            cin >> playingTime;
        }

        void displayData(const Publication& p) {
            cout << "Ebook Title: " << p.title << endl;
            cout << "Ebook Price: " << p.price << endl;
            cout << "Ebook Author: " << p.author << endl;
            cout << "Ebook Playing Time: " << playingTime << endl;
        }
    } ebook;
} p;

int main() {
    // Book data input and display
    p.book.getData(p);
    p.book.displayData(p);

    // Ebook data input and display
    p.ebook.getData(p);
    p.ebook.displayData(p);

    return 0;
}
