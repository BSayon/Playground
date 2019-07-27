#include <stdio.h>
int fact(int);
int fact(int x)
{
  if(x==0)return 1;
  else
    return x*fact(x-1);
}
int main() {
	//Type your code
  	int number,copy=0,sum=0;
  	scanf("%d",&number);
  	copy = number;
  	while(copy!=0)
    {
      sum += fact(copy%10);
      copy /= 10;
    }
  	if(sum==number)
      printf("Yes");
  	else
      printf("No");
	return 0;
}