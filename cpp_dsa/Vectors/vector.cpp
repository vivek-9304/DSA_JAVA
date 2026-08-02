#include <iostream>
#include <vector>
using namespace std;
int main() {
    vector<int> v(10);
    for(int i = 0; i < 10; i++) {
        v[i] = i + 1;
    }
    for(int i = 0; i < 10; i++) {
        cout << v[i] << " ";
    }
    return 0;
}