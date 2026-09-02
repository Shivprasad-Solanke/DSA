#include <iostream>
#include <stdio.h>

using namespace std;

int main () {
    int intVar = 10;
    char charVar = 'A';
    char charArray[5] = "text" ;
    float floatVar = 12.12;

    int &refToIntVar = intVar;
    char &refToCharVar = charVar;
    char (&refToCharArray)[5] = charArray;
    float &refToFloatVar = floatVar;

    cout<<"intVar = "<<intVar<<endl;
    cout<<"refToIntVar = "<<refToIntVar<<endl;
    cout<<"charVar = "<<charVar<<endl;
    cout<<"refToCharVar = "<<refToCharVar<<endl;
    for(int i = 0; i < (sizeof(charArray)/sizeof(charArray[0])); i++) {
        cout<<"charArray["<<i<<"] = "<<charArray[i]<<endl;
    }
    for(int i = 0; i < (sizeof(charArray)/sizeof(charArray[0])); i++) {
        cout<<"refToCharArray["<<i<<"] = "<<refToCharArray[i]<<endl;
    }
    cout<<"floatVar = "<<floatVar<<endl;
    cout<<"refToFloatVar = "<<refToFloatVar<<endl;

    return 0;
}