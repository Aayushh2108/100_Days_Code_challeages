#include <iostream>
using namespace std;
int main() {
    // Write C++ code here
    char ch;
    cout<<"Enter the character :";
    cin>>ch;
    
    int x = (int)ch;
    
    if((x>=65 && x<=90) || (x>=97 && x<=122)){
        cout<<"Alphabet";
    }else{
        cout<<"Not Alphabet";
    }
    return 0;

  
}
