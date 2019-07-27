#include<stdio.h>
int main()
{
  //Type your code here
  int a=0,b=1,c,n;
  scanf("%d",&n);
  if(n==1)
    	printf("%d",a);
  else
  {
        printf("%d %d ",a,b);
    	for(int i=3;i<=n;i++)
        {
          c = a+b;
          printf("%d ",c);
          a=b;b=c;
        }
  }
  return 0;
}