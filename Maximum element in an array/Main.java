#include<stdio.h>
int main()
{
  	int i,arr[100],size,high=-99999;
  	scanf("%d",&size);
  	for(i=0;i<size;i++)
    {
      scanf("%d",&arr[i]);
      if(arr[i]>high)
        	high = arr[i];
    }
  printf("%d",high);
}