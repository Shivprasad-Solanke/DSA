#include <iostream>
#include <stdio.h>

using namespace std;

struct Student {
    int rollNo;
    char Name[20] ;
};

int main () {
    // Pointers

    int *i;
    char *c;
    float *f;
    double *d;
    struct Student *s;
    float *heapVar = (float *) malloc(5*sizeof(float));
    int intValue = 50;
    char charValue = 'C';
    float floatValue = 5.44;
    double doubleValue = 23421.23423;
    struct Student structValue1;
    structValue1={101,"Shivprasad"};
    i=&intValue;
    c=&charValue;
    f=&floatValue;
    d=&doubleValue;
    s=&structValue1;
    for(int i=0;i<5;i++){
        heapVar[i] = (i+1) + ((i+1)/10.0);
    }
    cout<<"i : \t"<<i<<endl;
    cout<<"c : \t"<<c<<endl;
    cout<<"f : \t"<<f<<endl;
    cout<<"d : \t"<<d<<endl;
    cout<<"s : \t"<<s<<endl;
    cout<<"heapVar : \t"<<heapVar<<endl;
    cout<<"*i : \t"<<*i<<endl;
    cout<<"*c : \t"<<*c<<endl;
    cout<<"*f : \t"<<*f<<endl;
    cout<<"*d : \t"<<*d<<endl;
    cout<<"*s : \t"<<s->rollNo<<" "<<s->Name<<endl;
    for(int i=0;i<5;i++){
        cout<<heapVar[i]<<" "<<endl;
    };
    free (heapVar);




    

    // int *pointerToHeapArrayVar;
    // pointerToHeapArrayVar = (int *) malloc(10 * (sizeof(int))) ;
    // *pointerToHeapArrayVar = 20;
    // cout << "*pointerToHeapArrayVar : " << *pointerToHeapArrayVar << endl;
    // cout << "PointerToHeapArrayVar : " << pointerToHeapArrayVar << endl;
    // free (pointerToHeapArrayVar);
    // float* f = (float*) malloc(5 * sizeof(float));
    // float value = 1;
    // for (int i=1; i<=5 ; ++i){
    //     for (int j=i;j<=i;j++){
    //         f[i-1]= value +(value/10);
    //         cout<<"f["<<i-1<<"] : "<<f[i-1]<<endl;
    //     }
    //     value = ++value;
    // }

    // float* f = (float*) malloc(5 * sizeof(float));
    // float value = 1;
    // for (int i=0; i<5 ; ++i){
    //     f[i]= value +(value/10);
    //     value = ++value;
    // }
    
    // for(int i=0; i<5; ++i) {
    //     cout << "f[" << i << "] : " << f[i] << endl;
    // }
    // free(f);
    return 0;
}