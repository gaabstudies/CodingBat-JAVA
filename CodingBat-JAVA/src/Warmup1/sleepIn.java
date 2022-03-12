package Warmup1;
/*
 * O parâmetro weekday é verdadeiro se for um dia da semana e o parâmetro férias é verdadeiro se estivermos de férias. Nós dormimos se não for um dia de semana ou estamos de férias. Retorne true se dormirmos até tarde.
sleepIn(falso, falso) → verdadeiro
sleepIn(verdadeiro, falso) → falso
sleepIn(falso, verdadeiro) → verdadeiro
 */

public class sleepIn {

	public static void main(String[] args) {

		System.out.println(sleepIn(false, false));
		System.out.println(sleepIn(true, false));
		System.out.println(sleepIn(false, true));

	}
	
	public static boolean sleepIn(boolean weekday, boolean vacation) {
		  if (weekday == true && vacation == false)
		    return false;
		  else
		    return true;
		}
	

}
