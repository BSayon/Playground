#include <stdio.h>
int main() {
	// Type your code here
  char c;
  scanf("%c",&c);
  if(c>='a' && c<='z')
  {
    printf("%c",toupper(c));
  }
  else if(c>='A' && c<='Z')
  {
    printf("%c",tolower(c));
  }
	return 0;
}