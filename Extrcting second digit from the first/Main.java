#include <stdio.h>
int main() {
	//Type your code
  	int number,rem=0,copy=0;
  	scanf("%d",&number);
  	copy = number;
  	while(copy>9)
    {
      rem = copy%10;
      copy = copy/10;
    }
  	printf("%d",rem);
	return 0;
}