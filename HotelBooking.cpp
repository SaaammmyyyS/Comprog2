#include <iostream>
#include <iomanip>
using namespace std;

int main(){
    char type;
    int cost, rooms, days;
    double discount, CashDiscount, TotalCost, TotalBill;
    cin >> type >> cost >> rooms >> days;

    if (type == 'W' &&  rooms >= 20){
        discount = 0.2;
    }
    else if (type == 'W' && rooms >= 15){
        discount = 0.15;
    }
    else if (type == 'W' && rooms >= 10){
        discount = 0.1;
    }
    else if (type == 'P' && rooms >= 20){
        discount = 0.3;
    }
    else if (type == 'P' && rooms >= 15){
        discount = 0.2;
    }
    else if (type == 'P' && rooms >= 10){
        discount = 0.1;
    }

    if (type == 'W'){
        cout << "Guest type: Walk-in Guest" << endl;
    }
    else if (type == 'P'){
        cout << "Guest type: Privilege Guest" << endl;
    }
    cout << "Cost of renting a room: " << cost << endl <<
    "Discount: " <<  discount * 100 << '%' << endl << "Number of days: " << days << endl;

    CashDiscount = (cost * days) * discount;
    TotalCost = (cost * days) - CashDiscount;
    cout << fixed << setprecision(2) << "Total cost: " << TotalCost << endl;

    TotalBill = TotalCost + (TotalCost * 0.12);
    cout << "Total bill: " <<  TotalBill;
}