#include<iostream>
#include<string>
#include <locale>

typedef struct {
	std::string name;
	
	int age;
	float height, weight;
}Human;

int main(){
	setlocale(LC_CTYPE, "");
	Human me[15];
	
	std::cout <<"Digite seu nome: ";
	std::cin >> me[0].name;
	
}