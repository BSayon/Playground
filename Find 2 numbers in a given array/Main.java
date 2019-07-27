#include<stdio.h>
int main()
{
  	int i,size,arr[100],no1,no2,pos1=-1,pos2=-1;
  	scanf("%d",&size);
  	for(i=0;i<size;i++)
    {
      scanf("%d",&arr[i]);
    }
  	scanf("%d%d",&no1,&no2);
  	for(i=0;i<size;i++)
    {
      if(arr[i]==no1)
        pos1 = i;
      if(arr[i]==no2)
        pos2 =i;
    }
  printf("Element 1 index = %d\nElement 2 index = %d",pos1,pos2);
}