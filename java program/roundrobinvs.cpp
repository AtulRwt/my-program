#include<iostream>
using namespace std;
void roundrobin(int bursttime[],int n,int quantum)
{
    int remainingtime[n];
    for(int i=0;i<n;i++)
        remainingtime[i]=bursttime[i];


int currenttime=0;
int completed=0;
while(completed<n)
{
    for(int i=0;i<n;i++)
    {
        if(remainingtime[i]>0)
        {
            if(remainingtime[i]>quantum)
            {
                currenttime+=quantum;
                remainingtime[i]-=quantum;

            }
            else
            {
                currenttime+=remainingtime[i];
                remainingtime[i]=0;
                std::cout<<"process "<<i+1<<"copleted at time "<<currenttime<<std::endl;
                completed++;

            }
        }
    }
}

}
int main()
{
    int n, quantum;
    std::cout<<"enter the number of processes: ";
    std::cin>>n;
    int bursttime[n];
    for(int i=0;i<n;i++){
        std::cout<<"enter burst time for process "<<i+1<<": ";
        std::cin>>quantum;
        roundrobin(bursttime,n,quantum);
        return 0;
    }
}