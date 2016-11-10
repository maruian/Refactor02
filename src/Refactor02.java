/**
 * Ejemplo de código Extraer funcionalidad
 * 
 * @author      Paco Gomez <fjgomez@florida-uni.es>
 * @version     1.0 
 * @since       1.2          (the version of the package this class was first added to)
 */
public class Refactor02 {

	public static void main(String[] args) {
		//Tenemos los arrays de goles marcados por jugador y partido
		int[] jugador1={2,5,3,0,1};
		int[] jugador2={1,1,3,1,4};
		int[] jugador3={1,0,2,1,0};
		float resultado=0;

		//Calculamos la media geométrica para el primer jugador
		resultado = media(jugador1);
		mensrslt("La media de goles del jugador 1 es:",resultado);
		
		//Calculamos la media geométrica para el segundo jugador
		resultado = media(jugador2);
		mensrslt("La media de goles del jugador 2 es:",resultado);
		
		//Calculamos la media geométrica para el tercer jugador
		resultado = media(jugador3);
		mensrslt("La media de goles del jugador 3 es:",resultado);	
	}
	public static float media(int[] jugador){
		float media=0;
		for(int i=0;i<jugador.length;i++)
		{
			media=media+jugador[i];
		}
		media=media/jugador.length;
		return media;
	}
	
	public static void mensrslt(String msg, float resultado){
		System.out.println(msg+" "+resultado);	
		resultado = 0;
	}
	
}


