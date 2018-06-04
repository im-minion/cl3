#include<iostream>
using namespace std;

int Bsearch_fun(int low,int mid, int high, int *a,int key){
    if(a[mid] == key){
        cout<<"\nFound at : "<<(mid+1)<<endl;
        return 0;
    }else if (a[mid] > key){
        high = mid - 1;
        mid = (low+high)/2;
        Bsearch_fun(low,mid,high,a,key);
    }else if (a[mid] < key){
        low = mid + 1;
        mid = (low+high)/2;
        Bsearch_fun(low,mid,high,a,key);
    }
}

int main(){
    int a[10];
    for(int i = 0 ; i < 10 ; i++){
        cin>>a[i];
    }
    //sort
    for(int i = 0 ; i<10 ;i++){
        for(int j = 0 ; j < 10 - i - 1 ; j++){
           if(a[j] > a[j+1]){
                int temp;
                temp = a[j];
                a[j] = a[j+1];
                a[j+1] = temp;
           }
        }
    }
    for(int i = 0 ; i < 10 ; i++){
        cout<<a[i]<<"   ";
    }

    //ask key
    int key;
    cout<<"\n Enter key : ";
    cin>>key;

    int low = 0;
    int high = 10;
    int mid = (low + mid) /2 ;
    Bsearch_fun(low,mid,high,a,key);
    return 0;
}