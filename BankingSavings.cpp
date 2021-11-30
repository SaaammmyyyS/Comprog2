#include <iostream>
#include <iomanip>
using namespace std;

int main(){
    double num1, rate, balance, interest, sum;
    double arrInterest[4] = {};
    cin >> num1 >> rate;
    double NewRate = rate * 0.01;
    balance = num1;
    for (int i = 1; i < 5; i++){
        arrInterest[i] = (balance * NewRate);
        balance = arrInterest[i] + balance;
        cout << fixed << setprecision(2) << balance << endl;
    }
    
    for (int i = 1; i < 5; i++){
        sum = sum + arrInterest[i];
    }
    cout << "Interest earned is " << sum << endl;
    

    
}