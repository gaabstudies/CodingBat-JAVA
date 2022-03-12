package Warmup2;
/*
 * 
Dada uma string, retorne true se a primeira instância de "x" na string for imediatamente seguida por outro "x".
doubleX("axxbb") → true
doubleX("axaxax") → false
doubleX("xxxxx") → true
 */

public class doubleX {

	public static void main(String[] args) {

		System.out.println(doubleX("axxbb"));
		System.out.println(doubleX("axaxax"));
		System.out.println(doubleX("xxxxx"));
		}


static boolean doubleX(String str) {
  int i = str.indexOf("x");
  if (i == -1) return false; 
  if (i+1 >= str.length()) return false; 
  return str.substring(i+1, i+2).equals("x");
}
}
