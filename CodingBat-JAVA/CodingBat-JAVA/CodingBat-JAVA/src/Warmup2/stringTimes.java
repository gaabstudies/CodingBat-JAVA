package Warmup2;

/*
 * Dada uma string e um int n não negativo, retorne uma string maior que seja n cópias da string original.

stringTimes("Oi", 2) → "OiOi"
stringTimes("Oi", 3) → "OiOi"
stringTimes("Oi", 1) → "Oi"

 */
public class stringTimes {
	
	public static void main(String[] args) {
		
		System.out.println(stringTimes("Ola", 0));
		System.out.println(stringTimes("Ola", 1));
		System.out.println(stringTimes("Ola", 2));
		System.out.println(stringTimes("Ola", 3));
		System.out.println(stringTimes("Ola", 4));

}
	
	public static String stringTimes(String str, int n) {
		   String temp = "";
		     for (int i = 0; i < n; i++)
		         temp += str;
		  return temp;


		  
		}
}

