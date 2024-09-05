#include<stdio.h>
int main(){
	int a,b,c;
	printf("enter three number");
	scanf("%d",&a);
	scanf("%d",&b);
	scanf("%d",&c);

	
	
	
	if(a>b){
		if(a>c){
			printf("%d is greater", a);
		}
	}
	else if(b>a){
		
		if(b>c){
			printf("%d is greater", b);
		}
	}
	else
		printf("c is greater");
	
	return 0;
}