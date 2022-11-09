package unico;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

/*Implementar una aplicación que pida un número al usuario entre el 1 y el 10,
 * y calcule su tabla de multiplicar. El código debe asegurarse de que el
 * número introducido está entre 1 y 10, y si no es así, volver a pedirlo hasta que lo cumpla.
 */
		int num;
		int i;
		int mult;
		
		System.out.print("Introduzca un número entero (entre 1 y 10) para la tabla de multiplicar: ");
		num = Integer.parseInt(teclado.nextLine());
		while (num > 10) {
			System.out.println("Número intorducido incorrecto. Recuerde: debe ser un número entre 1 y 10.");
			System.out.print("Introduzca otro número: ");
			num = Integer.parseInt(teclado.nextLine());
		}
			
		for (i = 0; i <= 10; i++) {
			mult = num * i;
			System.out.println(num + " x " + i + " = " + num * i);
		}
	}
}
