package conversion;

/*Declaracion de clase Conversiones, donde se realizaran las operaciones para
 * convertir de un sistema numerico a otro (Binario, Decimal, Octal, Hexadecimal)
 */
public class Conversiones {
	
	//Conversion de Decimal a Binario
	public String decBin (int decimal) {
		String binario = "";
		do {
			binario = decimal % 2 + binario;
			decimal /= 2;
		}while(decimal > 0);
		
		return binario;
		
	}
	
	//Conversion de Decimal a Octal
	public String decOcta (int decimal) {
		int res = 0;
		String octal = "";
		char[] numOctales = {'0', '1', '2', '3', '4', '5', '6', '7'};
		do {
			res = decimal % 8;
			char numero = numOctales[res];
			octal = numero + octal;
			decimal /= 8;
		}while(decimal > 0);
		
		return octal;
	}
	
	//Conversion de Decimal a Hexadecimal
	public String decHexa (int decimal) {
		int res = 0;
		String hexadecimal = "";
		char[] caracteresHexadecimales = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
		do {
			res = decimal % 16;
			char caracteres = caracteresHexadecimales[res];
			hexadecimal = caracteres + hexadecimal;
			decimal /= 16;
		}while(decimal > 0);
		
		return hexadecimal;
	}
	
	//Metodo para convertir de binario a decimal
	public int binDec(long binario) {
		int decimal = 0;
		int posicion = 0;
		long bin = 0;
		while(binario !=0) {
			bin = binario % 10;
			binario /= 10;
			decimal += bin * Math.pow(2, posicion);
			++posicion;
		}
		return decimal;
	}
	
	//Metodo para convertir de octal a decimal
	public int octDec(int octal) {
		int decimal = 0;
		int posicion = 0;
		int oct = 0;
		while(octal !=0) {
			oct = octal % 10;
			octal /= 10;
			decimal += oct * Math.pow(8, posicion);
			++posicion;
		}
		return decimal;
	}
	
	//Metodo para convertir de hexadecimal a decimal
	public int hexaDec(String hexadecimal) {
		int decimal = 0;
		String charHexadecimales = "0123456789ABCDEF";
		hexadecimal = hexadecimal.toUpperCase();
		for (int i = 0; i < hexadecimal.length(); i++) {
			char charHexa = hexadecimal.charAt(i);
			int posicion = charHexadecimales.indexOf(charHexa);
			decimal = 16 * decimal + posicion;
		}
		return decimal;
	}

}