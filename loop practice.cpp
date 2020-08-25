#include<stdio.h>
void print_natural_number()
{
	for(int i=0; i<=10;i++)
	{
		printf("\n %d",i);
	}
	
}
void sum_natural_number()
{
	int a=0;
	for(int i=0; i<=10;i++)
	{
		a=a+i;
	}
	printf(" sum= %d",a);
}
void n_terms_natural_number_sum(int input)
{
	int temp=0;
	for(int i=0; i<=input;i++)
	{
		printf("\n  %d",i);
		temp=temp+i;
	}
	printf(" \n sum= %d",temp);
}
void numbers_between_1_and_500()
{
	 int i = 1, u = 1, sum = 0;
 
  while (i <= 500) 
  {
	    while (u <= 500) 
	    {
	      if (u < i) 
	      {
	        if (i % u == 0)
	          sum = sum + u;
	        
	      }
	      u++;
	    }
    if (sum == i)
	{
    	printf(" \n sum= %d",i);
     
    }
    i++;
    u = 1;
    sum = 0;
  }
	
}
void multimultiplication_table(int input)
{
	int temp=0;
	for(int i=1;i<=10;i++)
	{
		
		printf("\n%d x %d= %d",i,input,(i*input));	
	}
}
void multipliaction_table_vertically(int input)
{
	for(int i=1;i<=10;i++)
	{
		for(int j=1;j<=input;j++)
		{
			if (j<=input)
          	 printf("%dx%d = %d, ",j,i,i*j);
        
		}
		printf("\n");
	}
	
}
void triagle_pattern(int rows)
{
	for(int i=1;i<=rows;i++)
	{
	
		for(int j=1;j<=i;j++)
		{
			 printf("*");
          	
        
		}
		printf("\n");
	}
}
void triagle_number(int rows)
{
	for(int i=1;i<=rows;i++)
	{
	
		for(int j=1;j<=i;j++)
		{
			 printf("%d",j);
          	
        
		}
		printf("\n");
	}
}
void right_angle_triangle_num(int rows)
{
	for(int i=1;i<=rows;i++)
	{
	
		for(int j=1;j<=i;j++)
		{
			 printf("%d",i);
          	
        
		}
		printf("\n");
	}
}
void right_angle_triangle_increase_increased(int rows)
{
	int k=1;
	for(int i=1;i<=rows;i++)
	{
	
		for(int j=1;j<=i;j++)
		{
			
			  printf("%d ",k++);
			
        
		}
		printf("\n");
	}
}
int main()
{

	 right_angle_triangle_increase_increased(4);
	
	return 0;
}
