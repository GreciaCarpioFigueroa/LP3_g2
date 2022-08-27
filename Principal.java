import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		int vida, rp =0,a=1;
		boolean fl = false;
		Scanner sc = new Scanner(System.in);
		System.out.println("Numero? ");
		vida = sc.nextInt();
		System.out.println("El numero ingresado es: " + vida);
		
		for (int i = 0; i <= vida; i++)
			rp += i;
		System.out.println("La suma es: " + rp);
		
		for (int i = 1; i <= 12; i++)
			System.out.println(vida +" multplicado por: " + i + " es igual a: " + (vida*i) );
		int a;
		System.out.println("Encuentra la clave secreta");
		a = sc.nextInt();
		if (a != 9) {
			System.out.println("No es el numero, perdiste :(");
		}
		else {
			System.out.println("Encontraste tu numero de la suerte")
		}
	}

}

