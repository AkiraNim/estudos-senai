#include<conio.h>
#include<stdio.h>
#include<stdlib.h>
int main(){
	int counter;
		for(counter=1000;counter>=1000&&counter<=1999;counter++){
			if(counter%11==5){
				printf("%d\n",counter);
			}
		}
return 0;
}
