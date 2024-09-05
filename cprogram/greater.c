#include<stdio.h>
int main(){
	int a, b, c, d;
	printf("enter value of a: ");
	scanf("%d",&a);
	printf("enter value of b: ");
	scanf("%d",&b);
	printf("enter value of c: ");
	scanf("%d",&c);
	printf("enter value of d: ");
	scanf("%d",&d);
	
	
	if(a>b){
		if(a>c){
			if(a>d){
				printf("%d is greater",a);
			}
		}
	}
	else if(b>a)
	{
		if(b>c){
			if(b>d)
			{
				printf("%d is greater",b);
			}
			
		}
	}
	else if(c>a){
		if(c>b){
				
				if(c>d){
					printf("%d is greater",c);
				}
		}
	}
	else 
		printf("%d is greater", d);
		 
	return 0;
}