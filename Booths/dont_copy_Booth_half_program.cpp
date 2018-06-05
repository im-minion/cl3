#include<iostream>
using namespace std;

int main(){
    int M_original[4],Q[4];
    
    cout<<"\nenter M\n";
    
    for(int i = 0 ; i < 4 ; i++){
        cin>>M_original[i];
    }
    
    cout<<"\nenter Q\n";

    for(int i = 0 ; i < 4 ; i++){
        cin>>Q[i];
    }
    cout<<"\n2's Compliment of M : \n";
    
    int M[4];
    for(int i =0 ;i <4 ; i++){
        M[i] = M_original[i];
    }

    //1s
    for(int i = 0 ; i < 4 ; i++){
        if(M[i]==0){
            M[i] = 1 ;
        }else{
            M[i] = 0;
        }
    }
    
    //2s
    if(M[3] == 0){
        M[3] = 1;
    }
    else{
        M[3] = 0;
        if(M[2] == 0){
            M[2] = 1;
        }else{
            M[2] = 0;
            if(M[1] == 0){
                M[1] = 1;
            }else{
                M[1] = 0;
                if(M[0] == 0){
                    M[0] = 1;
                }
                else{
                    M[0] = 0;
                }
            }
        }
    }

    for(int i = 0 ; i < 4; i++){
        cout<<M[i]<<"\t";
    }

    cout<<"\n\n";

    int A[4] = {0,0,0,0};
    if((M_original[0] == 0 && A[0] == 0) || (M_original[0] == 1 && A[0] == 1) ){

    }
    else if(M_original[0] == 0 && A[0] == 1){
        //add
    }else if(M_original[0] == 1 && A[0] == 0){
        //sub
    } 

    return 0;

}