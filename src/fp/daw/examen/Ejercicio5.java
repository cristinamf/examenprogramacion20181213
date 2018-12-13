package fp.daw.examen;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio5 {

	/* 
	 * 2 puntos
	 * 
	 * Crea en el método 'main' un juego que consista en generar de forma aleatoria
	 * un número entero comprendido entre 100 y 200 y pedirle al usuario que lo
	 * adivine. Para ello el programa le pedirá que introduza por teclado un número.
	 * Si introduce el número correcto se mostrará un mesaje por pantalla indicando
	 * que ha acertado acompañado del número de intentos realizados y del tiempo
	 * empleado. A continuación, se le dará al usuario la opción de volver a jugar o
	 * de finalizar el juego.
	 * 
	 */
	
	public static void main(String[] args) {
		Random r=new Random ();
		Scanner sc= new Scanner(System.in);
		int numeroAleatorio=r.nextInt(200)+99;
		String volverEmpezar="si";
		String empezar;
		int intentos=0;
		int adivina;
		long tiempoInicio, tiempoFin, tiempo;
		
		tiempoInicio=System.currentTimeMillis();
		System.out.println("�Intenta adivinar el numero aleatorio! Introduce un numero: ");
		adivina=sc.nextInt();
			do{	
				if (numeroAleatorio<adivina) {
					System.out.println("No has acertado, prueba con un numero mas bajo: ");
					adivina=sc.nextInt();
				}
			else if (numeroAleatorio>adivina) {
				System.out.println("No has acertado, prueba con un numero mas alto: ");
					adivina=sc.nextInt();
				}
				intentos++;		
			}while(numeroAleatorio!=adivina);
			tiempoFin=System.currentTimeMillis();
			tiempo=(tiempoFin-tiempoInicio)/1000;
			System.out.println("Has adivinado el numero en "+intentos+" intentos en "+tiempo+" segundos");
			
			System.out.println("�Quieres volver a jugar? si/no");
			empezar=sc.nextLine();
			if(volverEmpezar==empezar) {
				Ejercicio5.main(null);
			} 
			else {
				System.out.println("FIN DE LA PARTIDA");
			}
	}
}

