#include<iostream>
using namespace std;
void findwaitingtime(int pro[], int n, int bt[], int wt[])
{
    wt[0]=0;
    for(int i=1;i<n;i++)
        wt[i]=bt[i-1]+wt[i-1];
}
void findturnaroundtime(int pro[],int n,int bt[],int wt[],int tat[])
{
    for(int i=0;i<n;i++)
        tat[i]=bt[i]+wt[i];
    
}
void findavgtime(int pro[] ,int n, int bt[])
{
    int wt[n],tat [n], total_wt=0,total_tat=0;
    findwaitingtime(pro,n,bt,wt);
    findturnaroundtime(pro,n,bt,wt,tat);
    cout<<"processes "<<"burst time"<<"waiting time "<<"turn around time\n";
    for(int i=0;i<n;i++)
    {
        total_wt=total_wt+wt[i];
        total_tat=total_tat+tat[i];
        cout<<" "<<i+1<<"\t\t"<<bt[i]<<"\t"<<wt[i]<<"\t\t"<<tat[i]<<endl;

    }
    cout<<"average waiting time=  "<<(float)total_wt/(float)n;
    cout<<"\nAverage turn around time=  "<<(float)total_tat/(float)n;
}
int main()
{
    int processes[]={1,2,3};
    int n= sizeof processes/sizeof processes[0];
    int burst_time[]={10,5,8};
    findavgtime(processes,n,burst_time);
    return 0;
}