#include <iostream>

using namespace std;

struct Car {
    char carName [20];
    char carColor [20];
    int price;
};



int main () {
    struct Car a;
    cout << "please enter carname" << endl ;
    cin >> a.carName;
    cout << "pelase enter carcolor" << endl ;
    cin >> a.carColor ;
    cout << "peease enter carprice" << endl ;
    cin >> a.price ;

    cout << "a car has below features\n" << endl << "Car Name : \t" << a.carName << endl << "Car Color : \t" << a.carColor << endl << "Car Price : \t" << a.price << endl;
    
    return 0;
}