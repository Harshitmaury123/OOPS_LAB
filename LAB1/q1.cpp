#include <iostream>
using namespace std;

struct Mail {
    int weight = 0;  
    double calculate(int weight) const {
        if (weight > 400) {
            return 25 * (weight / 1000);
        } else {
            if (weight <= 50) {
                return static_cast<double>((weight / 10) * 0.50);
            } else if (weight > 50 && weight <= 150) {
                return static_cast<double>(5 * 0.50 + ((weight - 50) / 10) * 0.40);
            } else if (weight > 150 && weight <= 400) {
                return static_cast<double>(5 * 0.50 + 10 * 0.40 + ((weight - 150) / 10) * 0.25);
            }
        }
        return 0;
    }
};

int main() {
    int weight;
    cin >> weight;
    Mail m;
    double totalcost = m.calculate(weight);
    cout << totalcost << endl;
    return 0;
}
