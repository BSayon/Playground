#include<stdio.h>
int main()
{
  //Type your code here
  int number,digit=0;
  scanf("%d",&number);
  digit = (number/10)%10;
  printf("%d",digit);
  return 0;
}