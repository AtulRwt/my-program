#include<iostream>
using namespace std;
int main(){
    int bsize[10],psize[10],pno, bno, flags[10],allocation[10],i,j;
    for(i=0;i<10;i++){
        flags[i]=0;
        allocation[i]=-1;
    }
    cout<<"enter no. of blocks: ";
    cin>>bno;
    cout<<"enter the size of each blocks: ";
    for(i=0;i<bno;i++){
        cin>>bsize[i];
    }
    cout<<"enter no of processes: ";
    cin>>pno;
    cout<<"enter size of each processes: ";
    for(i=0;i<pno;i++){
        cin>>psize[i];
    }
    for(i=0;i<pno;i++){
        int best_fit_index=-1;
        for(j=0;j<bno;j++){
            if(flags[j]==0 && bsize[j]>=psize[i]){
                if(best_fit_index==-1 || bsize[j]>bsize[allocation[best_fit_index]]){
                    best_fit_index=j;
                }
            }
        }
        if(best_fit_index!=-1){
            allocation[best_fit_index]=i;
            flags[best_fit_index]=1;
        }
    }
    cout<<"\nblock no.\tsize\t\t\tprocess allocation\t\tsize";
    for(i=0;i<bno;i++){
        cout<<"\n"<<i<<"\t\t"<<bsize[i]<<"\t\t";
        if(flags[i]==1){
            cout<<"\t\t"<<allocation[i]+1<<"\t\t\t"<<psize[allocation[i]];
        }else{
            cout<<"\tnot allocated";
        }
    }
    cout<<"\n";
    return 0;

}