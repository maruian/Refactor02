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
		for(int i=0;i<jugador1.length;i++)
		{
			resultado=resultado+jugador1[i];
		}
		resultado=resultado/jugador1.length;
		System.out.println("La media de goles del jugador 1 es: "+resultado);
		resultado=0;
		//Calculamos la media geométrica para el segundo jugador
		for(int i=0;i<jugador2.length;i++)
		{
			resultado=resultado+jugador2[i];
		}
		resultado=resultado/jugador2.length;
		System.out.println("La media de goles del jugador 2 es: "+resultado);
		resultado=0;
		//Calculamos la media geométrica para el tercer jugador
		for(int i=0;i<jugador3.length;i++)
		{
			resultado=resultado+jugador3[i];
		}
		resultado=resultado/jugador3.length;
		System.out.println("La media de goles del jugador 3 es: "+resultado);
		resultado=0;
	}

}
