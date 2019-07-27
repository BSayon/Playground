#include <stdio.h>
int main() {
	//Type your code
  int number,copy=0,sum=0;
  scanf("%d",&number);
  copy = number;
  while(copy!=0)
  {
    sum += copy%10;
    copy = copy/10;
  }
  printf("%d",sum);
	return 0;
}