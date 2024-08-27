#include<iostream>
using namespace std;
void findaveragetime(int bt[],int n)
{
    int wt[n],tat[n];
    float total_wt=0, total_tat=0;
    for(int i=0;i<n;i++)
    {
        int min_index=i;
        for(int j=i+1;j<n;j++)
        {
            if (bt[j]<bt[min_index])
                min_index=j;
        }
        swap(bt[i],bt[min_index]);

    }
    wt[0]=0;
    for(int i=1;i<n;i++)
        wt[i]=bt[i-1]+wt[i-1];
    for(int i=0;i<n;i++)
    {
        tat[i]=bt[i]+wt[i];
        total_wt+=wt[i];
        total_tat+=tat[i];
        cout<<"process"<<i+1<<"\tburst time :"<<bt[i]<<"\twaiting time :"<<wt[i]<<"\tturn around time: "<<tat[i]<<endl;

    }
    cout<<"average waiting time: "<<total_wt/n<<endl;
    cout<<"average turnaround time: "<<total_wt/n<<endl;
}
int main()
{
    int n;
    cout<<"enter number of processes: ";
    cin>>n;
    int burst_time[n];
    cout<<"enter burst time for each processes: \n";
    for(int i=0;i<n;i++)
    {
        cout<<"burst time for process"<<i+1<<":";
        cin>>burst_time[i];
    }
    findaveragetime(burst_time,n);
    return 0;
}