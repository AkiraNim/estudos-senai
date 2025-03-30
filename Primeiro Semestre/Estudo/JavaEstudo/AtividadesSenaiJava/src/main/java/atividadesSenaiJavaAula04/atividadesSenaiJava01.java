package atividadesSenaiJavaAula04;
import java.util.Scanner;


public class atividadesSenaiJava01 {
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		
		int number1, number2, sum, subtraction, multiplication, division;
		
		System.out.print("Digite um numero: ");
		number1=stdin.nextInt();
		System.out.print("Digite um outro numero: ");
		number2=stdin.nextInt();
		
		sum=number1+number2;
		subtraction=number1-number2;
		multiplication=number1*number2;
		division=number1/number2;
		
		System.out.println("A soma de "+number1+" + "+number2+" = "+sum);
		System.out.println("A subtracao de "+number1+" - "+number2+" = "+subtraction);
		System.out.println("A multiplicacao de "+number1+" * "+number2+" = "+multiplication);
		System.out.println("A divisao de "+number1+" / "+number2+" = "+division);

	}

}
