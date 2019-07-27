#include<stdio.h>
int main()
{
  int number;
  scanf("%d",&number);
  if(number>5)
    printf("Invalid");
  else
  {
    switch(number)
    {
      case 1:
        printf("One");
        break;
      case 2:
        printf("Two");
        break;
      case 3:
        printf("Three");
        break;
      case 4:
        printf("Four");
        break;
      case 5:
        printf("Five");
        break;
    }
  }
  return 0;
}