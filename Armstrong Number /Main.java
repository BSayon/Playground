#include <stdio.h>
int main() {
	//Type your code
  	int number,copy=0,sum=0,r=0;
  	scanf("%d",&number);
  	copy = number;
  	while(copy!=0)
    {
      r = copy%10;
      sum += (r*r*r);
      copy /=10;
    }
  	if(sum==number)
  	printf("Armstrong Number");
  	else
      printf("Not an Armstrong Number");
	return 0;
}