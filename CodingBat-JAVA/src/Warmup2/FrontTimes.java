package Warmup2;
/*
 * Dada uma string e um int n não negativo, diremos que a frente da string são os primeiros 3 caracteres, ou o que estiver lá se a string for menor que 3. Retorna n cópias da frente;

frontTimes("Chocolate", 2) → "ChoCho"
frontTimes("Chocolate", 3) → "ChoChoCho"
frontTimes("Abc", 3) → "AbcAbcAbc"
 */

public class FrontTimes {

	public static void main(String[] args) {
		
		System.out.println(frontTimes("Chocolate", 0));
		System.out.println(frontTimes("Chocolate", 1));
		System.out.println(frontTimes("Chocolate", 2));
		System.out.println(frontTimes("Chocolate", 3));
		System.out.println(frontTimes("Chocolate", 4));

	}

	public static String frontTimes(String str, int n) {
		  int len = str.length();
		  String temp = "";
		  if (len < 4) {
		    for (int i = 0; i < n; i++) {
		      temp += str;
		    }
		  } else {
		      for (int j = 0; j < n; j++) {
		        temp += str.substring(0,3);
		      }
		  }
		  return temp;
		}
}
