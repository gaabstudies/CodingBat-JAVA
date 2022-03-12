package Warmup2;
/*
 * Conte o número de "xx" na string fornecida. Diremos que a sobreposição é permitida, então "xxx" contém 2 "xx".
contagemXX("abcxx") → 1
contagemXX("xxx") → 2
contagemXX("xxxx") → 3
 */

public class countXX {

	public static void main(String[] args) {

 System.out.println("countXX(\"abcxx\") = " + countXX("abcxx"));		
 System.out.println("countXX(\"xxx\") = " + countXX("xxx"));		
 System.out.println("countXX(\"xxxx\") =" + countXX("xxxx"));		

	}

	
	public static int countXX(String str) {
		  int count = 0;
		  for (int i = 0; i < str.length()-1; i++) {
		    if (str.substring(i, i+2).equals("xx")) count++;
		  }
		  return count;
		}
	
	
}
