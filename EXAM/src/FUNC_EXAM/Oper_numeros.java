package FUNC_EXAM;

import java.util.Arrays;
import java.util.Scanner;

public class Oper_numeros {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//examen 1�DAM
		saludar();
		System.out.print("Introduce un n�mero para averiguar si es primo o no ");
		 
		int num = pedir_numero();
		 
		 comprobar_primo(num);
		 
		 int suma = suma(num);
		 System.out.println("Se incrementa el n�mero en 15 unidades"+ ":"+" "+ suma);
		 
		 nuevafun();
		 
		 //A�adir la nueva funcionalidad que ha pedido el cliente
		 //*****************************************
//		 Crear una funci�n que guarde 4 n�meros en un array e invertidos 
//		 en otro array. Adem�s, el cliente quiere que se visualice la suma de las cuatro cifras.
		 //*****************************************
	}


		public static int pedir_numero() {
		// TODO Auto-generated method stub
			
			Scanner entradaEscaner = new Scanner (System.in); //Creaci�n de un objeto Scanner
			int num = entradaEscaner.nextInt(); //Invocamos
		    return num;
	}


		public static boolean comprobar_primo(int num) {
			
			int[] divisores =new int[15];
			boolean primoB = true; 
			int posicion=0;
			
			for(int i = 2; i <=num; i++) {
				if (num % i == 0) {
					primoB = false;
					//Vamos guardando los divisores en un array
					divisores[posicion]=i;
					posicion++;
					//break;
				}
			}
			if (primoB) {
				System.out.print("El n�mero es primo \n");
			}else {
				System.out.print("El n�mero no es primo \n");
				System.out.printf("Los divisores del n�mero \n");
			}
			for (int i = 0; i < posicion; i++) {
				
				System.out.printf(divisores[i]+"\n");
			}
			return primoB;
		}
			
		
		
		public static int suma(int num) {
			// TODO Auto-generated method stub
			
			return num+15;
		}
		//Hola a los de primero de DAM, suerte con la asignatura---18:51
		
		public static void saludar() {
			
			
			System.out.println("Buenos d�as Ceinmark, soy Carlos Gonz�lez");
		}

		
		//crear la nueva funci�n
		public static void nuevafun() {
			
			int array[]= new int[4];
			int suma=0;int suma2 =0;
			
			for (int i= 0; i<array.length; i++) {
				
				array[i]=i;	
				suma+=array[i];
			}System.out.println(Arrays.toString(array));
			System.out.println("La suma de este array es "+ suma);
			
			int array2[]= new int[4];
			
			for (int i=array.length-1; i>=0; i--) {
				
				array[i]=i;	
				suma2+=array[i];
			}System.out.println(Arrays.toString(array2));
			System.out.println("La suma de este array es "+ suma2);
		}
		
}
