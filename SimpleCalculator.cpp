#include <iostream>
using namespace std;

int main(){
    int num1, num2, result=0;
    char symbol;
    cin >> num1 >> symbol >> num2;

    if (symbol == '+'){
        result = num1 + num2;
        cout << num1 << ' ' << symbol << ' ' << num2 << " = " << result << endl;
    }
    else if (symbol == '-'){
        result = num1 - num2;
        cout << num1 << ' ' << symbol << ' ' << num2 << " = " << result << endl;
    }
    else if (symbol == '*'){
        result = num1 * num2;
        cout << num1 << ' ' << symbol << ' ' << num2 << " = " << result << endl;
    }
    else if (symbol == '/'){
        double(result) = double(num1) / double(num2);
        cout << num1 << ' ' << symbol << ' ' << num2 << " = " << result << endl;
    }
    else if (symbol == '%'){
        result = num1 % num2;
        cout << num1 << ' ' << symbol << ' ' << num2 << " = " << result << endl;
    }
}