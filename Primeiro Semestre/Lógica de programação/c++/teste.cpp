#include<iostream>
#include<string>
#include <locale>

int main(){
	setlocale(LC_CTYPE, "");
	int x=1;
	float y= 0.0f;
	double z= 0.0;
	bool a = true;
	char nome[10]="Jorge";
	std::string myString;
	
	for (int i = 0; i < 10; i++){
		std::cout <<"\nDigite um numero: ";
		std::cin >> x;
		std::cout << "\nDigite seu nome: ";
		std::cin >> myString;
		if(x>0){
			std::cout << "\nSeu nome é: " << myString;
			std::cout << "\n" << x << " é maior que 0\n";
		}
		else if(x==0){
			std::cout << "\nSeu nome é: " << myString;
			std::cout << "\n" << x << " é igual a zero\n";
		}
		else{
			std::cout << "\nSeu nome é: " << myString;
			std::cout << "\n" << x << " é menor que zero\n";
		}
		system("pause");
		system("cls");
	}
	
}