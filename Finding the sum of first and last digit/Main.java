#include <stdio.h>
int main() {
	//Type your code
  	int number,copy=0;
  	scanf("%d",&number);
  	copy = number;
  	while(copy>9)
    {
      copy /=10;
    }
  	printf("%d",(copy+number%10));
	return 0;
}