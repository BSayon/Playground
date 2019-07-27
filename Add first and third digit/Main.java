#include<stdio.h>
int main()
{
  //Type your code here
  int num,sum=0;
  scanf("%d",&num);
  sum = (num/10)/10 + num%10;
  printf("%d",sum);
  return 0;
}