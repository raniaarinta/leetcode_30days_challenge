#include<stdio.h>    
#include<stdlib.h> 
#include<math.h>
#include <algorithm>
#include <Windows.h>


void fizzbuzz(int *n)
{
	int i;
	i=1;
	for(i=1;i<=*n;i++)
	{
		if((i%3)==0)
		{
			printf("fizz");
			printf("\n");
		}
		if((i%5)==0)
		{
			printf("buzz");
			printf("\n");
		}
		if((i%3)&&(i%5)!=0)
		{
			printf("%d",i);
			printf("\n");
		}
	}
}

int main()
{
	
	int n=15;
	fizzbuzz(&n);

	
	return 0;
}
