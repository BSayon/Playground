#include<stdio.h>
int main()
{
	int n;
  scanf("%d",&n);
  if(n%2==1)
  {
    	printf("%d",n-1);
  }
  else
  {
    n = n/2 - 1;
    printf("%d",n);
  }
	
}