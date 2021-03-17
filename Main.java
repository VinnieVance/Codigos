package conversion;
//Importe del Scanner
import java.util.Scanner;
//@Autor: Aaron CG y Erik Alejandro BC
//Declaracion de la clase principal
public class Main {
	//Clase principal para correr el programa
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//declaracion de variables
		int seleccion = 0;
		int decimal = 0;
		int binario = 0;
		int octal = 0;
		String hexadecimal;
		//Llamada del Scanner
		Scanner entrada = new Scanner(System.in);
		Scanner scan = new Scanner(System.in);
		//Instancias de las clases
		Conversiones conv = new Conversiones();
		Validacion val = new Validacion();
		
		/*Creamos un do para repetir el menu hasta que el usuario seleccione la
		 * opcion 13 para salir del programa
		 */
		do {
			System.out.println("\tConversión Numérica");
			System.out.println("");
			System.out.println("¿Que conversion desea realizar?");
			System.out.println("1.Convertir de decimal a binario");
			System.out.println("2.Convertir de decimal a octal");
			System.out.println("3.Convertir de decimal a hexadecimal");
			System.out.println("4.Convertir de binario a decimal");
			System.out.println("5.Convertir de binario a octal");
			System.out.println("6.Convertir de binario a hexadecimal");
			System.out.println("7.Convertir de octal a decimal");
			System.out.println("8.Convertir de octal a binario");
			System.out.println("9.Convertir de octal a hexadecimal");
			System.out.println("10.Convertir de hexadecimal a decimal");
			System.out.println("11.Convertir de hexadecimal a binario");
			System.out.println("12.Convertir de hexadecimal a octal");
			System.out.println("13.Salir");
			seleccion = entrada.nextInt();
			//Switch para seleccionar la conversion deseada
			switch(seleccion) {
			//Case 1 para convertir de decimal a binario
			case 1:
				System.out.println("Ingrese el valor decimal");
				//Insertamos el valor que nos solicita
				decimal = entrada.nextInt();
				//Valida el numero ingresado
				if(!val.validarDecimal(decimal)) {
					//Si no es valido, se termina el programa
					System.out.println("Numero no valido");
					return;
				}
				//La conversion se guarda en la variable String
				String resultadoBinario = conv.decBin(decimal);
				//Se imprime el resultado de la conversion
				System.out.println("El valor binario es: " + resultadoBinario + " _base:2");
				break;
			//Case 2 para convertir de decimal a octal	
			case 2:
				System.out.println("Ingrese el valor decimal");
				decimal = entrada.nextInt();
				if(!val.validarDecimal(decimal)) {
					System.out.println("Numero no valido");
					return;
				}
				String resultadoOctal = conv.decOcta(decimal);
				System.out.println("El valor octal es: " + resultadoOctal + " _base:8");
				break;
			//Case 3 para convertir de decimal a hexadecimal	
			case 3:
				System.out.println("Ingrese el valor decimal");
				decimal = entrada.nextInt();
				if(!val.validarDecimal(decimal)) {
					System.out.println("Numero no valido");
					return;
				}
				String resultadoHexa = conv.decHexa(decimal);
				System.out.println("El valor hexadecimal es: " + resultadoHexa + " _base:16");
				break;
			//Case 4 para convertir de binario a decimal
			case 4:
				System.out.println("Ingrese el valor binario");
				binario = entrada.nextInt();
				if(!val.validarBinario(binario)) {
					System.out.println("Numero no valido");
					return;
				}
				int resDecimal = conv.binDec(binario);
				System.out.println("El valor decimal es: " + resDecimal + " _base:10");
				break;
			//Case 5 para convertir de binario a octal
			case 5:
				System.out.println("Ingrese el valor binario");
				binario = entrada.nextInt();
				if(!val.validarBinario(binario)) {
					System.out.println("Numero no valido");
					return;
				}
				/*En esta conversion y otras como la de hexadecimal a binario y
				 * octal a hexadecimal, convertimos el valor en decimal y
				 * despues convertimos de decimal a el valor que buscamos
				 */
				resDecimal = conv.binDec(binario);
				String resBinOct = conv.decOcta(resDecimal);
				System.out.println("El valor octal es: " + resBinOct + " _base:8");
				break;
			//Case 6 para convertir de binario a hexadecimal
			case 6:
				System.out.println("Ingrese el valor binario");
				binario = entrada.nextInt();
				if(!val.validarBinario(binario)) {
					System.out.println("Numero no valido");
					return;
				}
				resDecimal = conv.binDec(binario);
				String resBinHex = conv.decHexa(resDecimal);
				System.out.println("El valor hexadecimal es: " + resBinHex + " _base:16");
				break;
			//Case 7 para convertir de octal a decimal
			case 7:
				System.out.println("Ingrese el valor octal");
				octal = entrada.nextInt();
				if(!val.validarOctal(octal)) {
					System.out.println("Numero no valido");
					return;
				}
				resDecimal = conv.octDec(octal);
				System.out.println("El valor decimal es: " + resDecimal + " _base:10");
				break;
			//Case 8 para convertir de octal a binario
			case 8:
				System.out.println("Ingrese el valor octal");
				octal = entrada.nextInt();
				if(!val.validarOctal(octal)) {
					System.out.println("Numero no valido");
					return;
				}
				resDecimal = conv.octDec(octal);
				String resOctBin = conv.decBin(resDecimal);
				System.out.println("El valor binario es: " + resOctBin + " _base:2");
				break;
			//Case 9 para convertir de octal a hexadecimal
			case 9:
				System.out.println("Ingrese el valor octal");
				octal = entrada.nextInt();
				if(!val.validarOctal(octal)) {
					System.out.println("Numero no valido");
					return;
				}
				resDecimal = conv.octDec(octal);
				String resOctHex = conv.decHexa(resDecimal);
				System.out.println("El valor hexadecimal es: " + resOctHex + " _base:16");
				break;
			//Case 10 para convertir de hexadecimal a decimal
			case 10:
				System.out.println("Ingrese el valor hexadecimal");
				hexadecimal = scan.nextLine().toUpperCase();
				if(!val.validarHexadecimal(hexadecimal)) {
					System.out.println("Numero no valido");
					return;
				}
				int resHexaDec = conv.hexaDec(hexadecimal);
				System.out.println("El valor decimal es: " + resHexaDec + " _base:10");
				break;
			//Case 11 para convertir de hexadecimal a binario
			case 11:
				System.out.println("Ingrese el valor hexadecimal");
				hexadecimal = scan.nextLine().toUpperCase();
				if(!val.validarHexadecimal(hexadecimal)) {
					System.out.println("Numero no valido");
					return;
				}
				resHexaDec = conv.hexaDec(hexadecimal);
				String resHexBin = conv.decBin(resHexaDec);
				System.out.println("El valor binario es: " + resHexBin + " _base:2");
				break;
			//Case 12 para convertir de hexadecimal a octal
			case 12:
				System.out.println("Ingrese el valor hexadecimal");
				hexadecimal = scan.nextLine().toUpperCase();
				if(!val.validarHexadecimal(hexadecimal)) {
					System.out.println("Numero no valido");
					return;
				}
				resHexaDec = conv.hexaDec(hexadecimal);
				String resHexOct = conv.decOcta(resHexaDec);
				System.out.println("El valor octal es: " + resHexOct + " _base:8");
				break; 
			//Case 13 para despedirse y terminar el programa
			case 13:
				System.out.println("¡¡¡¡¡Adios!!!!!");
				break;
			/*Default para advertir al usuario que solo puede insertar numeros del
			 * 1 al 13 para cada case
			 */
			default:
				System.out.println("Solo opciones del 1 al 13");
				break;
			}
			}while(seleccion!=13);
		
		//Cerramos el Scanner
		entrada.close();
		scan.close();
	}

}
