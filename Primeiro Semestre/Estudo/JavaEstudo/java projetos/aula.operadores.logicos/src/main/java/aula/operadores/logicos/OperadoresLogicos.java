package aula.operadores.logicos;

public class OperadoresLogicos {

	public static void main(String[] args) {
		/*int n1, n2, r;
		n1=14;
		n2=18;
		r=(n1>n2)?n1+n2:n1-n2;
		System.out.println(r);*/
	
		int x, y, z;
		boolean r;
		String name;
		
		x=4;
		y=7;
		z=12;
		
		
		r=(x<y && y<z)?true:false;
		/*
		 * r=(x<y || y<z)?true:false;
		 * r=(x<y ^ y<z)?true:false;
		 * */
		name=(r==true)?"verdade":"falso";
		System.out.println(name);

	}
}
