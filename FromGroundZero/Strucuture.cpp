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

    cout << " a card has below features" << endl << "Car Name : " << a.carName << endl << "Car Color : " << a.carColor << endl << "Car Price : " << a.price << endl;
    
    return 0;
}