#include <iostream>
#include <unordered_set>
#include <vector>

using namespace std;

void check_seating_rules(int t, vector<vector<int>>& test_cases) {
    for (int tc = 0; tc < t; ++tc) {
        int n = test_cases[tc][0];
        vector<int> seats = vector<int>(test_cases[tc].begin() + 1, test_cases[tc].end());
        unordered_set<int> occupied;
        bool valid = true;

        for (int i = 0; i < n; ++i) {
            int seat = seats[i];
            if (i == 0) {
                occupied.insert(seat);
            } else {
                bool has_neighbor = (occupied.find(seat - 1) != occupied.end()) || (occupied.find(seat + 1) != occupied.end());
                if (has_neighbor) {
                    occupied.insert(seat);
                } else {
                    valid = false;
                    break;
                }
            }
        }

        cout << (valid ? "YES" : "NO") << endl;
    }
}

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int t;
    cin >> t;
    vector<vector<int>> test_cases(t);

    for (int i = 0; i < t; ++i) {
        int n;
        cin >> n;
        test_cases[i].push_back(n);
        for (int j = 0; j < n; ++j) {
            int seat;
            cin >> seat;
            test_cases[i].push_back(seat);
        }
    }

    check_seating_rules(t, test_cases);

    return 0;
}
